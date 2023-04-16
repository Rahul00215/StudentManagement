package com.rahul.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rahul.model.StudentMod;
@Repository
public interface StudentRepos extends CrudRepository<StudentMod, Long> {

}
