package com.example.scBackend.Service;

import com.example.scBackend.Entity.Item;
import com.example.scBackend.Exception.ItemNotFoundException;
import com.example.scBackend.Repository.ItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class ItemServiceImpl implements ItemService{

    ItemRepository itemRepository;
    @Override
    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item getItem(Long id) {
        Optional<Item> item = itemRepository.findById(id);
        return unwrapItem(item, id);
    }
    static Item unwrapItem(Optional<Item> entity, Long id) {
        if (entity.isPresent()) return entity.get();
        else throw new ItemNotFoundException(id);
    }
}
