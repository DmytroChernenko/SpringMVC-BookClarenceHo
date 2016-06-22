package com.apress.prospring4.ch16;

import java.util.List;

/**
 * Created by Dmytro on 22.06.16.
 */
public interface ContactService {

    List<Contact> findAll();
    Contact findById(Long id);
    Contact save(Contact contact);
}
