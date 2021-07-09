package com.synthshowcase.SynthesizersShowcase.repository;

import com.synthshowcase.SynthesizersShowcase.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends JpaRepository<User,String> {

}
