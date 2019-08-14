class mainlagi {
    public static void main(String[] args){
 
        Motor Vario;
        Vario = new Motor ("Hitam", 2, "Motor Bergigi");
        Motor Beat;
        Beat = new Motor ("Biru", 4, "Motor automathic");

        System.out.println("Jenis Kendaraan: Motor\nWarna Motor: " +Vario.warna + "\nJumlah Roda Motor: " + Vario.jumlahroda + "\nJenis Motor: " + Vario.jenis);
        System.out.println("\nJenis Kendaraan: Motor\nWarna Motor: " +Beat.warna + "\nJumlah Roda Motor: " + Beat.jumlahroda + "\nJenis Motor: " + Beat.jenis);   
    }
}
