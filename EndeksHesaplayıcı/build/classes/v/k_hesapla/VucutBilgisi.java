package v.k_hesapla;

public class VucutBilgisi extends KisiselBilgi {
    private double kilo, boy;

    public VucutBilgisi(String isim,double kilo, double boy) {
        super(isim);
        this.kilo = kilo;
        this.boy = boy;
    }

    public double hesapla() {
        //Vücut kitle endeksi bu şekilde hesaplanır.
        double endeks = kilo / Math.pow(boy, 2);
        return endeks;
    }

    public String yazdir() {
        if (hesapla() > 0 && hesapla() <= 18.4)
            return String.format("Sevgili %s Vücut Kitle Endeksiniz %.2f'dir. Bu Sizin Zayıf Oldugunuzu Gösterir.",super.getIsim(),hesapla());
        else if (hesapla() >= 18.5 && hesapla() <= 24.9)
            return String.format("Sevgili %s Vücut Kitle Endeksiniz %.2f'dir. Bu Sizin Normal Oldugunuzu Gösterir.",super.getIsim(),hesapla());
        else if (hesapla()>=25&&hesapla()<=29.9)
            return String.format("Sevgili %s Vücut Kitle Endeksiniz %.2f'dir. Bu Sizin Fazla Kilolu Oldugunuzu Gösterir.",super.getIsim(),hesapla());
        else if (hesapla()>=30&&hesapla()<=34.9)
            return String.format("Sevgili %s Vücut Kitle Endeksiniz %.2f'dir. Bu Sizin Obez(1.Sınıf) Oldugunuzu Gösterir.",super.getIsim(),hesapla());
        else if (hesapla()>=35&&hesapla()<=44.9)
            return String.format("Sevgili %s Vücut Kitle Endeksiniz %.2f'dir. Bu Sizin  Obez(2.Sınıf) Oldugunuzu Gösterir.",super.getIsim(),hesapla());
        else if (hesapla()>=45)
            return String.format("Sevgili %s Vücut Kitle Endeksiniz %.2f'dir. Bu Sizin  Obez(3.Sınıf) Oldugunuzu Gösterir.",super.getIsim(),hesapla());

        return "Veri yok!";
    }
}
