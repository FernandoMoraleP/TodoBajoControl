package todobajocontrol;

import java.util.*;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        this.asignarFecha();
    }

    public Fecha(int dia) {
        asignarFecha(dia);
    }

    public Fecha(int dia, int mes) {
        asignarFecha(dia, mes);
    }

    public Fecha(int dia, int mes, int anio) {
        asignarFecha(dia, mes, anio);
    }

    protected void finalize() {
        System.out.println(this.dia + "/" + this.mes + "/" + this.anio + " El objeto sera destruido");
    }

    public void asignarFecha() {
        Calendar fechaActual = new GregorianCalendar();
        this.dia = fechaActual.get(Calendar.DAY_OF_MONTH);
        this.mes = fechaActual.get(Calendar.MONTH) + 1;
        this.anio = fechaActual.get(Calendar.YEAR);
    }

    public void asignarFecha(int idia) {
        this.asignarFecha();
        this.dia = idia;
    }

    public void asignarFecha(int idia, int imes) {
        this.asignarFecha();
        this.dia = idia;
        this.mes = imes;

    }

    public void asignarFecha(int idia, int imes, int ianio) {
        this.dia = idia;
        this.mes = imes;
        this.anio = ianio;
    }

    public int[] obtenerFecha(int[] fecha) {
        fecha[0] = this.dia;
        fecha[1] = this.mes;
        fecha[2] = this.anio;

        return fecha;
    }

    public static void verFecha(int[] fecha) {
        System.out.println("\t" + fecha[0] + "-" + fecha[1] + "-" + fecha[2]);
    }

    public boolean fechaCorrecta(int cdia) {

        boolean diaCorrecto;
        boolean mesCorrecto;
        boolean anioCorrecto;

        anioCorrecto = (anio >= 1582);
        mesCorrecto = (mes > 0) && (mes <= 12);

        switch (mes) {

            case 2:

                if (bisiesto()) {

                    diaCorrecto = (cdia >= 1 && cdia <= 29);

                } else {

                    diaCorrecto = (cdia >= 1 && cdia <= 28);

                }

                break;

            case 4:
            case 6:
            case 9:
            case 11:

                diaCorrecto = (cdia >= 1 && cdia <= 30);

                break;
            default:

                diaCorrecto = (cdia >= 1 && cdia <= 31);
        }
        return diaCorrecto && mesCorrecto && anioCorrecto;
    }

    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.anio;
    }

    public boolean fechaCorrecta(int cdia, int cmes) {
        boolean diaCorrecto;
        boolean mesCorrecto;
        boolean anioCorrecto;

        anioCorrecto = (anio >= 1582);
        mesCorrecto = (cmes > 0 && cmes <= 12);

        switch (cmes) {

            case 2:

                if (bisiesto()) {

                    diaCorrecto = (cdia >= 1 && cdia <= 29);

                } else {

                    diaCorrecto = (cdia >= 1 && cdia <= 28);
                }

                break;
            case 4:
            case 6:
            case 9:
            case 11:

                diaCorrecto = (cdia >= 1 && cdia <= 30);

                break;

            default:

                diaCorrecto = (cdia >= 1 && cdia <= 31);
        }
        return diaCorrecto && mesCorrecto && anioCorrecto;
    }

    public boolean fechaCorrecta(int cdia, int cmes, int canio) {
        boolean diaCorrecto;
        boolean mesCorrecto;
        boolean anioCorrecto;

        anioCorrecto = (canio >= 1582);
        mesCorrecto = (cmes > 0 && cmes <= 12);

        switch (cmes) {

            case 2:

                if (bisiesto()) {

                    diaCorrecto = (cdia >= 1 && cdia <= 29);

                } else {

                    diaCorrecto = (cdia >= 1 && cdia <= 28);

                }

                break;

            case 4:
            case 6:
            case 9:
            case 11:

                diaCorrecto = (cdia >= 1 && cdia <= 30);

                break;

            default:

                diaCorrecto = (cdia >= 1 && cdia <= 31);

        }
        return diaCorrecto && mesCorrecto && anioCorrecto;
    }

    protected boolean bisiesto() {

        return (anio % 4 == 0);

    }

}
