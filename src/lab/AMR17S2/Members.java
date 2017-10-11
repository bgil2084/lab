package lab.AMR17S2;

import java.util.ArrayList;

public class Members {

    //instance fields
    private ArrayList<Individual> individuals;

    public  Members(){
        individuals = new ArrayList<Individual>();
    }

    public void addIndiv(Individual ind){
        individuals.add(ind);
    }

    public void delIndiv(Individual ind){
        individuals.remove(ind);
    }

    public String toString(){
        String output = "";
        for(Individual individual: individuals){
            output += individual.toString() +"\n";
        }
        return output;
    }

}
