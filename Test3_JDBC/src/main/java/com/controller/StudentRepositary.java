package com.controller;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepositary extends CrudRepository<Student, String> {

}
