package utp.misiontic2022.c2.p47.reto4.modelo.vo;

public class Salarios {
    // Su código
    private String Cargo;
    private String Ciudad_Residencia;
    private double Salario;

    public Salarios() {
       
    }

    public String getCiudad_Residencia() {
        return Ciudad_Residencia;
    }

    public void setCiudad_Residencia(String Ciudad_Residencia) {
        this.Ciudad_Residencia = Ciudad_Residencia;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
    
}
