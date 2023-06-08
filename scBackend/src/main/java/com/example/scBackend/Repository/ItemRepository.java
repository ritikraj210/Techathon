package com.example.scBackend.Repository;

import com.example.scBackend.Entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item,Long> {
}
