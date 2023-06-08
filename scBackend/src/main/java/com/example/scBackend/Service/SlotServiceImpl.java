package com.example.scBackend.Service;

import com.example.scBackend.Entity.Slot;
import com.example.scBackend.Exception.SlotNotFoundException;
import com.example.scBackend.Repository.SlotRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@AllArgsConstructor
@Service
public class SlotServiceImpl implements SlotService{
    SlotRepository slotRepository;
    @Override
    public Slot saveSlot(Slot slot) {
        return slotRepository.save(slot);
    }

    @Override
    public Slot getSlot(Long id) {
        Optional<Slot> slot = slotRepository.findById(id);
        return unwrapSlot(slot, id);
    }

    @Override
    public Slot updateSlot(Long id, LocalDateTime dateTime, String approvalStatus) {
        Optional<Slot> slot = slotRepository.findById(id);
        Slot unwrappedSlot = unwrapSlot(slot, id);
        unwrappedSlot.setDateTime(dateTime);
        unwrappedSlot.setApprovalStatus(approvalStatus);
        return slotRepository.save(unwrappedSlot);
    }

    static Slot unwrapSlot(Optional<Slot> entity, Long id) {
        if (entity.isPresent()) return entity.get();
        else throw new SlotNotFoundException(id);
    }
}
