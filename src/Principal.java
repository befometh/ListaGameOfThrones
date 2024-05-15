
import Esquema.Episodio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Episodio> base = new ArrayList<>();
        File gameOfTrones = new File("/home/befometh/Escritorio/Game_Of_Thrones.csv");
        String texto;
        try (BufferedReader br = new BufferedReader(new FileReader(gameOfTrones))){
            int aux = 0;
            ArrayList<String> lineas = new ArrayList<>();
            while ((texto = br.readLine())!=null) {
                if(aux == 0){
                    aux ++;
                    continue;
                }
                lineas.add(texto);
//                String[] campos = texto.split(",");
            }
//            for(String campo:campos)
//                System.out.println(linea);
        }catch(IOException e){
            System.err.println("Error al leer archivo");
        }


    }
}
