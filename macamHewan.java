abstract class macamHewan implements Hewan {
    
    @Override
    public void mamalia(){
        System.out.println("Sapi");
        System.out.println("Kambing");
        System.out.println("Banteng");
        System.out.println("Domba");
        System.out.println("OrangUtan");  
    }
    @Override
    public void unggas(){
        System.out.println("Ayam");
        System.out.println("Bebek");
        System.out.println("Angsa");
        System.out.println("Itik");
        System.out.println("Burung");
    }
    
    @Override
    public void ikan(){
        System.out.println("Ikan Mas");
        System.out.println("Ikan Nila");
        System.out.println("Ikan Sapu Sapu");
        System.out.println("Paus");
        System.out.println("Hiu");
    }
    
    @Override
    public void reptil(){
        System.out.println("Ular");
        System.out.println("Komodo");
        System.out.println("Biawak");
        System.out.println("Buaya");
        System.out.println("Komodo kecil");
    }
}
