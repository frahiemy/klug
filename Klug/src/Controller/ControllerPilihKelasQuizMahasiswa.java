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
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 *
 * @author faiz
 */
public class ControllerPilihKelasQuizMahasiswa implements ActionListener{
    private PilihKelas pilKel = null;
    private Application app;
    private FileIO file;
    private int userId;
    
    public ControllerPilihKelasQuizMahasiswa(Application app, FileIO file, int userId){
        pilKel = new PilihKelas();
        this.app = app;
        this.file = file;
        this.userId = userId;
        pilKel.setResizable(false);
        pilKel.getBtn_back().addActionListener(this);
        pilKel.getBtn_pilih().addActionListener(this);
        pilKel.getHalaman().setText("Quiz");
        DefaultListModel modelList = new DefaultListModel();
        pilKel.getPilihKelas().setModel(modelList);
        for(int i=0;i<app.getMahasiswa(userId).getKelasList().size();i++){
            modelList.addElement(app.getMahasiswa(userId).getKelas(i).getNamaMataKuliah());
        }
        pilKel.getPilihKelas().setSelectedIndex(0);
        pilKel.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object x = e.getSource();
        if(x.equals(pilKel.getBtn_back())){
            ControllerDashboardMahasiswa dashMhs = new ControllerDashboardMahasiswa(app,file,userId);
        }else if(x.equals(pilKel.getBtn_pilih())){
            ControllerPilihQuizMahasiswa tugasMhs = new ControllerPilihQuizMahasiswa(app,file,userId,pilKel.getPilihKelas().getSelectedIndex());
        }
        pilKel.dispose();
    }
}
