package com.example.BTS.repo;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.BTS.entity.Bug;

public interface BugRepository extends MongoRepository<Bug,String> {


}
