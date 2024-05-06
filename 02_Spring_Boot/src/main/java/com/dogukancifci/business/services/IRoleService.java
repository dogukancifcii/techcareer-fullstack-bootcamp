package com.dogukancifci.business.services;

// D: Dto
// E: Entity

import java.util.List;

public interface IRoleService<D,E> {

    // MODEL MAPPER
    public D entityToDto(E e);
    public E dtoToEntity(D d);

    ////////////////////////////////////////////
    // ROLE CRUD

    // Role Create
    public D roleServiceCreate(D d);

    // Role List
    public List<D> roleServiceList(D d);

    // Role Find ID
    public D roleServiceFindById(Long id);

    // Role Update ID, Object
    public D roleServiceUpdateById(Long id, D d);

    // Role Delete ID
    public D roleServiceDeleteById(Long id);

}// end IRoleService
