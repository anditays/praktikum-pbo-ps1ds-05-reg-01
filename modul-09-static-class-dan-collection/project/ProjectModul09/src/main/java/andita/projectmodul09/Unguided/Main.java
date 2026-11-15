/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andita.projectmodul09.Unguided;

/**
 *
 * @author andit
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // Membuat List menggunakan generics
        List<HasilEksperimen> listEksperimen =
                new ArrayList<>();

        // Menambahkan data eksperimen
        listEksperimen.add(
                new HasilEksperimen(
                        "Logistic Regression", 0.82, 12
                )
        );

        listEksperimen.add(
                new HasilEksperimen(
                        "Random Forest", 0.91, 45
                )
        );

        listEksperimen.add(
                new HasilEksperimen(
                        "SVM", 0.87, 60
                )
        );

        listEksperimen.add(
                new HasilEksperimen(
                        "KNN", 0.79, 5
                )
        );

        listEksperimen.add(
                new HasilEksperimen(
                        "Decision Tree", 0.84, 8
                )
        );


        // 1. Menampilkan jumlah eksperimen
        System.out.println(
                "Jumlah eksperimen: "
                + HasilEksperimen.getJumlahEksperimen()
        );


        // 2. Sorting berdasarkan akurasi tertinggi
        Collections.sort(listEksperimen);

        System.out.println("\nSorted by akurasi");

        listEksperimen.forEach(
                System.out::println
        );


        // 3. Sorting berdasarkan waktu training tercepat
        Collections.sort(
                listEksperimen,
                new WaktuTrainingComparator()
        );

        System.out.println("\nSorted by waktu training");

        listEksperimen.forEach(
                System.out::println
        );


        // 4. Filtering akurasi minimal 0.85
        List<HasilEksperimen> akurasiMinimal =
                listEksperimen.stream()
                        .filter(
                                model -> model.getAkurasi() >= 0.85
                        )
                        .collect(Collectors.toList());

        System.out.println(
                "\nModel dengan akurasi minimal 0.85"
        );

        akurasiMinimal.forEach(
                System.out::println
        );


        // 5. Pencarian model KNN menggunakan lambda
        HasilEksperimen modelKNN =
                listEksperimen.stream()
                        .filter(
                                model -> model.getNamaModel()
                                        .equals("KNN")
                        )
                        .findFirst()
                        .orElse(null);

        System.out.println("\nPencarian model KNN");

        System.out.println(modelKNN);
    }
}
