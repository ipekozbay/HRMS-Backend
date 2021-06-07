
# Human Resources Management System

![unknown](https://user-images.githubusercontent.com/72815766/121091766-32e85780-c7f3-11eb-92f8-d6f2f81941df.png)


### ✔ Req 1 : İş Arayanlar sisteme kayıt olabilmelidir.

Kabul Kriterleri:

Kayıt sırasında kullanıcıdan ad, soyad, tcno, doğum yılı, e-Posta, şifre, şifre tekrarı bilgileri istenir.
Tüm alanlar zorunludur. Kullanıcı bilgilendirilir.
Mernis doğrulaması yapılarak sisteme kayıt gerçekleştirilir.
Doğrulama geçerli değilse kullanıcı bilgilendirilir.
Daha önce kayıtlı bir e-posta veya tcno var ise kayıt gerçekleşmez. Kullanıcı bilgilendirilir.
Kayıdın gerçekleşmesi için e-posta doğrulaması gerekir.

### ✔ Req 2 : İş verenler sisteme kayıt olabilmelidir.

Kabul Kriterleri:

Kayıt sırasında kullanıcıdan şirket adı, web sitesi, web sitesi ile aynı domaine sahip e-posta, telefon, şifre, şifre tekrarı bilgileri istenir. Burada amaç sisteme şirket olmayanların katılmasını engellemektir.
Tüm alanlar zorunludur. Kullanıcı bilgilendirilir.
Şirket kayıtları iki şekilde doğrulanır. Kayıdın gerçekleşmesi için e-posta doğrulaması gerekir. HRMS personelinin (bizim :)) onayı gerekmektedir.
Daha önce kayıtlı bir e-posta var ise kayıt gerçekleşmez. Kullanıcı bilgilendirilir.

### ✔ Req 3 : Sisteme genel iş pozisyonu isimleri eklenebilmelidir. Örneğin Software Developer, Software Architect.

Kabul Kriterleri:

Bu pozisyonlar tekrar edemez. Kullanıcı uyarılır.

### ✔ Req 4 : İş verenler listelenebilmelidir. (Sadece tüm liste)

### ✔ Req 5 : İş arayanlar listelenebilmelidir. (Sadece tüm liste)

### ✔ Req 6 : İş pozisyonları listelenebilmelidir. (Sadece tüm liste)

### ✔ Req 7 : İş verenler sisteme iş ilanı ekleyebilmelidir.

İş ilanı formunda;
Seçilebilir listeden (dropdown) genel iş pozisyonu seçilebilmelidir.(Örneğin Java Developer)(Zorunlu)
İş tanımı girişi yapılabilmelidir. (Örneğin; firmamız için JAVA, C# vb. dillere hakim....)(Zorunlu)
Şehir bilgisi açılır listeden seçilebilmelidir. (Zorunlu)
Maaş skalası için min-max girişi yapılabilmelidir. (Opsiyonel)
Açık pozisyon adedi girişi yapılabilmelidir. (Zorunlu)
Son başvuru tarihi girişi yapılabilmelidir.

### ✔ Req 8 : Sistemdeki tüm aktif iş ilanları listelenebilmelidir.

Liste, tablo formunda gelmelidir.
Listede firmadı, genel iş pozisyonu adı, açık pozisyon adedi, yayın tarihi, son başvuru tarihi bilgileri olmalıdır.

### ✔ Req 9 : Sistemdeki tüm aktif iş ilanları tarihe göre listelenebilmelidir.

Liste, tablo formunda gelmelidir.
Listede firmadı, genel iş pozisyonu adı, açık pozisyon adedi, yayın tarihi, son başvuru tarihi bilgileri olmalıdır.

### ✔ Req 10 : Sistemde bir firmaya ait tüm aktif iş ilanları listelenebilmelidir.

Liste, tablo formunda gelmelidir.
Listede firmadı, genel iş pozisyonu adı, açık pozisyon adedi, yayın tarihi, son başvuru tarihi bilgileri olmalıdır.

### ✔ Req 11 : İş verenler sistemdeki bir ilanı kapatabilmelidir. (Pasif ilan)

### ✔ Req 12: Adaylar sisteme CV girişi yapabilmelidir.

Adaylar okudukları okulları sisteme ekleyebilmelidir. (Okul adı, bölüm)
Bu okullarda hangi yıllarda okuduklarını sisteme girebilmelidir.
Eğer mezun değilse mezuniyet yılı boş geçilebilmelidir.
Adayların okudukları okullar mezuniyet yılına göre tersten sıralanabilmelidir. Mezun olunmamışsa yine bu okul en üstte ve "devam ediyor" olarak görüntülenmelidir.
Adaylar iş tecübelerini girebilmelidir. (İş yeri adı, pozisyon)
Bu tecrübelerini hangi yıllarda yaptıklarını sisteme girebilmelidir.
Eğer hala çalışıyorsa işten ayrılma yılı boş geçilebilmelidir.
Adayların tecrübeleri yıla göre tersten sıralanabilmelidir. Hala çalışıyorsa yine bu tecrübesi en üstte ve "devam ediyor" olarak görüntülenmelidir.
Adaylar bildikleri yabancı dilleri sisteme girebilmelidir. ( Dil, Seviye -> 1-5)
Adaylar sisteme fotoğraf girebilmelidir. Adaya ait fotoğraf https://cloudinary.com/pricing sisteminde tutulacaktır. (Dış servis entegrasyonu) Ücretsiz hesabı kullanınız.
Adaylar sisteme github adreslerini girebilmelidir.
Adaylar sisteme linkedin adreslerini girebilmelidir.
Adaylar bildikleri programlama dillerini veya teknolojilerini sisteme girebilmelidir. (Programlama/Teknoloji adı) Örneğin; React
Adaylar sisteme ön yazı ekleyebilmelidir. (Örneğin: Çalışmayı çok severim....)
