public class Hewan {
    String nama;
    String jenis;
    int hapiness = 5;
    int energy = 5;
    int health = 5;

    public Hewan(String nama) {
        this.nama = nama;
    }

    void bermain(Hewan Hewan1, Hewan Hewan2){
        if(Hewan1 instanceof Ikan){
            if(Hewan2 instanceof Ikan){
                hapiness += 5;
                energy -= 3;
                health += 1;
            } else if(Hewan2 instanceof Kucing){
                hapiness -= 10;
                energy -= 10;
                health -= 15;
            } else if(Hewan2 instanceof Anjing){
                hapiness -= 10;
                energy -= 10;
                health -= 10;
            }
        } else if(Hewan1 instanceof Kucing){
            if(Hewan2 instanceof Ikan){
                hapiness += 10;
                energy -= 1;
                health += 5;
            } else if(Hewan2 instanceof Kucing){
                hapiness += 10;
                energy -= 5;
                health += 3;
            } else if(Hewan2 instanceof Anjing){
                hapiness -= 10;
                energy -= 10;
                health -= 8;
            }
        } else if(Hewan1 instanceof Anjing){
            if(Hewan2 instanceof Ikan){
                hapiness += 5;
                energy -= 1;
                health += 3;
            } else if(Hewan2 instanceof Kucing){
                hapiness += 10;
                energy -= 3;
                health += 2;
            } else if(Hewan2 instanceof Anjing){
                hapiness += 10;
                energy -= 5;
                health += 3;
            }
        }
    }

    void makan(Makanan makan, Hewan hewan){
        if(hewan instanceof Ikan){
            if(makan instanceof Plankton){
                 hapiness += 5;
                 energy += 5;
                 health += 5;
            } else if(makan instanceof DSapi){
                hapiness -= 5;
                energy += 2;
                health -= 1;
            } else if(makan instanceof DAyam){
                hapiness -= 5;
                energy += 1;
                health -= 3;
            }
        } else if(hewan instanceof Kucing){
            if(makan instanceof Plankton){
                hapiness -= 5;
                energy += 2;
                health -= 3;
           } else if(makan instanceof DSapi){
               hapiness += 2;
               energy += 3;
               health += 1;
           } else if(makan instanceof DAyam){
               hapiness += 5;
               energy += 5;
               health += 5;
           }
        } else if(hewan instanceof Anjing){
            if(makan instanceof Plankton){
                hapiness -= 5;
                energy += 3;
                health -= 2;
           } else if(makan instanceof DSapi){
               hapiness += 5;
               energy += 5;
               health += 5;
           } else if(makan instanceof DAyam){
               hapiness += 3;
               energy += 4;
               health += 2;
           }
        }
    }
}
