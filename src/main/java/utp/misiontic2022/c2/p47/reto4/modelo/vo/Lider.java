package utp.misiontic2022.c2.p47.reto4.modelo.vo;

public class Lider {
    private String Nombre;
    private String Primer_Apellido;
    private String Segundo_Apellido;
    private double salario;
    //private String promedio;

    public Lider(){

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPrimer_Apellido() {
        return Primer_Apellido;
    }
    public void setPrimer_Apellido(String primer_Apellido) {
        Primer_Apellido = primer_Apellido;
    }

    public String getSegundo_Apellido() {
        return Segundo_Apellido;
    }
    public void setSegundo_Apellido(String segundo_Apellido) {
        Segundo_Apellido = segundo_Apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    
    


}
