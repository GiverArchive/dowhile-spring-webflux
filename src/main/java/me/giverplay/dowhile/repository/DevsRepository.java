package me.giverplay.dowhile.repository;

import me.giverplay.dowhile.model.Devs;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevsRepository extends ReactiveMongoRepository<Devs, String>
{

}