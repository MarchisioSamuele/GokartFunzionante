package pkgGokart;

import java.util.Vector;
/**
 * Created by Sassu on 17/12/2015.
 */
public class Main {
    public static void main(String[] args){
        Races race = new Races(10, 5);
        Partecipanti partecipanti = new Partecipanti();
        Vector<Integer> vincitori = new Vector<>();
        int i = 0;
        int giri = 0;
        int giriMax = 0;
        int nPartecipanti = 20;
        
        //aggiunge i partecipanti
        for(i = 0; i < nPartecipanti; i++){
            partecipanti.add();
        }
        
        //fa eseguire la corsa ad ogni kart e salva il numero dei migliori
        for(i = 0; i < partecipanti.partecipanti.size(); i++){
            race.corsa(partecipanti.partecipanti.get(i));
            giri = partecipanti.partecipanti.get(i).getGiri();
            if(giri == giriMax){
                vincitori.add(partecipanti.partecipanti.get(i).getId());
            }else if(giri > giriMax){
                vincitori.clear();
                vincitori.add(partecipanti.partecipanti.get(i).getId());
                giriMax = giri;
            }
        }
        
        //stampa il numero dei kart migliori
        if(vincitori.size() > 1){
           System.out.print("I vincitori sono i kart numero: ");
           for(i = 0; i < vincitori.size()-1; i++){
               System.out.print(vincitori.get(i) + ", ");
           }
           System.out.println(vincitori.get(i) + ".");
        }else{
            System.out.println("Il vincitore e' il kart numero: " + vincitori.get(0) + ".");
        }
    }
}
