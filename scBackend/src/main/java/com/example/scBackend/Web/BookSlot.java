package com.example.scBackend.Web;

import com.example.scBackend.Entity.Slot;
import com.example.scBackend.Service.SlotService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/bookSlot")
public class BookSlot {

    @Autowired
    SlotService slotService;

    @PutMapping("/{id}")
    public ResponseEntity<Slot> updateSlot(@RequestBody Slot slot, @PathVariable Long id) {
        return new ResponseEntity<>(slotService.updateSlot(id,slot.getDateTime(),slot.getApprovalStatus()), HttpStatus.CREATED);
    }

//    @GetMapping("/status/{id}")
//    public ResponseEntity<Slot> getStatus(@PathVariable Long id) {
//        return new ResponseEntity<>( slotService.getSlot(id), HttpStatus.OK);
//    }

    @PostMapping("/book")
    public ResponseEntity<Slot> saveStatus(@RequestBody Slot slot) {
        return new ResponseEntity<>(slotService.saveSlot(slot), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Slot> getSlot(@PathVariable Long id) {
        return new ResponseEntity<>( slotService.getSlot(id), HttpStatus.OK);
    }

//    @GetMapping("/getGMV/{id}")
//    public ResponseEntity<Slot> getGMV(@PathVariable Long id) {
//        return new ResponseEntity<>( slotService.getSlot(id), HttpStatus.OK);
//    }

}
