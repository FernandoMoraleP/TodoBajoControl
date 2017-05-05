package todobajocontrol;

public class CicloMenstrual {

    private final Fecha inicioSangrado;         //
    private Fecha finSangrado;            //
    private Fecha inicioPeriodoInfertil;   //
    private Fecha finPeriodoInfertil;      // ATRIBUTOS 
    private Fecha inicioPeriodoFertil;    //
    private Fecha finPeriodoFertil;       //

    public CicloMenstrual() {// COSTRUCTOR POR OMISIÓN 
        this.inicioSangrado = new Fecha();         //
        this.finSangrado = new Fecha();            //
        this.inicioPeriodoInfertil = new Fecha();   //
        this.finPeriodoInfertil = new Fecha();      // ATRIBUTOS 
        this.inicioPeriodoFertil = new Fecha();    //
        this.finPeriodoFertil = new Fecha();
    }

    public Fecha getinicioSangrado() { // METODOS
        return inicioSangrado;
    }

    public Fecha getfinSangrado() {
        return finSangrado;
    }

    public Fecha getinicioPeriodoInfertil() {
        return inicioPeriodoInfertil;
    }

    public Fecha getfinPeriodoInfertil() {
        return finPeriodoInfertil;
    }

    public Fecha getinicioPeriodoFertil() {
        return inicioPeriodoFertil;
    }

    public Fecha getfinPeriodoFertil() {
        return finPeriodoFertil;
    }

    public void calculaCiclo() {
        CicloMenstrual arrayCiclos[] = new CicloMenstrual[1];
        Reader read = new Reader();

        int dia;

        for (int i = 0; i < arrayCiclos.length; i++) {
            CicloMenstrual ciclo = new CicloMenstrual();

            System.out.println("Ingrese la fecha inicio de sangrado:");
            System.out.println("Proporciona el dia: ");
            dia = read.leeInt();
            ciclo.getinicioSangrado().asignarFecha(dia);
            ciclo.getfinSangrado().asignarFecha(dia + 4);
            ciclo.getinicioPeriodoInfertil().asignarFecha(dia + 5);
            ciclo.getfinPeriodoInfertil().asignarFecha(dia + 10);
            ciclo.getinicioPeriodoFertil().asignarFecha(dia + 10);
            ciclo.getfinPeriodoFertil().asignarFecha(dia + 16);
            //System.out.println(ciclo.getfinSangrado());

            arrayCiclos[i] = ciclo;
        }

        for (int i = 0; i < arrayCiclos.length; i++) {
            System.out.println(arrayCiclos[i]);
        }
    }

    public String toString() {
        return " Fecha inicio Sangrado: " + this.inicioSangrado + " Fecha fin Sangrado: " + this.finSangrado
                + "\n Fecha inicio Periodo Infertil: " + this.inicioPeriodoInfertil + " Fecha fin Periodo Infertil: " + this.finPeriodoInfertil
                + "\n Fecha inicio Periodo Fertil: " + this.inicioPeriodoFertil + " Fecha fin Periodo Fertil: " + this.finPeriodoFertil + "\n";
    }

}
