package com.yasemin.repository;

import com.yasemin.entity.Randevu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RandevuRepository extends JpaRepository<Randevu,Long> {
    List<Randevu> findByDoktorId(Long doktorId);
}
