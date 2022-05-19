# BankSystem
 Java Swing ile Banka Sistemi
Sistemdeki Roller:
###● Müşteriler
- Hesaplarından para çekebilirler ve yatırabilirler./
- Yeni hesap açma ve var olan bir hesabı silme talebinde bulunabilirler./
- Bakiyesi “0” olmayan bir hesap silinemez./
- Birbirleri arasında para transferi yapabilirler./
- Farklı para birimlerine sahip hesaplar arası transferler sırasında gönderilen miktar
hedef para birimine otomatik olarak çevrilir./
- Bilgilerini güncelleyebilirler./ 
- Bankadan kredi talep edebilirler./
- Bankaya para transferi yapabilirler. (Kredi borcu ödeme)/
- Bankanın kredi talebini onaylaması durumunda istenilen vade oranınca (faiz ve
anapara toplamı) bölünerek aylara borç olarak yansıtılır./
- Faiz ve gecikme faiz oranı banka müdürü tarafından belirlenir./
- Aylık özetlerini görüntüleyebilirler.


###● Yönetici
o Bankanın genel durumunu (gelir, gider, kar ve toplam bakiye) görüntüleyebilmektedir.
o Yeni para birimi (Dolar, Euro, Sterling vs.) ekleyebilir ve kur değerlerini güncelleyebilir.
o Çalışanların maaş ücretlerini belirleyebilecektir.
▪ Tek bir çalışan türü vardır (müşteri temsilcisi). Hepsinin maaş miktarı aynıdır.
o Kredi ve gecikme faiz oranını belirler.
o Müşteri ekleyebilir.
▪ Sisteme yeni bir müşteri eklenmesi durumunda en az müşteriye sahip olan
temsilciye atanır.
o Sistemi bir ay ilerletebilir.
▪ İsterlerin test edilebilmesi için sizlerden uygulama tarihini bir ay ileriye
öteleyebilmeniz istenmektedir.
▪ Bu ilerletme işlemi sonucunda -> maaşların ödenmesi, gelir-gider durumlarının
güncellenmesi ve müşterilerin bir sonraki aya ait borçlarının kendilerine
yansıtılması gerekmektedir.
o Bankada gerçekleşen tüm işlemleri (para çekme, yatırma ve transfer)
görüntüleyebilmektedir.
▪ İşlemleri listelerken “son X adet işlemi listele” şeklinde bir seçenek sunulmalıdır.
▪ Örnek olarak “son 5 işlemi listele” sorgusunun çıktısı Tablo I’de gösterilmiştir.

###● Müşteri Temsilcisi
o Her müşterinin bir temsilcisi vardır.
o Müşteri ekleme, silme ve düzenleme yapabilir (silme ve düzenleme işlemleri sadece kendi
müşterileri için geçerlidir).
o Müşteri bilgilerini güncelleyebilirler. (Adres, Telefon vs.)
o İlgilendikleri müşterilerin genel durumlarını (gelir, gider ve toplam bakiye)
görüntüleyebilmektedir.
o Müşterilerden gelen hesap açma, silme ve kredi taleplerini görüntüleme ve onaylama
sorumluluğu temsilcilere aittir.
o İlgilendikleri müşterilerin işlemlerini (para çekme, yatırma ve transfer)
görüntüleyebilmektedir.
