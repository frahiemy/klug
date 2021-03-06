/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author faiz
 */
public class Nilai implements Serializable {
    private String judulNilai;
    private Nilai nil;
    private Kelas kelas;
    private double nilai;

    public Nilai(String judulNilai, Kelas kelas) {
        this.judulNilai = judulNilai;
        this.kelas = kelas;
    }
    
    public Nilai(Nilai nil, double nilai) {
        this.nil = nil;
        this.nilai = nilai;
    }

    public String getJudulNilai() {
        return judulNilai;
    }

    public void setJudulNilai(String judulNilai) {
        this.judulNilai = judulNilai;
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    public Kelas getKelas() {
        return kelas;
    }

    public Nilai getNil() {
        return nil;
    }

    public void setNil(Nilai nil) {
        this.nil = nil;
    }
    
}
