/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.*;
import View.*;
import FileIO.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author faiz
 */
public class ControllerPilihTugasDosen extends MouseAdapter implements ActionListener{
    private PilihTugasDosen pilihTugas = null;
    private Application app;
    private IOFile file;
    private int userId;
    private int kelasId;
    
    public ControllerPilihTugasDosen(Application app, IOFile file, int userId, int kelasId){
        pilihTugas = new PilihTugasDosen();
        this.app = app;
        this.file = file;
        this.userId = userId;
        this.kelasId = kelasId;
        pilihTugas.setResizable(false);
        pilihTugas.getBtn_back().addActionListener(this);
        pilihTugas.getBtn_tambah().addActionListener(this);
        pilihTugas.getBtn_hapus().addActionListener(this);
        pilihTugas.getBtn_lihat().addActionListener(this);
        pilihTugas.getPilihTugas().addMouseListener(this);
        pilihTugas.getJudulHalaman().setText("Tugas " + app.getDosen(userId).getKelas(kelasId).getNamaMataKuliah());
        DefaultListModel modelList = new DefaultListModel();
        pilihTugas.getPilihTugas().setModel(modelList);
        if (app.getDosen(userId).getKelas(kelasId).getTugasList().size()>0){
            for(int i=0;i<app.getDosen(userId).getKelas(kelasId).getTugasList().size();i++){
                modelList.addElement(app.getDosen(userId).getKelas(kelasId).getTugas(i).getJudulTugas());
                if (i == 0){
                    pilihTugas.getJudul().setText(app.getDosen(userId).getKelas(kelasId).getTugas(0).getJudulTugas());
                    pilihTugas.getTugas().setText(app.getDosen(userId).getKelas(kelasId).getTugas(0).getIsiTugas());
                }
            }
        }else{
            modelList.addElement("Belum ada Tugas");
            pilihTugas.getJudul().setText("Belum ada Tugas");
            pilihTugas.getTugas().setText("Belum ada Tugas");
            pilihTugas.getBtn_lihat().setVisible(false);
        }
        pilihTugas.getPilihTugas().setSelectedIndex(0);
        pilihTugas.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object x = e.getSource();
        if(x.equals(pilihTugas.getBtn_back())){
            ControllerPilihKelasTugasDosen pilKelMateri = new ControllerPilihKelasTugasDosen(app,file,userId);
            pilihTugas.dispose();
        }else if(x.equals(pilihTugas.getBtn_lihat())){
            ControllerTugasDosen materidetail = new ControllerTugasDosen(app, file, userId, kelasId, pilihTugas.getPilihTugas().getSelectedIndex());
            pilihTugas.dispose();
        }else if(x.equals(pilihTugas.getBtn_tambah())){
            ControllerTugasDosen materidetail = new ControllerTugasDosen(app, file, userId, kelasId, -1);
            pilihTugas.dispose();
        }else if(x.equals(pilihTugas.getBtn_hapus())){
            if (app.getDosen(userId).getKelas(kelasId).getTugasList().size() > 0){
                int reply = JOptionPane.showConfirmDialog(pilihTugas, "Yakin akan hapus tugas "+(app.getDosen(userId).getKelas(kelasId).getTugas(pilihTugas.getPilihTugas().getSelectedIndex()).getJudulTugas())+"?", "Yakin?", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    app.getDosen(userId).getKelas(kelasId).getTugasList().remove(pilihTugas.getPilihTugas().getSelectedIndex());
                    try {
                        app.saveFile(app.getKelasList());
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    DefaultListModel modelList = new DefaultListModel();
                    pilihTugas.getPilihTugas().setModel(modelList);
                    for(int i=0;i<app.getDosen(userId).getKelas(kelasId).getTugasList().size();i++){
                        modelList.addElement(app.getDosen(userId).getKelas(kelasId).getTugas(i).getJudulTugas());
                    }
                    if (app.getDosen(userId).getKelas(kelasId).getTugasList().size() == 1){
                        pilihTugas.getJudul().setText(app.getDosen(userId).getKelas(kelasId).getTugas(0).getJudulTugas());
                        pilihTugas.getTugas().setText(app.getDosen(userId).getKelas(kelasId).getTugas(0).getIsiTugas());
                    }
                    pilihTugas.getPilihTugas().setSelectedIndex(0);
                    JOptionPane.showMessageDialog(pilihTugas, "Berhasil hapus tugas!");
                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object x = e.getSource();
        if (x.equals(pilihTugas.getPilihTugas())){
            if (app.getDosen(userId).getKelas(kelasId).getTugasList().size()>0){
                pilihTugas.getJudul().setText(app.getDosen(userId).getKelas(kelasId).getTugas(pilihTugas.getPilihTugas().getSelectedIndex()).getJudulTugas());
                pilihTugas.getTugas().setText(app.getDosen(userId).getKelas(kelasId).getTugas(pilihTugas.getPilihTugas().getSelectedIndex()).getIsiTugas());
            }
        }
    }
}
