import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanI = new Scanner(System.in);
        Scanner scanS = new Scanner(System.in);
        Random rand = new Random();
        int menu1;
        ArrayList<Hewan> listHewan = new ArrayList<>();

        int sudahDapatHewan = 0;
        do {
            int dapatHewan = rand.nextInt(3);
            if(dapatHewan == 0){
                String nama;
                do {                    
                    System.out.print("Mendapatkan hewan anjing, beri nama: ");
                    nama = scanS.nextLine();
                } while (nama.isEmpty());
                Anjing newAnjing = new Anjing(nama);
                listHewan.add(newAnjing);
                sudahDapatHewan++;
            } else if(dapatHewan == 1){
                String nama;
                do {               
                    System.out.print("Mendapatkan hewan kucing, beri nama: ");
                    nama = scanS.nextLine();
                } while (nama.isEmpty());
                Kucing newKucing = new Kucing(nama);
                listHewan.add(newKucing);
                sudahDapatHewan++;
            } else if(dapatHewan == 2){
                String nama;
                do {             
                    System.out.print("Mendapatkan hewan ikan, beri nama: ");
                    nama = scanS.nextLine();
                } while (nama.isEmpty());
                Ikan newIkan = new Ikan(nama);
                listHewan.add(newIkan);
                sudahDapatHewan++;
            }
        } while(sudahDapatHewan < 3);

        do {
            
            System.out.println("MENU");
            System.out.println("====");
            System.out.println("1. Tambah Hewan");
            System.out.println("2. Lihat Status");
            System.out.println("3. Beri Makan");
            System.out.println("4. Bermain");
            System.out.println("5. Beri Obat");
            do {
                System.out.print("Pilihan: ");
                menu1 = scanI.nextInt();
            } while(menu1 < 1 || menu1 > 5);
    
            if(menu1 == 1){
                int dapatHewan = rand.nextInt(3);
                if(dapatHewan == 0){
                    String nama;
                    System.out.print("Mendapatkan hewan anjing, beri nama: ");
                    nama = scanS.nextLine();
                    Anjing newAnjing = new Anjing(nama);
                    listHewan.add(newAnjing);
                } else if(dapatHewan == 1){
                    String nama;
                    System.out.print("Mendapatkan hewan kucing, beri nama: ");
                    nama = scanS.nextLine();
                    Kucing newKucing = new Kucing(nama);
                    listHewan.add(newKucing);
                } else if(dapatHewan == 2){
                    String nama;
                    System.out.print("Mendapatkan hewan ikan, beri nama: ");
                    nama = scanS.nextLine();
                    Ikan newIkan = new Ikan(nama);
                    listHewan.add(newIkan);
                }
            } else if(menu1 == 2){
                for(int i = 0; i < listHewan.size(); i++){
                    System.out.println(listHewan.get(i).nama + " (" + listHewan.get(i).jenis + "): (Hapiness, Energy, Health): " + listHewan.get(i).hapiness + " " + listHewan.get(i).energy + " " + listHewan.get(i).health);
                }
            } else if(menu1 == 3){
                int pilihMakan;
                int pilihHewan;
                System.out.println("MAKANAN");
                System.out.println("=======");
                System.out.println("1. Plankton");
                System.out.println("2. D. Sapi");
                System.out.println("3. D. Ayam");
                do {          
                    System.out.print("Pilihan: ");
                    pilihMakan = scanI.nextInt();
                } while (pilihMakan < 1 || pilihMakan > 3);
                for(int i = 0; i < listHewan.size(); i++){
                    System.out.println((i + 1) + ". " + listHewan.get(i).nama + "(" + listHewan.get(i).jenis + "): (Hapiness, Energy, Health): " + listHewan.get(i).hapiness + " " + listHewan.get(i).energy + " " + listHewan.get(i).health);
                }
                do {
                    System.out.print("Kepada: ");
                    pilihHewan = scanI.nextInt();
                } while(pilihHewan < 1 || pilihHewan > listHewan.size());
                if(pilihMakan == 1){
                    Plankton Plankton = new Plankton();
                    listHewan.get(pilihHewan-1).makan(Plankton, listHewan.get(pilihHewan-1));
                } else if(pilihMakan == 2){
                    DAyam DAyam = new DAyam();
                    listHewan.get(pilihHewan-1).makan(DAyam, listHewan.get(pilihHewan-1));
                } else if(pilihMakan == 3){
                    DSapi DSapi = new DSapi();
                    listHewan.get(pilihHewan-1).makan(DSapi, listHewan.get(pilihHewan-1));
                }
            } else if(menu1 == 4){
                int pilihBermain;
                System.out.println("BERMAIN");
                System.out.println("=======");
                System.out.println("1. Ajak Bermain");
                System.out.println("2. Suruh Bermain");
                do {
                    System.out.print("Pilihan: ");
                    pilihBermain = scanI.nextInt();
                } while(pilihBermain < 1 || pilihBermain > 2);
                if(pilihBermain == 1){
                    int pilihHewan;
                    for(int i = 0; i < listHewan.size(); i++){
                        System.out.println((i + 1) + ". " + listHewan.get(i).nama + "(" + listHewan.get(i).jenis + "): (Hapiness, Energy, Health): " + listHewan.get(i).hapiness + " " + listHewan.get(i).energy + " " + listHewan.get(i).health);
                    }
                    do {
                        System.out.print("Kepada: ");
                        pilihHewan = scanI.nextInt();
                    } while(pilihHewan < 1 || pilihHewan > listHewan.size());
                    listHewan.get(pilihHewan-1).bermain(listHewan.get(pilihHewan-1), listHewan.get(pilihHewan-1));
                } else if(pilihBermain == 2){
                    int pilihHewan1;
                    int pilihHewan2;
                    for(int i = 0; i < listHewan.size(); i++){
                        System.out.println((i + 1) + ". " + listHewan.get(i).nama + "(" + listHewan.get(i).jenis + "): (Hapiness, Energy, Health): " + listHewan.get(i).hapiness + " " + listHewan.get(i).energy + " " + listHewan.get(i).health);
                    }
                    do {
                        System.out.print("Kepada Hewan1: ");
                        pilihHewan1 = scanI.nextInt();
                    } while(pilihHewan1 < 1 || pilihHewan1 > listHewan.size());
                    for(int i = 0; i < listHewan.size(); i++){
                        System.out.println((i + 1) + ". " + listHewan.get(i).nama + "(" + listHewan.get(i).jenis + "): (Hapiness, Energy, Health): " + listHewan.get(i).hapiness + " " + listHewan.get(i).energy + " " + listHewan.get(i).health);
                    }
                    do {
                        System.out.print("Dengan Hewan2: ");
                        pilihHewan2 = scanI.nextInt();
                        if(pilihHewan1 == pilihHewan2){
                            System.out.println("Hewan tidak boleh sama!");
                        }
                    } while(pilihHewan2 < 1 || pilihHewan2 > listHewan.size() || pilihHewan1 == pilihHewan2);
                    listHewan.get(pilihHewan1-1).bermain(listHewan.get(pilihHewan1-1), listHewan.get(pilihHewan2-1));
                    listHewan.get(pilihHewan2-1).bermain(listHewan.get(pilihHewan1-1), listHewan.get(pilihHewan2-1));
                }
            } else if(menu1 == 5){
                int pilihHewan;
                System.out.println("Beri Obat");
                System.out.println("=========");
                for(int i = 0; i < listHewan.size(); i++){
                    System.out.println((i + 1) + ". " + listHewan.get(i).nama + "(" + listHewan.get(i).jenis + "): (Hapiness, Energy, Health): " + listHewan.get(i).hapiness + " " + listHewan.get(i).energy + " " + listHewan.get(i).health);
                }
                do {
                    System.out.print("Kepada: ");
                    pilihHewan = scanI.nextInt();
                } while(pilihHewan < 1 || pilihHewan > listHewan.size());
                listHewan.get(pilihHewan).health += 5;
            }

            for(int i = 0; i < listHewan.size(); i++){
                if(listHewan.get(i).health < 0){
                    listHewan.remove(i);
                }
            }
        } while(listHewan.size() > 2);
        if(listHewan.size() < 3){
            System.out.println("GAME OVER");
        }
    }
}
