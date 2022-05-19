# BankSystem
 Java Swing ile Banka Sistemi
Sistemdeki Roller:
### ● Müşteriler
- Hesaplarından para çekebilirler ve yatırabilirler.
- Yeni hesap açma ve var olan bir hesabı silme talebinde bulunabilirler.
- Bakiyesi “0” olmayan bir hesap silinemez.
- Birbirleri arasında para transferi yapabilirler.
- Farklı para birimlerine sahip hesaplar arası transferler sırasında gönderilen miktar
hedef para birimine otomatik olarak çevrilir.
- Bilgilerini güncelleyebilirler.
- Bankadan kredi talep edebilirler.
- Bankaya para transferi yapabilirler. (Kredi borcu ödeme)
- Bankanın kredi talebini onaylaması durumunda istenilen vade oranınca (faiz ve
anapara toplamı) bölünerek aylara borç olarak yansıtılır.
- Faiz ve gecikme faiz oranı banka müdürü tarafından belirlenir.
- Aylık özetlerini görüntüleyebilirler.


### ● Yönetici
- Bankanın genel durumunu (gelir, gider, kar ve toplam bakiye) görüntüleyebilmektedir.
- Yeni para birimi (Dolar, Euro, Sterling vs.) ekleyebilir ve kur değerlerini güncelleyebilir.
- Çalışanların maaş ücretlerini belirler.
- Kredi ve gecikme faiz oranını belirler.
- Müşteri ekleyebilir.
- Sisteme yeni bir müşteri eklenmesi durumunda en az müşteriye sahip olan temsilciye atanır.
- Bankada gerçekleşen tüm işlemleri (para çekme, yatırma ve transfer) görüntüler.


### ● Müşteri Temsilcisi
- Her müşterinin bir temsilcisi vardır.
- Müşteri ekleme, silme ve düzenleme yapabilir (silme ve düzenleme işlemleri sadece kendi
müşterileri için geçerlidir).
- İlgilendikleri müşterilerin genel durumlarını görüntüler.
- Müşterilerden gelen hesap açma, silme ve kredi taleplerini görüntüleme ve onaylama sorumluluğu temsilcilere aittir.
- İlgilendikleri müşterilerin işlemlerini (para çekme, yatırma ve transfer) görüntüler.
