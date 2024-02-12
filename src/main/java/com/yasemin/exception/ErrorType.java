package com.yasemin.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ErrorType {

    INTERNAL_ERROR(1000, "Sunucuda beklenmeye hata oluştu, lütfen terar deneyiniz",HttpStatus.INTERNAL_SERVER_ERROR),
    BAD_REQUEST_ERROR(1001, "Girilen parametreler hatalıdır. Lütfen düzelterek tekrar deneyiniz", BAD_REQUEST),
    ERROR_DOKTOR_EKLEME_HATASI(1111, "Doktor eklenemedi, girilen parametreler eksik", BAD_REQUEST),
    REGISTER_KULLANICIADI_KAYITLI(1001,"Kullanıcı adı kayıtlı", BAD_REQUEST),
    NAME_IS_NULL(1001,"Name alanı boş geçilemez", BAD_REQUEST),
    DOKTOR_BULUNAMADI(3001,"Doktor bulunamadı", BAD_REQUEST),
    HASTA_BULUNAMADI(4001,"Hasta bulunamadı", BAD_REQUEST),
    ID_NOT_FOUND(1001,"Aradığınız id ya ait kayıt bulunamamıştır.", BAD_REQUEST),
    ISTENILEN_VERI_BULUNAMAMAKTADIR(1002,"Aradıgınız bilgileri datada bulunmaktadır.",BAD_REQUEST),
    BRANS_ZATEN_KAYITLI(2001,"Bu Branş Zaten Kayıtlıdır", BAD_REQUEST),
    RANDEVU_OLUSTURULAMADI(5001,"Randevu talebiniz gercekleşmemiştir",BAD_REQUEST),
    INVALID_TOKEN(1002,"Geçersiz token", BAD_REQUEST);

    int code;
    String message;
    HttpStatus httpStatus;
}
