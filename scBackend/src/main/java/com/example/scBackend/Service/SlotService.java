package com.example.scBackend.Service;

import com.example.scBackend.Entity.Slot;

import java.time.LocalDateTime;

public interface SlotService {
    Slot saveSlot(Slot student);

    Slot getSlot(Long id);

    Slot updateSlot(Long id, LocalDateTime dateTime, String approvalStatus);
}
