package com.nur.phonebook.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nur.phonebook.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
