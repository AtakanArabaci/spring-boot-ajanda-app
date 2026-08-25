# 📅 Kişisel Ajanda & Görev Yönetimi (Spring Boot & Modern UI)

Spring Boot mimarisi ve modern bir web arayüzü ile geliştirilmiş, RESTful prensiplere dayalı kişisel ajanda ve görev takip uygulamasıdır. Proje; 3 katmanlı mimari (Controller-Service-Repository), veri kalıcılığı ve asenkron HTTP haberleşmesini uçtan uca uygulamak amacıyla hazırlanmıştır.

---

## 🚀 Özellikler

* **Tarih Odaklı Ajanda Yapısı:** Görevleri seçilen tarihe göre otomatik gruplar ve akordiyon menü düzeninde listeler.
* **Geçmiş Tarih Doğrulaması:** Kullanıcının geçmiş tarihlere görev eklemesini hem UI hem de mantıksal kontrollerle engeller.
* **Durum ve Kategori Ayrımı:**
  * **Bekleyen Görevler:** Planlanan ve tarihi henüz gelmemiş görevler.
  * **Süresi Geçmiş Görevler:** Tarihi geçtiği halde tamamlanmamış görevlerin otomatik taşındığı uyarı alanı.
  * **Yapılan / Tamamlanan Görevler:** Tek tıkla tamamlanan veya istenildiğinde geri alınabilen görevler.
* **Kalıcı Dosya Veritabanı:** Gömülü H2 veritabanı dosya tabanlı (`file:./data/ajandadb`) yapılandırılarak uygulama yeniden başlatılsa bile verilerin korunması sağlandı.
* **Glassmorphism UI:** JavaScript `Fetch API` ile backend ile haberleşen modern, göz yormayan arayüz tasarımı.

---

## 🛠️ Kullanılan Teknolojiler

| Alan | Teknoloji / Kütüphane |
| :--- | :--- |
| **Backend** | Java 17+, Spring Boot 3, Spring Data JPA |
| **Veritabanı** | H2 Database (File-based Engine) |
| **Yardımcı Araçlar** | Lombok, Maven |
| **Frontend** | HTML5, CSS3 (Glassmorphism & Flexbox/Grid), JavaScript (Fetch API) |
| **API Formatı** | RESTful JSON |

---

## 🔌 REST API Uç Noktaları

| HTTP Metodu | Endpoint | Açıklama |
| :--- | :--- | :--- |
| `GET` | `/api/gorevler` | Tüm görev listesini JSON olarak getirir |
| `POST` | `/api/gorevler` | Yeni bir görev ekler |
| `PUT` | `/api/gorevler/{id}` | Belirtilen ID'ye sahip görevi günceller |
| `PATCH` | `/api/gorevler/{id}/tamamla` | Görevin tamamlanma durumunu tersine çevirir (true/false) |
| `DELETE` | `/api/gorevler/{id}` | Belirtilen görevi veritabanından kalıcı olarak siler |

---

## 💻 Kurulum ve Çalıştırma

1. **Projeyi klonlayın:**
   ```bash
   git clone [https://github.com/AtakanArabaci/spring-boot-ajanda-app.git](https://github.com/AtakanArabaci/spring-boot-ajanda-app.git)
   cd spring-boot-ajanda-app
