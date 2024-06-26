package com.dogukancifci.business.dto;

import com.dogukancifci.annotation.AnnotationUniqueRoleName;
import com.dogukancifci.audit.AuditingAwareBaseDto;
import com.dogukancifci.role.ERole;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import lombok.extern.log4j.Log4j2;

import java.io.Serializable;
import java.util.Date;

//LOMBOK
@Data //@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
@Log4j2
@Builder
//@SneakyThrows

//RoleDto
public class RoleDto extends AuditingAwareBaseDto implements Serializable {

    //SERILESTIRME
    public static final Long serialVersionUID = 1L;

    //Role ID
    private  Long roleId;

    //Role Name
    //Validation oto control
    @NotEmpty(message = "{role.name.validation.constraints.NotNull.message}")
    //Annotation kullanmalisin cunku database ayni role adinda olmamasi gerekiyor(unique)
    @AnnotationUniqueRoleName
    @Builder.Default
    private String roleName= ERole.USER.toString();

    //System Created Date
    private Date systemCreatedDate;


}//end class RoleDto
