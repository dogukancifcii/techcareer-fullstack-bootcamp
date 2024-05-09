package com.dogukancifci.business.services.impl;

import com.dogukancifci.bean.ModelMapperBeanClass;
import com.dogukancifci.bean.PasswordEncoderBeanClass;
import com.dogukancifci.business.dto.EmailDto;
import com.dogukancifci.business.services.IEmailServices;
import com.dogukancifci.data.entity.EmailEntity;
import com.dogukancifci.data.repository.IEmailRepository;
import com.dogukancifci.exception.DogukanCifciException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// LOMBOK
@RequiredArgsConstructor
@Log4j2

// Service: Asıl İş Yükünü sırtlayan
@Service
@Component("emailServicesImpl") // @Component => Spring'in bir parcasısın
public class EmailServicesImpl implements IEmailServices<EmailDto, EmailEntity> {

    // Injection
    private final ModelMapperBeanClass modelMapperBeanClass;
    private final PasswordEncoderBeanClass passwordEncoderBeanClass;

    // Injection Email
    private final IEmailRepository iEmailRepository;
    private final JavaMailSender javaMailSender;

    ///////////////////////////////////////////////////////////////////////////////////////
    //**** Model Mapper *****************************************************************//
    // Model Mapper
    @Override
    public EmailDto entityToDto(EmailEntity emailEntity) {
        return modelMapperBeanClass.modelMapperMethod().map(emailEntity, EmailDto.class);
    }

    @Override
    public EmailEntity dtoToEntity(EmailDto emailDto) {
        return modelMapperBeanClass.modelMapperMethod().map(emailDto, EmailEntity.class);
    }

    ///////////////////////////////////////////////////////////////////////////////////////
    //**** EMAIL DATABASE *****************************************************************//
    // Email Database
    @Override
    public EmailDto mailDatabase(EmailDto emailDto) {
        EmailEntity emailEntity1=dtoToEntity(emailDto);
        EmailEntity emailEntity2= iEmailRepository.save(emailEntity1);
        EmailDto emailDto2=entityToDto(emailEntity2);
        emailDto2.setId(emailEntity2.getId());
        return emailDto2;
        // 2.YOL (Kısa Olanı)
        //return entityToDto(iEmailRepository.save(dtoToEntity(emailDto)));
    }

    ///////////////////////////////////////////////////////////////////////////////////////
    //**** EMAIL SEND BASIC*****************************************************************//
    // Email Basic Send
    @Override
    @Transactional // Create,Delete, Update
    public EmailDto basicSendEmail(EmailDto emailDto) {
        // Maili Öncelikle Kaydedin.
        EmailDto firstDatabaseSave=mailDatabase(emailDto);

        // Mail kaydettiğinde emin olana kadar mail gönderme
        if(firstDatabaseSave.getId()!=null){
            SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
            simpleMailMessage.setFrom(emailDto.getEmailFrom());// Kim gönderdi
            simpleMailMessage.setTo(emailDto.getEmailTo());// Kime
            simpleMailMessage.setSubject(emailDto.getEmailSubject());// Konu
            simpleMailMessage.setText(emailDto.getEmailText());// Text
            simpleMailMessage.setCc(emailDto.getEmailCc());// CC
            simpleMailMessage.setBcc(emailDto.getEmailBcc());// BCC
            simpleMailMessage.setSentDate(emailDto.getSystemCreatedDate());
            System.out.println(simpleMailMessage.hashCode());

            // Mail Gönder
            javaMailSender.send(simpleMailMessage);
            return emailDto;
        }else{
            throw new DogukanCifciException("Database kaydetmedi ve bundan dolayı gönderilmedi");
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////
    //**** EMAIL SEND INTERMEDIA *****************************************************************//
    // Email Intermedia Send
    @Override
    public EmailDto intermediaSendEmail(EmailDto emailDto) {
        return null;
    }

} //end EmailServicesImpl