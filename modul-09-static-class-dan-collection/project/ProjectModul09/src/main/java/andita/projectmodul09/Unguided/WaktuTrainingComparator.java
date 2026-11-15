/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andita.projectmodul09.Unguided;

/**
 *
 * @author andit
 */
import java.util.Comparator;

public class WaktuTrainingComparator
        implements Comparator<HasilEksperimen> {

    @Override
    public int compare(HasilEksperimen h1,
                       HasilEksperimen h2) {

        return Integer.compare(
                h1.getWaktuTraining(),
                h2.getWaktuTraining()
        );
    }
}