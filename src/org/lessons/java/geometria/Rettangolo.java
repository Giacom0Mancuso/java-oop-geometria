package org.lessons.java.geometria;

public class Rettangolo {
        int altezza;
        int base;
        int perimetro;
        int area;


        Rettangolo(){
            this.altezza = altezza;
            this.base = base;
        }

        void calcolaPerimetro(int altezza, int base){
            perimetro = (altezza + base) * 2;
        }

        void calcolaArea(int altezza, int base){
            area = base * altezza;
        }

        String getInfoPerimetro(){
            String info = "Perimetro: " + perimetro;
            return info;
        }
        String getInfoArea(){
        String info = "Area: " + area;
        return info;
        }
        
}

