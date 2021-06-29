package com.synthshowcase.SynthesizersShowcase.repository;

import com.synthshowcase.SynthesizersShowcase.model.Synthesizer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "synth", path = "synth")
public interface SynthesizerRepository extends JpaRepository<Synthesizer, Long>  {
    
}
