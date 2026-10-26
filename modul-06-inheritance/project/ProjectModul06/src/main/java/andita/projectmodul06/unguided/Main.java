/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andita.projectmodul06.unguided;

/**
 *
 * @author andit
 */
public class Main {
    public static void main(String[] args) {

        Regresi regresi = new Regresi("Regresi Linier", 500, 4);

        Klasifikasi klasifikasi =
                new Klasifikasi("Decision Tree", 800, 3);

        DeepLearning neuralNetwork =
                new DeepLearning("Neural Network", 1000, 5, 3);

        Model[] daftarModel = {
            regresi,
            klasifikasi,
            neuralNetwork
        };

        int totalBiaya = 0;

        for (Model model : daftarModel) {
            model.tampilkanInformasi();

            int biaya = model.hitungBiaya();
            System.out.println("Biaya komputasi: " + biaya);
            System.out.println();

            totalBiaya += biaya;
        }

        System.out.println("Total biaya: " + totalBiaya);

        System.out.println("Biaya 10 epoch (Neural Network): "
                + daftarModel[2].hitungBiaya(10));

        System.out.println("Biaya 10 epoch (Regresi Linier): "
                + daftarModel[0].hitungBiaya(10));

        Regresi modelRegresi = (Regresi) daftarModel[0];

        System.out.println("Biaya 10 epoch batch 50 (Regresi Linier): "
                + modelRegresi.hitungBiaya(10, 50));
    }
}
