package edu.mve.prj.repository;

import edu.mve.prj.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends MongoRepository<Item, String> {
}
