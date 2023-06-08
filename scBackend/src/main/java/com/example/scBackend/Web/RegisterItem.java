package com.example.scBackend.Web;

import com.example.scBackend.Entity.Item;
import com.example.scBackend.Entity.Slot;
import com.example.scBackend.Service.ItemService;
import com.example.scBackend.Service.SlotService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/registerItem")
public class RegisterItem {

    @Autowired
    ItemService itemService;


    @PostMapping()
    public ResponseEntity<Item> saveStatus(@RequestBody Item item) {
        return new ResponseEntity<>(itemService.saveItem(item), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> getSlot(@PathVariable Long id) {
        return new ResponseEntity<>( itemService.getItem(id), HttpStatus.OK);
    }

}
