import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MaquinaEstacionamientoExamen extends JFrame implements ActionListener{
    private JLabel Est, adm, pass, money, pantalla01, pantalla02, pantalla03, pantalla04, pantalla05, pd1, pd2, pd3, pd4, pd5, pantallaaux;
    private JTextField cambio, tiempo, descuento, dinero;
    private JButton Pagar, calcular;
    private JMenuBar mb;
    private JMenu Opciones;
    private JMenuItem Iniciar,Salir;

    int desc = 0, cost = 0, tot = 0, PorPagar = 0, change = 0, time=0;

    public MaquinaEstacionamientoExamen(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Maquina de estacionamiento");
        mb = new JMenuBar();
            mb.setBackground(Color.DARK_GRAY);
            setJMenuBar(mb);
        Opciones = new JMenu("Opciones");
            Opciones.setBackground(new Color(255, 0, 0));
            Opciones.setFont(new Font("", 1, 14));
            Opciones.setForeground(new Color(0, 255, 0));
            mb.add(Opciones);
        Iniciar = new JMenuItem("Iniciar");
            Iniciar.setFont(new Font("", 1, 14));
            Iniciar.setForeground(new Color(255, 0, 0));
            Opciones.add(Iniciar);
            Iniciar.addActionListener(this);
        Salir = new JMenuItem("Salir");
            Salir.setFont(new Font("", 1, 14));
            Salir.setForeground(new Color(255, 0, 0));
            Opciones.add(Salir);
            Salir.addActionListener(this);
        Est = new JLabel(" ESTACION DE PAGO");
            Est.setForeground(Color.WHITE);
            Est.setBackground(Color.DARK_GRAY);
            Est.setOpaque(true);
            Est.setFont(new Font("", 1, 33));
            Est.setBounds(0,0,350,40);//x,y,width,heigth
            add(Est);
        adm = new JLabel("tiempo:");
            adm.setBounds(5,40,200,30);//x,y,width,heigth
            add(adm);
        pass = new JLabel("descuento:");
            pass.setBounds(5,70,200,30);//x,y,width,heigth
            add(pass);
        money = new JLabel("dinero:");
            money.setBounds(5,170,200,30);//x,y,width,heigth
            add(money);
        pd1 = new JLabel("$");
            pd1.setBounds(270,55,50,14);//x,y,width,heigth
            pd1.setOpaque(true);
            pd1.setBackground(Color.BLUE);
            pd1.setForeground(Color.WHITE);
            add(pd1);
        pd2 = new JLabel("$");
            pd2.setBounds(270,67,50,14);//x,y,width,heigth
            pd2.setOpaque(true);
            pd2.setBackground(Color.BLUE);
            pd2.setForeground(Color.WHITE);
            add(pd2);
        pd3 = new JLabel("$");
            pd3.setBounds(270,79,50,14);//x,y,width,heigth
            pd3.setOpaque(true);
            pd3.setBackground(Color.BLUE);
            pd3.setForeground(Color.WHITE);
            add(pd3);
        pd4 = new JLabel("$");
            pd4.setBounds(270,91,50,14);//x,y,width,heigth
            pd4.setOpaque(true);
            pd4.setBackground(Color.BLUE);
            pd4.setForeground(Color.WHITE);
            add(pd4);
        pd5 = new JLabel("$");
            pd5.setBounds(270,103,50,14);//x,y,width,heigth
            pd5.setOpaque(true);
            pd5.setBackground(Color.BLUE);
            pd5.setForeground(Color.WHITE);
            add(pd5);
        pantalla01 = new JLabel("costo:");
            pantalla01.setBounds(190,55,135,14);//x,y,width,heigth
            pantalla01.setOpaque(true);
            pantalla01.setBackground(Color.BLUE);
            pantalla01.setForeground(Color.WHITE);
            add(pantalla01);
        pantalla02 = new JLabel("descuento:");
            pantalla02.setBounds(190,67,135,14);//x,y,width,heigth
            pantalla02.setOpaque(true);
            pantalla02.setBackground(Color.BLUE);
            pantalla02.setForeground(Color.WHITE);
            add(pantalla02);
        pantalla03 = new JLabel("total:");
            pantalla03.setBounds(190,79,135,14);//x,y,width,heigth
            pantalla03.setOpaque(true);
            pantalla03.setBackground(Color.BLUE);
            pantalla03.setForeground(Color.WHITE);
            add(pantalla03);
        pantalla04 = new JLabel("por pagar:");
            pantalla04.setBounds(190,91,135,14);//x,y,width,heigth
            pantalla04.setOpaque(true);
            pantalla04.setBackground(Color.BLUE);
            pantalla04.setForeground(Color.WHITE);
            add(pantalla04);
        pantalla05 = new JLabel("cambio:");
            pantalla05.setBounds(190,102,135,15);//x,y,width,heigth
            pantalla05.setOpaque(true);
            pantalla05.setBackground(Color.BLUE);
            pantalla05.setForeground(Color.WHITE);
            add(pantalla05);
        pantallaaux = new JLabel("");
            pantallaaux.setBounds(190,135,135,20);//x,y,width,heigth
            pantallaaux.setOpaque(true);
            pantallaaux.setBackground(new Color(45,114,34));
            pantallaaux.setForeground(Color.WHITE);
            pantallaaux.setFont(new Font("", 1, 10));
            add(pantallaaux);
        cambio = new JTextField();
            cambio.setBounds(50, 375, 150, 40);
            add(cambio);
        tiempo = new JTextField();
            tiempo.setBounds(75, 45, 100, 30);
            add(tiempo);
        dinero = new JTextField();
            dinero.setBounds(75, 165, 100, 30);
            add(dinero);
        descuento = new JTextField();
            descuento.setBounds(75, 75, 100, 30);
            add(descuento);
        Pagar = new JButton("PAGAR");
            Pagar.setBounds(75,200,100,30);
            add(Pagar);
            Pagar.addActionListener(this);
        calcular = new JButton("CALCULAR");
            calcular.setBounds(75,110,100,35);
            add(calcular);
            calcular.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == Salir){
            System.exit(0);
        }
        if(e.getSource() == Iniciar){
            MaquinaEstacionamientoExamen entrada = new MaquinaEstacionamientoExamen();
            entrada.setBounds(0,0,350,500);
            entrada.setVisible(true);
            entrada.setResizable(false);
            entrada.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if(e.getSource() == calcular){
            int time = Integer.parseInt(tiempo.getText()) ;
            String y = descuento.getText();

            int z =(int) time/15;
            cost = z*5;
            pd1.setText("$ "+cost);

            if(time < 15){
                int a = 15-time;
                pantallaaux.setText("tiene "+a+" para salir");
                pd2.setText("$ 0");
            }else{
                if(y.equals("WALMART")||y.equals("REST50")){
                    desc = (int) cost/2;
                    pd2.setText("$ "+desc);
                    pantallaaux.setText("");
                }else if(y.equals("")){
                    pd2.setText("$ 0");
                    pantallaaux.setText("");
                }else{
                    pd2.setText("$ 0");
                    pantallaaux.setText("Codigo Invalido");
                }
            }
            tot = cost-desc;
            PorPagar = tot;
            pd3.setText("$ "+tot);
            pd4.setText("$ "+tot);
            tiempo.setText("");
            descuento.setText("");
        }
        if(e.getSource() == Pagar){
            int x =0;
            String m = dinero.getText();
            if(m.equals("")){
                pantallaaux.setText("introduzca dinero");
            }else{
                x = Integer.parseInt(m);
                if(x== 0){
                    pantallaaux.setText("introduzca dinero");
                }else if(x >= PorPagar){
                    pd4.setText("$ 0");
                    change = x-PorPagar;
                    pd5.setText("$ "+change);
                    cambio.setText("$ "+change);
                    pantallaaux.setText("GRACIAS POR SU\n VISITA");
                    dinero.setText("");
                }else{
                    PorPagar = cost-x;
                    pd4.setText("$ "+PorPagar);
                    dinero.setText("");
                    pd5.setText("$ 0");
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Javier De Alba Ruiz, 12vo, Examen 4to periodo");
        System.out.println("Pablo Ocampo Lobato, 12vo, Examen 4to periodo");
        System.out.println("Alejandro Peralta Arzubide, 12vo, Examen 4to periodo");
        MaquinaEstacionamientoExamen entrada = new MaquinaEstacionamientoExamen();
        entrada.setBounds(0,0,350,500);
        entrada.setVisible(true);
        entrada.setResizable(false);
        entrada.setLocationRelativeTo(null);
    }
}