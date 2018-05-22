/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Artimetico.Aritmetico;
import Conversion.Conversion;
import Factories.AbstractFactory;
import Factories.FactoryProducer;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ventana extends JFrame {

    private JTextField caja1, caja2;
    private JButton botonSuma, botonResta, botonMultiplicacion, botonDivision, botonConversion;

    public Ventana() {
        super("Titulo ventana");
        initComponent();
    }

    public void initComponent() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        caja1 = new JTextField();
        caja1.setBounds(10, 100, 120, 30);

        botonSuma = new JButton("+");
        botonSuma.setBounds(10, 150, 150, 30);

        botonResta = new JButton("-");
        botonResta.setBounds(10, 200, 150, 30);

        botonMultiplicacion = new JButton("*");
        botonMultiplicacion.setBounds(10, 250, 150, 30);

        botonDivision = new JButton("/");
        botonDivision.setBounds(10, 300, 150, 30);

        botonConversion = new JButton("Conversion");
        botonConversion.setBounds(10, 350, 150, 30);

        caja2 = new JTextField();
        caja2.setBounds(200, 100, 120, 30);
        //caja2.setEditable(false);

        Container contenedor = getContentPane();

        contenedor.add(caja1);
        contenedor.add(botonSuma);
        contenedor.add(caja2);
        contenedor.add(botonResta);
        contenedor.add(botonMultiplicacion);
        contenedor.add(botonDivision);
        contenedor.add(botonConversion);

        botonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null,"Distes click");   //esto es para mostrar un mensaje
                AbstractFactory factory;
                factory = FactoryProducer.getFactory("aritmetico");
                Aritmetico operacion = factory.getAritmetico("suma");
                float sumados = operacion.operar(Integer.parseInt(caja1.getText()), (Integer.parseInt(caja2.getText())));
                String mensaje = Float.toString(sumados);
                //System.out.println(caja1.getText());
                JOptionPane.showMessageDialog(null, mensaje);
            }
        });

        botonResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null,"Distes click");   //esto es para mostrar un mensaje
                AbstractFactory factory;
                factory = FactoryProducer.getFactory("aritmetico");
                Aritmetico operacion = factory.getAritmetico("resta");
                float restados = operacion.operar(Integer.parseInt(caja1.getText()), (Integer.parseInt(caja2.getText())));
                String mensaje = Float.toString(restados);
                //System.out.println(caja1.getText());
                JOptionPane.showMessageDialog(null, mensaje);
            }
        });

        botonMultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null,"Distes click");   //esto es para mostrar un mensaje
                AbstractFactory factory;
                factory = FactoryProducer.getFactory("aritmetico");
                Aritmetico operacion = factory.getAritmetico("multiplicacion");
                float multiplicados = operacion.operar(Integer.parseInt(caja1.getText()), (Integer.parseInt(caja2.getText())));
                String mensaje = Float.toString(multiplicados);
                //System.out.println(caja1.getText());
                JOptionPane.showMessageDialog(null, mensaje);
            }
        });

        botonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null,"Distes click");   //esto es para mostrar un mensaje
                AbstractFactory factory;
                factory = FactoryProducer.getFactory("aritmetico");
                Aritmetico operacion = factory.getAritmetico("division");
                float divididos = operacion.operar(Integer.parseInt(caja1.getText()), (Integer.parseInt(caja2.getText())));
                String mensaje = Float.toString(divididos);
                //System.out.println(caja1.getText());
                JOptionPane.showMessageDialog(null, mensaje);
            }
        });

        botonConversion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null,"Distes click");   //esto es para mostrar un mensaje
                AbstractFactory factory;
                factory = FactoryProducer.getFactory("conversion");
                Conversion operacion = factory.getConversion("binario");
                String binario = operacion.convertir((Integer.parseInt(caja1.getText())));
                //System.out.println(caja1.getText());
                JOptionPane.showMessageDialog(null, binario);
            }
        });

        setSize(500, 500);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
}
