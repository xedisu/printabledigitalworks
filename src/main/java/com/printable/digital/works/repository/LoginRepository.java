package com.printable.digital.works.repository;


import com.printable.digital.works.model.UserCredentials;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends MongoRepository<UserCredentials,String> {

   @Query("{userName:'?0'}")
    UserCredentials findUserCredentialsByName(String name);

}
