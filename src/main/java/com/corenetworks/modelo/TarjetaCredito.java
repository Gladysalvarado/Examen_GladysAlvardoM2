package com.corenetworks.modelo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TarjetaCredito {
    private String numTarjeta;
    private double saldo;
    private LocalDate fVencimiento;
   private String CVV;
    private double Retiro;

    public boolean verificarTarjeta() {
        return verificarTarjeta();
    }

    public double saldoDisponible(){
        return saldo - Retiro;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public LocalDate getfVencimiento() {
        return fVencimiento;
    }

    public void setfVencimiento(LocalDate fVencimiento) {
        this.fVencimiento = fVencimiento;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoRetirar() {
        return Retiro;
    }

    public void setSaldoRetirar(double saldoRetirar) {
        this.Retiro = saldoRetirar;
    }
}
