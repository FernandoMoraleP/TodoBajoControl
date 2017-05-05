/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todobajocontrol;

/**
 *
 * @author YANET
 */
public class TodoBajoControl {

    public void ejecutaTodoBajoControl() {
        Reader read = new Reader();
        int opcion;

        do {
            System.out.println("Elija una de las opciones.");
            System.out.println(" 1.- Registrate \n 2.- Predecir las fechas de tu ciclo \n 3.- Sugerencias de metodos anticonceptivos \n 4.- Salir");
            opcion = read.leeInt();
            switch (opcion) {

                case 1:
                    DatosPersonalesSeguros registro = new DatosPersonalesSeguros();
                    registro.creaRegistro();
                    break;

                case 2:
                    CicloMenstrual ciclo = new CicloMenstrual();
                    ciclo.calculaCiclo();
                    break;

                case 3:
                    MetodosAnticonceptivos met = new MetodosAnticonceptivos();
                    met.imprimeLisataMetodosAnticonceptivos();
                    met.imprimeInformacionMetodoAnticonceptivo();
                    break;
            }

        } while (opcion != 4);

    }
}
