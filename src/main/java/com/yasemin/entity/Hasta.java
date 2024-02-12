package com.yasemin.entity;

import com.yasemin.utility.enums.Cinsiyet;
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
@Table(name = "tblhasta")
public class Hasta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NotNull
    String ad;
    @NotNull
    @Column(length = 11,unique = true)
    int tcKimlikNo;
    @Size(max = 11)
    @NotNull
    String telefon;
    @Size(max = 250)
    String adres;
    @NotNull
    Integer yas;
    @NotNull
    Cinsiyet cinsiyet;

}
