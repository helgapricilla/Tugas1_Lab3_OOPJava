public class Mapel {
    private String nama_mapel, status;
    private double tugas, kuis, uts, uas, a;


    public Mapel(String nama_mapel, double tugas, double kuis, double uts, double uas){
        this.nama_mapel = nama_mapel;
        this.tugas = tugas;
        this.kuis = kuis;
        this.uts = uts;
        this.uas = uas;
    }
    public void show(){
        System.out.println(" ");
        System.out.println("Mata Pelajaran          : " + nama_mapel);
        System.out.println("Nilai Tugas             : " + tugas);
        System.out.println("Nilai Kuis              : " + kuis);
        System.out.println("Nilai UTS               : " + uts );
        System.out.println("Nilai UAS               : " + uas );
        System.out.println("Nilai Akhir             : " + Nilaiakhir());
        System.out.println("keterangan              : " + Status(a));
    }

    public double Nilaiakhir(){
         a = ((0.15 * tugas) + (0.20 * kuis) + (0.30 * uts) + (0.35 * uas));
        return a;
    }
    public String Status(double a){
        if (a < 75){
            return "Dibawah Rata-Rata/Tidak lulus";
        }
        else if(a >=75){
            return  "Lulus";
        }
        else {
            return "Input tidak valid";
        }
    }
}
