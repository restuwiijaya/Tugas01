package t1point02;

public class T1point02 {

    
    public static void main(String[] args) {
        
        //Deklarasi array 2 dimensi
        String[][]huruf = {
            {"Adi","127647","Teknik Informatika"},
            {"Mika","129883","Sistem Komputer"},
            {"Budi","120495","Sistem Komputer"},
            {"Bunga","123489","Teknik Informatika"},    
        };

        //Menampilkan isi array dengan perulangan
        for (int i=0;i<4;i++){
            for (int j=0;j<3;j++){
                System.out.print(huruf[i][j]+"\t");
            }
            System.out.println();
        }
    }
 }
    
    

