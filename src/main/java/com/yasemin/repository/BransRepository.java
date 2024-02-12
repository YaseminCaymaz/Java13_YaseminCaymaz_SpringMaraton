package com.yasemin.repository;

import com.yasemin.entity.Brans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BransRepository extends JpaRepository<Brans,Long> {
    Brans findByAd(String brans);
}
