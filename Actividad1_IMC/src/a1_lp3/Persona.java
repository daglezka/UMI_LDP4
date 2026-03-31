package a1_lp3;

public class Persona {
    // Atributos privados (Encapsulamiento)
    private double peso;
    private double estatura;

    // Constructor vacío
    public Persona() {
    }

    // Métodos para asignar valores (Setters)
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    // Método para calcular el IMC (Fórmula matemática)
    public double calcularIMC() {
        return peso / (estatura * estatura);
    }

    // Método con la estructura de control
    public String obtenerDiagnostico(double imc) {
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.9) {
            return "Obesidad grado I";
        } else if (imc >= 35 && imc <= 39.9) {
            return "Obesidad grado II";
        } else {
            return "Obesidad grado III";
        }
    }
}