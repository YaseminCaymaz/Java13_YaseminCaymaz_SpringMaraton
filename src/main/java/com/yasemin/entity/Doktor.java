package com.yasemin.entity;

import com.yasemin.utility.enums.DoktorDurum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbldoktor")
public class Doktor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NotNull
    @Size(max = 64)
    String ad;
    @NotNull
    @Size(max = 64)
    String soyad;
    @Size(max = 250)
    String adres;
    @Size(max = 11)
    String telefon;
    Long bransId;
    DoktorDurum durum;
}
