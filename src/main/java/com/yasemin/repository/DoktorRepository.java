package com.yasemin.repository;

import com.yasemin.entity.Doktor;
import com.yasemin.utility.enums.DoktorDurum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoktorRepository extends JpaRepository<Doktor,Long> {

}
