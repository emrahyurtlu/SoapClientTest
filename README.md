# SoapClientTest
SoapClient örneği geliştirdik.
WSDL Adresi: http://wsgeoip.lavasoft.com/ipservice.asmx?WSDL

Adımlar:
- wsimport komutu ile belirtilen wsdl kullanılarak sınıfları oluşturup projeye dahil ettik.
- wsimport -keep -s [kodun_olusturulacağı_klasör_adresi] http://wsgeoip.lavasoft.com/ipservice.asmx?WSDL
- Projede belirtilen yapıya göre kodu yazıp test ettik.
