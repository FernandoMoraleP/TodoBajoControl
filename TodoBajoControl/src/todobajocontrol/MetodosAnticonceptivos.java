package todobajocontrol;

public class MetodosAnticonceptivos {

    private int opcion;
    //private PrintStream fsalida = System.out; 
    private final Reader read;

    public MetodosAnticonceptivos() {
        read = new Reader();
    }

    public void imprimeLisataMetodosAnticonceptivos() {

        System.out.println("\"La lista de Metodos anticonceptivos\"\n");
        System.out.println("1.-Abstinencia\n");
        System.out.println("2.-Parches\n");
        System.out.println("3.-Pildora Anticonceptiva\n");
        System.out.println("4.-Condones\n");
    }

    public void imprimeInformacionMetodoAnticonceptivo() {

        try {
            //dato = read.leeString();
            opcion = read.leeInt();
        } catch (Exception ex) {
        }

        //this.imprimeLisataMetodosAnticonceptivos();
        switch (opcion) {
            case 1:
                System.out.println("¿Que es la Abstinencia?");
                System.out.println("La Abstinencia es pocas palabras es:\n[1].-Comportamiento que previene el embarazo\n");
                System.out.println("[2].-Previene las infecciones de trasmision sexual\n[3].-Segura,Facil y Comoda");

                break;

            case 2:
                System.out.println("Parches");
                System.out.println("El parche anticonceptivo en pocas palabras:\n[1].-Es un pequeño parche que se adhiere a la piel para prevenir embarazos\n");
                System.out.println("[2].-Es seguro, eficaz y conveniente\n[3].-Es facil de conseguir con una receta medica\n[4].-Cuesta al rededor de 50-90 pesos por mes.\n");

                break;

            case 3:
                System.out.println("Pildora anticonceptiva\n");
                System.out.println("Las pildoras anticonceptivas en pocas palabras:\n"
                        + " son un medicamento que contiene diversas hormonas,\n "
                        + " y se utiliza como anticonceptivo, para evitar el embarazo.\n");
                System.out.println("[1].-Toma una pildora por dia para prevenir embarazos\n[2].-Es segura, eficaz y conveniente");
                System.out.println("[3].-Es facil de conseguir con una receta medica\n[4].-Cuesta alrededor de 20-50 pesos por mes.\n");
                break;

            case 4:
                System.out.println("4.-Condones\n");
                System.out.println(" Un preservativo o condon,es un dispositivo de barrera con forma de \n "
                        + " funda utilizado durante una relación sexual para reducir la probabilidad\n "
                        + " de embarazo o la transmisión de infecciones de transmisión sexual (ITS).\n "
                        + " Existen preservativos masculinos y femeninos.\n");
                break;

        }

    }
}
