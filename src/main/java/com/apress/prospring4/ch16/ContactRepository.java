package com.apress.prospring4.ch16;


import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dmytro on 22.06.16.
 */
public interface ContactRepository extends CrudRepository<Contact, Long> {
}
