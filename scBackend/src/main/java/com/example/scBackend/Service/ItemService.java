package com.example.scBackend.Service;

import com.example.scBackend.Entity.Item;
import com.example.scBackend.Entity.Slot;

import java.time.LocalDateTime;

public interface ItemService {

    Item saveItem(Item item);

    Item getItem(Long id);
}
