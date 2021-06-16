package com.iqmsoft.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iqmsoft.model.Sample;

public interface SampleRepository extends MongoRepository<Sample, String> {

}
