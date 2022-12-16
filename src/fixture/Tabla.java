/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package fixture;

import java.util.ArrayList;
import java.util.List;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;

/**
 *
 * @author alumno
 */
public class Tabla extends javax.swing.JInternalFrame {

    public static boolean abierta = false;

    static String primeroGA;
    static String segundoGA;
    static String primeroGB;
    static String segundoGB;
    static String primeroGC;
    static String segundoGC;
    static String primeroGD;
    static String segundoGD;
    static String primeroGE;
    static String segundoGE;
    static String primeroGF;
    static String segundoGF;
    static String primeroGG;
    static String segundoGG;
    static String primeroGH;
    static String segundoGH;
    

  
    public void crearA() {
        try {
            //File myObj = new File("C:\\Users\\alumno\\Desktop\\fixture.txt"); en Windows
            //NetBeansProjects/FixtureApp/src/fixture/clasificados
            File myObj = new File("grupoA_clasificados.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public void crearB() {
        try {
            //File myObj = new File("C:\\Users\\alumno\\Desktop\\fixture.txt"); en Windows
            //NetBeansProjects/FixtureApp/src/fixture/clasificados
            File myObj = new File("grupoB_clasificados.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
    
    public void crearC() {
        try {
            //File myObj = new File("C:\\Users\\alumno\\Desktop\\fixture.txt"); en Windows
            //NetBeansProjects/FixtureApp/src/fixture/clasificados
            File myObj = new File("grupoC_clasificados.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
    
    public void crearD() {
        try {
            //File myObj = new File("C:\\Users\\alumno\\Desktop\\fixture.txt"); en Windows
            //NetBeansProjects/FixtureApp/src/fixture/clasificados
            File myObj = new File("grupoD_clasificados.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
    
    public void crearE() {
        try {
            //File myObj = new File("C:\\Users\\alumno\\Desktop\\fixture.txt"); en Windows
            //NetBeansProjects/FixtureApp/src/fixture/clasificados
            File myObj = new File("grupoE_clasificados.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
    
    public void crearF() {
        try {
            //File myObj = new File("C:\\Users\\alumno\\Desktop\\fixture.txt"); en Windows
            //NetBeansProjects/FixtureApp/src/fixture/clasificados
            File myObj = new File("grupoF_clasificados.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
    
    public void crearG() {
        try {
            //File myObj = new File("C:\\Users\\alumno\\Desktop\\fixture.txt"); en Windows
            //NetBeansProjects/FixtureApp/src/fixture/clasificados
            File myObj = new File("grupoG_clasificados.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
    
    public void crearH() {
        try {
            //File myObj = new File("C:\\Users\\alumno\\Desktop\\fixture.txt"); en Windows
            //NetBeansProjects/FixtureApp/src/fixture/clasificados
            File myObj = new File("grupoH_clasificados.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public void escribirA() {
        try {
            //FileWriter myWriter = new FileWriter("C:\\Users\\alumno\\Desktop\\fixture.txt"); en Windows
            FileWriter myWriter = new FileWriter("grupoA_clasificados.txt");//ruta relativa creacon de archivo
            myWriter.write(primeroGA + ", ");
            myWriter.write(segundoGA);

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            //System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void escribirB() {
        try {
            //FileWriter myWriter = new FileWriter("C:\\Users\\alumno\\Desktop\\fixture.txt"); en Windows
            FileWriter myWriter = new FileWriter("grupoB_clasificados.txt");//ruta relativa creacon de archivo
            myWriter.write(primeroGB + ", ");
            myWriter.write(segundoGB);

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            //System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public void escribirC() {
        try {
            //FileWriter myWriter = new FileWriter("C:\\Users\\alumno\\Desktop\\fixture.txt"); en Windows
            FileWriter myWriter = new FileWriter("grupoC_clasificados.txt");//ruta relativa creacon de archivo
            myWriter.write(primeroGC + ", ");
            myWriter.write(segundoGC);

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            //System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public void escribirD() {
        try {
            //FileWriter myWriter = new FileWriter("C:\\Users\\alumno\\Desktop\\fixture.txt"); en Windows
            FileWriter myWriter = new FileWriter("grupoD_clasificados.txt");//ruta relativa creacon de archivo
            myWriter.write(primeroGD + ", ");
            myWriter.write(segundoGD);

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            //System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public void escribirE() {
        try {
            //FileWriter myWriter = new FileWriter("C:\\Users\\alumno\\Desktop\\fixture.txt"); en Windows
            FileWriter myWriter = new FileWriter("grupoE_clasificados.txt");//ruta relativa creacon de archivo
            myWriter.write(primeroGE + ", ");
            myWriter.write(segundoGE);

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            //System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public void escribirF() {
        try {
            //FileWriter myWriter = new FileWriter("C:\\Users\\alumno\\Desktop\\fixture.txt"); en Windows
            FileWriter myWriter = new FileWriter("grupoF_clasificados.txt");//ruta relativa creacon de archivo
            myWriter.write(primeroGF + ", ");
            myWriter.write(segundoGF);

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            //System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public void escribirG() {
        try {
            //FileWriter myWriter = new FileWriter("C:\\Users\\alumno\\Desktop\\fixture.txt"); en Windows
            FileWriter myWriter = new FileWriter("grupoG_clasificados.txt");//ruta relativa creacon de archivo
            myWriter.write(primeroGG + ", ");
            myWriter.write(segundoGG);

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            //System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public void escribirH() {
        try {
            //FileWriter myWriter = new FileWriter("C:\\Users\\alumno\\Desktop\\fixture.txt"); en Windows
            FileWriter myWriter = new FileWriter("grupoH_clasificados.txt");//ruta relativa creacon de archivo
            myWriter.write(primeroGH + ", ");
            myWriter.write(segundoGH);

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            //System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
  
    /**
     * Creates new form Tabla
     */
    public Tabla() {

        super("Fixture app - Qatar 2022 - Encuentros | Posiciones", false, true, false, false);

        initComponents();
       
        this.setSize(1083, 800);

        switch (VentanaMaestra.tab) {
            case 0:
                partidosYposiciones.setSelectedIndex(0);
                break;
            case 1:
                partidosYposiciones.setSelectedIndex(1);
                break;
            case 2:
                partidosYposiciones.setSelectedIndex(2);
                break;
            case 3:
                partidosYposiciones.setSelectedIndex(3);
                break;
            case 4:
                partidosYposiciones.setSelectedIndex(4);
                break;
            case 5:
                partidosYposiciones.setSelectedIndex(5);
                break;
            case 6:
                partidosYposiciones.setSelectedIndex(6);
                break;
            case 7:
                partidosYposiciones.setSelectedIndex(7);
                break;

        }

        //indico que se abre la ventana Tabla
        abierta = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel16 = new javax.swing.JPanel();
        jLabel369 = new javax.swing.JLabel();
        jLabel370 = new javax.swing.JLabel();
        jLabel371 = new javax.swing.JLabel();
        jLabel372 = new javax.swing.JLabel();
        jLabel373 = new javax.swing.JLabel();
        jLabel374 = new javax.swing.JLabel();
        jLabel375 = new javax.swing.JLabel();
        jLabel376 = new javax.swing.JLabel();
        jLabel377 = new javax.swing.JLabel();
        jLabel378 = new javax.swing.JLabel();
        jLabel379 = new javax.swing.JLabel();
        jLabel380 = new javax.swing.JLabel();
        jLabel381 = new javax.swing.JLabel();
        jLabel382 = new javax.swing.JLabel();
        jLabel383 = new javax.swing.JLabel();
        jLabel384 = new javax.swing.JLabel();
        jLabel385 = new javax.swing.JLabel();
        jLabel386 = new javax.swing.JLabel();
        jLabel387 = new javax.swing.JLabel();
        jLabel388 = new javax.swing.JLabel();
        jLabel389 = new javax.swing.JLabel();
        jLabel390 = new javax.swing.JLabel();
        jLabel391 = new javax.swing.JLabel();
        jLabel392 = new javax.swing.JLabel();
        jLabel393 = new javax.swing.JLabel();
        jLabel394 = new javax.swing.JLabel();
        jLabel395 = new javax.swing.JLabel();
        jLabel396 = new javax.swing.JLabel();
        jLabel397 = new javax.swing.JLabel();
        jLabel398 = new javax.swing.JLabel();
        jLabel399 = new javax.swing.JLabel();
        jLabel400 = new javax.swing.JLabel();
        jLabel401 = new javax.swing.JLabel();
        jLabel402 = new javax.swing.JLabel();
        jTextField97 = new javax.swing.JTextField();
        jTextField98 = new javax.swing.JTextField();
        jTextField99 = new javax.swing.JTextField();
        jTextField100 = new javax.swing.JTextField();
        jTextField101 = new javax.swing.JTextField();
        jTextField102 = new javax.swing.JTextField();
        jTextField103 = new javax.swing.JTextField();
        jTextField104 = new javax.swing.JTextField();
        jTextField105 = new javax.swing.JTextField();
        jTextField106 = new javax.swing.JTextField();
        jTextField107 = new javax.swing.JTextField();
        jTextField108 = new javax.swing.JTextField();
        jLabel403 = new javax.swing.JLabel();
        jLabel404 = new javax.swing.JLabel();
        jLabel405 = new javax.swing.JLabel();
        jLabel406 = new javax.swing.JLabel();
        jLabel407 = new javax.swing.JLabel();
        jLabel408 = new javax.swing.JLabel();
        jLabel409 = new javax.swing.JLabel();
        jLabel410 = new javax.swing.JLabel();
        jLabel411 = new javax.swing.JLabel();
        jLabel412 = new javax.swing.JLabel();
        jLabel413 = new javax.swing.JLabel();
        jLabel414 = new javax.swing.JLabel();
        partidosYposiciones = new javax.swing.JTabbedPane();
        grupoA = new javax.swing.JPanel();
        jLabel960 = new javax.swing.JLabel();
        jLabel973 = new javax.swing.JLabel();
        jLabel1155 = new javax.swing.JLabel();
        jLabel1156 = new javax.swing.JLabel();
        jLabel1157 = new javax.swing.JLabel();
        jLabel1158 = new javax.swing.JLabel();
        qatar01 = new javax.swing.JLabel();
        tfA01 = new javax.swing.JTextField();
        tfA02 = new javax.swing.JTextField();
        ecuador01 = new javax.swing.JLabel();
        jLabel1161 = new javax.swing.JLabel();
        jLabel1162 = new javax.swing.JLabel();
        jLabel1163 = new javax.swing.JLabel();
        senegal01 = new javax.swing.JLabel();
        tfA03 = new javax.swing.JTextField();
        tfA04 = new javax.swing.JTextField();
        pbajos01 = new javax.swing.JLabel();
        jLabel1166 = new javax.swing.JLabel();
        jLabel1167 = new javax.swing.JLabel();
        jLabel1168 = new javax.swing.JLabel();
        qatar02 = new javax.swing.JLabel();
        tfA05 = new javax.swing.JTextField();
        tfA06 = new javax.swing.JTextField();
        senegal02 = new javax.swing.JLabel();
        jLabel1171 = new javax.swing.JLabel();
        jLabel1172 = new javax.swing.JLabel();
        jLabel1173 = new javax.swing.JLabel();
        ecuador02 = new javax.swing.JLabel();
        tfA07 = new javax.swing.JTextField();
        tfA08 = new javax.swing.JTextField();
        pbajos02 = new javax.swing.JLabel();
        jLabel1175 = new javax.swing.JLabel();
        jLabel1176 = new javax.swing.JLabel();
        jLabel1177 = new javax.swing.JLabel();
        pbajos03 = new javax.swing.JLabel();
        tfA09 = new javax.swing.JTextField();
        tfA10 = new javax.swing.JTextField();
        qatar03 = new javax.swing.JLabel();
        jLabel1180 = new javax.swing.JLabel();
        jLabel1181 = new javax.swing.JLabel();
        jLabel1182 = new javax.swing.JLabel();
        ecuador03 = new javax.swing.JLabel();
        tfA11 = new javax.swing.JTextField();
        tfA12 = new javax.swing.JTextField();
        senegal03 = new javax.swing.JLabel();
        jLabel1185 = new javax.swing.JLabel();
        guardarA = new javax.swing.JButton();
        borrarA = new javax.swing.JButton();
        jScrollPane25 = new javax.swing.JScrollPane();
        tablaA = new javax.swing.JTable();
        grupoB = new javax.swing.JPanel();
        jLabel1186 = new javax.swing.JLabel();
        jLabel1187 = new javax.swing.JLabel();
        jLabel1188 = new javax.swing.JLabel();
        jLabel1189 = new javax.swing.JLabel();
        jLabel1190 = new javax.swing.JLabel();
        jLabel1191 = new javax.swing.JLabel();
        jLabel1192 = new javax.swing.JLabel();
        tfB01 = new javax.swing.JTextField();
        tfB02 = new javax.swing.JTextField();
        jLabel1193 = new javax.swing.JLabel();
        jLabel1194 = new javax.swing.JLabel();
        jLabel1195 = new javax.swing.JLabel();
        jLabel1196 = new javax.swing.JLabel();
        jLabel1197 = new javax.swing.JLabel();
        tfB03 = new javax.swing.JTextField();
        tfB04 = new javax.swing.JTextField();
        jLabel1198 = new javax.swing.JLabel();
        jLabel1199 = new javax.swing.JLabel();
        jLabel1200 = new javax.swing.JLabel();
        jLabel1201 = new javax.swing.JLabel();
        jLabel1202 = new javax.swing.JLabel();
        tfB05 = new javax.swing.JTextField();
        tfB06 = new javax.swing.JTextField();
        jLabel1203 = new javax.swing.JLabel();
        jLabel1204 = new javax.swing.JLabel();
        jLabel1205 = new javax.swing.JLabel();
        jLabel1206 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfB07 = new javax.swing.JTextField();
        tfB08 = new javax.swing.JTextField();
        jLabel1207 = new javax.swing.JLabel();
        jLabel1208 = new javax.swing.JLabel();
        jLabel1209 = new javax.swing.JLabel();
        jLabel1210 = new javax.swing.JLabel();
        jLabel1211 = new javax.swing.JLabel();
        tfB09 = new javax.swing.JTextField();
        tfB10 = new javax.swing.JTextField();
        jLabel1212 = new javax.swing.JLabel();
        jLabel1213 = new javax.swing.JLabel();
        jLabel1214 = new javax.swing.JLabel();
        jLabel1215 = new javax.swing.JLabel();
        jLabel1216 = new javax.swing.JLabel();
        tfB11 = new javax.swing.JTextField();
        tfB12 = new javax.swing.JTextField();
        jLabel1217 = new javax.swing.JLabel();
        jLabel1218 = new javax.swing.JLabel();
        guardarB = new javax.swing.JButton();
        borrarB = new javax.swing.JButton();
        jScrollPane26 = new javax.swing.JScrollPane();
        tablaB = new javax.swing.JTable();
        grupoC = new javax.swing.JPanel();
        jLabel1219 = new javax.swing.JLabel();
        jLabel1220 = new javax.swing.JLabel();
        jLabel1221 = new javax.swing.JLabel();
        jLabel1222 = new javax.swing.JLabel();
        jLabel1223 = new javax.swing.JLabel();
        jLabel1224 = new javax.swing.JLabel();
        jLabel1225 = new javax.swing.JLabel();
        tfC01 = new javax.swing.JTextField();
        tfC02 = new javax.swing.JTextField();
        jLabel1226 = new javax.swing.JLabel();
        jLabel1227 = new javax.swing.JLabel();
        jLabel1228 = new javax.swing.JLabel();
        jLabel1229 = new javax.swing.JLabel();
        jLabel1230 = new javax.swing.JLabel();
        tfC03 = new javax.swing.JTextField();
        tfC04 = new javax.swing.JTextField();
        jLabel1231 = new javax.swing.JLabel();
        jLabel1232 = new javax.swing.JLabel();
        jLabel1233 = new javax.swing.JLabel();
        jLabel1234 = new javax.swing.JLabel();
        jLabel1235 = new javax.swing.JLabel();
        tfC05 = new javax.swing.JTextField();
        tfC06 = new javax.swing.JTextField();
        jLabel1236 = new javax.swing.JLabel();
        jLabel1237 = new javax.swing.JLabel();
        jLabel1238 = new javax.swing.JLabel();
        jLabel1239 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfC07 = new javax.swing.JTextField();
        tfC08 = new javax.swing.JTextField();
        jLabel1240 = new javax.swing.JLabel();
        jLabel1241 = new javax.swing.JLabel();
        jLabel1242 = new javax.swing.JLabel();
        jLabel1243 = new javax.swing.JLabel();
        jLabel1244 = new javax.swing.JLabel();
        tfC09 = new javax.swing.JTextField();
        tfC10 = new javax.swing.JTextField();
        jLabel1245 = new javax.swing.JLabel();
        jLabel1246 = new javax.swing.JLabel();
        jLabel1247 = new javax.swing.JLabel();
        jLabel1248 = new javax.swing.JLabel();
        jLabel1249 = new javax.swing.JLabel();
        tfC11 = new javax.swing.JTextField();
        tfC12 = new javax.swing.JTextField();
        jLabel1250 = new javax.swing.JLabel();
        jLabel1251 = new javax.swing.JLabel();
        guardarC = new javax.swing.JButton();
        borrarC = new javax.swing.JButton();
        jScrollPane27 = new javax.swing.JScrollPane();
        tablaC = new javax.swing.JTable();
        grupoD = new javax.swing.JPanel();
        jLabel950 = new javax.swing.JLabel();
        jLabel953 = new javax.swing.JLabel();
        jLabel964 = new javax.swing.JLabel();
        jLabel965 = new javax.swing.JLabel();
        jLabel956 = new javax.swing.JLabel();
        jLabel1154 = new javax.swing.JLabel();
        jLabel974 = new javax.swing.JLabel();
        tfD01 = new javax.swing.JTextField();
        tfD02 = new javax.swing.JTextField();
        jLabel980 = new javax.swing.JLabel();
        jLabel968 = new javax.swing.JLabel();
        jLabel952 = new javax.swing.JLabel();
        jLabel955 = new javax.swing.JLabel();
        jLabel972 = new javax.swing.JLabel();
        tfD03 = new javax.swing.JTextField();
        tfD04 = new javax.swing.JTextField();
        jLabel978 = new javax.swing.JLabel();
        jLabel966 = new javax.swing.JLabel();
        jLabel951 = new javax.swing.JLabel();
        jLabel954 = new javax.swing.JLabel();
        jLabel975 = new javax.swing.JLabel();
        tfD05 = new javax.swing.JTextField();
        tfD06 = new javax.swing.JTextField();
        jLabel981 = new javax.swing.JLabel();
        jLabel969 = new javax.swing.JLabel();
        jLabel958 = new javax.swing.JLabel();
        jLabel962 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfD07 = new javax.swing.JTextField();
        tfD08 = new javax.swing.JTextField();
        jLabel979 = new javax.swing.JLabel();
        jLabel967 = new javax.swing.JLabel();
        jLabel957 = new javax.swing.JLabel();
        jLabel961 = new javax.swing.JLabel();
        jLabel976 = new javax.swing.JLabel();
        tfD09 = new javax.swing.JTextField();
        tfD10 = new javax.swing.JTextField();
        jLabel982 = new javax.swing.JLabel();
        jLabel970 = new javax.swing.JLabel();
        jLabel959 = new javax.swing.JLabel();
        jLabel963 = new javax.swing.JLabel();
        jLabel977 = new javax.swing.JLabel();
        tfD11 = new javax.swing.JTextField();
        tfD12 = new javax.swing.JTextField();
        jLabel983 = new javax.swing.JLabel();
        jLabel971 = new javax.swing.JLabel();
        guardarD = new javax.swing.JButton();
        borrarD = new javax.swing.JButton();
        jScrollPane19 = new javax.swing.JScrollPane();
        tablaD = new javax.swing.JTable();
        grupoE = new javax.swing.JPanel();
        jLabel984 = new javax.swing.JLabel();
        jLabel985 = new javax.swing.JLabel();
        jLabel986 = new javax.swing.JLabel();
        jLabel987 = new javax.swing.JLabel();
        jLabel988 = new javax.swing.JLabel();
        jLabel1252 = new javax.swing.JLabel();
        jLabel989 = new javax.swing.JLabel();
        tfE01 = new javax.swing.JTextField();
        tfE02 = new javax.swing.JTextField();
        jLabel990 = new javax.swing.JLabel();
        jLabel991 = new javax.swing.JLabel();
        jLabel992 = new javax.swing.JLabel();
        jLabel993 = new javax.swing.JLabel();
        jLabel994 = new javax.swing.JLabel();
        tfE03 = new javax.swing.JTextField();
        tfE04 = new javax.swing.JTextField();
        jLabel995 = new javax.swing.JLabel();
        jLabel996 = new javax.swing.JLabel();
        jLabel997 = new javax.swing.JLabel();
        jLabel998 = new javax.swing.JLabel();
        jLabel999 = new javax.swing.JLabel();
        tfE05 = new javax.swing.JTextField();
        tfE06 = new javax.swing.JTextField();
        jLabel1000 = new javax.swing.JLabel();
        jLabel1001 = new javax.swing.JLabel();
        jLabel1002 = new javax.swing.JLabel();
        jLabel1003 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfE07 = new javax.swing.JTextField();
        tfE08 = new javax.swing.JTextField();
        jLabel1004 = new javax.swing.JLabel();
        jLabel1005 = new javax.swing.JLabel();
        jLabel1006 = new javax.swing.JLabel();
        jLabel1007 = new javax.swing.JLabel();
        jLabel1008 = new javax.swing.JLabel();
        tfE09 = new javax.swing.JTextField();
        tfE10 = new javax.swing.JTextField();
        jLabel1009 = new javax.swing.JLabel();
        jLabel1010 = new javax.swing.JLabel();
        jLabel1011 = new javax.swing.JLabel();
        jLabel1012 = new javax.swing.JLabel();
        jLabel1013 = new javax.swing.JLabel();
        tfE11 = new javax.swing.JTextField();
        tfE12 = new javax.swing.JTextField();
        jLabel1014 = new javax.swing.JLabel();
        jLabel1015 = new javax.swing.JLabel();
        guardarE = new javax.swing.JButton();
        borrarE = new javax.swing.JButton();
        jScrollPane20 = new javax.swing.JScrollPane();
        tablaE = new javax.swing.JTable();
        grupoF = new javax.swing.JPanel();
        jLabel1016 = new javax.swing.JLabel();
        jLabel1017 = new javax.swing.JLabel();
        jLabel1018 = new javax.swing.JLabel();
        jLabel1019 = new javax.swing.JLabel();
        jLabel1020 = new javax.swing.JLabel();
        jLabel1253 = new javax.swing.JLabel();
        jLabel1021 = new javax.swing.JLabel();
        tfF01 = new javax.swing.JTextField();
        tfF02 = new javax.swing.JTextField();
        jLabel1022 = new javax.swing.JLabel();
        jLabel1023 = new javax.swing.JLabel();
        jLabel1024 = new javax.swing.JLabel();
        jLabel1025 = new javax.swing.JLabel();
        jLabel1026 = new javax.swing.JLabel();
        tfF03 = new javax.swing.JTextField();
        tfF04 = new javax.swing.JTextField();
        jLabel1027 = new javax.swing.JLabel();
        jLabel1028 = new javax.swing.JLabel();
        jLabel1029 = new javax.swing.JLabel();
        jLabel1030 = new javax.swing.JLabel();
        jLabel1031 = new javax.swing.JLabel();
        tfF05 = new javax.swing.JTextField();
        tfF06 = new javax.swing.JTextField();
        jLabel1032 = new javax.swing.JLabel();
        jLabel1033 = new javax.swing.JLabel();
        jLabel1034 = new javax.swing.JLabel();
        jLabel1035 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfF07 = new javax.swing.JTextField();
        tfF08 = new javax.swing.JTextField();
        jLabel1036 = new javax.swing.JLabel();
        jLabel1037 = new javax.swing.JLabel();
        jLabel1038 = new javax.swing.JLabel();
        jLabel1039 = new javax.swing.JLabel();
        jLabel1040 = new javax.swing.JLabel();
        tfF09 = new javax.swing.JTextField();
        tfF10 = new javax.swing.JTextField();
        jLabel1041 = new javax.swing.JLabel();
        jLabel1042 = new javax.swing.JLabel();
        jLabel1043 = new javax.swing.JLabel();
        jLabel1044 = new javax.swing.JLabel();
        jLabel1045 = new javax.swing.JLabel();
        tfF11 = new javax.swing.JTextField();
        tfF12 = new javax.swing.JTextField();
        jLabel1046 = new javax.swing.JLabel();
        jLabel1047 = new javax.swing.JLabel();
        guardarF = new javax.swing.JButton();
        borrarF = new javax.swing.JButton();
        jScrollPane21 = new javax.swing.JScrollPane();
        tablaF = new javax.swing.JTable();
        grupoG = new javax.swing.JPanel();
        jLabel1048 = new javax.swing.JLabel();
        jLabel1049 = new javax.swing.JLabel();
        jLabel1050 = new javax.swing.JLabel();
        jLabel1051 = new javax.swing.JLabel();
        jLabel1052 = new javax.swing.JLabel();
        jLabel1254 = new javax.swing.JLabel();
        jLabel1053 = new javax.swing.JLabel();
        tfG01 = new javax.swing.JTextField();
        tfG02 = new javax.swing.JTextField();
        jLabel1054 = new javax.swing.JLabel();
        jLabel1055 = new javax.swing.JLabel();
        jLabel1056 = new javax.swing.JLabel();
        jLabel1057 = new javax.swing.JLabel();
        jLabel1058 = new javax.swing.JLabel();
        tfG03 = new javax.swing.JTextField();
        tfG04 = new javax.swing.JTextField();
        jLabel1059 = new javax.swing.JLabel();
        jLabel1060 = new javax.swing.JLabel();
        jLabel1061 = new javax.swing.JLabel();
        jLabel1062 = new javax.swing.JLabel();
        jLabel1063 = new javax.swing.JLabel();
        tfG05 = new javax.swing.JTextField();
        tfG06 = new javax.swing.JTextField();
        jLabel1064 = new javax.swing.JLabel();
        jLabel1065 = new javax.swing.JLabel();
        jLabel1066 = new javax.swing.JLabel();
        jLabel1067 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfG07 = new javax.swing.JTextField();
        tfG08 = new javax.swing.JTextField();
        jLabel1068 = new javax.swing.JLabel();
        jLabel1069 = new javax.swing.JLabel();
        jLabel1070 = new javax.swing.JLabel();
        jLabel1071 = new javax.swing.JLabel();
        jLabel1072 = new javax.swing.JLabel();
        tfG09 = new javax.swing.JTextField();
        tfG10 = new javax.swing.JTextField();
        jLabel1073 = new javax.swing.JLabel();
        jLabel1074 = new javax.swing.JLabel();
        jLabel1075 = new javax.swing.JLabel();
        jLabel1076 = new javax.swing.JLabel();
        jLabel1077 = new javax.swing.JLabel();
        tfG11 = new javax.swing.JTextField();
        tfG12 = new javax.swing.JTextField();
        jLabel1078 = new javax.swing.JLabel();
        jLabel1079 = new javax.swing.JLabel();
        guardarG = new javax.swing.JButton();
        borrarG = new javax.swing.JButton();
        jScrollPane22 = new javax.swing.JScrollPane();
        tablaG = new javax.swing.JTable();
        grupoH = new javax.swing.JPanel();
        jLabel1080 = new javax.swing.JLabel();
        jLabel1081 = new javax.swing.JLabel();
        jLabel1082 = new javax.swing.JLabel();
        jLabel1083 = new javax.swing.JLabel();
        jLabel1084 = new javax.swing.JLabel();
        jLabel1255 = new javax.swing.JLabel();
        jLabel1085 = new javax.swing.JLabel();
        tfH01 = new javax.swing.JTextField();
        tfH02 = new javax.swing.JTextField();
        jLabel1086 = new javax.swing.JLabel();
        jLabel1087 = new javax.swing.JLabel();
        jLabel1088 = new javax.swing.JLabel();
        jLabel1089 = new javax.swing.JLabel();
        jLabel1090 = new javax.swing.JLabel();
        tfH03 = new javax.swing.JTextField();
        tfH04 = new javax.swing.JTextField();
        jLabel1091 = new javax.swing.JLabel();
        jLabel1092 = new javax.swing.JLabel();
        jLabel1093 = new javax.swing.JLabel();
        jLabel1094 = new javax.swing.JLabel();
        jLabel1095 = new javax.swing.JLabel();
        tfH05 = new javax.swing.JTextField();
        tfH06 = new javax.swing.JTextField();
        jLabel1096 = new javax.swing.JLabel();
        jLabel1097 = new javax.swing.JLabel();
        jLabel1098 = new javax.swing.JLabel();
        jLabel1099 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfH07 = new javax.swing.JTextField();
        tfH08 = new javax.swing.JTextField();
        jLabel1100 = new javax.swing.JLabel();
        jLabel1101 = new javax.swing.JLabel();
        jLabel1102 = new javax.swing.JLabel();
        jLabel1103 = new javax.swing.JLabel();
        jLabel1104 = new javax.swing.JLabel();
        tfH09 = new javax.swing.JTextField();
        tfH10 = new javax.swing.JTextField();
        jLabel1105 = new javax.swing.JLabel();
        jLabel1106 = new javax.swing.JLabel();
        jLabel1107 = new javax.swing.JLabel();
        jLabel1108 = new javax.swing.JLabel();
        jLabel1109 = new javax.swing.JLabel();
        tfH11 = new javax.swing.JTextField();
        tfH12 = new javax.swing.JTextField();
        jLabel1110 = new javax.swing.JLabel();
        jLabel1111 = new javax.swing.JLabel();
        guardarH = new javax.swing.JButton();
        borrarH = new javax.swing.JButton();
        jScrollPane23 = new javax.swing.JScrollPane();
        tablaH = new javax.swing.JTable();

        jLabel369.setText("FECHA");

        jLabel370.setText("20 - NOV");

        jLabel371.setText("21 - NOV");

        jLabel372.setText("HORARIO");

        jLabel373.setText("19:00");

        jLabel374.setText("19:00");

        jLabel375.setText("25 - NOV");

        jLabel376.setText("25 - NOV");

        jLabel377.setText("29 - NOV");

        jLabel378.setText("29 - NOV");

        jLabel379.setText("16:00");

        jLabel380.setText("19:00");

        jLabel381.setText("18:00");

        jLabel382.setText("18:00");

        jLabel383.setText("PARTIDOS");

        jLabel384.setText("ESTADIO");

        jLabel385.setText("jLabel17");

        jLabel386.setText("jLabel18");

        jLabel387.setText("jLabel19");

        jLabel388.setText("jLabel20");

        jLabel389.setText("jLabel21");

        jLabel390.setText("jLabel22");

        jLabel391.setText("jLabel23");

        jLabel392.setText("jLabel24");

        jLabel393.setText("jLabel25");

        jLabel394.setText("jLabel26");

        jLabel395.setText("jLabel27");

        jLabel396.setText("jLabel28");

        jLabel397.setText("Al Bayt");

        jLabel398.setText("Al Thumama");

        jLabel399.setText("Al Thumama");

        jLabel400.setText("Khalifa");

        jLabel401.setText("Khalifa");

        jLabel402.setText("Al Bayt");

        jLabel403.setText("jLabel35");

        jLabel404.setText("jLabel36");

        jLabel405.setText("jLabel37");

        jLabel406.setText("jLabel38");

        jLabel407.setText("jLabel39");

        jLabel408.setText("jLabel40");

        jLabel409.setText("jLabel41");

        jLabel410.setText("jLabel42");

        jLabel411.setText("jLabel43");

        jLabel412.setText("jLabel44");

        jLabel413.setText("jLabel45");

        jLabel414.setText("jLabel46");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel383)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel369)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel372)
                                .addGap(88, 88, 88))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                                        .addComponent(jLabel378)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel382))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                                        .addComponent(jLabel377)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel381))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                                        .addComponent(jLabel376)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel380))
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addComponent(jLabel375)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel379))
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel16Layout.createSequentialGroup()
                                                .addComponent(jLabel370)
                                                .addGap(10, 10, 10))
                                            .addComponent(jLabel371, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel373)
                                            .addComponent(jLabel374))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel403)
                                    .addComponent(jLabel404)
                                    .addComponent(jLabel405)
                                    .addComponent(jLabel406)
                                    .addComponent(jLabel407)
                                    .addComponent(jLabel408))
                                .addGap(28, 28, 28)))
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel389)
                            .addComponent(jLabel388)
                            .addComponent(jLabel387)
                            .addComponent(jLabel386)
                            .addComponent(jLabel385)
                            .addComponent(jLabel390))
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField103, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField100, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField99, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField101, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField102, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextField105, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField108, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel396, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel393, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel16Layout.createSequentialGroup()
                                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jTextField107, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField106, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(40, 40, 40)
                                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel394)
                                                    .addComponent(jLabel395, javax.swing.GroupLayout.Alignment.TRAILING)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                                .addComponent(jTextField104, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                .addGap(40, 40, 40)
                                                .addComponent(jLabel392))))))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jTextField97, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField98, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(jLabel391)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel412)
                                    .addComponent(jLabel413)
                                    .addComponent(jLabel414))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel402)
                                    .addComponent(jLabel401)
                                    .addComponent(jLabel400))
                                .addGap(14, 14, 14))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel409)
                                .addGap(22, 22, 22)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel384)
                                    .addComponent(jLabel397))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel410)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addComponent(jLabel398))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel411)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel399)))))
                .addGap(65, 65, 65))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel369)
                    .addComponent(jLabel372)
                    .addComponent(jLabel383)
                    .addComponent(jLabel384))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel370)
                    .addComponent(jLabel373)
                    .addComponent(jLabel385)
                    .addComponent(jLabel391)
                    .addComponent(jLabel397)
                    .addComponent(jTextField97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel403)
                    .addComponent(jLabel409))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel371)
                    .addComponent(jLabel374)
                    .addComponent(jLabel386)
                    .addComponent(jLabel392)
                    .addComponent(jLabel398)
                    .addComponent(jTextField99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel404)
                    .addComponent(jLabel410))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel375)
                    .addComponent(jLabel379)
                    .addComponent(jLabel387)
                    .addComponent(jLabel393)
                    .addComponent(jLabel399)
                    .addComponent(jTextField100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel405)
                    .addComponent(jLabel411))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel376)
                    .addComponent(jLabel380)
                    .addComponent(jLabel388)
                    .addComponent(jLabel394)
                    .addComponent(jLabel400)
                    .addComponent(jTextField101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel406)
                    .addComponent(jLabel412))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel377)
                    .addComponent(jLabel381)
                    .addComponent(jLabel389)
                    .addComponent(jLabel395)
                    .addComponent(jLabel401)
                    .addComponent(jTextField102, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel407)
                    .addComponent(jLabel413))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel378)
                    .addComponent(jLabel382)
                    .addComponent(jLabel390)
                    .addComponent(jLabel396)
                    .addComponent(jLabel402)
                    .addComponent(jTextField103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel408)
                    .addComponent(jLabel414))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(140, 21, 57));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/iconoFApp.png"))); // NOI18N
        setMaximumSize(new java.awt.Dimension(1083, 800));
        setMinimumSize(new java.awt.Dimension(1083, 800));
        setPreferredSize(new java.awt.Dimension(1083, 800));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        partidosYposiciones.setBackground(new java.awt.Color(140, 21, 57));
        partidosYposiciones.setForeground(new java.awt.Color(255, 255, 255));
        partidosYposiciones.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        partidosYposiciones.setMaximumSize(new java.awt.Dimension(1083, 800));
        partidosYposiciones.setMinimumSize(new java.awt.Dimension(1083, 800));
        partidosYposiciones.setOpaque(true);
        partidosYposiciones.setPreferredSize(new java.awt.Dimension(1083, 800));

        grupoA.setBackground(new java.awt.Color(140, 21, 57));
        grupoA.setMaximumSize(new java.awt.Dimension(178, 33));
        grupoA.setMinimumSize(new java.awt.Dimension(178, 33));
        grupoA.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel960.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel960.setForeground(new java.awt.Color(255, 255, 255));
        jLabel960.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel960.setText("FECHA");

        jLabel973.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel973.setForeground(new java.awt.Color(255, 255, 255));
        jLabel973.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel973.setText("HORARIO");

        jLabel1155.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1155.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1155.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1155.setText("PARTIDOS");

        jLabel1156.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1156.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1156.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1156.setText("ESTADIO");
        jLabel1156.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1156.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1156.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1157.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1157.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1157.setText("20 - NOV");

        jLabel1158.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1158.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1158.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1158.setText("13:00");

        qatar01.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        qatar01.setForeground(new java.awt.Color(255, 255, 255));
        qatar01.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        qatar01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/qat.png"))); // NOI18N
        qatar01.setText("Qatar   ");
        qatar01.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        qatar01.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        qatar01.setMaximumSize(new java.awt.Dimension(178, 33));
        qatar01.setMinimumSize(new java.awt.Dimension(178, 33));
        qatar01.setPreferredSize(new java.awt.Dimension(178, 33));

        tfA01.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfA01.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfA02.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfA02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfA02.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        ecuador01.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        ecuador01.setForeground(new java.awt.Color(255, 255, 255));
        ecuador01.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ecuador01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/ecu.png"))); // NOI18N
        ecuador01.setText("   Ecuador");
        ecuador01.setMaximumSize(new java.awt.Dimension(178, 33));
        ecuador01.setMinimumSize(new java.awt.Dimension(178, 33));
        ecuador01.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel1161.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1161.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1161.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1161.setText("Al Bayt");
        jLabel1161.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1161.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1161.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1162.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1162.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1162.setText("21 - NOV");

        jLabel1163.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1163.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1163.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1163.setText("13:00");

        senegal01.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        senegal01.setForeground(new java.awt.Color(255, 255, 255));
        senegal01.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        senegal01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/sen.png"))); // NOI18N
        senegal01.setText("Senegal   ");
        senegal01.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        senegal01.setMaximumSize(new java.awt.Dimension(178, 33));
        senegal01.setMinimumSize(new java.awt.Dimension(178, 33));
        senegal01.setPreferredSize(new java.awt.Dimension(178, 33));

        tfA03.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfA03.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfA04.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfA04.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        pbajos01.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        pbajos01.setForeground(new java.awt.Color(255, 255, 255));
        pbajos01.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pbajos01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/pba.png"))); // NOI18N
        pbajos01.setText("   Países Bajos");

        jLabel1166.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1166.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1166.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1166.setText("Al Thumama");
        jLabel1166.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1166.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1166.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1167.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1167.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1167.setText("25 - NOV");

        jLabel1168.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1168.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1168.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1168.setText("10:00");

        qatar02.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        qatar02.setForeground(new java.awt.Color(255, 255, 255));
        qatar02.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        qatar02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/qat.png"))); // NOI18N
        qatar02.setText("   Qatar   ");
        qatar02.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        qatar02.setMaximumSize(new java.awt.Dimension(178, 33));
        qatar02.setMinimumSize(new java.awt.Dimension(178, 33));
        qatar02.setPreferredSize(new java.awt.Dimension(178, 33));

        tfA05.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfA05.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfA06.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfA06.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        senegal02.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        senegal02.setForeground(new java.awt.Color(255, 255, 255));
        senegal02.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        senegal02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/sen.png"))); // NOI18N
        senegal02.setText("   Senegal");

        jLabel1171.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1171.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1171.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1171.setText("Al Thumama");

        jLabel1172.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1172.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1172.setText("25 - NOV");

        jLabel1173.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1173.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1173.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1173.setText("13:00");

        ecuador02.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        ecuador02.setForeground(new java.awt.Color(255, 255, 255));
        ecuador02.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ecuador02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/ecu.png"))); // NOI18N
        ecuador02.setText("   Ecuador   ");
        ecuador02.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        ecuador02.setMaximumSize(new java.awt.Dimension(178, 33));
        ecuador02.setMinimumSize(new java.awt.Dimension(178, 33));
        ecuador02.setPreferredSize(new java.awt.Dimension(178, 33));

        tfA07.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfA07.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfA08.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfA08.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        pbajos02.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        pbajos02.setForeground(new java.awt.Color(255, 255, 255));
        pbajos02.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pbajos02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/pba.png"))); // NOI18N
        pbajos02.setText("   Países Bajos");
        pbajos02.setMaximumSize(new java.awt.Dimension(178, 33));
        pbajos02.setMinimumSize(new java.awt.Dimension(178, 33));
        pbajos02.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel1175.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1175.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1175.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1175.setText("Khalifa");
        jLabel1175.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1175.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1175.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1176.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1176.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1176.setText("29 - NOV");

        jLabel1177.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1177.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1177.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1177.setText("12:00");

        pbajos03.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        pbajos03.setForeground(new java.awt.Color(255, 255, 255));
        pbajos03.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pbajos03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/pba.png"))); // NOI18N
        pbajos03.setText("   Países Bajos  ");
        pbajos03.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        pbajos03.setMaximumSize(new java.awt.Dimension(178, 33));
        pbajos03.setMinimumSize(new java.awt.Dimension(178, 33));
        pbajos03.setPreferredSize(new java.awt.Dimension(178, 33));

        tfA09.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfA09.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfA10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfA10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        qatar03.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        qatar03.setForeground(new java.awt.Color(255, 255, 255));
        qatar03.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        qatar03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/qat.png"))); // NOI18N
        qatar03.setText("   Qatar");
        qatar03.setMaximumSize(new java.awt.Dimension(178, 33));
        qatar03.setMinimumSize(new java.awt.Dimension(178, 33));
        qatar03.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel1180.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1180.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1180.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1180.setText("Al Bayt");
        jLabel1180.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1180.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1180.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1181.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1181.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1181.setText("29 - NOV");

        jLabel1182.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1182.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1182.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1182.setText("12:00");

        ecuador03.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        ecuador03.setForeground(new java.awt.Color(255, 255, 255));
        ecuador03.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ecuador03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/ecu.png"))); // NOI18N
        ecuador03.setText("   Ecuador   ");
        ecuador03.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        tfA11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfA11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfA12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfA12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        senegal03.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        senegal03.setForeground(new java.awt.Color(255, 255, 255));
        senegal03.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        senegal03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/sen.png"))); // NOI18N
        senegal03.setText("   Senegal");
        senegal03.setToolTipText("");
        senegal03.setMaximumSize(new java.awt.Dimension(178, 33));
        senegal03.setMinimumSize(new java.awt.Dimension(178, 33));
        senegal03.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel1185.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1185.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1185.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1185.setText("Khalifa");
        jLabel1185.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1185.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1185.setPreferredSize(new java.awt.Dimension(112, 19));

        guardarA.setBackground(new java.awt.Color(140, 21, 57));
        guardarA.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        guardarA.setForeground(new java.awt.Color(255, 255, 255));
        guardarA.setText("Cargar tabla");
        guardarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarAActionPerformed(evt);
            }
        });

        borrarA.setBackground(new java.awt.Color(204, 0, 51));
        borrarA.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        borrarA.setForeground(new java.awt.Color(255, 255, 255));
        borrarA.setText("Borrar tabla");
        borrarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarAActionPerformed(evt);
            }
        });

        tablaA.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tablaA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Ecuador", null, null, null, null, null, null, null},
                {"Países B.", null, null, null, null, null, null, null},
                {"Qatar", null, null, null, null, null, null, null},
                {"Senegal", null, null, null, null, null, null, null}
            },
            new String [] {
                "Paises", "Puntos", "Part. Ganados", "P. Empatados", "Part. Perdidos", "G. a Favor", "G. en Contra", "Dif."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaA.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tablaA.setSelectionForeground(new java.awt.Color(0, 255, 204));
        jScrollPane25.setViewportView(tablaA);

        javax.swing.GroupLayout grupoALayout = new javax.swing.GroupLayout(grupoA);
        grupoA.setLayout(grupoALayout);
        grupoALayout.setHorizontalGroup(
            grupoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoALayout.createSequentialGroup()
                .addGroup(grupoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoALayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(grupoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(grupoALayout.createSequentialGroup()
                                .addGroup(grupoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1181, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1172, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1176, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1157, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1167, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1162, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel960, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(grupoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(grupoALayout.createSequentialGroup()
                                        .addGroup(grupoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1177, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1173, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1168, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1163, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1158, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1182, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)
                                        .addGroup(grupoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ecuador03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(pbajos03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ecuador02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(qatar02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(senegal01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(qatar01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(40, 40, 40)
                                        .addGroup(grupoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(grupoALayout.createSequentialGroup()
                                                .addGroup(grupoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(tfA09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfA11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(24, 24, 24)
                                                .addGroup(grupoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tfA12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfA10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(tfA01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfA05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfA07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfA03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfA02, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1155, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfA04, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfA06, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfA08, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(43, 43, 43)
                                        .addGroup(grupoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ecuador01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(qatar03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(senegal03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(pbajos02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(pbajos01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(senegal02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(50, 50, 50)
                                        .addGroup(grupoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1171, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1161, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1166, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1175, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1180, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1185, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1156, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel973)))
                            .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(grupoALayout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addGroup(grupoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(borrarA, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guardarA, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        grupoALayout.setVerticalGroup(
            grupoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoALayout.createSequentialGroup()
                .addGroup(grupoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoALayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(grupoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel960)
                            .addComponent(jLabel973)
                            .addComponent(jLabel1155)
                            .addComponent(jLabel1156, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(grupoALayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(grupoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qatar01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(grupoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1157)
                                .addComponent(tfA01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfA02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ecuador01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1161, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1158)))
                        .addGap(30, 30, 30)
                        .addGroup(grupoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1162)
                            .addComponent(jLabel1163)
                            .addComponent(senegal01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfA03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfA04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pbajos01)
                            .addComponent(jLabel1166, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(grupoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1167)
                    .addComponent(qatar02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1168)
                    .addComponent(tfA05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfA06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senegal02)
                    .addComponent(jLabel1171))
                .addGap(30, 30, 30)
                .addGroup(grupoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1172)
                    .addComponent(ecuador02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1173)
                    .addComponent(tfA07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfA08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pbajos02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1175, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(grupoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1176)
                    .addComponent(jLabel1177)
                    .addComponent(pbajos03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfA09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfA10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qatar03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1180, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(grupoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1181)
                    .addComponent(ecuador03)
                    .addComponent(jLabel1182)
                    .addComponent(tfA11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfA12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senegal03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1185, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(guardarA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(borrarA)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        partidosYposiciones.addTab("Grupo A", grupoA);

        grupoB.setBackground(new java.awt.Color(140, 21, 57));
        grupoB.setMaximumSize(new java.awt.Dimension(178, 33));
        grupoB.setMinimumSize(new java.awt.Dimension(178, 33));

        jLabel1186.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1186.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1186.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1186.setText("FECHA");

        jLabel1187.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1187.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1187.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1187.setText("HORARIO");

        jLabel1188.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1188.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1188.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1188.setText("PARTIDOS");

        jLabel1189.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1189.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1189.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1189.setText("ESTADIO");
        jLabel1189.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1189.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1189.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1190.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1190.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1190.setText("21 - NOV");

        jLabel1191.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1191.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1191.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1191.setText("10:00");

        jLabel1192.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1192.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1192.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1192.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/ing.png"))); // NOI18N
        jLabel1192.setText("   Inglaterra   ");
        jLabel1192.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1192.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1192.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1192.setPreferredSize(new java.awt.Dimension(178, 33));

        tfB01.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfB01.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfB02.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfB02.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1193.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1193.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1193.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1193.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/ira.png"))); // NOI18N
        jLabel1193.setText("   Irán");
        jLabel1193.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1193.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1193.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel1194.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1194.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1194.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1194.setText("Khalifa");
        jLabel1194.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1194.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1194.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1195.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1195.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1195.setText("21 - NOV");

        jLabel1196.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1196.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1196.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1196.setText("16:00");

        jLabel1197.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1197.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1197.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1197.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/usa.png"))); // NOI18N
        jLabel1197.setText("   EE.UU.   ");
        jLabel1197.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1197.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1197.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1197.setPreferredSize(new java.awt.Dimension(178, 33));

        tfB03.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfB03.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfB04.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfB04.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1198.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1198.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1198.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1198.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/gal.png"))); // NOI18N
        jLabel1198.setText("   Gales");

        jLabel1199.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1199.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1199.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1199.setText("Áhmad Bin Ali");
        jLabel1199.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1199.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1199.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1200.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1200.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1200.setText("25 - NOV");

        jLabel1201.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1201.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1201.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1201.setText("07:00");

        jLabel1202.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1202.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1202.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1202.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/gal.png"))); // NOI18N
        jLabel1202.setText("   Gales   ");
        jLabel1202.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1202.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1202.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1202.setPreferredSize(new java.awt.Dimension(178, 33));

        tfB05.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfB05.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfB06.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfB06.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1203.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1203.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1203.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1203.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/ira.png"))); // NOI18N
        jLabel1203.setText("   Irán");

        jLabel1204.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1204.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1204.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1204.setText("Áhmad Bin Ali");

        jLabel1205.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1205.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1205.setText("25 - NOV");

        jLabel1206.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1206.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1206.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1206.setText("16:00");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/ing.png"))); // NOI18N
        jLabel11.setText("   Inglaterra   ");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel11.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel11.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel11.setPreferredSize(new java.awt.Dimension(178, 33));

        tfB07.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfB07.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfB08.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfB08.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1207.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1207.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1207.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1207.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/usa.png"))); // NOI18N
        jLabel1207.setText("   EE.UU.");
        jLabel1207.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1207.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1207.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel1208.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1208.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1208.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1208.setText("Al Bayt");
        jLabel1208.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1208.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1208.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1209.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1209.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1209.setText("29 - NOV");

        jLabel1210.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1210.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1210.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1210.setText("16:00");

        jLabel1211.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1211.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1211.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1211.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/gal.png"))); // NOI18N
        jLabel1211.setText("   Gales   ");
        jLabel1211.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1211.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1211.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1211.setPreferredSize(new java.awt.Dimension(178, 33));

        tfB09.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfB09.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfB10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfB10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1212.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1212.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1212.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1212.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/ing.png"))); // NOI18N
        jLabel1212.setText("   Inglaterra");
        jLabel1212.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1212.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1212.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel1213.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1213.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1213.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1213.setText("Áhmad Bin Ali");
        jLabel1213.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1213.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1213.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1214.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1214.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1214.setText("29 - NOV");

        jLabel1215.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1215.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1215.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1215.setText("16:00");

        jLabel1216.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1216.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1216.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1216.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/ira.png"))); // NOI18N
        jLabel1216.setText("   Irán   ");
        jLabel1216.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        tfB11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfB11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfB12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfB12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1217.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1217.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1217.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1217.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/usa.png"))); // NOI18N
        jLabel1217.setText("   EE.UU.");
        jLabel1217.setToolTipText("");
        jLabel1217.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1217.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1217.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel1218.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1218.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1218.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1218.setText("Al Thumama");
        jLabel1218.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1218.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1218.setPreferredSize(new java.awt.Dimension(112, 19));

        guardarB.setBackground(new java.awt.Color(140, 21, 57));
        guardarB.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        guardarB.setForeground(new java.awt.Color(255, 255, 255));
        guardarB.setText("Cargar tabla");
        guardarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBActionPerformed(evt);
            }
        });

        borrarB.setBackground(new java.awt.Color(204, 0, 51));
        borrarB.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        borrarB.setForeground(new java.awt.Color(255, 255, 255));
        borrarB.setText("Borrar tabla");
        borrarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarBActionPerformed(evt);
            }
        });

        tablaB.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tablaB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"EE.UU.", null, null, null, null, null, null, null},
                {"Gales", null, null, null, null, null, null, null},
                {"Inglaterra", null, null, null, null, null, null, null},
                {"Irán", null, null, null, null, null, null, null}
            },
            new String [] {
                "Paises", "Puntos", "Part. Ganados", "P. Empatados", "Part. Perdidos", "G. a Favor", "G. en Contra", "Dif."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaB.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tablaB.setSelectionForeground(new java.awt.Color(0, 255, 204));
        jScrollPane26.setViewportView(tablaB);

        javax.swing.GroupLayout grupoBLayout = new javax.swing.GroupLayout(grupoB);
        grupoB.setLayout(grupoBLayout);
        grupoBLayout.setHorizontalGroup(
            grupoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoBLayout.createSequentialGroup()
                .addGroup(grupoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoBLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(grupoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(grupoBLayout.createSequentialGroup()
                                .addGroup(grupoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1214, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1205, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1209, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1190, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1200, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1195, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1186, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(grupoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(grupoBLayout.createSequentialGroup()
                                        .addGroup(grupoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1210, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1206, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1201, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1196, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1191, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1215, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)
                                        .addGroup(grupoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1216, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1211, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1202, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1197, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1192, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(40, 40, 40)
                                        .addGroup(grupoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(grupoBLayout.createSequentialGroup()
                                                .addGroup(grupoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(tfB09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfB11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(24, 24, 24)
                                                .addGroup(grupoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tfB12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfB10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(tfB01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfB05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfB07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfB03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfB02, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1188, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfB04, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfB06, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfB08, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(43, 43, 43)
                                        .addGroup(grupoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1193, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1212, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1217, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1207, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1198, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1203, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(50, 50, 50)
                                        .addGroup(grupoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1204, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1194, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1199, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1208, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1213, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1218, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1189, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel1187)))
                            .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(grupoBLayout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addGroup(grupoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(borrarB, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guardarB, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        grupoBLayout.setVerticalGroup(
            grupoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoBLayout.createSequentialGroup()
                .addGroup(grupoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoBLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(grupoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1186)
                            .addComponent(jLabel1187)
                            .addComponent(jLabel1188)
                            .addComponent(jLabel1189, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(grupoBLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(grupoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1190)
                            .addComponent(jLabel1192, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfB01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfB02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1193, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1194, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1191))
                        .addGap(30, 30, 30)
                        .addGroup(grupoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1195)
                            .addComponent(jLabel1196)
                            .addComponent(jLabel1197, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfB03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfB04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1198)
                            .addComponent(jLabel1199, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(grupoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1200)
                    .addComponent(jLabel1202, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1201)
                    .addComponent(tfB05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfB06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1203)
                    .addComponent(jLabel1204))
                .addGap(30, 30, 30)
                .addGroup(grupoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1205)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1206)
                    .addComponent(tfB07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfB08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1207, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1208, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(grupoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1209)
                    .addComponent(jLabel1210)
                    .addComponent(jLabel1211, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfB09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfB10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1213, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(grupoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1214)
                    .addComponent(jLabel1216)
                    .addComponent(jLabel1215)
                    .addComponent(tfB11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfB12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1217, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1218, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(guardarB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(borrarB)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        partidosYposiciones.addTab("Grupo B", grupoB);

        grupoC.setBackground(new java.awt.Color(140, 21, 57));

        jLabel1219.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1219.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1219.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1219.setText("FECHA");

        jLabel1220.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1220.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1220.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1220.setText("HORARIO");

        jLabel1221.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1221.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1221.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1221.setText("PARTIDOS");

        jLabel1222.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1222.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1222.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1222.setText("ESTADIO");
        jLabel1222.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1222.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1222.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1223.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1223.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1223.setText("22 - NOV");

        jLabel1224.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1224.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1224.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1224.setText("13:00");

        jLabel1225.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1225.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1225.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1225.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/mex.png"))); // NOI18N
        jLabel1225.setText("   México   ");
        jLabel1225.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1225.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1225.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1225.setPreferredSize(new java.awt.Dimension(178, 33));

        tfC01.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfC01.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfC02.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfC02.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1226.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1226.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1226.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1226.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/pol.png"))); // NOI18N
        jLabel1226.setText("   Polonia");
        jLabel1226.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1226.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1226.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel1227.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1227.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1227.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1227.setText("Estadium 974");
        jLabel1227.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1227.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1227.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1228.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1228.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1228.setText("22 - NOV");

        jLabel1229.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1229.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1229.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1229.setText("07:00");

        jLabel1230.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1230.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1230.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1230.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/arg.png"))); // NOI18N
        jLabel1230.setText("   Argentina   ");
        jLabel1230.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1230.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1230.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1230.setPreferredSize(new java.awt.Dimension(178, 33));

        tfC03.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfC03.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfC04.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfC04.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1231.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1231.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1231.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1231.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/ara.png"))); // NOI18N
        jLabel1231.setText("   Arabia Saudita");

        jLabel1232.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1232.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1232.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1232.setText("Lusail");
        jLabel1232.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1232.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1232.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1233.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1233.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1233.setText("26 - NOV");

        jLabel1234.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1234.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1234.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1234.setText("10:00");

        jLabel1235.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1235.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1235.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1235.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/pol.png"))); // NOI18N
        jLabel1235.setText("   Polonia   ");
        jLabel1235.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1235.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1235.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1235.setPreferredSize(new java.awt.Dimension(178, 33));

        tfC05.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfC05.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfC06.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfC06.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1236.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1236.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1236.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1236.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/ara.png"))); // NOI18N
        jLabel1236.setText("   Arabia Saudita");

        jLabel1237.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1237.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1237.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1237.setText("Education City");

        jLabel1238.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1238.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1238.setText("26 - NOV");

        jLabel1239.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1239.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1239.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1239.setText("16:00");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/arg.png"))); // NOI18N
        jLabel12.setText("   Argentina   ");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel12.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel12.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel12.setPreferredSize(new java.awt.Dimension(178, 33));

        tfC07.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfC07.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfC08.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfC08.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1240.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1240.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1240.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1240.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/mex.png"))); // NOI18N
        jLabel1240.setText("   México");
        jLabel1240.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1240.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1240.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel1241.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1241.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1241.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1241.setText("Lusail");
        jLabel1241.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1241.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1241.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1242.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1242.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1242.setText("30 - NOV");

        jLabel1243.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1243.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1243.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1243.setText("16:00");

        jLabel1244.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1244.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1244.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1244.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/pol.png"))); // NOI18N
        jLabel1244.setText("   Polonia   ");
        jLabel1244.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1244.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1244.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1244.setPreferredSize(new java.awt.Dimension(178, 33));

        tfC09.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfC09.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfC10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfC10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1245.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1245.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1245.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1245.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/arg.png"))); // NOI18N
        jLabel1245.setText("   Argentina");
        jLabel1245.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1245.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1245.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel1246.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1246.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1246.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1246.setText("Estadium 974");
        jLabel1246.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1246.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1246.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1247.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1247.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1247.setText("30 - NOV");

        jLabel1248.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1248.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1248.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1248.setText("16:00");

        jLabel1249.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1249.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1249.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1249.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/ara.png"))); // NOI18N
        jLabel1249.setText("   Arabia Saudita");
        jLabel1249.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        tfC11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfC11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfC12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfC12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1250.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1250.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1250.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1250.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/mex.png"))); // NOI18N
        jLabel1250.setText("   México");
        jLabel1250.setToolTipText("");
        jLabel1250.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1250.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1250.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel1251.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1251.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1251.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1251.setText("Lusail");
        jLabel1251.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1251.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1251.setPreferredSize(new java.awt.Dimension(112, 19));

        guardarC.setBackground(new java.awt.Color(140, 21, 57));
        guardarC.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        guardarC.setForeground(new java.awt.Color(255, 255, 255));
        guardarC.setText("Cargar tabla");
        guardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCActionPerformed(evt);
            }
        });

        borrarC.setBackground(new java.awt.Color(204, 0, 51));
        borrarC.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        borrarC.setForeground(new java.awt.Color(255, 255, 255));
        borrarC.setText("Borrar tabla");
        borrarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarCActionPerformed(evt);
            }
        });

        tablaC.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tablaC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Arabia S.", null, null, null, null, null, null, null},
                {"Argentina", null, null, null, null, null, null, null},
                {"México", null, null, null, null, null, null, null},
                {"Polonia", null, null, null, null, null, null, null}
            },
            new String [] {
                "Paises", "Puntos", "Part. Ganados", "P. Empatados", "Part. Perdidos", "G. a Favor", "G. en Contra", "Dif."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaC.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tablaC.setSelectionForeground(new java.awt.Color(0, 255, 204));
        jScrollPane27.setViewportView(tablaC);

        javax.swing.GroupLayout grupoCLayout = new javax.swing.GroupLayout(grupoC);
        grupoC.setLayout(grupoCLayout);
        grupoCLayout.setHorizontalGroup(
            grupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoCLayout.createSequentialGroup()
                .addGroup(grupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoCLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(grupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(grupoCLayout.createSequentialGroup()
                                .addGroup(grupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1247, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1238, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1242, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1223, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1233, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1228, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1219, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(grupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(grupoCLayout.createSequentialGroup()
                                        .addGroup(grupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1243, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1239, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1234, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1229, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1224, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1248, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)
                                        .addGroup(grupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1249, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1244, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1235, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1230, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1225, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(40, 40, 40)
                                        .addGroup(grupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(grupoCLayout.createSequentialGroup()
                                                .addGroup(grupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(tfC09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfC11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(24, 24, 24)
                                                .addGroup(grupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tfC12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfC10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(tfC01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfC05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfC07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfC03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfC02, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1221, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfC04, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfC06, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfC08, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(43, 43, 43)
                                        .addGroup(grupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1226, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(grupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel1245, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1250, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel1231)
                                            .addComponent(jLabel1236)
                                            .addComponent(jLabel1240, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(50, 50, 50)
                                        .addGroup(grupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1237, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1227, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1232, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1241, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1246, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1251, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1222, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel1220)))
                            .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(grupoCLayout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addGroup(grupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(borrarC, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guardarC, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        grupoCLayout.setVerticalGroup(
            grupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoCLayout.createSequentialGroup()
                .addGroup(grupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoCLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(grupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1219)
                            .addComponent(jLabel1220)
                            .addComponent(jLabel1221)
                            .addComponent(jLabel1222, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(grupoCLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(grupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1223)
                            .addComponent(jLabel1225, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfC01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfC02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1226, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1227, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1224))
                        .addGap(30, 30, 30)
                        .addGroup(grupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1228)
                            .addComponent(jLabel1229)
                            .addComponent(jLabel1230, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfC03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfC04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1231)
                            .addComponent(jLabel1232, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(grupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1233)
                    .addComponent(jLabel1235, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1234)
                    .addComponent(tfC05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfC06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1236)
                    .addComponent(jLabel1237))
                .addGap(30, 30, 30)
                .addGroup(grupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1238)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1239)
                    .addComponent(tfC07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfC08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1240, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1241, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(grupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1242)
                    .addComponent(jLabel1243)
                    .addComponent(jLabel1244, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfC09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfC10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1245, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1246, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(grupoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1247)
                    .addComponent(jLabel1249)
                    .addComponent(jLabel1248)
                    .addComponent(tfC11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfC12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1250, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1251, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(guardarC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(borrarC)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        partidosYposiciones.addTab("Grupo C", grupoC);

        grupoD.setBackground(new java.awt.Color(140, 21, 57));

        jLabel950.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel950.setForeground(new java.awt.Color(255, 255, 255));
        jLabel950.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel950.setText("FECHA");

        jLabel953.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel953.setForeground(new java.awt.Color(255, 255, 255));
        jLabel953.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel953.setText("HORARIO");

        jLabel964.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel964.setForeground(new java.awt.Color(255, 255, 255));
        jLabel964.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel964.setText("PARTIDOS");

        jLabel965.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel965.setForeground(new java.awt.Color(255, 255, 255));
        jLabel965.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel965.setText("ESTADIO");
        jLabel965.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel965.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel965.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel956.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel956.setForeground(new java.awt.Color(255, 255, 255));
        jLabel956.setText("22 - NOV");

        jLabel1154.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1154.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1154.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1154.setText("16:00");

        jLabel974.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel974.setForeground(new java.awt.Color(255, 255, 255));
        jLabel974.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel974.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/fra.png"))); // NOI18N
        jLabel974.setText("   Francia   ");
        jLabel974.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel974.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel974.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel974.setPreferredSize(new java.awt.Dimension(178, 33));

        tfD01.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfD01.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfD02.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfD02.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel980.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel980.setForeground(new java.awt.Color(255, 255, 255));
        jLabel980.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel980.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/aus.png"))); // NOI18N
        jLabel980.setText("   Australia");
        jLabel980.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel980.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel980.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel968.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel968.setForeground(new java.awt.Color(255, 255, 255));
        jLabel968.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel968.setText("Al janoub");
        jLabel968.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel968.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel968.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel952.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel952.setForeground(new java.awt.Color(255, 255, 255));
        jLabel952.setText("22 - NOV");

        jLabel955.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel955.setForeground(new java.awt.Color(255, 255, 255));
        jLabel955.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel955.setText("10:00");

        jLabel972.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel972.setForeground(new java.awt.Color(255, 255, 255));
        jLabel972.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel972.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/din.png"))); // NOI18N
        jLabel972.setText("   Dinamarca   ");
        jLabel972.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel972.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel972.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel972.setPreferredSize(new java.awt.Dimension(178, 33));

        tfD03.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfD03.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfD04.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfD04.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel978.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel978.setForeground(new java.awt.Color(255, 255, 255));
        jLabel978.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel978.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/tun.png"))); // NOI18N
        jLabel978.setText("   Túnez");

        jLabel966.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel966.setForeground(new java.awt.Color(255, 255, 255));
        jLabel966.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel966.setText("Education City");

        jLabel951.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel951.setForeground(new java.awt.Color(255, 255, 255));
        jLabel951.setText("26 - NOV");

        jLabel954.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel954.setForeground(new java.awt.Color(255, 255, 255));
        jLabel954.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel954.setText("07:00");

        jLabel975.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel975.setForeground(new java.awt.Color(255, 255, 255));
        jLabel975.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel975.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/tun.png"))); // NOI18N
        jLabel975.setText("   Túnez   ");
        jLabel975.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel975.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel975.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel975.setPreferredSize(new java.awt.Dimension(178, 33));

        tfD05.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfD05.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfD06.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfD06.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel981.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel981.setForeground(new java.awt.Color(255, 255, 255));
        jLabel981.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel981.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/aus.png"))); // NOI18N
        jLabel981.setText("   Australia");

        jLabel969.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel969.setForeground(new java.awt.Color(255, 255, 255));
        jLabel969.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel969.setText("Al janoub");

        jLabel958.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel958.setForeground(new java.awt.Color(255, 255, 255));
        jLabel958.setText("26 - NOV");

        jLabel962.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel962.setForeground(new java.awt.Color(255, 255, 255));
        jLabel962.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel962.setText("13:00");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/fra.png"))); // NOI18N
        jLabel4.setText("   Francia   ");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel4.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel4.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel4.setPreferredSize(new java.awt.Dimension(178, 33));

        tfD07.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfD07.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfD08.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfD08.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel979.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel979.setForeground(new java.awt.Color(255, 255, 255));
        jLabel979.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel979.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/din.png"))); // NOI18N
        jLabel979.setText("   Dinamarca");
        jLabel979.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel979.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel979.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel967.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel967.setForeground(new java.awt.Color(255, 255, 255));
        jLabel967.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel967.setText("Estadium 974");
        jLabel967.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel967.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel967.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel957.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel957.setForeground(new java.awt.Color(255, 255, 255));
        jLabel957.setText("30 - NOV");

        jLabel961.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel961.setForeground(new java.awt.Color(255, 255, 255));
        jLabel961.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel961.setText("12:00");

        jLabel976.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel976.setForeground(new java.awt.Color(255, 255, 255));
        jLabel976.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel976.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/aus.png"))); // NOI18N
        jLabel976.setText("   Australia   ");
        jLabel976.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel976.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel976.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel976.setPreferredSize(new java.awt.Dimension(178, 33));

        tfD09.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfD09.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfD10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfD10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel982.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel982.setForeground(new java.awt.Color(255, 255, 255));
        jLabel982.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel982.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/din.png"))); // NOI18N
        jLabel982.setText("   Dinamarca");
        jLabel982.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel982.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel982.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel970.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel970.setForeground(new java.awt.Color(255, 255, 255));
        jLabel970.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel970.setText("Al janoub");
        jLabel970.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel970.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel970.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel959.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel959.setForeground(new java.awt.Color(255, 255, 255));
        jLabel959.setText("30 - NOV");

        jLabel963.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel963.setForeground(new java.awt.Color(255, 255, 255));
        jLabel963.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel963.setText("12:00");

        jLabel977.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel977.setForeground(new java.awt.Color(255, 255, 255));
        jLabel977.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel977.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/tun.png"))); // NOI18N
        jLabel977.setText("   Túnez   ");
        jLabel977.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        tfD11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfD11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfD12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfD12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel983.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel983.setForeground(new java.awt.Color(255, 255, 255));
        jLabel983.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel983.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/fra.png"))); // NOI18N
        jLabel983.setText("   Francia");
        jLabel983.setToolTipText("");
        jLabel983.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel983.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel983.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel971.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel971.setForeground(new java.awt.Color(255, 255, 255));
        jLabel971.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel971.setText("Education City");

        guardarD.setBackground(new java.awt.Color(140, 21, 57));
        guardarD.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        guardarD.setForeground(new java.awt.Color(255, 255, 255));
        guardarD.setText("Cargar tabla");
        guardarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarDActionPerformed(evt);
            }
        });

        borrarD.setBackground(new java.awt.Color(204, 0, 51));
        borrarD.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        borrarD.setForeground(new java.awt.Color(255, 255, 255));
        borrarD.setText("Borrar tabla");
        borrarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarDActionPerformed(evt);
            }
        });

        tablaD.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tablaD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Australia", null, null, null, null, null, null, null},
                {"Dinamarca", null, null, null, null, null, null, null},
                {"Francia", null, null, null, null, null, null, null},
                {"Túnez", null, null, null, null, null, null, null}
            },
            new String [] {
                "Paises", "Puntos", "Part. Ganados", "P. Empatados", "Part. Perdidos", "G. a Favor", "G. en Contra", "Dif."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaD.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tablaD.setSelectionForeground(new java.awt.Color(0, 255, 204));
        jScrollPane19.setViewportView(tablaD);

        javax.swing.GroupLayout grupoDLayout = new javax.swing.GroupLayout(grupoD);
        grupoD.setLayout(grupoDLayout);
        grupoDLayout.setHorizontalGroup(
            grupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoDLayout.createSequentialGroup()
                .addGroup(grupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoDLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(grupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(grupoDLayout.createSequentialGroup()
                                .addGroup(grupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel959, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel958, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel957, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel956, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel951, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel952, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel950, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(grupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(grupoDLayout.createSequentialGroup()
                                        .addGroup(grupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel961, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel962, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel954, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel955, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1154, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel963, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)
                                        .addGroup(grupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel977, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel976, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel975, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel972, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel974, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(40, 40, 40)
                                        .addGroup(grupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(grupoDLayout.createSequentialGroup()
                                                .addGroup(grupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(tfD09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfD11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(24, 24, 24)
                                                .addGroup(grupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tfD12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfD10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(tfD01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfD05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfD07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfD03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfD02, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel964, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfD04, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfD06, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfD08, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(43, 43, 43)
                                        .addGroup(grupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel980, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(grupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel982, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel983, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel978)
                                            .addComponent(jLabel981)
                                            .addComponent(jLabel979, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(50, 50, 50)
                                        .addGroup(grupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel969, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel968, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel966, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel967, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel970, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel971, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel965, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel953)))
                            .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(grupoDLayout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addGroup(grupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(borrarD, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guardarD, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        grupoDLayout.setVerticalGroup(
            grupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoDLayout.createSequentialGroup()
                .addGroup(grupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoDLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(grupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel950)
                            .addComponent(jLabel953)
                            .addComponent(jLabel964)
                            .addComponent(jLabel965, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(grupoDLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(grupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel956)
                            .addComponent(jLabel974, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfD01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfD02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel980, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel968, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1154))
                        .addGap(30, 30, 30)
                        .addGroup(grupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel952)
                            .addComponent(jLabel955)
                            .addComponent(jLabel972, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfD03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfD04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel978)
                            .addComponent(jLabel966))))
                .addGap(30, 30, 30)
                .addGroup(grupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel951)
                    .addComponent(jLabel975, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel954)
                    .addComponent(tfD05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfD06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel981)
                    .addComponent(jLabel969))
                .addGap(30, 30, 30)
                .addGroup(grupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel958)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel962)
                    .addComponent(tfD07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfD08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel979, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel967, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(grupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel957)
                    .addComponent(jLabel961)
                    .addComponent(jLabel976, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfD09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfD10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel982, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel970, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(grupoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel959)
                    .addComponent(jLabel977)
                    .addComponent(jLabel963)
                    .addComponent(tfD11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfD12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel983, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel971))
                .addGap(33, 33, 33)
                .addComponent(guardarD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(borrarD)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        partidosYposiciones.addTab("Grupo D", grupoD);

        grupoE.setBackground(new java.awt.Color(140, 21, 57));

        jLabel984.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel984.setForeground(new java.awt.Color(255, 255, 255));
        jLabel984.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel984.setText("FECHA");

        jLabel985.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel985.setForeground(new java.awt.Color(255, 255, 255));
        jLabel985.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel985.setText("HORARIO");

        jLabel986.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel986.setForeground(new java.awt.Color(255, 255, 255));
        jLabel986.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel986.setText("PARTIDOS");

        jLabel987.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel987.setForeground(new java.awt.Color(255, 255, 255));
        jLabel987.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel987.setText("ESTADIO");
        jLabel987.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel987.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel987.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel988.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel988.setForeground(new java.awt.Color(255, 255, 255));
        jLabel988.setText("23 - NOV");

        jLabel1252.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1252.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1252.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1252.setText("13:00");

        jLabel989.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel989.setForeground(new java.awt.Color(255, 255, 255));
        jLabel989.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel989.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/esp.png"))); // NOI18N
        jLabel989.setText("   España   ");
        jLabel989.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel989.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel989.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel989.setPreferredSize(new java.awt.Dimension(178, 33));

        tfE01.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfE01.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfE02.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfE02.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel990.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel990.setForeground(new java.awt.Color(255, 255, 255));
        jLabel990.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel990.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/cos.png"))); // NOI18N
        jLabel990.setText("   Costa Rica");
        jLabel990.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel990.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel990.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel991.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel991.setForeground(new java.awt.Color(255, 255, 255));
        jLabel991.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel991.setText("Al Thumama");
        jLabel991.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel991.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel991.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel992.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel992.setForeground(new java.awt.Color(255, 255, 255));
        jLabel992.setText("23 - NOV");

        jLabel993.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel993.setForeground(new java.awt.Color(255, 255, 255));
        jLabel993.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel993.setText("10:00");

        jLabel994.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel994.setForeground(new java.awt.Color(255, 255, 255));
        jLabel994.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel994.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/ale.png"))); // NOI18N
        jLabel994.setText("   Alemania   ");
        jLabel994.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel994.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel994.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel994.setPreferredSize(new java.awt.Dimension(178, 33));

        tfE03.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfE03.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfE04.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfE04.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel995.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel995.setForeground(new java.awt.Color(255, 255, 255));
        jLabel995.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel995.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/jap.png"))); // NOI18N
        jLabel995.setText("   Japón");

        jLabel996.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel996.setForeground(new java.awt.Color(255, 255, 255));
        jLabel996.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel996.setText("Khalifa");

        jLabel997.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel997.setForeground(new java.awt.Color(255, 255, 255));
        jLabel997.setText("27 - NOV");

        jLabel998.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel998.setForeground(new java.awt.Color(255, 255, 255));
        jLabel998.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel998.setText("07:00");

        jLabel999.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel999.setForeground(new java.awt.Color(255, 255, 255));
        jLabel999.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel999.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/jap.png"))); // NOI18N
        jLabel999.setText("   Japón   ");
        jLabel999.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel999.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel999.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel999.setPreferredSize(new java.awt.Dimension(178, 33));

        tfE05.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfE05.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfE06.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfE06.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1000.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1000.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1000.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/cos.png"))); // NOI18N
        jLabel1000.setText("   Costa Rica");

        jLabel1001.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1001.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1001.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1001.setText("Áhmad Bin Ali");

        jLabel1002.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1002.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1002.setText("27 - NOV");

        jLabel1003.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1003.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1003.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1003.setText("16:00");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/esp.png"))); // NOI18N
        jLabel5.setText("   España   ");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel5.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel5.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel5.setPreferredSize(new java.awt.Dimension(178, 33));

        tfE07.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfE07.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfE08.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfE08.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1004.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1004.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1004.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1004.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/ale.png"))); // NOI18N
        jLabel1004.setText("   Alemania");
        jLabel1004.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1004.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1004.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel1005.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1005.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1005.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1005.setText("Al Bayt");
        jLabel1005.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1005.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1005.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1006.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1006.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1006.setText("01 - DIC");

        jLabel1007.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1007.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1007.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1007.setText("16:00");

        jLabel1008.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1008.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1008.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1008.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/jap.png"))); // NOI18N
        jLabel1008.setText("   Japón   ");
        jLabel1008.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1008.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1008.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1008.setPreferredSize(new java.awt.Dimension(178, 33));

        tfE09.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfE09.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfE10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfE10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1009.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1009.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1009.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1009.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/esp.png"))); // NOI18N
        jLabel1009.setText("   España");
        jLabel1009.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1009.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1009.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel1010.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1010.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1010.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1010.setText("Khalifa");
        jLabel1010.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1010.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1010.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1011.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1011.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1011.setText("01 - DIC");

        jLabel1012.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1012.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1012.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1012.setText("16:00");

        jLabel1013.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1013.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1013.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1013.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/cos.png"))); // NOI18N
        jLabel1013.setText("   Costa Rica   ");
        jLabel1013.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        tfE11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfE11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfE12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfE12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1014.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1014.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1014.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1014.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/ale.png"))); // NOI18N
        jLabel1014.setText("   Alemania");
        jLabel1014.setToolTipText("");
        jLabel1014.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1014.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1014.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel1015.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1015.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1015.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1015.setText("Al Bayt");

        guardarE.setBackground(new java.awt.Color(140, 21, 57));
        guardarE.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        guardarE.setForeground(new java.awt.Color(255, 255, 255));
        guardarE.setText("Cargar tabla");
        guardarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarEActionPerformed(evt);
            }
        });

        borrarE.setBackground(new java.awt.Color(204, 0, 51));
        borrarE.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        borrarE.setForeground(new java.awt.Color(255, 255, 255));
        borrarE.setText("Borrar tabla");
        borrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarEActionPerformed(evt);
            }
        });

        tablaE.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tablaE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Alemania", null, null, null, null, null, null, null},
                {"Costa Rica", null, null, null, null, null, null, null},
                {"España", null, null, null, null, null, null, null},
                {"Japón", null, null, null, null, null, null, null}
            },
            new String [] {
                "Paises", "Puntos", "Part. Ganados", "P. Empatados", "Part. Perdidos", "G. a Favor", "G. en Contra", "Dif."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaE.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tablaE.setSelectionForeground(new java.awt.Color(0, 255, 204));
        jScrollPane20.setViewportView(tablaE);

        javax.swing.GroupLayout grupoELayout = new javax.swing.GroupLayout(grupoE);
        grupoE.setLayout(grupoELayout);
        grupoELayout.setHorizontalGroup(
            grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoELayout.createSequentialGroup()
                .addGroup(grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoELayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(grupoELayout.createSequentialGroup()
                                .addGroup(grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1011, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1002, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1006, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel988, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel997, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel992, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel984, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(grupoELayout.createSequentialGroup()
                                        .addGroup(grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1007, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1003, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel998, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel993, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1252, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1012, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)
                                        .addGroup(grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1013, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1008, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel999, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel994, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel989, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(40, 40, 40)
                                        .addGroup(grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(grupoELayout.createSequentialGroup()
                                                .addGroup(grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(tfE09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfE11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(24, 24, 24)
                                                .addGroup(grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tfE12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfE10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(tfE01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfE05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfE07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfE03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfE02, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel986, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfE04, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfE06, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfE08, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(43, 43, 43)
                                        .addGroup(grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel990, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel1009, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1014, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel1004, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel995, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1000, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(50, 50, 50)
                                        .addGroup(grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1001, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel991, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel996, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1005, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1010, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1015, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel987, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel985)))
                            .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(grupoELayout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addGroup(grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(borrarE, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guardarE, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        grupoELayout.setVerticalGroup(
            grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoELayout.createSequentialGroup()
                .addGroup(grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoELayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel984)
                            .addComponent(jLabel985)
                            .addComponent(jLabel986)
                            .addComponent(jLabel987, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(grupoELayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel988)
                            .addComponent(jLabel989, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfE01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfE02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel990, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel991, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1252))
                        .addGap(30, 30, 30)
                        .addGroup(grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel992)
                            .addComponent(jLabel993)
                            .addComponent(jLabel994, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfE03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfE04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel995)
                            .addComponent(jLabel996))))
                .addGap(30, 30, 30)
                .addGroup(grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel997)
                    .addComponent(jLabel999, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel998)
                    .addComponent(tfE05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfE06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1000)
                    .addComponent(jLabel1001))
                .addGap(30, 30, 30)
                .addGroup(grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1002)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1003)
                    .addComponent(tfE07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfE08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1004, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1005, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1006)
                    .addComponent(jLabel1007)
                    .addComponent(jLabel1008, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfE09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfE10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1009, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1010, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(grupoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1011)
                    .addComponent(jLabel1013)
                    .addComponent(jLabel1012)
                    .addComponent(tfE11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfE12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1014, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1015))
                .addGap(33, 33, 33)
                .addComponent(guardarE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(borrarE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        partidosYposiciones.addTab("Grupo E", grupoE);

        grupoF.setBackground(new java.awt.Color(140, 21, 57));

        jLabel1016.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1016.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1016.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1016.setText("FECHA");

        jLabel1017.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1017.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1017.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1017.setText("HORARIO");

        jLabel1018.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1018.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1018.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1018.setText("PARTIDOS");

        jLabel1019.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1019.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1019.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1019.setText("ESTADIO");
        jLabel1019.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1019.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1019.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1020.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1020.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1020.setText("23 - NOV");

        jLabel1253.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1253.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1253.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1253.setText("16:00");

        jLabel1021.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1021.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1021.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1021.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/bel.png"))); // NOI18N
        jLabel1021.setText("   Bélgica   ");
        jLabel1021.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1021.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1021.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1021.setPreferredSize(new java.awt.Dimension(178, 33));

        tfF01.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfF01.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfF02.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfF02.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1022.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1022.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1022.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1022.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/can.png"))); // NOI18N
        jLabel1022.setText("   Canadá");
        jLabel1022.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1022.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1022.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel1023.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1023.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1023.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1023.setText("Áhmad Bin Ali");
        jLabel1023.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1023.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1023.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1024.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1024.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1024.setText("23 - NOV");

        jLabel1025.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1025.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1025.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1025.setText("07:00");

        jLabel1026.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1026.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1026.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1026.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/mar.png"))); // NOI18N
        jLabel1026.setText("   Marruecos   ");
        jLabel1026.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1026.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1026.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1026.setPreferredSize(new java.awt.Dimension(178, 33));

        tfF03.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfF03.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfF04.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfF04.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1027.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1027.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1027.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1027.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/cro.png"))); // NOI18N
        jLabel1027.setText("   Croacia");

        jLabel1028.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1028.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1028.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1028.setText("Al Bayt");

        jLabel1029.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1029.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1029.setText("27 - NOV");

        jLabel1030.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1030.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1030.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1030.setText("10:00");

        jLabel1031.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1031.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1031.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1031.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/bel.png"))); // NOI18N
        jLabel1031.setText("   Bélgica   ");
        jLabel1031.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1031.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1031.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1031.setPreferredSize(new java.awt.Dimension(178, 33));

        tfF05.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfF05.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfF06.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfF06.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1032.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1032.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1032.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1032.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/mar.png"))); // NOI18N
        jLabel1032.setText("   Marruecos");

        jLabel1033.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1033.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1033.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1033.setText("Al Thumama");

        jLabel1034.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1034.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1034.setText("27 - NOV");

        jLabel1035.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1035.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1035.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1035.setText("13:00");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/cro.png"))); // NOI18N
        jLabel6.setText("   Croacia   ");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel6.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel6.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel6.setPreferredSize(new java.awt.Dimension(178, 33));

        tfF07.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfF07.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfF08.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfF08.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1036.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1036.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1036.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1036.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/can.png"))); // NOI18N
        jLabel1036.setText("   Canadá");
        jLabel1036.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1036.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1036.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel1037.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1037.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1037.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1037.setText("Khalifa");
        jLabel1037.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1037.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1037.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1038.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1038.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1038.setText("01 - DIC");

        jLabel1039.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1039.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1039.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1039.setText("12:00");

        jLabel1040.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1040.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1040.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1040.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/cro.png"))); // NOI18N
        jLabel1040.setText("   Croacia   ");
        jLabel1040.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1040.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1040.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1040.setPreferredSize(new java.awt.Dimension(178, 33));

        tfF09.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfF09.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfF10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfF10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1041.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1041.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1041.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1041.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/bel.png"))); // NOI18N
        jLabel1041.setText("   Bélgica");
        jLabel1041.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1041.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1041.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel1042.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1042.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1042.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1042.setText("Áhmad Bin Ali");
        jLabel1042.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1042.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1042.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1043.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1043.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1043.setText("01 - DIC");

        jLabel1044.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1044.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1044.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1044.setText("12:00");

        jLabel1045.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1045.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1045.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1045.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/can.png"))); // NOI18N
        jLabel1045.setText("   Canadá   ");
        jLabel1045.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        tfF11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfF11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfF12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfF12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1046.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1046.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1046.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1046.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/mar.png"))); // NOI18N
        jLabel1046.setText("   Marruecos");
        jLabel1046.setToolTipText("");
        jLabel1046.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1046.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1046.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel1047.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1047.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1047.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1047.setText("Al Thumama");

        guardarF.setBackground(new java.awt.Color(140, 21, 57));
        guardarF.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        guardarF.setForeground(new java.awt.Color(255, 255, 255));
        guardarF.setText("Cargar tabla");
        guardarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarFActionPerformed(evt);
            }
        });

        borrarF.setBackground(new java.awt.Color(204, 0, 51));
        borrarF.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        borrarF.setForeground(new java.awt.Color(255, 255, 255));
        borrarF.setText("Borrar tabla");
        borrarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarFActionPerformed(evt);
            }
        });

        tablaF.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tablaF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Bélgica", null, null, null, null, null, null, null},
                {"Canadá", null, null, null, null, null, null, null},
                {"Croacia", null, null, null, null, null, null, null},
                {"Marruecos", null, null, null, null, null, null, null}
            },
            new String [] {
                "Paises", "Puntos", "Part. Ganados", "P. Empatados", "Part. Perdidos", "G. a Favor", "G. en Contra", "Dif."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaF.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tablaF.setSelectionForeground(new java.awt.Color(0, 255, 204));
        jScrollPane21.setViewportView(tablaF);

        javax.swing.GroupLayout grupoFLayout = new javax.swing.GroupLayout(grupoF);
        grupoF.setLayout(grupoFLayout);
        grupoFLayout.setHorizontalGroup(
            grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoFLayout.createSequentialGroup()
                .addGroup(grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoFLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(grupoFLayout.createSequentialGroup()
                                .addGroup(grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1043, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1034, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1038, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1020, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1029, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1024, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1016, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(grupoFLayout.createSequentialGroup()
                                        .addGroup(grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1039, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1035, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1030, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1025, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1253, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1044, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)
                                        .addGroup(grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1045, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1040, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1031, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1026, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1021, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(40, 40, 40)
                                        .addGroup(grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(grupoFLayout.createSequentialGroup()
                                                .addGroup(grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(tfF09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfF11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(24, 24, 24)
                                                .addGroup(grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tfF12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfF10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(tfF01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfF05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfF07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfF03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfF02, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1018, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfF04, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfF06, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfF08, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(43, 43, 43)
                                        .addGroup(grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1022, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel1041, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1046, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel1036, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel1027, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1032, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(50, 50, 50)
                                        .addGroup(grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1033, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1023, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1028, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1037, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1042, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1047, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1019, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel1017)))
                            .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(grupoFLayout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addGroup(grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(borrarF, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guardarF, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        grupoFLayout.setVerticalGroup(
            grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoFLayout.createSequentialGroup()
                .addGroup(grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoFLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1016)
                            .addComponent(jLabel1017)
                            .addComponent(jLabel1018)
                            .addComponent(jLabel1019, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(grupoFLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1020)
                            .addComponent(jLabel1021, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfF01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfF02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1022, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1023, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1253))
                        .addGap(30, 30, 30)
                        .addGroup(grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1024)
                            .addComponent(jLabel1025)
                            .addComponent(jLabel1026, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfF03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfF04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1027)
                            .addComponent(jLabel1028))))
                .addGap(30, 30, 30)
                .addGroup(grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1029)
                    .addComponent(jLabel1031, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1030)
                    .addComponent(tfF05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfF06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1032)
                    .addComponent(jLabel1033))
                .addGap(30, 30, 30)
                .addGroup(grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1034)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1035)
                    .addComponent(tfF07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfF08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1036, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1037, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1038)
                    .addComponent(jLabel1039)
                    .addComponent(jLabel1040, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfF09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfF10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1041, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1042, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(grupoFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1043)
                    .addComponent(jLabel1045)
                    .addComponent(jLabel1044)
                    .addComponent(tfF11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfF12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1046, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1047))
                .addGap(33, 33, 33)
                .addComponent(guardarF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(borrarF)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        partidosYposiciones.addTab("Grupo F", grupoF);

        grupoG.setBackground(new java.awt.Color(140, 21, 57));

        jLabel1048.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1048.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1048.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1048.setText("FECHA");

        jLabel1049.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1049.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1049.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1049.setText("HORARIO");

        jLabel1050.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1050.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1050.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1050.setText("PARTIDOS");

        jLabel1051.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1051.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1051.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1051.setText("ESTADIO");
        jLabel1051.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1051.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1051.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1052.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1052.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1052.setText("24 - NOV");

        jLabel1254.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1254.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1254.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1254.setText("07:00");

        jLabel1053.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1053.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1053.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1053.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/sui.png"))); // NOI18N
        jLabel1053.setText("   Suiza   ");
        jLabel1053.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1053.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1053.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1053.setPreferredSize(new java.awt.Dimension(178, 33));

        tfG01.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfG01.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfG02.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfG02.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1054.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1054.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1054.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1054.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/cam.png"))); // NOI18N
        jLabel1054.setText("   Camerún");
        jLabel1054.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1054.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1054.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel1055.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1055.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1055.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1055.setText("Al Janoub");
        jLabel1055.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1055.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1055.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1056.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1056.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1056.setText("24 - NOV");

        jLabel1057.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1057.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1057.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1057.setText("16:00");

        jLabel1058.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1058.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1058.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1058.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/bra.png"))); // NOI18N
        jLabel1058.setText("   Brasil   ");
        jLabel1058.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1058.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1058.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1058.setPreferredSize(new java.awt.Dimension(178, 33));

        tfG03.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfG03.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfG04.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfG04.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1059.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1059.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1059.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1059.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/ser.png"))); // NOI18N
        jLabel1059.setText("   Serbia");

        jLabel1060.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1060.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1060.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1060.setText("Lusail");

        jLabel1061.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1061.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1061.setText("28 - NOV");

        jLabel1062.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1062.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1062.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1062.setText("07:00");

        jLabel1063.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1063.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1063.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1063.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/cam.png"))); // NOI18N
        jLabel1063.setText("   Camerún   ");
        jLabel1063.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1063.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1063.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1063.setPreferredSize(new java.awt.Dimension(178, 33));

        tfG05.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfG05.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfG06.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfG06.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1064.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1064.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1064.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1064.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/ser.png"))); // NOI18N
        jLabel1064.setText("   Serbia");

        jLabel1065.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1065.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1065.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1065.setText("Al Janoub");

        jLabel1066.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1066.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1066.setText("28 - NOV");

        jLabel1067.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1067.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1067.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1067.setText("13:00");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/bra.png"))); // NOI18N
        jLabel7.setText("   Brasil   ");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel7.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel7.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel7.setPreferredSize(new java.awt.Dimension(178, 33));

        tfG07.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfG07.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfG08.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfG08.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1068.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1068.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1068.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1068.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/sui.png"))); // NOI18N
        jLabel1068.setText("   Suiza");
        jLabel1068.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1068.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1068.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel1069.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1069.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1069.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1069.setText("Estadium 974");
        jLabel1069.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1069.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1069.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1070.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1070.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1070.setText("02 - DIC");

        jLabel1071.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1071.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1071.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1071.setText("16:00");

        jLabel1072.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1072.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1072.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1072.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/ser.png"))); // NOI18N
        jLabel1072.setText("   Serbia   ");
        jLabel1072.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1072.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1072.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1072.setPreferredSize(new java.awt.Dimension(178, 33));

        tfG09.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfG09.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfG10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfG10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1073.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1073.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1073.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1073.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/sui.png"))); // NOI18N
        jLabel1073.setText("   Suiza");
        jLabel1073.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1073.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1073.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel1074.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1074.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1074.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1074.setText("Estadium 974");
        jLabel1074.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1074.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1074.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1075.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1075.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1075.setText("02 - DIC");

        jLabel1076.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1076.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1076.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1076.setText("16:00");

        jLabel1077.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1077.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1077.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1077.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/cam.png"))); // NOI18N
        jLabel1077.setText("   Camerún   ");
        jLabel1077.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        tfG11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfG11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfG12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfG12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1078.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1078.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1078.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1078.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/bra.png"))); // NOI18N
        jLabel1078.setText("   Brasil");
        jLabel1078.setToolTipText("");
        jLabel1078.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1078.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1078.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel1079.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1079.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1079.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1079.setText("Lusail");

        guardarG.setBackground(new java.awt.Color(140, 21, 57));
        guardarG.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        guardarG.setForeground(new java.awt.Color(255, 255, 255));
        guardarG.setText("Cargar tabla");
        guardarG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarGActionPerformed(evt);
            }
        });

        borrarG.setBackground(new java.awt.Color(204, 0, 51));
        borrarG.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        borrarG.setForeground(new java.awt.Color(255, 255, 255));
        borrarG.setText("Borrar tabla");
        borrarG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarGActionPerformed(evt);
            }
        });

        tablaG.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tablaG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Brasil", null, null, null, null, null, null, null},
                {"Camerún", null, null, null, null, null, null, null},
                {"Serbia", null, null, null, null, null, null, null},
                {"Suiza", null, null, null, null, null, null, null}
            },
            new String [] {
                "Paises", "Puntos", "Part. Ganados", "P. Empatados", "Part. Perdidos", "G. a Favor", "G. en Contra", "Dif."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaG.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tablaG.setSelectionForeground(new java.awt.Color(0, 255, 204));
        jScrollPane22.setViewportView(tablaG);

        javax.swing.GroupLayout grupoGLayout = new javax.swing.GroupLayout(grupoG);
        grupoG.setLayout(grupoGLayout);
        grupoGLayout.setHorizontalGroup(
            grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoGLayout.createSequentialGroup()
                .addGroup(grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoGLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(grupoGLayout.createSequentialGroup()
                                .addGroup(grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1075, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1066, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1070, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1052, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1061, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1056, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1048, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(grupoGLayout.createSequentialGroup()
                                        .addGroup(grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1071, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1067, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1062, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1057, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1254, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1076, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)
                                        .addGroup(grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1077, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1072, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1063, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1058, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1053, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(40, 40, 40)
                                        .addGroup(grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(grupoGLayout.createSequentialGroup()
                                                .addGroup(grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(tfG09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfG11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(24, 24, 24)
                                                .addGroup(grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tfG12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfG10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(tfG01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfG05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfG07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfG03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfG02, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1050, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfG04, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfG06, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfG08, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(43, 43, 43)
                                        .addGroup(grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1054, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel1073, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1078, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel1068, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel1059, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1064, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(50, 50, 50)
                                        .addGroup(grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1065, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1055, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1060, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1069, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1074, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1079, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1051, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel1049)))
                            .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(grupoGLayout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addGroup(grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(borrarG, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guardarG, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        grupoGLayout.setVerticalGroup(
            grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoGLayout.createSequentialGroup()
                .addGroup(grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoGLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1048)
                            .addComponent(jLabel1049)
                            .addComponent(jLabel1050)
                            .addComponent(jLabel1051, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(grupoGLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1052)
                            .addComponent(jLabel1053, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfG01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfG02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1054, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1055, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1254))
                        .addGap(30, 30, 30)
                        .addGroup(grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1056)
                            .addComponent(jLabel1057)
                            .addComponent(jLabel1058, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfG03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfG04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1059)
                            .addComponent(jLabel1060))))
                .addGap(30, 30, 30)
                .addGroup(grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1061)
                    .addComponent(jLabel1063, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1062)
                    .addComponent(tfG05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfG06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1064)
                    .addComponent(jLabel1065))
                .addGap(30, 30, 30)
                .addGroup(grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1066)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1067)
                    .addComponent(tfG07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfG08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1068, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1069, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1070)
                    .addComponent(jLabel1071)
                    .addComponent(jLabel1072, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfG09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfG10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1073, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1074, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(grupoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1075)
                    .addComponent(jLabel1077)
                    .addComponent(jLabel1076)
                    .addComponent(tfG11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfG12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1078, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1079))
                .addGap(33, 33, 33)
                .addComponent(guardarG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(borrarG)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        partidosYposiciones.addTab("Grupo G", grupoG);

        grupoH.setBackground(new java.awt.Color(140, 21, 57));

        jLabel1080.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1080.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1080.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1080.setText("FECHA");

        jLabel1081.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1081.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1081.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1081.setText("HORARIO");

        jLabel1082.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1082.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1082.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1082.setText("PARTIDOS");

        jLabel1083.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1083.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1083.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1083.setText("ESTADIO");
        jLabel1083.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1083.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1083.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1084.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1084.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1084.setText("24 - NOV");

        jLabel1255.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1255.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1255.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1255.setText("10:00");

        jLabel1085.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1085.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1085.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1085.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/uru.png"))); // NOI18N
        jLabel1085.setText("   Uruguay   ");
        jLabel1085.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1085.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1085.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1085.setPreferredSize(new java.awt.Dimension(178, 33));

        tfH01.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfH01.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfH02.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfH02.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1086.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1086.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1086.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1086.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/cor.png"))); // NOI18N
        jLabel1086.setText("   Corea del Sur");
        jLabel1086.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1086.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1086.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel1087.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1087.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1087.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1087.setText("Education City");

        jLabel1088.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1088.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1088.setText("24 - NOV");

        jLabel1089.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1089.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1089.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1089.setText("13:00");

        jLabel1090.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1090.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1090.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1090.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/por.png"))); // NOI18N
        jLabel1090.setText("   Portugal   ");
        jLabel1090.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1090.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1090.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1090.setPreferredSize(new java.awt.Dimension(178, 33));

        tfH03.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfH03.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfH04.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfH04.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1091.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1091.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1091.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1091.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/gha.png"))); // NOI18N
        jLabel1091.setText("   Ghana");

        jLabel1092.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1092.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1092.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1092.setText("Estadium 974");

        jLabel1093.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1093.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1093.setText("28 - NOV");

        jLabel1094.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1094.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1094.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1094.setText("10:00");

        jLabel1095.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1095.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1095.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1095.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/cor.png"))); // NOI18N
        jLabel1095.setText("Corea del Sur   ");
        jLabel1095.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1095.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1095.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1095.setPreferredSize(new java.awt.Dimension(178, 33));

        tfH05.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfH05.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfH06.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfH06.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1096.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1096.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1096.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1096.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/gha.png"))); // NOI18N
        jLabel1096.setText("   Ghana");

        jLabel1097.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1097.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1097.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1097.setText("Education City");

        jLabel1098.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1098.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1098.setText("28 - NOV");

        jLabel1099.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1099.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1099.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1099.setText("16:00");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/por.png"))); // NOI18N
        jLabel8.setText("   Portugal   ");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel8.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel8.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel8.setPreferredSize(new java.awt.Dimension(178, 33));

        tfH07.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfH07.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfH08.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfH08.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1100.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1100.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1100.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/uru.png"))); // NOI18N
        jLabel1100.setText("   Uruguay");
        jLabel1100.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1100.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1100.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel1101.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1101.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1101.setText("Lusail");
        jLabel1101.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1101.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1101.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1102.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1102.setText("02 - DIC");

        jLabel1103.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1103.setText("12:00");

        jLabel1104.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1104.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1104.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/gha.png"))); // NOI18N
        jLabel1104.setText("   Ghana   ");
        jLabel1104.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1104.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1104.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1104.setPreferredSize(new java.awt.Dimension(178, 33));

        tfH09.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfH09.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfH10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfH10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1105.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1105.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1105.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/uru.png"))); // NOI18N
        jLabel1105.setText("   Uruguay");
        jLabel1105.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1105.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1105.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel1106.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1106.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1106.setText("Al Janoub");
        jLabel1106.setMaximumSize(new java.awt.Dimension(112, 19));
        jLabel1106.setMinimumSize(new java.awt.Dimension(112, 19));
        jLabel1106.setPreferredSize(new java.awt.Dimension(112, 19));

        jLabel1107.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1107.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1107.setText("02 - DIC");

        jLabel1108.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1108.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1108.setText("12:00");

        jLabel1109.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1109.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1109.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/cor.png"))); // NOI18N
        jLabel1109.setText("   Corea del Sur");
        jLabel1109.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        tfH11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfH11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfH12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tfH12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1110.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1110.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fixture/img/por.png"))); // NOI18N
        jLabel1110.setText("   Portugal");
        jLabel1110.setToolTipText("");
        jLabel1110.setMaximumSize(new java.awt.Dimension(178, 33));
        jLabel1110.setMinimumSize(new java.awt.Dimension(178, 33));
        jLabel1110.setPreferredSize(new java.awt.Dimension(178, 33));

        jLabel1111.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1111.setText("Education City");

        guardarH.setBackground(new java.awt.Color(140, 21, 57));
        guardarH.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        guardarH.setForeground(new java.awt.Color(255, 255, 255));
        guardarH.setText("Cargar tabla");
        guardarH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarHActionPerformed(evt);
            }
        });

        borrarH.setBackground(new java.awt.Color(204, 0, 51));
        borrarH.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        borrarH.setForeground(new java.awt.Color(255, 255, 255));
        borrarH.setText("Borrar tabla");
        borrarH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarHActionPerformed(evt);
            }
        });

        tablaH.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tablaH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Corea", null, null, null, null, null, null, null},
                {"Ghana", null, null, null, null, null, null, null},
                {"Portugal", null, null, null, null, null, null, null},
                {"Uruguay", null, null, null, null, null, null, null}
            },
            new String [] {
                "Paises", "Puntos", "Part. Ganados", "P. Empatados", "Part. Perdidos", "G. a Favor", "G. en Contra", "Dif."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaH.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tablaH.setSelectionForeground(new java.awt.Color(0, 255, 204));
        jScrollPane23.setViewportView(tablaH);

        javax.swing.GroupLayout grupoHLayout = new javax.swing.GroupLayout(grupoH);
        grupoH.setLayout(grupoHLayout);
        grupoHLayout.setHorizontalGroup(
            grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoHLayout.createSequentialGroup()
                .addGroup(grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoHLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(grupoHLayout.createSequentialGroup()
                                .addGroup(grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1107, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1098, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1084, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1093, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1088, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1080, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(grupoHLayout.createSequentialGroup()
                                        .addGroup(grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1103, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1099, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1094, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1089, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1255, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1108, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)
                                        .addGroup(grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1109, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1104, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1095, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1090, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1085, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(40, 40, 40)
                                        .addGroup(grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(grupoHLayout.createSequentialGroup()
                                                .addGroup(grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(tfH09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfH11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(24, 24, 24)
                                                .addGroup(grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tfH12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfH10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(tfH01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfH05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfH07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfH03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfH02, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1082, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfH04, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfH06, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfH08, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(43, 43, 43)
                                        .addGroup(grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1086, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel1105, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1110, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel1100, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel1091, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1096, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(50, 50, 50)
                                        .addGroup(grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1097, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1087, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1092, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1083, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel1081)))
                            .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(grupoHLayout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addGroup(grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(borrarH, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guardarH, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        grupoHLayout.setVerticalGroup(
            grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoHLayout.createSequentialGroup()
                .addGroup(grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grupoHLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1080)
                            .addComponent(jLabel1081)
                            .addComponent(jLabel1082)
                            .addComponent(jLabel1083, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(grupoHLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1084)
                            .addComponent(jLabel1085, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfH01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfH02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1086, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1087)
                            .addComponent(jLabel1255))
                        .addGap(30, 30, 30)
                        .addGroup(grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1088)
                            .addComponent(jLabel1089)
                            .addComponent(jLabel1090, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfH03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfH04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1091)
                            .addComponent(jLabel1092))))
                .addGap(30, 30, 30)
                .addGroup(grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1093)
                    .addComponent(jLabel1095, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1094)
                    .addComponent(tfH05, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfH06, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1096)
                    .addComponent(jLabel1097))
                .addGap(30, 30, 30)
                .addGroup(grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1098)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1099)
                    .addComponent(tfH07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfH08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1102)
                    .addComponent(jLabel1103)
                    .addComponent(jLabel1104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfH09, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfH10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(grupoHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1107)
                    .addComponent(jLabel1109)
                    .addComponent(jLabel1108)
                    .addComponent(tfH11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfH12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1111))
                .addGap(33, 33, 33)
                .addComponent(guardarH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(borrarH)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        partidosYposiciones.addTab("Grupo H", grupoH);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(partidosYposiciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(partidosYposiciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        partidosYposiciones.getAccessibleContext().setAccessibleDescription("");

        getAccessibleContext().setAccessibleDescription("");

        setBounds(0, 0, 1054, 800);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:

        abierta = false;
    }//GEN-LAST:event_formInternalFrameClosed

    private void guardarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarAActionPerformed
        // TODO add your handling code here:

        //Borra toda la tabla
        tablaA.setValueAt(null, 0, 1);
        tablaA.setValueAt(null, 0, 2);
        tablaA.setValueAt(null, 0, 3);
        tablaA.setValueAt(null, 0, 4);
        tablaA.setValueAt(null, 0, 5);
        tablaA.setValueAt(null, 0, 6);
        tablaA.setValueAt(null, 0, 7);
        tablaA.setValueAt(null, 1, 1);
        tablaA.setValueAt(null, 1, 2);
        tablaA.setValueAt(null, 1, 3);
        tablaA.setValueAt(null, 1, 4);
        tablaA.setValueAt(null, 1, 5);
        tablaA.setValueAt(null, 1, 6);
        tablaA.setValueAt(null, 1, 7);
        tablaA.setValueAt(null, 2, 1);
        tablaA.setValueAt(null, 2, 2);
        tablaA.setValueAt(null, 2, 3);
        tablaA.setValueAt(null, 2, 4);
        tablaA.setValueAt(null, 2, 5);
        tablaA.setValueAt(null, 2, 6);
        tablaA.setValueAt(null, 2, 7);
        tablaA.setValueAt(null, 3, 1);
        tablaA.setValueAt(null, 3, 2);
        tablaA.setValueAt(null, 3, 3);
        tablaA.setValueAt(null, 3, 4);
        tablaA.setValueAt(null, 3, 5);
        tablaA.setValueAt(null, 3, 6);
        tablaA.setValueAt(null, 3, 7);
        
        
        //Grupo A
        // Qatar[2] vs Ecuador[0]
        if (Integer.parseInt(tfA01.getText()) > Integer.parseInt(tfA02.getText())) {

            tablaA.setValueAt(3, 2, 1);
            tablaA.setValueAt(1, 2, 2);
            tablaA.setValueAt(0, 2, 3);
            tablaA.setValueAt(0, 2, 4);

            tablaA.setValueAt(0, 0, 1);
            tablaA.setValueAt(0, 0, 2);
            tablaA.setValueAt(0, 0, 3);
            tablaA.setValueAt(1, 0, 4);
        } else if (Integer.parseInt(tfA01.getText()) < Integer.parseInt(tfA02.getText())) {

            tablaA.setValueAt(3, 0, 1);
            tablaA.setValueAt(1, 0, 2);
            tablaA.setValueAt(0, 0, 3);
            tablaA.setValueAt(0, 0, 4);

            tablaA.setValueAt(0, 2, 1);
            tablaA.setValueAt(0, 2, 2);
            tablaA.setValueAt(0, 2, 3);
            tablaA.setValueAt(1, 2, 4);

        } else { //Empate
            tablaA.setValueAt(1, 2, 1);
            tablaA.setValueAt(0, 2, 2);
            tablaA.setValueAt(1, 2, 3);
            tablaA.setValueAt(0, 2, 4);

            tablaA.setValueAt(1, 0, 1);
            tablaA.setValueAt(0, 0, 2);
            tablaA.setValueAt(1, 0, 3);
            tablaA.setValueAt(0, 0, 4);
        }

        // Senegal[3] vs Paises Bajos[1]
        if (Integer.parseInt(tfA03.getText()) > Integer.parseInt(tfA04.getText())) {

            tablaA.setValueAt(3, 3, 1);
            tablaA.setValueAt(1, 3, 2);
            tablaA.setValueAt(0, 3, 3);
            tablaA.setValueAt(0, 3, 4);

            tablaA.setValueAt(0, 1, 1);
            tablaA.setValueAt(0, 1, 2);
            tablaA.setValueAt(0, 1, 3);
            tablaA.setValueAt(1, 1, 4);
        } else if (Integer.parseInt(tfA03.getText()) < Integer.parseInt(tfA04.getText())) {

            tablaA.setValueAt(3, 1, 1);
            tablaA.setValueAt(1, 1, 2);
            tablaA.setValueAt(0, 1, 3);
            tablaA.setValueAt(0, 1, 4);

            tablaA.setValueAt(0, 3, 1);
            tablaA.setValueAt(0, 3, 2);
            tablaA.setValueAt(0, 3, 3);
            tablaA.setValueAt(1, 3, 4);

        } else { //Empate
            tablaA.setValueAt(1, 1, 1);
            tablaA.setValueAt(0, 1, 2);
            tablaA.setValueAt(1, 1, 3);
            tablaA.setValueAt(0, 1, 4);

            tablaA.setValueAt(1, 3, 1);
            tablaA.setValueAt(0, 3, 2);
            tablaA.setValueAt(1, 3, 3);
            tablaA.setValueAt(0, 3, 4);
        }

        // Qatar[2] vs Senegal[3]
        if (Integer.parseInt(tfA05.getText()) > Integer.parseInt(tfA06.getText())) {

            tablaA.setValueAt((Integer) tablaA.getValueAt(2, 1) + 3, 2, 1);
            tablaA.setValueAt((Integer) tablaA.getValueAt(2, 2) + 1, 2, 2);
            tablaA.setValueAt((Integer) tablaA.getValueAt(3, 4) + 1, 3, 4);
        } else if (Integer.parseInt(tfA05.getText()) < Integer.parseInt(tfA06.getText())) {

            tablaA.setValueAt((Integer) tablaA.getValueAt(3, 1) + 3, 3, 1);
            tablaA.setValueAt((Integer) tablaA.getValueAt(3, 2) + 1, 3, 2);
            tablaA.setValueAt((Integer) tablaA.getValueAt(2, 4) + 1, 2, 4);

        } else { //Empate
            tablaA.setValueAt((Integer) tablaA.getValueAt(2, 1) + 1, 2, 1);
            tablaA.setValueAt((Integer) tablaA.getValueAt(2, 3) + 1, 2, 3);

            tablaA.setValueAt((Integer) tablaA.getValueAt(3, 1) + 1, 3, 1);
            tablaA.setValueAt((Integer) tablaA.getValueAt(3, 3) + 1, 3, 3);
        }

        // Ecuador[0] vs Paises Bajos[1]
        if (Integer.parseInt(tfA07.getText()) > Integer.parseInt(tfA08.getText())) {

            tablaA.setValueAt((Integer) tablaA.getValueAt(0, 1) + 3, 0, 1);
            tablaA.setValueAt((Integer) tablaA.getValueAt(0, 2) + 1, 0, 2);
            tablaA.setValueAt((Integer) tablaA.getValueAt(1, 4) + 1, 1, 4);
        } else if (Integer.parseInt(tfA07.getText()) < Integer.parseInt(tfA08.getText())) {

            tablaA.setValueAt((Integer) tablaA.getValueAt(1, 1) + 3, 1, 1);
            tablaA.setValueAt((Integer) tablaA.getValueAt(1, 2) + 1, 1, 2);
            tablaA.setValueAt((Integer) tablaA.getValueAt(0, 4) + 1, 0, 4);

        } else { //Empate
            tablaA.setValueAt((Integer) tablaA.getValueAt(0, 1) + 1, 0, 1);
            tablaA.setValueAt((Integer) tablaA.getValueAt(0, 3) + 1, 0, 3);

            tablaA.setValueAt((Integer) tablaA.getValueAt(1, 1) + 1, 1, 1);
            tablaA.setValueAt((Integer) tablaA.getValueAt(1, 3) + 1, 1, 3);
        }

        // Paises Bajos[1] vs Qatar[2]
        if (Integer.parseInt(tfA09.getText()) > Integer.parseInt(tfA10.getText())) {

            tablaA.setValueAt((Integer) tablaA.getValueAt(1, 1) + 3, 1, 1);
            tablaA.setValueAt((Integer) tablaA.getValueAt(1, 2) + 1, 1, 2);
            tablaA.setValueAt((Integer) tablaA.getValueAt(2, 4) + 1, 2, 4);
        } else if (Integer.parseInt(tfA09.getText()) < Integer.parseInt(tfA10.getText())) {

            tablaA.setValueAt((Integer) tablaA.getValueAt(2, 1) + 3, 2, 1);
            tablaA.setValueAt((Integer) tablaA.getValueAt(2, 2) + 1, 2, 2);
            tablaA.setValueAt((Integer) tablaA.getValueAt(1, 4) + 1, 1, 4);

        } else { //Empate
            tablaA.setValueAt((Integer) tablaA.getValueAt(1, 1) + 1, 1, 1);
            tablaA.setValueAt((Integer) tablaA.getValueAt(1, 3) + 1, 1, 3);

            tablaA.setValueAt((Integer) tablaA.getValueAt(2, 1) + 1, 2, 1);
            tablaA.setValueAt((Integer) tablaA.getValueAt(2, 3) + 1, 2, 3);
        }

        // Ecuador[0] vs Senegal[3]
        if (Integer.parseInt(tfA11.getText()) > Integer.parseInt(tfA12.getText())) {

            tablaA.setValueAt((Integer) tablaA.getValueAt(0, 1) + 3, 0, 1);
            tablaA.setValueAt((Integer) tablaA.getValueAt(0, 2) + 1, 0, 2);
            tablaA.setValueAt((Integer) tablaA.getValueAt(3, 4) + 1, 3, 4);
        } else if (Integer.parseInt(tfA11.getText()) < Integer.parseInt(tfA12.getText())) {

            tablaA.setValueAt((Integer) tablaA.getValueAt(3, 1) + 3, 3, 1);
            tablaA.setValueAt((Integer) tablaA.getValueAt(3, 2) + 1, 3, 2);
            tablaA.setValueAt((Integer) tablaA.getValueAt(0, 4) + 1, 0, 4);

        } else { //Empate
            tablaA.setValueAt((Integer) tablaA.getValueAt(0, 1) + 1, 0, 1);
            tablaA.setValueAt((Integer) tablaA.getValueAt(0, 3) + 1, 0, 3);

            tablaA.setValueAt((Integer) tablaA.getValueAt(3, 1) + 1, 3, 1);
            tablaA.setValueAt((Integer) tablaA.getValueAt(3, 3) + 1, 3, 3);
        }
        //Calculo goles a favor, en contra y diferencia de goles de cada pais 
        //y lo muestro en tabla
        int ecuadorGF = Integer.parseInt(tfA02.getText()) + Integer.parseInt(tfA07.getText()) + Integer.parseInt(tfA11.getText());
        int ecuadorGC = Integer.parseInt(tfA01.getText()) + Integer.parseInt(tfA08.getText()) + Integer.parseInt(tfA12.getText());
        int ecuadorDif = ecuadorGF - ecuadorGC;
        tablaA.setValueAt(ecuadorGF, 0, 5);
        tablaA.setValueAt(ecuadorGC, 0, 6);
        tablaA.setValueAt(ecuadorDif, 0, 7);
        
        int paisesbGF = Integer.parseInt(tfA04.getText()) + Integer.parseInt(tfA08.getText()) + Integer.parseInt(tfA09.getText());
        int paisesbGC = Integer.parseInt(tfA03.getText()) + Integer.parseInt(tfA07.getText()) + Integer.parseInt(tfA10.getText());
        int paisesbDif = paisesbGF - paisesbGC;
        tablaA.setValueAt(paisesbGF, 1, 5);
        tablaA.setValueAt(paisesbGC, 1, 6);
        tablaA.setValueAt(paisesbDif, 1, 7);
        
        int qatarGF = Integer.parseInt(tfA01.getText()) + Integer.parseInt(tfA05.getText()) + Integer.parseInt(tfA10.getText());
        int qatarGC = Integer.parseInt(tfA02.getText()) + Integer.parseInt(tfA06.getText()) + Integer.parseInt(tfA09.getText());
        int qatarDif = qatarGF - qatarGC;
        tablaA.setValueAt(qatarGF, 2, 5);
        tablaA.setValueAt(qatarGC, 2, 6);
        tablaA.setValueAt(qatarDif, 2, 7);
        
        int senegalGF = Integer.parseInt(tfA03.getText()) + Integer.parseInt(tfA06.getText()) + Integer.parseInt(tfA12.getText());
        int senegalGC = Integer.parseInt(tfA04.getText()) + Integer.parseInt(tfA05.getText()) + Integer.parseInt(tfA11.getText());
        int senegalDif = senegalGF - senegalGC;
        tablaA.setValueAt(senegalGF, 3, 5);
        tablaA.setValueAt(senegalGC, 3, 6);
        tablaA.setValueAt(senegalDif, 3, 7);
        
        //Activamos el ordenamiento por columnas en la tabla
        tablaA.setAutoCreateRowSorter(true);

        //Creo la accion automatica de ordenamiento de la tabla
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tablaA.getModel());
        tablaA.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        //ordenamos por la columna puntos
        int ordenamientoDeColumna = 1; 
        sortKeys.add(new RowSorter.SortKey(ordenamientoDeColumna, SortOrder.DESCENDING));
        //ordenamos por la columna diferencia de goles en caso de empate por puntos
        int ordenamientoDeColumna2 = 7;
        sortKeys.add(new RowSorter.SortKey(ordenamientoDeColumna2, SortOrder.DESCENDING));
        
        sorter.setSortKeys(sortKeys);
        sorter.sort();

        primeroGA = (String) tablaA.getValueAt(0, 0);
        segundoGA = (String) tablaA.getValueAt(1, 0);
        
        crearA();
        escribirA();
        


    }//GEN-LAST:event_guardarAActionPerformed

    private void guardarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBActionPerformed
        // TODO add your handling code here:

        //Borra toda la tabla
        tablaB.setValueAt(null, 0, 1);
        tablaB.setValueAt(null, 0, 2);
        tablaB.setValueAt(null, 0, 3);
        tablaB.setValueAt(null, 0, 4);
        tablaB.setValueAt(null, 0, 5);
        tablaB.setValueAt(null, 0, 6);
        tablaB.setValueAt(null, 0, 7);
        tablaB.setValueAt(null, 1, 1);
        tablaB.setValueAt(null, 1, 2);
        tablaB.setValueAt(null, 1, 3);
        tablaB.setValueAt(null, 1, 4);
        tablaB.setValueAt(null, 1, 5);
        tablaB.setValueAt(null, 1, 6);
        tablaB.setValueAt(null, 1, 7);
        tablaB.setValueAt(null, 2, 1);
        tablaB.setValueAt(null, 2, 2);
        tablaB.setValueAt(null, 2, 3);
        tablaB.setValueAt(null, 2, 4);
        tablaB.setValueAt(null, 2, 5);
        tablaB.setValueAt(null, 2, 6);
        tablaB.setValueAt(null, 2, 7);
        tablaB.setValueAt(null, 3, 1);
        tablaB.setValueAt(null, 3, 2);
        tablaB.setValueAt(null, 3, 3);
        tablaB.setValueAt(null, 3, 4);
        tablaB.setValueAt(null, 3, 5);
        tablaB.setValueAt(null, 3, 6);
        tablaB.setValueAt(null, 3, 7);

        //Grupo B
        // Inglaterra [2] vs Iran [3]
        if (Integer.parseInt(tfB01.getText()) > Integer.parseInt(tfB02.getText())) {

            tablaB.setValueAt(3, 2, 1);
            tablaB.setValueAt(1, 2, 2);
            tablaB.setValueAt(0, 2, 3);
            tablaB.setValueAt(0, 2, 4);

            tablaB.setValueAt(0, 3, 1);
            tablaB.setValueAt(0, 3, 2);
            tablaB.setValueAt(0, 3, 3);
            tablaB.setValueAt(1, 3, 4);
        } else if (Integer.parseInt(tfB01.getText()) < Integer.parseInt(tfB02.getText())) {

            tablaB.setValueAt(3, 3, 1);
            tablaB.setValueAt(1, 3, 2);
            tablaB.setValueAt(0, 3, 3);
            tablaB.setValueAt(0, 3, 4);

            tablaB.setValueAt(0, 2, 1);
            tablaB.setValueAt(0, 2, 2);
            tablaB.setValueAt(0, 2, 3);
            tablaB.setValueAt(1, 2, 4);

        } else {
            tablaB.setValueAt(1, 2, 1);
            tablaB.setValueAt(0, 2, 2);
            tablaB.setValueAt(1, 2, 3);
            tablaB.setValueAt(0, 2, 4);

            tablaB.setValueAt(1, 3, 1);
            tablaB.setValueAt(0, 3, 2);
            tablaB.setValueAt(1, 3, 3);
            tablaB.setValueAt(0, 3, 4);
        }

        // EEUU [0] vs Gales [1]
        if (Integer.parseInt(tfB03.getText()) > Integer.parseInt(tfB04.getText())) {

            tablaB.setValueAt(3, 0, 1);
            tablaB.setValueAt(1, 0, 2);
            tablaB.setValueAt(0, 0, 3);
            tablaB.setValueAt(0, 0, 4);

            tablaB.setValueAt(0, 1, 1);
            tablaB.setValueAt(0, 1, 2);
            tablaB.setValueAt(0, 1, 3);
            tablaB.setValueAt(1, 1, 4);
        } else if (Integer.parseInt(tfB03.getText()) < Integer.parseInt(tfB04.getText())) {

            tablaB.setValueAt(3, 1, 1);
            tablaB.setValueAt(1, 1, 2);
            tablaB.setValueAt(0, 1, 3);
            tablaB.setValueAt(0, 1, 4);

            tablaB.setValueAt(0, 0, 1);
            tablaB.setValueAt(0, 0, 2);
            tablaB.setValueAt(0, 0, 3);
            tablaB.setValueAt(1, 0, 4);

        } else {
            tablaB.setValueAt(1, 1, 1);
            tablaB.setValueAt(0, 1, 2);
            tablaB.setValueAt(1, 1, 3);
            tablaB.setValueAt(0, 1, 4);

            tablaB.setValueAt(1, 0, 1);
            tablaB.setValueAt(0, 0, 2);
            tablaB.setValueAt(1, 0, 3);
            tablaB.setValueAt(0, 0, 4);
        }

        // Gales [1] vs Iran [3]
        if (Integer.parseInt(tfB05.getText()) > Integer.parseInt(tfB06.getText())) {

            tablaB.setValueAt((Integer) tablaB.getValueAt(1, 1) + 3, 1, 1);
            tablaB.setValueAt((Integer) tablaB.getValueAt(1, 2) + 1, 1, 2);
            tablaB.setValueAt((Integer) tablaB.getValueAt(3, 4) + 1, 3, 4);
        } else if (Integer.parseInt(tfB05.getText()) < Integer.parseInt(tfB06.getText())) {

            tablaB.setValueAt((Integer) tablaB.getValueAt(3, 1) + 3, 3, 1);
            tablaB.setValueAt((Integer) tablaB.getValueAt(3, 2) + 1, 3, 2);
            tablaB.setValueAt((Integer) tablaB.getValueAt(1, 4) + 1, 1, 4);

        } else {
            tablaB.setValueAt((Integer) tablaB.getValueAt(1, 1) + 1, 1, 1);
            tablaB.setValueAt((Integer) tablaB.getValueAt(1, 3) + 1, 1, 3);

            tablaB.setValueAt((Integer) tablaB.getValueAt(3, 1) + 1, 3, 1);
            tablaB.setValueAt((Integer) tablaB.getValueAt(3, 3) + 1, 3, 3);
        }

        // Inglaterra [2] vs EEUU [0]
        if (Integer.parseInt(tfB07.getText()) > Integer.parseInt(tfB08.getText())) {

            tablaB.setValueAt((Integer) tablaB.getValueAt(2, 1) + 3, 2, 1);
            tablaB.setValueAt((Integer) tablaB.getValueAt(2, 2) + 1, 2, 2);
            tablaB.setValueAt((Integer) tablaB.getValueAt(0, 4) + 1, 0, 4);
        } else if (Integer.parseInt(tfB07.getText()) < Integer.parseInt(tfB08.getText())) {

            tablaB.setValueAt((Integer) tablaB.getValueAt(0, 1) + 3, 0, 1);
            tablaB.setValueAt((Integer) tablaB.getValueAt(0, 2) + 1, 0, 2);
            tablaB.setValueAt((Integer) tablaB.getValueAt(2, 4) + 1, 2, 4);

        } else {
            tablaB.setValueAt((Integer) tablaB.getValueAt(2, 1) + 1, 2, 1);
            tablaB.setValueAt((Integer) tablaB.getValueAt(2, 3) + 1, 2, 3);

            tablaB.setValueAt((Integer) tablaB.getValueAt(0, 1) + 1, 0, 1);
            tablaB.setValueAt((Integer) tablaB.getValueAt(0, 3) + 1, 0, 3);
        }

        // Gales [1] vs Inglaterra [2]
        if (Integer.parseInt(tfB09.getText()) > Integer.parseInt(tfB10.getText())) {

            tablaB.setValueAt((Integer) tablaB.getValueAt(1, 1) + 3, 1, 1);
            tablaB.setValueAt((Integer) tablaB.getValueAt(1, 2) + 1, 1, 2);
            tablaB.setValueAt((Integer) tablaB.getValueAt(2, 4) + 1, 2, 4);
        } else if (Integer.parseInt(tfB09.getText()) < Integer.parseInt(tfB10.getText())) {

            tablaB.setValueAt((Integer) tablaB.getValueAt(2, 1) + 3, 2, 1);
            tablaB.setValueAt((Integer) tablaB.getValueAt(2, 2) + 1, 2, 2);
            tablaB.setValueAt((Integer) tablaB.getValueAt(1, 4) + 1, 1, 4);

        } else {
            tablaB.setValueAt((Integer) tablaB.getValueAt(1, 1) + 1, 1, 1);
            tablaB.setValueAt((Integer) tablaB.getValueAt(1, 3) + 1, 1, 3);

            tablaB.setValueAt((Integer) tablaB.getValueAt(2, 1) + 1, 2, 1);
            tablaB.setValueAt((Integer) tablaB.getValueAt(2, 3) + 1, 2, 3);
        }

        // Iran [3] vs EEUU [0]
        if (Integer.parseInt(tfB11.getText()) > Integer.parseInt(tfB12.getText())) {

            tablaB.setValueAt((Integer) tablaB.getValueAt(3, 1) + 3, 3, 1);
            tablaB.setValueAt((Integer) tablaB.getValueAt(3, 2) + 1, 3, 2);
            tablaB.setValueAt((Integer) tablaB.getValueAt(0, 4) + 1, 0, 4);
        } else if (Integer.parseInt(tfB11.getText()) < Integer.parseInt(tfB12.getText())) {

            tablaB.setValueAt((Integer) tablaB.getValueAt(0, 1) + 3, 0, 1);
            tablaB.setValueAt((Integer) tablaB.getValueAt(0, 2) + 1, 0, 2);
            tablaB.setValueAt((Integer) tablaB.getValueAt(3, 4) + 1, 3, 4);

        } else {
            tablaB.setValueAt((Integer) tablaB.getValueAt(3, 1) + 1, 3, 1);
            tablaB.setValueAt((Integer) tablaB.getValueAt(3, 3) + 1, 3, 3);

            tablaB.setValueAt((Integer) tablaB.getValueAt(0, 1) + 1, 0, 1);
            tablaB.setValueAt((Integer) tablaB.getValueAt(0, 3) + 1, 0, 3);
        }
        //Calculo goles a favor, en contra y diferencia de goles de cada pais 
        //y lo muestro en tabla
        int eeuuGF = Integer.parseInt(tfB03.getText()) + Integer.parseInt(tfB08.getText()) + Integer.parseInt(tfB12.getText());
        int eeuuGC = Integer.parseInt(tfB04.getText()) + Integer.parseInt(tfB07.getText()) + Integer.parseInt(tfB11.getText());
        int eeuuDif = eeuuGF - eeuuGC;
        tablaB.setValueAt(eeuuGF, 0, 5);
        tablaB.setValueAt(eeuuGC, 0, 6);
        tablaB.setValueAt(eeuuDif, 0, 7);
        
        int galesGF = Integer.parseInt(tfB04.getText()) + Integer.parseInt(tfB05.getText()) + Integer.parseInt(tfB09.getText());
        int galesGC = Integer.parseInt(tfB03.getText()) + Integer.parseInt(tfB06.getText()) + Integer.parseInt(tfB10.getText());
        int galesDif = galesGF - galesGC;
        tablaB.setValueAt(galesGF, 1, 5);
        tablaB.setValueAt(galesGC, 1, 6);
        tablaB.setValueAt(galesDif, 1, 7);
        
        int inglaterraGF = Integer.parseInt(tfB01.getText()) + Integer.parseInt(tfB07.getText()) + Integer.parseInt(tfB10.getText());
        int inglaterraGC = Integer.parseInt(tfB02.getText()) + Integer.parseInt(tfB08.getText()) + Integer.parseInt(tfB09.getText());
        int inglaterraDif = inglaterraGF - inglaterraGC;
        tablaB.setValueAt(inglaterraGF, 2, 5);
        tablaB.setValueAt(inglaterraGC, 2, 6);
        tablaB.setValueAt(inglaterraDif, 2, 7);
        
        int iranGF = Integer.parseInt(tfB02.getText()) + Integer.parseInt(tfB06.getText()) + Integer.parseInt(tfB11.getText());
        int iranGC = Integer.parseInt(tfB01.getText()) + Integer.parseInt(tfB05.getText()) + Integer.parseInt(tfB12.getText());
        int iranDif = iranGF - iranGC;
        tablaB.setValueAt(iranGF, 3, 5);
        tablaB.setValueAt(iranGC, 3, 6);
        tablaB.setValueAt(iranDif, 3, 7);

        //Activamos el ordenamiento por columnas en la tabla
        tablaB.setAutoCreateRowSorter(true);

        //Creo la accion automatica de ordenamiento de la tabla
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tablaB.getModel());
        tablaB.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        //ordenamos por la columna puntos
        int ordenamientoDeColumna = 1; 
        sortKeys.add(new RowSorter.SortKey(ordenamientoDeColumna, SortOrder.DESCENDING));
        //ordenamos por la columna diferencia de goles en caso de empate por puntos
        int ordenamientoDeColumna2 = 7;
        sortKeys.add(new RowSorter.SortKey(ordenamientoDeColumna2, SortOrder.DESCENDING));

        sorter.setSortKeys(sortKeys);
        sorter.sort();
        
        primeroGB = (String) tablaB.getValueAt(0, 0);
        segundoGB = (String) tablaB.getValueAt(1, 0);
        
        crearB();
        escribirB();

    }//GEN-LAST:event_guardarBActionPerformed

    private void guardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCActionPerformed
        // TODO add your handling code here:

        //Borra toda la tabla
        tablaC.setValueAt(null, 0, 1);
        tablaC.setValueAt(null, 0, 2);
        tablaC.setValueAt(null, 0, 3);
        tablaC.setValueAt(null, 0, 4);
        tablaC.setValueAt(null, 0, 5);
        tablaC.setValueAt(null, 0, 6);
        tablaC.setValueAt(null, 0, 7);
        tablaC.setValueAt(null, 1, 1);
        tablaC.setValueAt(null, 1, 2);
        tablaC.setValueAt(null, 1, 3);
        tablaC.setValueAt(null, 1, 4);
        tablaC.setValueAt(null, 1, 5);
        tablaC.setValueAt(null, 1, 6);
        tablaC.setValueAt(null, 1, 7);
        tablaC.setValueAt(null, 2, 1);
        tablaC.setValueAt(null, 2, 2);
        tablaC.setValueAt(null, 2, 3);
        tablaC.setValueAt(null, 2, 4);
        tablaC.setValueAt(null, 2, 5);
        tablaC.setValueAt(null, 2, 6);
        tablaC.setValueAt(null, 2, 7);
        tablaC.setValueAt(null, 3, 1);
        tablaC.setValueAt(null, 3, 2);
        tablaC.setValueAt(null, 3, 3);
        tablaC.setValueAt(null, 3, 4);
        tablaC.setValueAt(null, 3, 5);
        tablaC.setValueAt(null, 3, 6);
        tablaC.setValueAt(null, 3, 7);

        //Grupo C
        // Mexico[2] vs Polonia [3]
        if (Integer.parseInt(tfC01.getText()) > Integer.parseInt(tfC02.getText())) {

            tablaC.setValueAt(3, 2, 1);
            tablaC.setValueAt(1, 2, 2);
            tablaC.setValueAt(0, 2, 3);
            tablaC.setValueAt(0, 2, 4);

            tablaC.setValueAt(0, 3, 1);
            tablaC.setValueAt(0, 3, 2);
            tablaC.setValueAt(0, 3, 3);
            tablaC.setValueAt(1, 3, 4);
        } else if (Integer.parseInt(tfC01.getText()) < Integer.parseInt(tfC02.getText())) {

            tablaC.setValueAt(3, 3, 1);
            tablaC.setValueAt(1, 3, 2);
            tablaC.setValueAt(0, 3, 3);
            tablaC.setValueAt(0, 3, 4);

            tablaC.setValueAt(0, 2, 1);
            tablaC.setValueAt(0, 2, 2);
            tablaC.setValueAt(0, 2, 3);
            tablaC.setValueAt(1, 2, 4);

        } else {
            tablaC.setValueAt(1, 2, 1);
            tablaC.setValueAt(0, 2, 2);
            tablaC.setValueAt(1, 2, 3);
            tablaC.setValueAt(0, 2, 4);

            tablaC.setValueAt(1, 3, 1);
            tablaC.setValueAt(0, 3, 2);
            tablaC.setValueAt(1, 3, 3);
            tablaC.setValueAt(0, 3, 4);
        }

        // Argentina [1] vs Arabia Saudita [0]
        if (Integer.parseInt(tfC03.getText()) > Integer.parseInt(tfC04.getText())) {

            tablaC.setValueAt(3, 1, 1);
            tablaC.setValueAt(1, 1, 2);
            tablaC.setValueAt(0, 1, 3);
            tablaC.setValueAt(0, 1, 4);

            tablaC.setValueAt(0, 0, 1);
            tablaC.setValueAt(0, 0, 2);
            tablaC.setValueAt(0, 0, 3);
            tablaC.setValueAt(1, 0, 4);
        } else if (Integer.parseInt(tfC03.getText()) < Integer.parseInt(tfC04.getText())) {

            tablaC.setValueAt(3, 0, 1);
            tablaC.setValueAt(1, 0, 2);
            tablaC.setValueAt(0, 0, 3);
            tablaC.setValueAt(0, 0, 4);

            tablaC.setValueAt(0, 1, 1);
            tablaC.setValueAt(0, 1, 2);
            tablaC.setValueAt(0, 1, 3);
            tablaC.setValueAt(1, 1, 4);

        } else {
            tablaC.setValueAt(1, 1, 1);
            tablaC.setValueAt(0, 1, 2);
            tablaC.setValueAt(1, 1, 3);
            tablaC.setValueAt(0, 1, 4);

            tablaC.setValueAt(1, 0, 1);
            tablaC.setValueAt(0, 0, 2);
            tablaC.setValueAt(1, 0, 3);
            tablaC.setValueAt(0, 0, 4);
        }

        // Polonia [3] vs Arabia Saudita [0]
        if (Integer.parseInt(tfC05.getText()) > Integer.parseInt(tfC06.getText())) {

            tablaC.setValueAt((Integer) tablaC.getValueAt(3, 1) + 3, 3, 1);
            tablaC.setValueAt((Integer) tablaC.getValueAt(3, 2) + 1, 3, 2);
            tablaC.setValueAt((Integer) tablaC.getValueAt(0, 4) + 1, 0, 4);
        } else if (Integer.parseInt(tfC05.getText()) < Integer.parseInt(tfC06.getText())) {

            tablaC.setValueAt((Integer) tablaC.getValueAt(0, 1) + 3, 0, 1);
            tablaC.setValueAt((Integer) tablaC.getValueAt(0, 2) + 1, 0, 2);
            tablaC.setValueAt((Integer) tablaC.getValueAt(3, 4) + 1, 3, 4);

        } else {
            tablaC.setValueAt((Integer) tablaC.getValueAt(3, 1) + 1, 3, 1);
            tablaC.setValueAt((Integer) tablaC.getValueAt(3, 3) + 1, 3, 3);

            tablaC.setValueAt((Integer) tablaC.getValueAt(0, 1) + 1, 0, 1);
            tablaC.setValueAt((Integer) tablaC.getValueAt(0, 3) + 1, 0, 3);
        }

        // Argentina [1] vs Mexico [2]
        if (Integer.parseInt(tfC07.getText()) > Integer.parseInt(tfC08.getText())) {

            tablaC.setValueAt((Integer) tablaC.getValueAt(1, 1) + 3, 1, 1);
            tablaC.setValueAt((Integer) tablaC.getValueAt(1, 2) + 1, 1, 2);
            tablaC.setValueAt((Integer) tablaC.getValueAt(2, 4) + 1, 2, 4);
        } else if (Integer.parseInt(tfC07.getText()) < Integer.parseInt(tfC08.getText())) {

            tablaC.setValueAt((Integer) tablaC.getValueAt(2, 1) + 3, 2, 1);
            tablaC.setValueAt((Integer) tablaC.getValueAt(2, 2) + 1, 2, 2);
            tablaC.setValueAt((Integer) tablaC.getValueAt(1, 4) + 1, 1, 4);

        } else {
            tablaC.setValueAt((Integer) tablaC.getValueAt(1, 1) + 1, 1, 1);
            tablaC.setValueAt((Integer) tablaC.getValueAt(1, 3) + 1, 1, 3);

            tablaC.setValueAt((Integer) tablaC.getValueAt(2, 1) + 1, 2, 1);
            tablaC.setValueAt((Integer) tablaC.getValueAt(2, 3) + 1, 2, 3);
        }

        // Polonia [3] vs Argentina [1]
        if (Integer.parseInt(tfC09.getText()) > Integer.parseInt(tfC10.getText())) {

            tablaC.setValueAt((Integer) tablaC.getValueAt(3, 1) + 3, 3, 1);
            tablaC.setValueAt((Integer) tablaC.getValueAt(3, 2) + 1, 3, 2);
            tablaC.setValueAt((Integer) tablaC.getValueAt(1, 4) + 1, 1, 4);
        } else if (Integer.parseInt(tfC09.getText()) < Integer.parseInt(tfC10.getText())) {

            tablaC.setValueAt((Integer) tablaC.getValueAt(1, 1) + 3, 1, 1);
            tablaC.setValueAt((Integer) tablaC.getValueAt(1, 2) + 1, 1, 2);
            tablaC.setValueAt((Integer) tablaC.getValueAt(3, 4) + 1, 3, 4);

        } else {
            tablaC.setValueAt((Integer) tablaC.getValueAt(3, 1) + 1, 3, 1);
            tablaC.setValueAt((Integer) tablaC.getValueAt(3, 3) + 1, 3, 3);

            tablaC.setValueAt((Integer) tablaC.getValueAt(1, 1) + 1, 1, 1);
            tablaC.setValueAt((Integer) tablaC.getValueAt(1, 3) + 1, 1, 3);
        }

        // Arabia Saudita [0] vs Mexico [2]
        if (Integer.parseInt(tfC11.getText()) > Integer.parseInt(tfC12.getText())) {

            tablaC.setValueAt((Integer) tablaC.getValueAt(0, 1) + 3, 0, 1);
            tablaC.setValueAt((Integer) tablaC.getValueAt(0, 2) + 1, 0, 2);
            tablaC.setValueAt((Integer) tablaC.getValueAt(2, 4) + 1, 2, 4);
        } else if (Integer.parseInt(tfC11.getText()) < Integer.parseInt(tfC12.getText())) {

            tablaC.setValueAt((Integer) tablaC.getValueAt(2, 1) + 3, 2, 1);
            tablaC.setValueAt((Integer) tablaC.getValueAt(2, 2) + 1, 2, 2);
            tablaC.setValueAt((Integer) tablaC.getValueAt(0, 4) + 1, 0, 4);

        } else {
            tablaC.setValueAt((Integer) tablaC.getValueAt(0, 1) + 1, 0, 1);
            tablaC.setValueAt((Integer) tablaC.getValueAt(0, 3) + 1, 0, 3);

            tablaC.setValueAt((Integer) tablaC.getValueAt(2, 1) + 1, 2, 1);
            tablaC.setValueAt((Integer) tablaC.getValueAt(2, 3) + 1, 2, 3);
        }
        //Calculo goles a favor, en contra y diferencia de goles de cada pais 
        //y lo muestro en tabla
        int arabiaGF = Integer.parseInt(tfC04.getText()) + Integer.parseInt(tfC06.getText()) + Integer.parseInt(tfC11.getText());
        int arabiaGC = Integer.parseInt(tfC03.getText()) + Integer.parseInt(tfC05.getText()) + Integer.parseInt(tfC12.getText());
        int arabiaDif = arabiaGF - arabiaGC;
        tablaC.setValueAt(arabiaGF, 0, 5);
        tablaC.setValueAt(arabiaGC, 0, 6);
        tablaC.setValueAt(arabiaDif, 0, 7);
        
        int argentinaGF = Integer.parseInt(tfC03.getText()) + Integer.parseInt(tfC07.getText()) + Integer.parseInt(tfC10.getText());
        int argentinaGC = Integer.parseInt(tfC04.getText()) + Integer.parseInt(tfC08.getText()) + Integer.parseInt(tfC09.getText());
        int argentinaDif = argentinaGF - argentinaGC;
        tablaC.setValueAt(argentinaGF, 1, 5);
        tablaC.setValueAt(argentinaGC, 1, 6);
        tablaC.setValueAt(argentinaDif, 1, 7);
        
        int mexicoGF = Integer.parseInt(tfC01.getText()) + Integer.parseInt(tfC08.getText()) + Integer.parseInt(tfC12.getText());
        int mexicoGC = Integer.parseInt(tfC02.getText()) + Integer.parseInt(tfC07.getText()) + Integer.parseInt(tfC11.getText());
        int mexicoDif = mexicoGF - mexicoGC;
        tablaC.setValueAt(mexicoGF, 2, 5);
        tablaC.setValueAt(mexicoGC, 2, 6);
        tablaC.setValueAt(mexicoDif, 2, 7);
        
        int poloniaGF = Integer.parseInt(tfC02.getText()) + Integer.parseInt(tfC05.getText()) + Integer.parseInt(tfC09.getText());
        int poloniaGC = Integer.parseInt(tfC01.getText()) + Integer.parseInt(tfC06.getText()) + Integer.parseInt(tfC10.getText());
        int poloniaDif = poloniaGF - poloniaGC;
        tablaC.setValueAt(poloniaGF, 3, 5);
        tablaC.setValueAt(poloniaGC, 3, 6);
        tablaC.setValueAt(poloniaDif, 3, 7);
        

        //Activamos el ordenamiento por columnas en la tabla
        tablaC.setAutoCreateRowSorter(true);

        //Creo la accion automatica de ordenamiento de la tabla
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tablaC.getModel());
        tablaC.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        //ordenamos por la columna puntos
        int ordenamientoDeColumna = 1; 
        sortKeys.add(new RowSorter.SortKey(ordenamientoDeColumna, SortOrder.DESCENDING));
        //ordenamos por la columna diferencia de goles en caso de empate por puntos
        int ordenamientoDeColumna2 = 7;
        sortKeys.add(new RowSorter.SortKey(ordenamientoDeColumna2, SortOrder.DESCENDING));

        sorter.setSortKeys(sortKeys);
        sorter.sort();
        
        primeroGC = (String) tablaC.getValueAt(0, 0);
        segundoGC = (String) tablaC.getValueAt(1, 0);
        
        crearC();
        escribirC();

    }//GEN-LAST:event_guardarCActionPerformed

    private void guardarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarDActionPerformed
        // TODO add your handling code here:

        //Borra toda la tabla
        tablaD.setValueAt(null, 0, 1);
        tablaD.setValueAt(null, 0, 2);
        tablaD.setValueAt(null, 0, 3);
        tablaD.setValueAt(null, 0, 4);
        tablaD.setValueAt(null, 0, 5);
        tablaD.setValueAt(null, 0, 6);
        tablaD.setValueAt(null, 0, 7);
        tablaD.setValueAt(null, 1, 1);
        tablaD.setValueAt(null, 1, 2);
        tablaD.setValueAt(null, 1, 3);
        tablaD.setValueAt(null, 1, 4);
        tablaD.setValueAt(null, 1, 5);
        tablaD.setValueAt(null, 1, 6);
        tablaD.setValueAt(null, 1, 7);
        tablaD.setValueAt(null, 2, 1);
        tablaD.setValueAt(null, 2, 2);
        tablaD.setValueAt(null, 2, 3);
        tablaD.setValueAt(null, 2, 4);
        tablaD.setValueAt(null, 2, 5);
        tablaD.setValueAt(null, 2, 6);
        tablaD.setValueAt(null, 2, 7);
        tablaD.setValueAt(null, 3, 1);
        tablaD.setValueAt(null, 3, 2);
        tablaD.setValueAt(null, 3, 3);
        tablaD.setValueAt(null, 3, 4);
        tablaD.setValueAt(null, 3, 5);
        tablaD.setValueAt(null, 3, 6);
        tablaD.setValueAt(null, 3, 7);

        //Grupo D
        // Francia [2]vs Australia [0]
        if (Integer.parseInt(tfD01.getText()) > Integer.parseInt(tfD02.getText())) {

            tablaD.setValueAt(3, 2, 1);
            tablaD.setValueAt(1, 2, 2);
            tablaD.setValueAt(0, 2, 3);
            tablaD.setValueAt(0, 2, 4);

            tablaD.setValueAt(0, 0, 1);
            tablaD.setValueAt(0, 0, 2);
            tablaD.setValueAt(0, 0, 3);
            tablaD.setValueAt(1, 0, 4);
        } else if (Integer.parseInt(tfD01.getText()) < Integer.parseInt(tfD02.getText())) {

            tablaD.setValueAt(3, 0, 1);
            tablaD.setValueAt(1, 0, 2);
            tablaD.setValueAt(0, 0, 3);
            tablaD.setValueAt(0, 0, 4);

            tablaD.setValueAt(0, 2, 1);
            tablaD.setValueAt(0, 2, 2);
            tablaD.setValueAt(0, 2, 3);
            tablaD.setValueAt(1, 2, 4);

        } else {
            tablaD.setValueAt(1, 2, 1);
            tablaD.setValueAt(0, 2, 2);
            tablaD.setValueAt(1, 2, 3);
            tablaD.setValueAt(0, 2, 4);

            tablaD.setValueAt(1, 0, 1);
            tablaD.setValueAt(0, 0, 2);
            tablaD.setValueAt(1, 0, 3);
            tablaD.setValueAt(0, 0, 4);
        }

        // Dinamarca [1] vs Tunez [3]
        if (Integer.parseInt(tfD03.getText()) > Integer.parseInt(tfD04.getText())) {

            tablaD.setValueAt(3, 1, 1);
            tablaD.setValueAt(1, 1, 2);
            tablaD.setValueAt(0, 1, 3);
            tablaD.setValueAt(0, 1, 4);

            tablaD.setValueAt(0, 3, 1);
            tablaD.setValueAt(0, 3, 2);
            tablaD.setValueAt(0, 3, 3);
            tablaD.setValueAt(1, 3, 4);
        } else if (Integer.parseInt(tfD03.getText()) < Integer.parseInt(tfD04.getText())) {

            tablaD.setValueAt(3, 3, 1);
            tablaD.setValueAt(1, 3, 2);
            tablaD.setValueAt(0, 3, 3);
            tablaD.setValueAt(0, 3, 4);

            tablaD.setValueAt(0, 1, 1);
            tablaD.setValueAt(0, 1, 2);
            tablaD.setValueAt(0, 1, 3);
            tablaD.setValueAt(1, 1, 4);

        } else {
            tablaD.setValueAt(1, 1, 1);
            tablaD.setValueAt(0, 1, 2);
            tablaD.setValueAt(1, 1, 3);
            tablaD.setValueAt(0, 1, 4);

            tablaD.setValueAt(1, 3, 1);
            tablaD.setValueAt(0, 3, 2);
            tablaD.setValueAt(1, 3, 3);
            tablaD.setValueAt(0, 3, 4);
        }

        // Tunez [3] vs Australia [0]
        if (Integer.parseInt(tfD05.getText()) > Integer.parseInt(tfD06.getText())) {

            tablaD.setValueAt((Integer) tablaD.getValueAt(3, 1) + 3, 3, 1);
            tablaD.setValueAt((Integer) tablaD.getValueAt(3, 2) + 1, 3, 2);
            tablaD.setValueAt((Integer) tablaD.getValueAt(0, 4) + 1, 0, 4);
        } else if (Integer.parseInt(tfD05.getText()) < Integer.parseInt(tfD06.getText())) {

            tablaD.setValueAt((Integer) tablaD.getValueAt(0, 1) + 3, 0, 1);
            tablaD.setValueAt((Integer) tablaD.getValueAt(0, 2) + 1, 0, 2);
            tablaD.setValueAt((Integer) tablaD.getValueAt(3, 4) + 1, 3, 4);

        } else {
            tablaD.setValueAt((Integer) tablaD.getValueAt(3, 1) + 1, 3, 1);
            tablaD.setValueAt((Integer) tablaD.getValueAt(3, 3) + 1, 3, 3);

            tablaD.setValueAt((Integer) tablaD.getValueAt(0, 1) + 1, 0, 1);
            tablaD.setValueAt((Integer) tablaD.getValueAt(0, 3) + 1, 0, 3);
        }

        // Francia [2] vs Dinamarca [1]
        if (Integer.parseInt(tfD07.getText()) > Integer.parseInt(tfD08.getText())) {

            tablaD.setValueAt((Integer) tablaD.getValueAt(2, 1) + 3, 2, 1);
            tablaD.setValueAt((Integer) tablaD.getValueAt(2, 2) + 1, 2, 2);
            tablaD.setValueAt((Integer) tablaD.getValueAt(1, 4) + 1, 1, 4);
        } else if (Integer.parseInt(tfD07.getText()) < Integer.parseInt(tfD08.getText())) {

            tablaD.setValueAt((Integer) tablaD.getValueAt(1, 1) + 3, 1, 1);
            tablaD.setValueAt((Integer) tablaD.getValueAt(1, 2) + 1, 1, 2);
            tablaD.setValueAt((Integer) tablaD.getValueAt(2, 4) + 1, 2, 4);

        } else {
            tablaD.setValueAt((Integer) tablaD.getValueAt(2, 1) + 1, 2, 1);
            tablaD.setValueAt((Integer) tablaD.getValueAt(2, 3) + 1, 2, 3);

            tablaD.setValueAt((Integer) tablaD.getValueAt(1, 1) + 1, 1, 1);
            tablaD.setValueAt((Integer) tablaD.getValueAt(1, 3) + 1, 1, 3);
        }

        // Australia [0] vs Dinamarca [1]
        if (Integer.parseInt(tfD09.getText()) > Integer.parseInt(tfD10.getText())) {

            tablaD.setValueAt((Integer) tablaD.getValueAt(0, 1) + 3, 0, 1);
            tablaD.setValueAt((Integer) tablaD.getValueAt(0, 2) + 1, 0, 2);
            tablaD.setValueAt((Integer) tablaD.getValueAt(1, 4) + 1, 1, 4);
        } else if (Integer.parseInt(tfD09.getText()) < Integer.parseInt(tfD10.getText())) {

            tablaD.setValueAt((Integer) tablaD.getValueAt(1, 1) + 3, 1, 1);
            tablaD.setValueAt((Integer) tablaD.getValueAt(1, 2) + 1, 1, 2);
            tablaD.setValueAt((Integer) tablaD.getValueAt(0, 4) + 1, 0, 4);

        } else {
            tablaD.setValueAt((Integer) tablaD.getValueAt(0, 1) + 1, 0, 1);
            tablaD.setValueAt((Integer) tablaD.getValueAt(0, 3) + 1, 0, 3);

            tablaD.setValueAt((Integer) tablaD.getValueAt(1, 1) + 1, 1, 1);
            tablaD.setValueAt((Integer) tablaD.getValueAt(1, 3) + 1, 1, 3);
        }

        // Tunez [3] vs Francia [2]
        if (Integer.parseInt(tfD11.getText()) > Integer.parseInt(tfD12.getText())) {

            tablaD.setValueAt((Integer) tablaD.getValueAt(3, 1) + 3, 3, 1);
            tablaD.setValueAt((Integer) tablaD.getValueAt(3, 2) + 1, 3, 2);
            tablaD.setValueAt((Integer) tablaD.getValueAt(2, 4) + 1, 2, 4);
        } else if (Integer.parseInt(tfD11.getText()) < Integer.parseInt(tfD12.getText())) {

            tablaD.setValueAt((Integer) tablaD.getValueAt(2, 1) + 3, 2, 1);
            tablaD.setValueAt((Integer) tablaD.getValueAt(2, 2) + 1, 2, 2);
            tablaD.setValueAt((Integer) tablaD.getValueAt(3, 4) + 1, 3, 4);

        } else {
            tablaD.setValueAt((Integer) tablaD.getValueAt(3, 1) + 1, 3, 1);
            tablaD.setValueAt((Integer) tablaD.getValueAt(3, 3) + 1, 3, 3);

            tablaD.setValueAt((Integer) tablaD.getValueAt(2, 1) + 1, 2, 1);
            tablaD.setValueAt((Integer) tablaD.getValueAt(2, 3) + 1, 2, 3);
        }
        //Calculo goles a favor, en contra y diferencia de goles de cada pais 
        //y lo muestro en tabla
        int australiaGF = Integer.parseInt(tfD02.getText()) + Integer.parseInt(tfD06.getText()) + Integer.parseInt(tfD09.getText());
        int australiaGC = Integer.parseInt(tfD01.getText()) + Integer.parseInt(tfD05.getText()) + Integer.parseInt(tfD10.getText());
        int australiaDif = australiaGF - australiaGC;
        tablaD.setValueAt(australiaGF, 0, 5);
        tablaD.setValueAt(australiaGC, 0, 6);
        tablaD.setValueAt(australiaDif, 0, 7);
        
        int dinamarcaGF = Integer.parseInt(tfD03.getText()) + Integer.parseInt(tfD08.getText()) + Integer.parseInt(tfD10.getText());
        int dinamarcaGC = Integer.parseInt(tfD04.getText()) + Integer.parseInt(tfD07.getText()) + Integer.parseInt(tfD09.getText());
        int dinamarcaDif = dinamarcaGF - dinamarcaGC;
        tablaD.setValueAt(dinamarcaGF, 1, 5);
        tablaD.setValueAt(dinamarcaGC, 1, 6);
        tablaD.setValueAt(dinamarcaDif, 1, 7);
        
        int franciaGF = Integer.parseInt(tfD01.getText()) + Integer.parseInt(tfD07.getText()) + Integer.parseInt(tfD12.getText());
        int franciaGC = Integer.parseInt(tfD02.getText()) + Integer.parseInt(tfD08.getText()) + Integer.parseInt(tfD11.getText());
        int franciaDif = franciaGF - franciaGC;
        tablaD.setValueAt(franciaGF, 2, 5);
        tablaD.setValueAt(franciaGC, 2, 6);
        tablaD.setValueAt(franciaDif, 2, 7);
        
        int tunezGF = Integer.parseInt(tfD04.getText()) + Integer.parseInt(tfD05.getText()) + Integer.parseInt(tfD11.getText());
        int tunezGC = Integer.parseInt(tfD03.getText()) + Integer.parseInt(tfD06.getText()) + Integer.parseInt(tfD12.getText());
        int tunezDif = tunezGF - tunezGC;
        tablaD.setValueAt(tunezGF, 3, 5);
        tablaD.setValueAt(tunezGC, 3, 6);
        tablaD.setValueAt(tunezDif, 3, 7);
        

        //Activamos el ordenamiento por columnas en la tabla
        tablaD.setAutoCreateRowSorter(true);

        //Creo la accion automatica de ordenamiento de la tabla
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tablaD.getModel());
        tablaD.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        //ordenamos por la columna puntos
        int ordenamientoDeColumna = 1; 
        sortKeys.add(new RowSorter.SortKey(ordenamientoDeColumna, SortOrder.DESCENDING));
        //ordenamos por la columna diferencia de goles en caso de empate por puntos
        int ordenamientoDeColumna2 = 7;
        sortKeys.add(new RowSorter.SortKey(ordenamientoDeColumna2, SortOrder.DESCENDING));

        sorter.setSortKeys(sortKeys);
        sorter.sort();
        
        primeroGD = (String) tablaD.getValueAt(0, 0);
        segundoGD = (String) tablaD.getValueAt(1, 0);
        
        crearD();
        escribirD();

    }//GEN-LAST:event_guardarDActionPerformed

    private void guardarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarEActionPerformed
        // TODO add your handling code here:

        //Borra toda la tabla
        tablaE.setValueAt(null, 0, 1);
        tablaE.setValueAt(null, 0, 2);
        tablaE.setValueAt(null, 0, 3);
        tablaE.setValueAt(null, 0, 4);
        tablaE.setValueAt(null, 0, 5);
        tablaE.setValueAt(null, 0, 6);
        tablaE.setValueAt(null, 0, 7);
        tablaE.setValueAt(null, 1, 1);
        tablaE.setValueAt(null, 1, 2);
        tablaE.setValueAt(null, 1, 3);
        tablaE.setValueAt(null, 1, 4);
        tablaE.setValueAt(null, 1, 5);
        tablaE.setValueAt(null, 1, 6);
        tablaE.setValueAt(null, 1, 7);
        tablaE.setValueAt(null, 2, 1);
        tablaE.setValueAt(null, 2, 2);
        tablaE.setValueAt(null, 2, 3);
        tablaE.setValueAt(null, 2, 4);
        tablaE.setValueAt(null, 2, 5);
        tablaE.setValueAt(null, 2, 6);
        tablaE.setValueAt(null, 2, 7);
        tablaE.setValueAt(null, 3, 1);
        tablaE.setValueAt(null, 3, 2);
        tablaE.setValueAt(null, 3, 3);
        tablaE.setValueAt(null, 3, 4);
        tablaE.setValueAt(null, 3, 5);
        tablaE.setValueAt(null, 3, 6);
        tablaE.setValueAt(null, 3, 7);

        //Grupo E
        // España [2] vs Costa Rica [1]
        if (Integer.parseInt(tfE01.getText()) > Integer.parseInt(tfE02.getText())) {

            tablaE.setValueAt(3, 2, 1);
            tablaE.setValueAt(1, 2, 2);
            tablaE.setValueAt(0, 2, 3);
            tablaE.setValueAt(0, 2, 4);

            tablaE.setValueAt(0, 1, 1);
            tablaE.setValueAt(0, 1, 2);
            tablaE.setValueAt(0, 1, 3);
            tablaE.setValueAt(1, 1, 4);
        } else if (Integer.parseInt(tfE01.getText()) < Integer.parseInt(tfE02.getText())) {

            tablaE.setValueAt(3, 1, 1);
            tablaE.setValueAt(1, 1, 2);
            tablaE.setValueAt(0, 1, 3);
            tablaE.setValueAt(0, 1, 4);

            tablaE.setValueAt(0, 2, 1);
            tablaE.setValueAt(0, 2, 2);
            tablaE.setValueAt(0, 2, 3);
            tablaE.setValueAt(1, 2, 4);

        } else {
            tablaE.setValueAt(1, 2, 1);
            tablaE.setValueAt(0, 2, 2);
            tablaE.setValueAt(1, 2, 3);
            tablaE.setValueAt(0, 2, 4);

            tablaE.setValueAt(1, 1, 1);
            tablaE.setValueAt(0, 1, 2);
            tablaE.setValueAt(1, 1, 3);
            tablaE.setValueAt(0, 1, 4);
        }

        // Alemania [0] vs Japon [3]
        if (Integer.parseInt(tfE03.getText()) > Integer.parseInt(tfE04.getText())) {

            tablaE.setValueAt(3, 0, 1);
            tablaE.setValueAt(1, 0, 2);
            tablaE.setValueAt(0, 0, 3);
            tablaE.setValueAt(0, 0, 4);

            tablaE.setValueAt(0, 3, 1);
            tablaE.setValueAt(0, 3, 2);
            tablaE.setValueAt(0, 3, 3);
            tablaE.setValueAt(1, 3, 4);
        } else if (Integer.parseInt(tfE03.getText()) < Integer.parseInt(tfE04.getText())) {

            tablaE.setValueAt(3, 3, 1);
            tablaE.setValueAt(1, 3, 2);
            tablaE.setValueAt(0, 3, 3);
            tablaE.setValueAt(0, 3, 4);

            tablaE.setValueAt(0, 0, 1);
            tablaE.setValueAt(0, 0, 2);
            tablaE.setValueAt(0, 0, 3);
            tablaE.setValueAt(1, 0, 4);

        } else {
            tablaE.setValueAt(1, 0, 1);
            tablaE.setValueAt(0, 0, 2);
            tablaE.setValueAt(1, 0, 3);
            tablaE.setValueAt(0, 0, 4);

            tablaE.setValueAt(1, 3, 1);
            tablaE.setValueAt(0, 3, 2);
            tablaE.setValueAt(1, 3, 3);
            tablaE.setValueAt(0, 3, 4);
        }

        // Japon [3] vs Costa Rica [1]
        if (Integer.parseInt(tfE05.getText()) > Integer.parseInt(tfE06.getText())) {

            tablaE.setValueAt((Integer) tablaE.getValueAt(3, 1) + 3, 3, 1);
            tablaE.setValueAt((Integer) tablaE.getValueAt(3, 2) + 1, 3, 2);
            tablaE.setValueAt((Integer) tablaE.getValueAt(1, 4) + 1, 1, 4);
        } else if (Integer.parseInt(tfE05.getText()) < Integer.parseInt(tfE06.getText())) {

            tablaE.setValueAt((Integer) tablaE.getValueAt(1, 1) + 3, 1, 1);
            tablaE.setValueAt((Integer) tablaE.getValueAt(1, 2) + 1, 1, 2);
            tablaE.setValueAt((Integer) tablaE.getValueAt(3, 4) + 1, 3, 4);

        } else {
            tablaE.setValueAt((Integer) tablaE.getValueAt(3, 1) + 1, 3, 1);
            tablaE.setValueAt((Integer) tablaE.getValueAt(3, 3) + 1, 3, 3);

            tablaE.setValueAt((Integer) tablaE.getValueAt(1, 1) + 1, 1, 1);
            tablaE.setValueAt((Integer) tablaE.getValueAt(1, 3) + 1, 1, 3);
        }

        // España [2] vs Alemania [0]
        if (Integer.parseInt(tfE07.getText()) > Integer.parseInt(tfE08.getText())) {

            tablaE.setValueAt((Integer) tablaE.getValueAt(2, 1) + 3, 2, 1);
            tablaE.setValueAt((Integer) tablaE.getValueAt(2, 2) + 1, 2, 2);
            tablaE.setValueAt((Integer) tablaE.getValueAt(0, 4) + 1, 0, 4);
        } else if (Integer.parseInt(tfE07.getText()) < Integer.parseInt(tfE08.getText())) {

            tablaE.setValueAt((Integer) tablaE.getValueAt(0, 1) + 3, 0, 1);
            tablaE.setValueAt((Integer) tablaE.getValueAt(0, 2) + 1, 0, 2);
            tablaE.setValueAt((Integer) tablaE.getValueAt(2, 4) + 1, 2, 4);

        } else {
            tablaE.setValueAt((Integer) tablaE.getValueAt(2, 1) + 1, 2, 1);
            tablaE.setValueAt((Integer) tablaE.getValueAt(2, 3) + 1, 2, 3);

            tablaE.setValueAt((Integer) tablaE.getValueAt(0, 1) + 1, 0, 1);
            tablaE.setValueAt((Integer) tablaE.getValueAt(0, 3) + 1, 0, 3);
        }

        // Japon [3] vs España [2]
        if (Integer.parseInt(tfE09.getText()) > Integer.parseInt(tfE10.getText())) {

            tablaE.setValueAt((Integer) tablaE.getValueAt(3, 1) + 3, 3, 1);
            tablaE.setValueAt((Integer) tablaE.getValueAt(3, 2) + 1, 3, 2);
            tablaE.setValueAt((Integer) tablaE.getValueAt(2, 4) + 1, 2, 4);
        } else if (Integer.parseInt(tfE09.getText()) < Integer.parseInt(tfE10.getText())) {

            tablaE.setValueAt((Integer) tablaE.getValueAt(2, 1) + 3, 2, 1);
            tablaE.setValueAt((Integer) tablaE.getValueAt(2, 2) + 1, 2, 2);
            tablaE.setValueAt((Integer) tablaE.getValueAt(3, 4) + 1, 3, 4);

        } else {
            tablaE.setValueAt((Integer) tablaE.getValueAt(3, 1) + 1, 3, 1);
            tablaE.setValueAt((Integer) tablaE.getValueAt(3, 3) + 1, 3, 3);

            tablaE.setValueAt((Integer) tablaE.getValueAt(2, 1) + 1, 2, 1);
            tablaE.setValueAt((Integer) tablaE.getValueAt(2, 3) + 1, 2, 3);
        }

        // Costa Rica [1] vs Alemania [0]
        if (Integer.parseInt(tfE11.getText()) > Integer.parseInt(tfE12.getText())) {

            tablaE.setValueAt((Integer) tablaE.getValueAt(1, 1) + 3, 1, 1);
            tablaE.setValueAt((Integer) tablaE.getValueAt(1, 2) + 1, 1, 2);
            tablaE.setValueAt((Integer) tablaE.getValueAt(0, 4) + 1, 0, 4);
        } else if (Integer.parseInt(tfE11.getText()) < Integer.parseInt(tfE12.getText())) {

            tablaE.setValueAt((Integer) tablaE.getValueAt(0, 1) + 3, 0, 1);
            tablaE.setValueAt((Integer) tablaE.getValueAt(0, 2) + 1, 0, 2);
            tablaE.setValueAt((Integer) tablaE.getValueAt(1, 4) + 1, 1, 4);

        } else {
            tablaE.setValueAt((Integer) tablaE.getValueAt(1, 1) + 1, 1, 1);
            tablaE.setValueAt((Integer) tablaE.getValueAt(1, 3) + 1, 1, 3);

            tablaE.setValueAt((Integer) tablaE.getValueAt(0, 1) + 1, 0, 1);
            tablaE.setValueAt((Integer) tablaE.getValueAt(0, 3) + 1, 0, 3);
        }
        //Calculo goles a favor, en contra y diferencia de goles de cada pais 
        //y lo muestro en tabla
        int alemaniaGF = Integer.parseInt(tfE03.getText()) + Integer.parseInt(tfE08.getText()) + Integer.parseInt(tfE12.getText());
        int alemaniaGC = Integer.parseInt(tfE04.getText()) + Integer.parseInt(tfE07.getText()) + Integer.parseInt(tfE11.getText());
        int alemaniaDif = alemaniaGF - alemaniaGC;
        tablaE.setValueAt(alemaniaGF, 0, 5);
        tablaE.setValueAt(alemaniaGC, 0, 6);
        tablaE.setValueAt(alemaniaDif, 0, 7);
        
        int costaricaGF = Integer.parseInt(tfE02.getText()) + Integer.parseInt(tfE06.getText()) + Integer.parseInt(tfE11.getText());
        int costaricaGC = Integer.parseInt(tfE01.getText()) + Integer.parseInt(tfE05.getText()) + Integer.parseInt(tfE12.getText());
        int costaricaDif = costaricaGF - costaricaGC;
        tablaE.setValueAt(costaricaGF, 1, 5);
        tablaE.setValueAt(costaricaGC, 1, 6);
        tablaE.setValueAt(costaricaDif, 1, 7);
        
        int espaniaGF = Integer.parseInt(tfE01.getText()) + Integer.parseInt(tfE07.getText()) + Integer.parseInt(tfE10.getText());
        int espaniaGC = Integer.parseInt(tfE02.getText()) + Integer.parseInt(tfE08.getText()) + Integer.parseInt(tfE09.getText());
        int espaniaDif = espaniaGF - espaniaGC;
        tablaE.setValueAt(espaniaGF, 2, 5);
        tablaE.setValueAt(espaniaGC, 2, 6);
        tablaE.setValueAt(espaniaDif, 2, 7);
        
        int japonGF = Integer.parseInt(tfE04.getText()) + Integer.parseInt(tfE05.getText()) + Integer.parseInt(tfE09.getText());
        int japonGC = Integer.parseInt(tfE03.getText()) + Integer.parseInt(tfE06.getText()) + Integer.parseInt(tfE10.getText());
        int japonDif = japonGF - japonGC;
        tablaE.setValueAt(japonGF, 3, 5);
        tablaE.setValueAt(japonGC, 3, 6);
        tablaE.setValueAt(japonDif, 3, 7);
        

        //Activamos el ordenamiento por columnas en la tabla
        tablaE.setAutoCreateRowSorter(true);

        //Creo la accion automatica de ordenamiento de la tabla
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tablaE.getModel());
        tablaE.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        //ordenamos por la columna puntos
        int ordenamientoDeColumna = 1; 
        sortKeys.add(new RowSorter.SortKey(ordenamientoDeColumna, SortOrder.DESCENDING));
        //ordenamos por la columna diferencia de goles en caso de empate por puntos
        int ordenamientoDeColumna2 = 7;
        sortKeys.add(new RowSorter.SortKey(ordenamientoDeColumna2, SortOrder.DESCENDING));

        sorter.setSortKeys(sortKeys);
        sorter.sort();
        
        primeroGE = (String) tablaE.getValueAt(0, 0);
        segundoGE = (String) tablaE.getValueAt(1, 0);
        
        crearE();
        escribirE();

    }//GEN-LAST:event_guardarEActionPerformed

    private void guardarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarFActionPerformed
        // TODO add your handling code here:

        //Borra toda la tabla
        tablaF.setValueAt(null, 0, 1);
        tablaF.setValueAt(null, 0, 2);
        tablaF.setValueAt(null, 0, 3);
        tablaF.setValueAt(null, 0, 4);
        tablaF.setValueAt(null, 0, 5);
        tablaF.setValueAt(null, 0, 6);
        tablaF.setValueAt(null, 0, 7);
        tablaF.setValueAt(null, 1, 1);
        tablaF.setValueAt(null, 1, 2);
        tablaF.setValueAt(null, 1, 3);
        tablaF.setValueAt(null, 1, 4);
        tablaF.setValueAt(null, 1, 5);
        tablaF.setValueAt(null, 1, 6);
        tablaF.setValueAt(null, 1, 7);
        tablaF.setValueAt(null, 2, 1);
        tablaF.setValueAt(null, 2, 2);
        tablaF.setValueAt(null, 2, 3);
        tablaF.setValueAt(null, 2, 4);
        tablaF.setValueAt(null, 2, 5);
        tablaF.setValueAt(null, 2, 6);
        tablaF.setValueAt(null, 2, 7);
        tablaF.setValueAt(null, 3, 1);
        tablaF.setValueAt(null, 3, 2);
        tablaF.setValueAt(null, 3, 3);
        tablaF.setValueAt(null, 3, 4);
        tablaF.setValueAt(null, 3, 5);
        tablaF.setValueAt(null, 3, 6);
        tablaF.setValueAt(null, 3, 7);

        //Grupo F
        // Belgica [0] vs Canada [1]
        if (Integer.parseInt(tfF01.getText()) > Integer.parseInt(tfF02.getText())) {

            tablaF.setValueAt(3, 0, 1);
            tablaF.setValueAt(1, 0, 2);
            tablaF.setValueAt(0, 0, 3);
            tablaF.setValueAt(0, 0, 4);

            tablaF.setValueAt(0, 1, 1);
            tablaF.setValueAt(0, 1, 2);
            tablaF.setValueAt(0, 1, 3);
            tablaF.setValueAt(1, 1, 4);
        } else if (Integer.parseInt(tfF01.getText()) < Integer.parseInt(tfF02.getText())) {

            tablaF.setValueAt(3, 1, 1);
            tablaF.setValueAt(1, 1, 2);
            tablaF.setValueAt(0, 1, 3);
            tablaF.setValueAt(0, 1, 4);

            tablaF.setValueAt(0, 0, 1);
            tablaF.setValueAt(0, 0, 2);
            tablaF.setValueAt(0, 0, 3);
            tablaF.setValueAt(1, 0, 4);

        } else {
            tablaF.setValueAt(1, 0, 1);
            tablaF.setValueAt(0, 0, 2);
            tablaF.setValueAt(1, 0, 3);
            tablaF.setValueAt(0, 0, 4);

            tablaF.setValueAt(1, 1, 1);
            tablaF.setValueAt(0, 1, 2);
            tablaF.setValueAt(1, 1, 3);
            tablaF.setValueAt(0, 1, 4);
        }

        // Marruecos [3] vs Croacia [2]
        if (Integer.parseInt(tfF03.getText()) > Integer.parseInt(tfF04.getText())) {

            tablaF.setValueAt(3, 3, 1);
            tablaF.setValueAt(1, 3, 2);
            tablaF.setValueAt(0, 3, 3);
            tablaF.setValueAt(0, 3, 4);

            tablaF.setValueAt(0, 2, 1);
            tablaF.setValueAt(0, 2, 2);
            tablaF.setValueAt(0, 2, 3);
            tablaF.setValueAt(1, 2, 4);
        } else if (Integer.parseInt(tfF03.getText()) < Integer.parseInt(tfF04.getText())) {

            tablaF.setValueAt(3, 2, 1);
            tablaF.setValueAt(1, 2, 2);
            tablaF.setValueAt(0, 2, 3);
            tablaF.setValueAt(0, 2, 4);

            tablaF.setValueAt(0, 3, 1);
            tablaF.setValueAt(0, 3, 2);
            tablaF.setValueAt(0, 3, 3);
            tablaF.setValueAt(1, 3, 4);

        } else {
            tablaF.setValueAt(1, 3, 1);
            tablaF.setValueAt(0, 3, 2);
            tablaF.setValueAt(1, 3, 3);
            tablaF.setValueAt(0, 3, 4);

            tablaF.setValueAt(1, 2, 1);
            tablaF.setValueAt(0, 2, 2);
            tablaF.setValueAt(1, 2, 3);
            tablaF.setValueAt(0, 2, 4);
        }

        // Belgica [0] vs Marruecos [3]
        if (Integer.parseInt(tfF05.getText()) > Integer.parseInt(tfF06.getText())) {

            tablaF.setValueAt((Integer) tablaF.getValueAt(0, 1) + 3, 0, 1);
            tablaF.setValueAt((Integer) tablaF.getValueAt(0, 2) + 1, 0, 2);
            tablaF.setValueAt((Integer) tablaF.getValueAt(3, 4) + 1, 3, 4);
        } else if (Integer.parseInt(tfF05.getText()) < Integer.parseInt(tfF06.getText())) {

            tablaF.setValueAt((Integer) tablaF.getValueAt(3, 1) + 3, 3, 1);
            tablaF.setValueAt((Integer) tablaF.getValueAt(3, 2) + 1, 3, 2);
            tablaF.setValueAt((Integer) tablaF.getValueAt(0, 4) + 1, 0, 4);

        } else {
            tablaF.setValueAt((Integer) tablaF.getValueAt(0, 1) + 1, 0, 1);
            tablaF.setValueAt((Integer) tablaF.getValueAt(0, 3) + 1, 0, 3);

            tablaF.setValueAt((Integer) tablaF.getValueAt(3, 1) + 1, 3, 1);
            tablaF.setValueAt((Integer) tablaF.getValueAt(3, 3) + 1, 3, 3);
        }

        // Croacia [2] vs Canada  [1]
        if (Integer.parseInt(tfF07.getText()) > Integer.parseInt(tfF08.getText())) {

            tablaF.setValueAt((Integer) tablaF.getValueAt(2, 1) + 3, 2, 1);
            tablaF.setValueAt((Integer) tablaF.getValueAt(2, 2) + 1, 2, 2);
            tablaF.setValueAt((Integer) tablaF.getValueAt(1, 4) + 1, 1, 4);
        } else if (Integer.parseInt(tfF07.getText()) < Integer.parseInt(tfF08.getText())) {

            tablaF.setValueAt((Integer) tablaF.getValueAt(1, 1) + 3, 1, 1);
            tablaF.setValueAt((Integer) tablaF.getValueAt(1, 2) + 1, 1, 2);
            tablaF.setValueAt((Integer) tablaF.getValueAt(2, 4) + 1, 2, 4);

        } else {
            tablaF.setValueAt((Integer) tablaF.getValueAt(2, 1) + 1, 2, 1);
            tablaF.setValueAt((Integer) tablaF.getValueAt(2, 3) + 1, 2, 3);

            tablaF.setValueAt((Integer) tablaF.getValueAt(1, 1) + 1, 1, 1);
            tablaF.setValueAt((Integer) tablaF.getValueAt(1, 3) + 1, 1, 3);
        }

        // Croacia [2] vs Belgica [0]
        if (Integer.parseInt(tfF09.getText()) > Integer.parseInt(tfF10.getText())) {

            tablaF.setValueAt((Integer) tablaF.getValueAt(2, 1) + 3, 2, 1);
            tablaF.setValueAt((Integer) tablaF.getValueAt(2, 2) + 1, 2, 2);
            tablaF.setValueAt((Integer) tablaF.getValueAt(0, 4) + 1, 0, 4);
        } else if (Integer.parseInt(tfF09.getText()) < Integer.parseInt(tfF10.getText())) {

            tablaF.setValueAt((Integer) tablaF.getValueAt(0, 1) + 3, 0, 1);
            tablaF.setValueAt((Integer) tablaF.getValueAt(0, 2) + 1, 0, 2);
            tablaF.setValueAt((Integer) tablaF.getValueAt(2, 4) + 1, 2, 4);

        } else {
            tablaF.setValueAt((Integer) tablaF.getValueAt(2, 1) + 1, 2, 1);
            tablaF.setValueAt((Integer) tablaF.getValueAt(2, 3) + 1, 2, 3);

            tablaF.setValueAt((Integer) tablaF.getValueAt(0, 1) + 1, 0, 1);
            tablaF.setValueAt((Integer) tablaF.getValueAt(0, 3) + 1, 0, 3);
        }

        // Canada [1] vs Marruecos [3]
        if (Integer.parseInt(tfF11.getText()) > Integer.parseInt(tfF12.getText())) {

            tablaF.setValueAt((Integer) tablaF.getValueAt(1, 1) + 3, 1, 1);
            tablaF.setValueAt((Integer) tablaF.getValueAt(1, 2) + 1, 1, 2);
            tablaF.setValueAt((Integer) tablaF.getValueAt(3, 4) + 1, 3, 4);
        } else if (Integer.parseInt(tfF11.getText()) < Integer.parseInt(tfF12.getText())) {

            tablaF.setValueAt((Integer) tablaF.getValueAt(3, 1) + 3, 3, 1);
            tablaF.setValueAt((Integer) tablaF.getValueAt(3, 2) + 1, 3, 2);
            tablaF.setValueAt((Integer) tablaF.getValueAt(1, 4) + 1, 1, 4);

        } else {
            tablaF.setValueAt((Integer) tablaF.getValueAt(1, 1) + 1, 1, 1);
            tablaF.setValueAt((Integer) tablaF.getValueAt(1, 3) + 1, 1, 3);

            tablaF.setValueAt((Integer) tablaF.getValueAt(3, 1) + 1, 3, 1);
            tablaF.setValueAt((Integer) tablaF.getValueAt(3, 3) + 1, 3, 3);
        }
        //Calculo goles a favor, en contra y diferencia de goles de cada pais 
        //y lo muestro en tabla
        int belgicaGF = Integer.parseInt(tfF01.getText()) + Integer.parseInt(tfF05.getText()) + Integer.parseInt(tfF10.getText());
        int belgicaGC = Integer.parseInt(tfF02.getText()) + Integer.parseInt(tfF06.getText()) + Integer.parseInt(tfF09.getText());
        int belgicaDif = belgicaGF - belgicaGC;
        tablaF.setValueAt(belgicaGF, 0, 5);
        tablaF.setValueAt(belgicaGC, 0, 6);
        tablaF.setValueAt(belgicaDif, 0, 7);
        
        int canadaGF = Integer.parseInt(tfF02.getText()) + Integer.parseInt(tfF08.getText()) + Integer.parseInt(tfF11.getText());
        int canadaGC = Integer.parseInt(tfF01.getText()) + Integer.parseInt(tfF07.getText()) + Integer.parseInt(tfF12.getText());
        int canadaDif = canadaGF - canadaGC;
        tablaF.setValueAt(canadaGF, 1, 5);
        tablaF.setValueAt(canadaGC, 1, 6);
        tablaF.setValueAt(canadaDif, 1, 7);
        
        int croaciaGF = Integer.parseInt(tfF04.getText()) + Integer.parseInt(tfF07.getText()) + Integer.parseInt(tfF09.getText());
        int croaciaGC = Integer.parseInt(tfF03.getText()) + Integer.parseInt(tfF08.getText()) + Integer.parseInt(tfF10.getText());
        int croaciaDif = croaciaGF - croaciaGC;
        tablaF.setValueAt(croaciaGF, 2, 5);
        tablaF.setValueAt(croaciaGC, 2, 6);
        tablaF.setValueAt(croaciaDif, 2, 7);
        
        int marruecosGF = Integer.parseInt(tfF03.getText()) + Integer.parseInt(tfF06.getText()) + Integer.parseInt(tfF12.getText());
        int marruecosGC = Integer.parseInt(tfF04.getText()) + Integer.parseInt(tfF05.getText()) + Integer.parseInt(tfF11.getText());
        int marruecosDif = marruecosGF - marruecosGC;
        tablaF.setValueAt(marruecosGF, 3, 5);
        tablaF.setValueAt(marruecosGC, 3, 6);
        tablaF.setValueAt(marruecosDif, 3, 7);
        

        //Activamos el ordenamiento por columnas en la tabla
        tablaF.setAutoCreateRowSorter(true);

        //Creo la accion automatica de ordenamiento de la tabla
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tablaF.getModel());
        tablaF.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        //ordenamos por la columna puntos
        int ordenamientoDeColumna = 1; 
        sortKeys.add(new RowSorter.SortKey(ordenamientoDeColumna, SortOrder.DESCENDING));
        //ordenamos por la columna diferencia de goles en caso de empate por puntos
        int ordenamientoDeColumna2 = 7;
        sortKeys.add(new RowSorter.SortKey(ordenamientoDeColumna2, SortOrder.DESCENDING));

        sorter.setSortKeys(sortKeys);
        sorter.sort();
        
        primeroGF = (String) tablaF.getValueAt(0, 0);
        segundoGF = (String) tablaF.getValueAt(1, 0);
        
        crearF();
        escribirF();

    }//GEN-LAST:event_guardarFActionPerformed

    private void guardarGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarGActionPerformed
        // TODO add your handling code here:

        //Borra toda la tabla
        tablaG.setValueAt(null, 0, 1);
        tablaG.setValueAt(null, 0, 2);
        tablaG.setValueAt(null, 0, 3);
        tablaG.setValueAt(null, 0, 4);
        tablaG.setValueAt(null, 0, 5);
        tablaG.setValueAt(null, 0, 6);
        tablaG.setValueAt(null, 0, 7);
        tablaG.setValueAt(null, 1, 1);
        tablaG.setValueAt(null, 1, 2);
        tablaG.setValueAt(null, 1, 3);
        tablaG.setValueAt(null, 1, 4);
        tablaG.setValueAt(null, 1, 5);
        tablaG.setValueAt(null, 1, 6);
        tablaG.setValueAt(null, 1, 7);
        tablaG.setValueAt(null, 2, 1);
        tablaG.setValueAt(null, 2, 2);
        tablaG.setValueAt(null, 2, 3);
        tablaG.setValueAt(null, 2, 4);
        tablaG.setValueAt(null, 2, 5);
        tablaG.setValueAt(null, 2, 6);
        tablaG.setValueAt(null, 2, 7);
        tablaG.setValueAt(null, 3, 1);
        tablaG.setValueAt(null, 3, 2);
        tablaG.setValueAt(null, 3, 3);
        tablaG.setValueAt(null, 3, 4);
        tablaG.setValueAt(null, 3, 5);
        tablaG.setValueAt(null, 3, 6);
        tablaG.setValueAt(null, 3, 7);

        //Grupo G
        // Suiza [3] vs Camerun [1]
        if (Integer.parseInt(tfG01.getText()) > Integer.parseInt(tfG02.getText())) {

            tablaG.setValueAt(3, 3, 1);
            tablaG.setValueAt(1, 3, 2);
            tablaG.setValueAt(0, 3, 3);
            tablaG.setValueAt(0, 3, 4);

            tablaG.setValueAt(0, 1, 1);
            tablaG.setValueAt(0, 1, 2);
            tablaG.setValueAt(0, 1, 3);
            tablaG.setValueAt(1, 1, 4);
        } else if (Integer.parseInt(tfG01.getText()) < Integer.parseInt(tfG02.getText())) {

            tablaG.setValueAt(3, 1, 1);
            tablaG.setValueAt(1, 1, 2);
            tablaG.setValueAt(0, 1, 3);
            tablaG.setValueAt(0, 1, 4);

            tablaG.setValueAt(0, 3, 1);
            tablaG.setValueAt(0, 3, 2);
            tablaG.setValueAt(0, 3, 3);
            tablaG.setValueAt(1, 3, 4);

        } else {
            tablaG.setValueAt(1, 3, 1);
            tablaG.setValueAt(0, 3, 2);
            tablaG.setValueAt(1, 3, 3);
            tablaG.setValueAt(0, 3, 4);

            tablaG.setValueAt(1, 1, 1);
            tablaG.setValueAt(0, 1, 2);
            tablaG.setValueAt(1, 1, 3);
            tablaG.setValueAt(0, 1, 4);
        }

        // Brasil [0] vs Serbia [2]
        if (Integer.parseInt(tfG03.getText()) > Integer.parseInt(tfG04.getText())) {

            tablaG.setValueAt(3, 0, 1);
            tablaG.setValueAt(1, 0, 2);
            tablaG.setValueAt(0, 0, 3);
            tablaG.setValueAt(0, 0, 4);

            tablaG.setValueAt(0, 2, 1);
            tablaG.setValueAt(0, 2, 2);
            tablaG.setValueAt(0, 2, 3);
            tablaG.setValueAt(1, 2, 4);
        } else if (Integer.parseInt(tfG03.getText()) < Integer.parseInt(tfG04.getText())) {

            tablaG.setValueAt(3, 2, 1);
            tablaG.setValueAt(1, 2, 2);
            tablaG.setValueAt(0, 2, 3);
            tablaG.setValueAt(0, 2, 4);

            tablaG.setValueAt(0, 0, 1);
            tablaG.setValueAt(0, 0, 2);
            tablaG.setValueAt(0, 0, 3);
            tablaG.setValueAt(1, 0, 4);

        } else {
            tablaG.setValueAt(1, 0, 1);
            tablaG.setValueAt(0, 0, 2);
            tablaG.setValueAt(1, 0, 3);
            tablaG.setValueAt(0, 0, 4);

            tablaG.setValueAt(1, 2, 1);
            tablaG.setValueAt(0, 2, 2);
            tablaG.setValueAt(1, 2, 3);
            tablaG.setValueAt(0, 2, 4);
        }

        // Camerun [1] vs Serbia [2]
        if (Integer.parseInt(tfG05.getText()) > Integer.parseInt(tfG06.getText())) {

            tablaG.setValueAt((Integer) tablaG.getValueAt(1, 1) + 3, 1, 1);
            tablaG.setValueAt((Integer) tablaG.getValueAt(1, 2) + 1, 1, 2);
            tablaG.setValueAt((Integer) tablaG.getValueAt(2, 4) + 1, 2, 4);
        } else if (Integer.parseInt(tfG05.getText()) < Integer.parseInt(tfG06.getText())) {

            tablaG.setValueAt((Integer) tablaG.getValueAt(2, 1) + 3, 2, 1);
            tablaG.setValueAt((Integer) tablaG.getValueAt(2, 2) + 1, 2, 2);
            tablaG.setValueAt((Integer) tablaG.getValueAt(1, 4) + 1, 1, 4);

        } else {
            tablaG.setValueAt((Integer) tablaG.getValueAt(1, 1) + 1, 1, 1);
            tablaG.setValueAt((Integer) tablaG.getValueAt(1, 3) + 1, 1, 3);

            tablaG.setValueAt((Integer) tablaG.getValueAt(2, 1) + 1, 2, 1);
            tablaG.setValueAt((Integer) tablaG.getValueAt(2, 3) + 1, 2, 3);
        }

        // Brasil [0] vs Suiza [3]
        if (Integer.parseInt(tfG07.getText()) > Integer.parseInt(tfG08.getText())) {

            tablaG.setValueAt((Integer) tablaG.getValueAt(0, 1) + 3, 0, 1);
            tablaG.setValueAt((Integer) tablaG.getValueAt(0, 2) + 1, 0, 2);
            tablaG.setValueAt((Integer) tablaG.getValueAt(3, 4) + 1, 3, 4);
        } else if (Integer.parseInt(tfG07.getText()) < Integer.parseInt(tfG08.getText())) {

            tablaG.setValueAt((Integer) tablaG.getValueAt(3, 1) + 3, 3, 1);
            tablaG.setValueAt((Integer) tablaG.getValueAt(3, 2) + 1, 3, 2);
            tablaG.setValueAt((Integer) tablaG.getValueAt(0, 4) + 1, 0, 4);

        } else {
            tablaG.setValueAt((Integer) tablaG.getValueAt(0, 1) + 1, 0, 1);
            tablaG.setValueAt((Integer) tablaG.getValueAt(0, 3) + 1, 0, 3);

            tablaG.setValueAt((Integer) tablaG.getValueAt(3, 1) + 1, 3, 1);
            tablaG.setValueAt((Integer) tablaG.getValueAt(3, 3) + 1, 3, 3);
        }

        // Serbia [2] vs Suiza [3]
        if (Integer.parseInt(tfG09.getText()) > Integer.parseInt(tfG10.getText())) {

            tablaG.setValueAt((Integer) tablaG.getValueAt(2, 1) + 3, 2, 1);
            tablaG.setValueAt((Integer) tablaG.getValueAt(2, 2) + 1, 2, 2);
            tablaG.setValueAt((Integer) tablaG.getValueAt(3, 4) + 1, 3, 4);
        } else if (Integer.parseInt(tfG09.getText()) < Integer.parseInt(tfG10.getText())) {

            tablaG.setValueAt((Integer) tablaG.getValueAt(3, 1) + 3, 3, 1);
            tablaG.setValueAt((Integer) tablaG.getValueAt(3, 2) + 1, 3, 2);
            tablaG.setValueAt((Integer) tablaG.getValueAt(2, 4) + 1, 2, 4);

        } else {
            tablaG.setValueAt((Integer) tablaG.getValueAt(2, 1) + 1, 2, 1);
            tablaG.setValueAt((Integer) tablaG.getValueAt(2, 3) + 1, 2, 3);

            tablaG.setValueAt((Integer) tablaG.getValueAt(3, 1) + 1, 3, 1);
            tablaG.setValueAt((Integer) tablaG.getValueAt(3, 3) + 1, 3, 3);
        }

        // Camerun [1] vs Brasil [0]
        if (Integer.parseInt(tfG11.getText()) > Integer.parseInt(tfG12.getText())) {

            tablaG.setValueAt((Integer) tablaG.getValueAt(1, 1) + 3, 1, 1);
            tablaG.setValueAt((Integer) tablaG.getValueAt(1, 2) + 1, 1, 2);
            tablaG.setValueAt((Integer) tablaG.getValueAt(0, 4) + 1, 0, 4);
        } else if (Integer.parseInt(tfG11.getText()) < Integer.parseInt(tfG12.getText())) {

            tablaG.setValueAt((Integer) tablaG.getValueAt(0, 1) + 3, 0, 1);
            tablaG.setValueAt((Integer) tablaG.getValueAt(0, 2) + 1, 0, 2);
            tablaG.setValueAt((Integer) tablaG.getValueAt(1, 4) + 1, 1, 4);

        } else {
            tablaG.setValueAt((Integer) tablaG.getValueAt(1, 1) + 1, 1, 1);
            tablaG.setValueAt((Integer) tablaG.getValueAt(1, 3) + 1, 1, 3);

            tablaG.setValueAt((Integer) tablaG.getValueAt(0, 1) + 1, 0, 1);
            tablaG.setValueAt((Integer) tablaG.getValueAt(0, 3) + 1, 0, 3);
        }
        //Calculo goles a favor, en contra y diferencia de goles de cada pais 
        //y lo muestro en tabla
        int brasilGF = Integer.parseInt(tfG03.getText()) + Integer.parseInt(tfG07.getText()) + Integer.parseInt(tfG12.getText());
        int brasilGC = Integer.parseInt(tfG04.getText()) + Integer.parseInt(tfG08.getText()) + Integer.parseInt(tfG11.getText());
        int brasilDif = brasilGF - brasilGC;
        tablaG.setValueAt(brasilGF, 0, 5);
        tablaG.setValueAt(brasilGC, 0, 6);
        tablaG.setValueAt(brasilDif, 0, 7);
        
        int camerunGF = Integer.parseInt(tfG02.getText()) + Integer.parseInt(tfG05.getText()) + Integer.parseInt(tfG11.getText());
        int camerunGC = Integer.parseInt(tfG01.getText()) + Integer.parseInt(tfG06.getText()) + Integer.parseInt(tfG12.getText());
        int camerunDif = camerunGF - camerunGC;
        tablaG.setValueAt(camerunGF, 1, 5);
        tablaG.setValueAt(camerunGC, 1, 6);
        tablaG.setValueAt(camerunDif, 1, 7);
        
        int serbiaGF = Integer.parseInt(tfG04.getText()) + Integer.parseInt(tfG06.getText()) + Integer.parseInt(tfG09.getText());
        int serbiaGC = Integer.parseInt(tfG03.getText()) + Integer.parseInt(tfG05.getText()) + Integer.parseInt(tfG10.getText());
        int serbiaDif = serbiaGF - serbiaGC;
        tablaG.setValueAt(serbiaGF, 2, 5);
        tablaG.setValueAt(serbiaGC, 2, 6);
        tablaG.setValueAt(serbiaDif, 2, 7);
        
        int suizaGF = Integer.parseInt(tfG01.getText()) + Integer.parseInt(tfG08.getText()) + Integer.parseInt(tfG10.getText());
        int suizaGC = Integer.parseInt(tfG02.getText()) + Integer.parseInt(tfG07.getText()) + Integer.parseInt(tfG09.getText());
        int suizaDif = suizaGF - suizaGC;
        tablaG.setValueAt(suizaGF, 3, 5);
        tablaG.setValueAt(suizaGC, 3, 6);
        tablaG.setValueAt(suizaDif, 3, 7);
        

        //Activamos el ordenamiento por columnas en la tabla
        tablaG.setAutoCreateRowSorter(true);

        //Creo la accion automatica de ordenamiento de la tabla
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tablaG.getModel());
        tablaG.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        //ordenamos por la columna puntos
        int ordenamientoDeColumna = 1; 
        sortKeys.add(new RowSorter.SortKey(ordenamientoDeColumna, SortOrder.DESCENDING));
        //ordenamos por la columna diferencia de goles en caso de empate por puntos
        int ordenamientoDeColumna2 = 7;
        sortKeys.add(new RowSorter.SortKey(ordenamientoDeColumna2, SortOrder.DESCENDING));

        sorter.setSortKeys(sortKeys);
        sorter.sort();
        
        primeroGG = (String) tablaG.getValueAt(0, 0);
        segundoGG = (String) tablaG.getValueAt(1, 0);
        
        crearG();
        escribirG();

    }//GEN-LAST:event_guardarGActionPerformed

    private void guardarHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarHActionPerformed
        // TODO add your handling code here:

        //Borra toda la tabla
        tablaH.setValueAt(null, 0, 1);
        tablaH.setValueAt(null, 0, 2);
        tablaH.setValueAt(null, 0, 3);
        tablaH.setValueAt(null, 0, 4);
        tablaH.setValueAt(null, 0, 5);
        tablaH.setValueAt(null, 0, 6);
        tablaH.setValueAt(null, 0, 7);
        tablaH.setValueAt(null, 1, 1);
        tablaH.setValueAt(null, 1, 2);
        tablaH.setValueAt(null, 1, 3);
        tablaH.setValueAt(null, 1, 4);
        tablaH.setValueAt(null, 1, 5);
        tablaH.setValueAt(null, 1, 6);
        tablaH.setValueAt(null, 1, 7);
        tablaH.setValueAt(null, 2, 1);
        tablaH.setValueAt(null, 2, 2);
        tablaH.setValueAt(null, 2, 3);
        tablaH.setValueAt(null, 2, 4);
        tablaH.setValueAt(null, 2, 5);
        tablaH.setValueAt(null, 2, 6);
        tablaH.setValueAt(null, 2, 7);
        tablaH.setValueAt(null, 3, 1);
        tablaH.setValueAt(null, 3, 2);
        tablaH.setValueAt(null, 3, 3);
        tablaH.setValueAt(null, 3, 4);
        tablaH.setValueAt(null, 3, 5);
        tablaH.setValueAt(null, 3, 6);
        tablaH.setValueAt(null, 3, 7);

        //Grupo H
        // Uruguay [3] vs Corea del Sur [0]
        if (Integer.parseInt(tfH01.getText()) > Integer.parseInt(tfH02.getText())) {

            tablaH.setValueAt(3, 3, 1);
            tablaH.setValueAt(1, 3, 2);
            tablaH.setValueAt(0, 3, 3);
            tablaH.setValueAt(0, 3, 4);

            tablaH.setValueAt(0, 0, 1);
            tablaH.setValueAt(0, 0, 2);
            tablaH.setValueAt(0, 0, 3);
            tablaH.setValueAt(1, 0, 4);
        } else if (Integer.parseInt(tfH01.getText()) < Integer.parseInt(tfH02.getText())) {

            tablaH.setValueAt(3, 0, 1);
            tablaH.setValueAt(1, 0, 2);
            tablaH.setValueAt(0, 0, 3);
            tablaH.setValueAt(0, 0, 4);

            tablaH.setValueAt(0, 3, 1);
            tablaH.setValueAt(0, 3, 2);
            tablaH.setValueAt(0, 3, 3);
            tablaH.setValueAt(1, 3, 4);

        } else {
            tablaH.setValueAt(1, 3, 1);
            tablaH.setValueAt(0, 3, 2);
            tablaH.setValueAt(1, 3, 3);
            tablaH.setValueAt(0, 3, 4);

            tablaH.setValueAt(1, 0, 1);
            tablaH.setValueAt(0, 0, 2);
            tablaH.setValueAt(1, 0, 3);
            tablaH.setValueAt(0, 0, 4);
        }

        // Portugal [2] vs Ghana [1]
        if (Integer.parseInt(tfH03.getText()) > Integer.parseInt(tfH04.getText())) {

            tablaH.setValueAt(3, 2, 1);
            tablaH.setValueAt(1, 2, 2);
            tablaH.setValueAt(0, 2, 3);
            tablaH.setValueAt(0, 2, 4);

            tablaH.setValueAt(0, 1, 1);
            tablaH.setValueAt(0, 1, 2);
            tablaH.setValueAt(0, 1, 3);
            tablaH.setValueAt(1, 1, 4);
        } else if (Integer.parseInt(tfH03.getText()) < Integer.parseInt(tfH04.getText())) {

            tablaH.setValueAt(3, 1, 1);
            tablaH.setValueAt(1, 1, 2);
            tablaH.setValueAt(0, 1, 3);
            tablaH.setValueAt(0, 1, 4);

            tablaH.setValueAt(0, 2, 1);
            tablaH.setValueAt(0, 2, 2);
            tablaH.setValueAt(0, 2, 3);
            tablaH.setValueAt(1, 2, 4);

        } else {
            tablaH.setValueAt(1, 2, 1);
            tablaH.setValueAt(0, 2, 2);
            tablaH.setValueAt(1, 2, 3);
            tablaH.setValueAt(0, 2, 4);

            tablaH.setValueAt(1, 1, 1);
            tablaH.setValueAt(0, 1, 2);
            tablaH.setValueAt(1, 1, 3);
            tablaH.setValueAt(0, 1, 4);
        }

        // Corea del Sur [0] vs Ghana [1]
        if (Integer.parseInt(tfH05.getText()) > Integer.parseInt(tfH06.getText())) {

            tablaH.setValueAt((Integer) tablaH.getValueAt(0, 1) + 3, 0, 1);
            tablaH.setValueAt((Integer) tablaH.getValueAt(0, 2) + 1, 0, 2);
            tablaH.setValueAt((Integer) tablaH.getValueAt(1, 4) + 1, 1, 4);
        } else if (Integer.parseInt(tfH05.getText()) < Integer.parseInt(tfH06.getText())) {

            tablaH.setValueAt((Integer) tablaH.getValueAt(1, 1) + 3, 1, 1);
            tablaH.setValueAt((Integer) tablaH.getValueAt(1, 2) + 1, 1, 2);
            tablaH.setValueAt((Integer) tablaH.getValueAt(0, 4) + 1, 0, 4);

        } else {
            tablaH.setValueAt((Integer) tablaH.getValueAt(0, 1) + 1, 0, 1);
            tablaH.setValueAt((Integer) tablaH.getValueAt(0, 3) + 1, 0, 3);

            tablaH.setValueAt((Integer) tablaH.getValueAt(1, 1) + 1, 1, 1);
            tablaH.setValueAt((Integer) tablaH.getValueAt(1, 3) + 1, 1, 3);
        }

        // Portugal [2] vs Uruguay [3]
        if (Integer.parseInt(tfH07.getText()) > Integer.parseInt(tfH08.getText())) {

            tablaH.setValueAt((Integer) tablaH.getValueAt(2, 1) + 3, 2, 1);
            tablaH.setValueAt((Integer) tablaH.getValueAt(2, 2) + 1, 2, 2);
            tablaH.setValueAt((Integer) tablaH.getValueAt(3, 4) + 1, 3, 4);
        } else if (Integer.parseInt(tfH07.getText()) < Integer.parseInt(tfH08.getText())) {

            tablaH.setValueAt((Integer) tablaH.getValueAt(3, 1) + 3, 3, 1);
            tablaH.setValueAt((Integer) tablaH.getValueAt(3, 2) + 1, 3, 2);
            tablaH.setValueAt((Integer) tablaH.getValueAt(2, 4) + 1, 2, 4);

        } else {
            tablaH.setValueAt((Integer) tablaH.getValueAt(2, 1) + 1, 2, 1);
            tablaH.setValueAt((Integer) tablaH.getValueAt(2, 3) + 1, 2, 3);

            tablaH.setValueAt((Integer) tablaH.getValueAt(3, 1) + 1, 3, 1);
            tablaH.setValueAt((Integer) tablaH.getValueAt(3, 3) + 1, 3, 3);
        }

        // Ghana [1] vs Uruguay [3]
        if (Integer.parseInt(tfH09.getText()) > Integer.parseInt(tfH10.getText())) {

            tablaH.setValueAt((Integer) tablaH.getValueAt(1, 1) + 3, 1, 1);
            tablaH.setValueAt((Integer) tablaH.getValueAt(1, 2) + 1, 1, 2);
            tablaH.setValueAt((Integer) tablaH.getValueAt(3, 4) + 1, 3, 4);
        } else if (Integer.parseInt(tfH09.getText()) < Integer.parseInt(tfH10.getText())) {

            tablaH.setValueAt((Integer) tablaH.getValueAt(3, 1) + 3, 3, 1);
            tablaH.setValueAt((Integer) tablaH.getValueAt(3, 2) + 1, 3, 2);
            tablaH.setValueAt((Integer) tablaH.getValueAt(1, 4) + 1, 1, 4);

        } else {
            tablaH.setValueAt((Integer) tablaH.getValueAt(1, 1) + 1, 1, 1);
            tablaH.setValueAt((Integer) tablaH.getValueAt(1, 3) + 1, 1, 3);

            tablaH.setValueAt((Integer) tablaH.getValueAt(3, 1) + 1, 3, 1);
            tablaH.setValueAt((Integer) tablaH.getValueAt(3, 3) + 1, 3, 3);
        }

        // Corea del Sur [0] vs Portugal [2]
        if (Integer.parseInt(tfH11.getText()) > Integer.parseInt(tfH12.getText())) {

            tablaH.setValueAt((Integer) tablaH.getValueAt(0, 1) + 3, 0, 1);
            tablaH.setValueAt((Integer) tablaH.getValueAt(0, 2) + 1, 0, 2);
            tablaH.setValueAt((Integer) tablaH.getValueAt(2, 4) + 1, 2, 4);
        } else if (Integer.parseInt(tfH11.getText()) < Integer.parseInt(tfH12.getText())) {

            tablaH.setValueAt((Integer) tablaH.getValueAt(2, 1) + 3, 2, 1);
            tablaH.setValueAt((Integer) tablaH.getValueAt(2, 2) + 1, 2, 2);
            tablaH.setValueAt((Integer) tablaH.getValueAt(0, 4) + 1, 0, 4);

        } else {
            tablaH.setValueAt((Integer) tablaH.getValueAt(0, 1) + 1, 0, 1);
            tablaH.setValueAt((Integer) tablaH.getValueAt(0, 3) + 1, 0, 3);

            tablaH.setValueAt((Integer) tablaH.getValueAt(2, 1) + 1, 2, 1);
            tablaH.setValueAt((Integer) tablaH.getValueAt(2, 3) + 1, 2, 3);
        }
        //Calculo goles a favor, en contra y diferencia de goles de cada pais 
        //y lo muestro en tabla
        int coreaGF = Integer.parseInt(tfH02.getText()) + Integer.parseInt(tfH05.getText()) + Integer.parseInt(tfH11.getText());
        int coreaGC = Integer.parseInt(tfH01.getText()) + Integer.parseInt(tfH06.getText()) + Integer.parseInt(tfH12.getText());
        int coreaDif = coreaGF - coreaGC;
        tablaH.setValueAt(coreaGF, 0, 5);
        tablaH.setValueAt(coreaGC, 0, 6);
        tablaH.setValueAt(coreaDif, 0, 7);
        
        int ghanaGF = Integer.parseInt(tfH04.getText()) + Integer.parseInt(tfH06.getText()) + Integer.parseInt(tfH09.getText());
        int ghanaGC = Integer.parseInt(tfH03.getText()) + Integer.parseInt(tfH05.getText()) + Integer.parseInt(tfH10.getText());
        int ghanaDif = ghanaGF - ghanaGC;
        tablaH.setValueAt(ghanaGF, 1, 5);
        tablaH.setValueAt(ghanaGC, 1, 6);
        tablaH.setValueAt(ghanaDif, 1, 7);
        
        int portugalGF = Integer.parseInt(tfH03.getText()) + Integer.parseInt(tfH07.getText()) + Integer.parseInt(tfH12.getText());
        int portugalGC = Integer.parseInt(tfH04.getText()) + Integer.parseInt(tfH08.getText()) + Integer.parseInt(tfH11.getText());
        int portugalDif = portugalGF - portugalGC;
        tablaH.setValueAt(portugalGF, 2, 5);
        tablaH.setValueAt(portugalGC, 2, 6);
        tablaH.setValueAt(portugalDif, 2, 7);
        
        int uruguayGF = Integer.parseInt(tfH01.getText()) + Integer.parseInt(tfH08.getText()) + Integer.parseInt(tfH10.getText());
        int uruguayGC = Integer.parseInt(tfH02.getText()) + Integer.parseInt(tfH07.getText()) + Integer.parseInt(tfH09.getText());
        int uruguayDif = uruguayGF - uruguayGC;
        tablaH.setValueAt(uruguayGF, 3, 5);
        tablaH.setValueAt(uruguayGC, 3, 6);
        tablaH.setValueAt(uruguayDif, 3, 7);
        

        //Activamos el ordenamiento por columnas en la tabla
        tablaH.setAutoCreateRowSorter(true);

        //Creo la accion automatica de ordenamiento de la tabla
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tablaH.getModel());
        tablaH.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        //ordenamos por la columna puntos
        int ordenamientoDeColumna = 1; 
        sortKeys.add(new RowSorter.SortKey(ordenamientoDeColumna, SortOrder.DESCENDING));
        //ordenamos por la columna diferencia de goles en caso de empate por puntos
        int ordenamientoDeColumna2 = 7;
        sortKeys.add(new RowSorter.SortKey(ordenamientoDeColumna2, SortOrder.DESCENDING));

        sorter.setSortKeys(sortKeys);
        sorter.sort();
        
        primeroGH = (String) tablaH.getValueAt(0, 0);
        segundoGH = (String) tablaH.getValueAt(1, 0);
        
        crearH();
        escribirH();

    }//GEN-LAST:event_guardarHActionPerformed

    private void borrarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarAActionPerformed
        //Borra toda la tabla
        tablaA.setValueAt(null, 0, 1);
        tablaA.setValueAt(null, 0, 2);
        tablaA.setValueAt(null, 0, 3);
        tablaA.setValueAt(null, 0, 4);
        tablaA.setValueAt(null, 0, 5);
        tablaA.setValueAt(null, 0, 6);
        tablaA.setValueAt(null, 0, 7);
        tablaA.setValueAt(null, 1, 1);
        tablaA.setValueAt(null, 1, 2);
        tablaA.setValueAt(null, 1, 3);
        tablaA.setValueAt(null, 1, 4);
        tablaA.setValueAt(null, 1, 5);
        tablaA.setValueAt(null, 1, 6);
        tablaA.setValueAt(null, 1, 7);
        tablaA.setValueAt(null, 2, 1);
        tablaA.setValueAt(null, 2, 2);
        tablaA.setValueAt(null, 2, 3);
        tablaA.setValueAt(null, 2, 4);
        tablaA.setValueAt(null, 2, 5);
        tablaA.setValueAt(null, 2, 6);
        tablaA.setValueAt(null, 2, 7);
        tablaA.setValueAt(null, 3, 1);
        tablaA.setValueAt(null, 3, 2);
        tablaA.setValueAt(null, 3, 3);
        tablaA.setValueAt(null, 3, 4);
        tablaA.setValueAt(null, 3, 5);
        tablaA.setValueAt(null, 3, 6);
        tablaA.setValueAt(null, 3, 7);
        
        //Activamos el ordenamiento por columnas en la tabla
        tablaA.setAutoCreateRowSorter(true);

        //Creo la accion automatica de ordenamiento de la tabla
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tablaA.getModel());
        tablaA.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();

        int ordenamientoDeColumna = 0; //ordenamos por la columna Paises
        sortKeys.add(new RowSorter.SortKey(ordenamientoDeColumna, SortOrder.ASCENDING));

        sorter.setSortKeys(sortKeys);
        sorter.sort();
    }//GEN-LAST:event_borrarAActionPerformed

    private void borrarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarBActionPerformed
        //Borra toda la tabla
        tablaB.setValueAt(null, 0, 1);
        tablaB.setValueAt(null, 0, 2);
        tablaB.setValueAt(null, 0, 3);
        tablaB.setValueAt(null, 0, 4);
        tablaB.setValueAt(null, 0, 5);
        tablaB.setValueAt(null, 0, 6);
        tablaB.setValueAt(null, 0, 7);
        tablaB.setValueAt(null, 1, 1);
        tablaB.setValueAt(null, 1, 2);
        tablaB.setValueAt(null, 1, 3);
        tablaB.setValueAt(null, 1, 4);
        tablaB.setValueAt(null, 1, 5);
        tablaB.setValueAt(null, 1, 6);
        tablaB.setValueAt(null, 1, 7);
        tablaB.setValueAt(null, 2, 1);
        tablaB.setValueAt(null, 2, 2);
        tablaB.setValueAt(null, 2, 3);
        tablaB.setValueAt(null, 2, 4);
        tablaB.setValueAt(null, 2, 5);
        tablaB.setValueAt(null, 2, 6);
        tablaB.setValueAt(null, 2, 7);
        tablaB.setValueAt(null, 3, 1);
        tablaB.setValueAt(null, 3, 2);
        tablaB.setValueAt(null, 3, 3);
        tablaB.setValueAt(null, 3, 4);
        tablaB.setValueAt(null, 3, 5);
        tablaB.setValueAt(null, 3, 6);
        tablaB.setValueAt(null, 3, 7);
        
        //Activamos el ordenamiento por columnas en la tabla
        tablaB.setAutoCreateRowSorter(true);

        //Creo la accion automatica de ordenamiento de la tabla
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tablaB.getModel());
        tablaB.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();

        int ordenamientoDeColumna = 0; //ordenamos por la columna Paises
        sortKeys.add(new RowSorter.SortKey(ordenamientoDeColumna, SortOrder.ASCENDING));

        sorter.setSortKeys(sortKeys);
        sorter.sort();
    }//GEN-LAST:event_borrarBActionPerformed

    private void borrarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarCActionPerformed
        //Borra toda la tabla
        tablaC.setValueAt(null, 0, 1);
        tablaC.setValueAt(null, 0, 2);
        tablaC.setValueAt(null, 0, 3);
        tablaC.setValueAt(null, 0, 4);
        tablaC.setValueAt(null, 0, 5);
        tablaC.setValueAt(null, 0, 6);
        tablaC.setValueAt(null, 0, 7);
        tablaC.setValueAt(null, 1, 1);
        tablaC.setValueAt(null, 1, 2);
        tablaC.setValueAt(null, 1, 3);
        tablaC.setValueAt(null, 1, 4);
        tablaC.setValueAt(null, 1, 5);
        tablaC.setValueAt(null, 1, 6);
        tablaC.setValueAt(null, 1, 7);
        tablaC.setValueAt(null, 2, 1);
        tablaC.setValueAt(null, 2, 2);
        tablaC.setValueAt(null, 2, 3);
        tablaC.setValueAt(null, 2, 4);
        tablaC.setValueAt(null, 2, 5);
        tablaC.setValueAt(null, 2, 6);
        tablaC.setValueAt(null, 2, 7);
        tablaC.setValueAt(null, 3, 1);
        tablaC.setValueAt(null, 3, 2);
        tablaC.setValueAt(null, 3, 3);
        tablaC.setValueAt(null, 3, 4);
        tablaC.setValueAt(null, 3, 5);
        tablaC.setValueAt(null, 3, 6);
        tablaC.setValueAt(null, 3, 7);
        
        //Activamos el ordenamiento por columnas en la tabla
        tablaC.setAutoCreateRowSorter(true);

        //Creo la accion automatica de ordenamiento de la tabla
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tablaC.getModel());
        tablaC.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();

        int ordenamientoDeColumna = 0; //ordenamos por la columna Paises
        sortKeys.add(new RowSorter.SortKey(ordenamientoDeColumna, SortOrder.ASCENDING));

        sorter.setSortKeys(sortKeys);
        sorter.sort();
    }//GEN-LAST:event_borrarCActionPerformed

    private void borrarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarDActionPerformed
        //Borra toda la tabla
        tablaD.setValueAt(null, 0, 1);
        tablaD.setValueAt(null, 0, 2);
        tablaD.setValueAt(null, 0, 3);
        tablaD.setValueAt(null, 0, 4);
        tablaD.setValueAt(null, 0, 5);
        tablaD.setValueAt(null, 0, 6);
        tablaD.setValueAt(null, 0, 7);
        tablaD.setValueAt(null, 1, 1);
        tablaD.setValueAt(null, 1, 2);
        tablaD.setValueAt(null, 1, 3);
        tablaD.setValueAt(null, 1, 4);
        tablaD.setValueAt(null, 1, 5);
        tablaD.setValueAt(null, 1, 6);
        tablaD.setValueAt(null, 1, 7);
        tablaD.setValueAt(null, 2, 1);
        tablaD.setValueAt(null, 2, 2);
        tablaD.setValueAt(null, 2, 3);
        tablaD.setValueAt(null, 2, 4);
        tablaD.setValueAt(null, 2, 5);
        tablaD.setValueAt(null, 2, 6);
        tablaD.setValueAt(null, 2, 7);
        tablaD.setValueAt(null, 3, 1);
        tablaD.setValueAt(null, 3, 2);
        tablaD.setValueAt(null, 3, 3);
        tablaD.setValueAt(null, 3, 4);
        tablaD.setValueAt(null, 3, 5);
        tablaD.setValueAt(null, 3, 6);
        tablaD.setValueAt(null, 3, 7);
        
        //Activamos el ordenamiento por columnas en la tabla
        tablaD.setAutoCreateRowSorter(true);

        //Creo la accion automatica de ordenamiento de la tabla
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tablaD.getModel());
        tablaD.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();

        int ordenamientoDeColumna = 0; //ordenamos por la columna Paises
        sortKeys.add(new RowSorter.SortKey(ordenamientoDeColumna, SortOrder.ASCENDING));

        sorter.setSortKeys(sortKeys);
        sorter.sort();
    }//GEN-LAST:event_borrarDActionPerformed

    private void borrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarEActionPerformed
        //Borra toda la tabla
        tablaE.setValueAt(null, 0, 1);
        tablaE.setValueAt(null, 0, 2);
        tablaE.setValueAt(null, 0, 3);
        tablaE.setValueAt(null, 0, 4);
        tablaE.setValueAt(null, 0, 5);
        tablaE.setValueAt(null, 0, 6);
        tablaE.setValueAt(null, 0, 7);
        tablaE.setValueAt(null, 1, 1);
        tablaE.setValueAt(null, 1, 2);
        tablaE.setValueAt(null, 1, 3);
        tablaE.setValueAt(null, 1, 4);
        tablaE.setValueAt(null, 1, 5);
        tablaE.setValueAt(null, 1, 6);
        tablaE.setValueAt(null, 1, 7);
        tablaE.setValueAt(null, 2, 1);
        tablaE.setValueAt(null, 2, 2);
        tablaE.setValueAt(null, 2, 3);
        tablaE.setValueAt(null, 2, 4);
        tablaE.setValueAt(null, 2, 5);
        tablaE.setValueAt(null, 2, 6);
        tablaE.setValueAt(null, 2, 7);
        tablaE.setValueAt(null, 3, 1);
        tablaE.setValueAt(null, 3, 2);
        tablaE.setValueAt(null, 3, 3);
        tablaE.setValueAt(null, 3, 4);
        tablaE.setValueAt(null, 3, 5);
        tablaE.setValueAt(null, 3, 6);
        tablaE.setValueAt(null, 3, 7);
        
        //Activamos el ordenamiento por columnas en la tabla
        tablaE.setAutoCreateRowSorter(true);

        //Creo la accion automatica de ordenamiento de la tabla
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tablaE.getModel());
        tablaE.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();

        int ordenamientoDeColumna = 0; //ordenamos por la columna Paises
        sortKeys.add(new RowSorter.SortKey(ordenamientoDeColumna, SortOrder.ASCENDING));

        sorter.setSortKeys(sortKeys);
        sorter.sort();
    }//GEN-LAST:event_borrarEActionPerformed

    private void borrarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarFActionPerformed
        //Borra toda la tabla
        tablaF.setValueAt(null, 0, 1);
        tablaF.setValueAt(null, 0, 2);
        tablaF.setValueAt(null, 0, 3);
        tablaF.setValueAt(null, 0, 4);
        tablaF.setValueAt(null, 0, 5);
        tablaF.setValueAt(null, 0, 6);
        tablaF.setValueAt(null, 0, 7);
        tablaF.setValueAt(null, 1, 1);
        tablaF.setValueAt(null, 1, 2);
        tablaF.setValueAt(null, 1, 3);
        tablaF.setValueAt(null, 1, 4);
        tablaF.setValueAt(null, 1, 5);
        tablaF.setValueAt(null, 1, 6);
        tablaF.setValueAt(null, 1, 7);
        tablaF.setValueAt(null, 2, 1);
        tablaF.setValueAt(null, 2, 2);
        tablaF.setValueAt(null, 2, 3);
        tablaF.setValueAt(null, 2, 4);
        tablaF.setValueAt(null, 2, 5);
        tablaF.setValueAt(null, 2, 6);
        tablaF.setValueAt(null, 2, 7);
        tablaF.setValueAt(null, 3, 1);
        tablaF.setValueAt(null, 3, 2);
        tablaF.setValueAt(null, 3, 3);
        tablaF.setValueAt(null, 3, 4);
        tablaF.setValueAt(null, 3, 5);
        tablaF.setValueAt(null, 3, 6);
        tablaF.setValueAt(null, 3, 7);
        
        //Activamos el ordenamiento por columnas en la tabla
        tablaF.setAutoCreateRowSorter(true);

        //Creo la accion automatica de ordenamiento de la tabla
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tablaF.getModel());
        tablaF.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();

        int ordenamientoDeColumna = 0; //ordenamos por la columna Paises
        sortKeys.add(new RowSorter.SortKey(ordenamientoDeColumna, SortOrder.ASCENDING));

        sorter.setSortKeys(sortKeys);
        sorter.sort();
    }//GEN-LAST:event_borrarFActionPerformed

    private void borrarGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarGActionPerformed
        //Borra toda la tabla
        tablaG.setValueAt(null, 0, 1);
        tablaG.setValueAt(null, 0, 2);
        tablaG.setValueAt(null, 0, 3);
        tablaG.setValueAt(null, 0, 4);
        tablaG.setValueAt(null, 0, 5);
        tablaG.setValueAt(null, 0, 6);
        tablaG.setValueAt(null, 0, 7);
        tablaG.setValueAt(null, 1, 1);
        tablaG.setValueAt(null, 1, 2);
        tablaG.setValueAt(null, 1, 3);
        tablaG.setValueAt(null, 1, 4);
        tablaG.setValueAt(null, 1, 5);
        tablaG.setValueAt(null, 1, 6);
        tablaG.setValueAt(null, 1, 7);
        tablaG.setValueAt(null, 2, 1);
        tablaG.setValueAt(null, 2, 2);
        tablaG.setValueAt(null, 2, 3);
        tablaG.setValueAt(null, 2, 4);
        tablaG.setValueAt(null, 2, 5);
        tablaG.setValueAt(null, 2, 6);
        tablaG.setValueAt(null, 2, 7);
        tablaG.setValueAt(null, 3, 1);
        tablaG.setValueAt(null, 3, 2);
        tablaG.setValueAt(null, 3, 3);
        tablaG.setValueAt(null, 3, 4);
        tablaG.setValueAt(null, 3, 5);
        tablaG.setValueAt(null, 3, 6);
        tablaG.setValueAt(null, 3, 7);
        
        //Activamos el ordenamiento por columnas en la tabla
        tablaG.setAutoCreateRowSorter(true);

        //Creo la accion automatica de ordenamiento de la tabla
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tablaG.getModel());
        tablaG.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();

        int ordenamientoDeColumna = 0; //ordenamos por la columna Paises
        sortKeys.add(new RowSorter.SortKey(ordenamientoDeColumna, SortOrder.ASCENDING));

        sorter.setSortKeys(sortKeys);
        sorter.sort();
    }//GEN-LAST:event_borrarGActionPerformed

    private void borrarHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarHActionPerformed
        //Borra toda la tabla
        tablaH.setValueAt(null, 0, 1);
        tablaH.setValueAt(null, 0, 2);
        tablaH.setValueAt(null, 0, 3);
        tablaH.setValueAt(null, 0, 4);
        tablaH.setValueAt(null, 0, 5);
        tablaH.setValueAt(null, 0, 6);
        tablaH.setValueAt(null, 0, 7);
        tablaH.setValueAt(null, 1, 1);
        tablaH.setValueAt(null, 1, 2);
        tablaH.setValueAt(null, 1, 3);
        tablaH.setValueAt(null, 1, 4);
        tablaH.setValueAt(null, 1, 5);
        tablaH.setValueAt(null, 1, 6);
        tablaH.setValueAt(null, 1, 7);
        tablaH.setValueAt(null, 2, 1);
        tablaH.setValueAt(null, 2, 2);
        tablaH.setValueAt(null, 2, 3);
        tablaH.setValueAt(null, 2, 4);
        tablaH.setValueAt(null, 2, 5);
        tablaH.setValueAt(null, 2, 6);
        tablaH.setValueAt(null, 2, 7);
        tablaH.setValueAt(null, 3, 1);
        tablaH.setValueAt(null, 3, 2);
        tablaH.setValueAt(null, 3, 3);
        tablaH.setValueAt(null, 3, 4);
        tablaH.setValueAt(null, 3, 5);
        tablaH.setValueAt(null, 3, 6);
        tablaH.setValueAt(null, 3, 7);
        
        //Activamos el ordenamiento por columnas en la tabla
        tablaH.setAutoCreateRowSorter(true);

        //Creo la accion automatica de ordenamiento de la tabla
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tablaH.getModel());
        tablaH.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();

        int ordenamientoDeColumna = 0; //ordenamos por la columna Paises
        sortKeys.add(new RowSorter.SortKey(ordenamientoDeColumna, SortOrder.ASCENDING));

        sorter.setSortKeys(sortKeys);
        sorter.sort();
    }//GEN-LAST:event_borrarHActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrarA;
    private javax.swing.JButton borrarB;
    private javax.swing.JButton borrarC;
    private javax.swing.JButton borrarD;
    private javax.swing.JButton borrarE;
    private javax.swing.JButton borrarF;
    private javax.swing.JButton borrarG;
    private javax.swing.JButton borrarH;
    private javax.swing.JLabel ecuador01;
    private javax.swing.JLabel ecuador02;
    private javax.swing.JLabel ecuador03;
    private javax.swing.JPanel grupoA;
    private javax.swing.JPanel grupoB;
    private javax.swing.JPanel grupoC;
    private javax.swing.JPanel grupoD;
    private javax.swing.JPanel grupoE;
    private javax.swing.JPanel grupoF;
    private javax.swing.JPanel grupoG;
    private javax.swing.JPanel grupoH;
    private javax.swing.JButton guardarA;
    private javax.swing.JButton guardarB;
    private javax.swing.JButton guardarC;
    private javax.swing.JButton guardarD;
    private javax.swing.JButton guardarE;
    private javax.swing.JButton guardarF;
    private javax.swing.JButton guardarG;
    private javax.swing.JButton guardarH;
    private javax.swing.JLabel jLabel1000;
    private javax.swing.JLabel jLabel1001;
    private javax.swing.JLabel jLabel1002;
    private javax.swing.JLabel jLabel1003;
    private javax.swing.JLabel jLabel1004;
    private javax.swing.JLabel jLabel1005;
    private javax.swing.JLabel jLabel1006;
    private javax.swing.JLabel jLabel1007;
    private javax.swing.JLabel jLabel1008;
    private javax.swing.JLabel jLabel1009;
    private javax.swing.JLabel jLabel1010;
    private javax.swing.JLabel jLabel1011;
    private javax.swing.JLabel jLabel1012;
    private javax.swing.JLabel jLabel1013;
    private javax.swing.JLabel jLabel1014;
    private javax.swing.JLabel jLabel1015;
    private javax.swing.JLabel jLabel1016;
    private javax.swing.JLabel jLabel1017;
    private javax.swing.JLabel jLabel1018;
    private javax.swing.JLabel jLabel1019;
    private javax.swing.JLabel jLabel1020;
    private javax.swing.JLabel jLabel1021;
    private javax.swing.JLabel jLabel1022;
    private javax.swing.JLabel jLabel1023;
    private javax.swing.JLabel jLabel1024;
    private javax.swing.JLabel jLabel1025;
    private javax.swing.JLabel jLabel1026;
    private javax.swing.JLabel jLabel1027;
    private javax.swing.JLabel jLabel1028;
    private javax.swing.JLabel jLabel1029;
    private javax.swing.JLabel jLabel1030;
    private javax.swing.JLabel jLabel1031;
    private javax.swing.JLabel jLabel1032;
    private javax.swing.JLabel jLabel1033;
    private javax.swing.JLabel jLabel1034;
    private javax.swing.JLabel jLabel1035;
    private javax.swing.JLabel jLabel1036;
    private javax.swing.JLabel jLabel1037;
    private javax.swing.JLabel jLabel1038;
    private javax.swing.JLabel jLabel1039;
    private javax.swing.JLabel jLabel1040;
    private javax.swing.JLabel jLabel1041;
    private javax.swing.JLabel jLabel1042;
    private javax.swing.JLabel jLabel1043;
    private javax.swing.JLabel jLabel1044;
    private javax.swing.JLabel jLabel1045;
    private javax.swing.JLabel jLabel1046;
    private javax.swing.JLabel jLabel1047;
    private javax.swing.JLabel jLabel1048;
    private javax.swing.JLabel jLabel1049;
    private javax.swing.JLabel jLabel1050;
    private javax.swing.JLabel jLabel1051;
    private javax.swing.JLabel jLabel1052;
    private javax.swing.JLabel jLabel1053;
    private javax.swing.JLabel jLabel1054;
    private javax.swing.JLabel jLabel1055;
    private javax.swing.JLabel jLabel1056;
    private javax.swing.JLabel jLabel1057;
    private javax.swing.JLabel jLabel1058;
    private javax.swing.JLabel jLabel1059;
    private javax.swing.JLabel jLabel1060;
    private javax.swing.JLabel jLabel1061;
    private javax.swing.JLabel jLabel1062;
    private javax.swing.JLabel jLabel1063;
    private javax.swing.JLabel jLabel1064;
    private javax.swing.JLabel jLabel1065;
    private javax.swing.JLabel jLabel1066;
    private javax.swing.JLabel jLabel1067;
    private javax.swing.JLabel jLabel1068;
    private javax.swing.JLabel jLabel1069;
    private javax.swing.JLabel jLabel1070;
    private javax.swing.JLabel jLabel1071;
    private javax.swing.JLabel jLabel1072;
    private javax.swing.JLabel jLabel1073;
    private javax.swing.JLabel jLabel1074;
    private javax.swing.JLabel jLabel1075;
    private javax.swing.JLabel jLabel1076;
    private javax.swing.JLabel jLabel1077;
    private javax.swing.JLabel jLabel1078;
    private javax.swing.JLabel jLabel1079;
    private javax.swing.JLabel jLabel1080;
    private javax.swing.JLabel jLabel1081;
    private javax.swing.JLabel jLabel1082;
    private javax.swing.JLabel jLabel1083;
    private javax.swing.JLabel jLabel1084;
    private javax.swing.JLabel jLabel1085;
    private javax.swing.JLabel jLabel1086;
    private javax.swing.JLabel jLabel1087;
    private javax.swing.JLabel jLabel1088;
    private javax.swing.JLabel jLabel1089;
    private javax.swing.JLabel jLabel1090;
    private javax.swing.JLabel jLabel1091;
    private javax.swing.JLabel jLabel1092;
    private javax.swing.JLabel jLabel1093;
    private javax.swing.JLabel jLabel1094;
    private javax.swing.JLabel jLabel1095;
    private javax.swing.JLabel jLabel1096;
    private javax.swing.JLabel jLabel1097;
    private javax.swing.JLabel jLabel1098;
    private javax.swing.JLabel jLabel1099;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel1100;
    private javax.swing.JLabel jLabel1101;
    private javax.swing.JLabel jLabel1102;
    private javax.swing.JLabel jLabel1103;
    private javax.swing.JLabel jLabel1104;
    private javax.swing.JLabel jLabel1105;
    private javax.swing.JLabel jLabel1106;
    private javax.swing.JLabel jLabel1107;
    private javax.swing.JLabel jLabel1108;
    private javax.swing.JLabel jLabel1109;
    private javax.swing.JLabel jLabel1110;
    private javax.swing.JLabel jLabel1111;
    private javax.swing.JLabel jLabel1154;
    private javax.swing.JLabel jLabel1155;
    private javax.swing.JLabel jLabel1156;
    private javax.swing.JLabel jLabel1157;
    private javax.swing.JLabel jLabel1158;
    private javax.swing.JLabel jLabel1161;
    private javax.swing.JLabel jLabel1162;
    private javax.swing.JLabel jLabel1163;
    private javax.swing.JLabel jLabel1166;
    private javax.swing.JLabel jLabel1167;
    private javax.swing.JLabel jLabel1168;
    private javax.swing.JLabel jLabel1171;
    private javax.swing.JLabel jLabel1172;
    private javax.swing.JLabel jLabel1173;
    private javax.swing.JLabel jLabel1175;
    private javax.swing.JLabel jLabel1176;
    private javax.swing.JLabel jLabel1177;
    private javax.swing.JLabel jLabel1180;
    private javax.swing.JLabel jLabel1181;
    private javax.swing.JLabel jLabel1182;
    private javax.swing.JLabel jLabel1185;
    private javax.swing.JLabel jLabel1186;
    private javax.swing.JLabel jLabel1187;
    private javax.swing.JLabel jLabel1188;
    private javax.swing.JLabel jLabel1189;
    private javax.swing.JLabel jLabel1190;
    private javax.swing.JLabel jLabel1191;
    private javax.swing.JLabel jLabel1192;
    private javax.swing.JLabel jLabel1193;
    private javax.swing.JLabel jLabel1194;
    private javax.swing.JLabel jLabel1195;
    private javax.swing.JLabel jLabel1196;
    private javax.swing.JLabel jLabel1197;
    private javax.swing.JLabel jLabel1198;
    private javax.swing.JLabel jLabel1199;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel1200;
    private javax.swing.JLabel jLabel1201;
    private javax.swing.JLabel jLabel1202;
    private javax.swing.JLabel jLabel1203;
    private javax.swing.JLabel jLabel1204;
    private javax.swing.JLabel jLabel1205;
    private javax.swing.JLabel jLabel1206;
    private javax.swing.JLabel jLabel1207;
    private javax.swing.JLabel jLabel1208;
    private javax.swing.JLabel jLabel1209;
    private javax.swing.JLabel jLabel1210;
    private javax.swing.JLabel jLabel1211;
    private javax.swing.JLabel jLabel1212;
    private javax.swing.JLabel jLabel1213;
    private javax.swing.JLabel jLabel1214;
    private javax.swing.JLabel jLabel1215;
    private javax.swing.JLabel jLabel1216;
    private javax.swing.JLabel jLabel1217;
    private javax.swing.JLabel jLabel1218;
    private javax.swing.JLabel jLabel1219;
    private javax.swing.JLabel jLabel1220;
    private javax.swing.JLabel jLabel1221;
    private javax.swing.JLabel jLabel1222;
    private javax.swing.JLabel jLabel1223;
    private javax.swing.JLabel jLabel1224;
    private javax.swing.JLabel jLabel1225;
    private javax.swing.JLabel jLabel1226;
    private javax.swing.JLabel jLabel1227;
    private javax.swing.JLabel jLabel1228;
    private javax.swing.JLabel jLabel1229;
    private javax.swing.JLabel jLabel1230;
    private javax.swing.JLabel jLabel1231;
    private javax.swing.JLabel jLabel1232;
    private javax.swing.JLabel jLabel1233;
    private javax.swing.JLabel jLabel1234;
    private javax.swing.JLabel jLabel1235;
    private javax.swing.JLabel jLabel1236;
    private javax.swing.JLabel jLabel1237;
    private javax.swing.JLabel jLabel1238;
    private javax.swing.JLabel jLabel1239;
    private javax.swing.JLabel jLabel1240;
    private javax.swing.JLabel jLabel1241;
    private javax.swing.JLabel jLabel1242;
    private javax.swing.JLabel jLabel1243;
    private javax.swing.JLabel jLabel1244;
    private javax.swing.JLabel jLabel1245;
    private javax.swing.JLabel jLabel1246;
    private javax.swing.JLabel jLabel1247;
    private javax.swing.JLabel jLabel1248;
    private javax.swing.JLabel jLabel1249;
    private javax.swing.JLabel jLabel1250;
    private javax.swing.JLabel jLabel1251;
    private javax.swing.JLabel jLabel1252;
    private javax.swing.JLabel jLabel1253;
    private javax.swing.JLabel jLabel1254;
    private javax.swing.JLabel jLabel1255;
    private javax.swing.JLabel jLabel369;
    private javax.swing.JLabel jLabel370;
    private javax.swing.JLabel jLabel371;
    private javax.swing.JLabel jLabel372;
    private javax.swing.JLabel jLabel373;
    private javax.swing.JLabel jLabel374;
    private javax.swing.JLabel jLabel375;
    private javax.swing.JLabel jLabel376;
    private javax.swing.JLabel jLabel377;
    private javax.swing.JLabel jLabel378;
    private javax.swing.JLabel jLabel379;
    private javax.swing.JLabel jLabel380;
    private javax.swing.JLabel jLabel381;
    private javax.swing.JLabel jLabel382;
    private javax.swing.JLabel jLabel383;
    private javax.swing.JLabel jLabel384;
    private javax.swing.JLabel jLabel385;
    private javax.swing.JLabel jLabel386;
    private javax.swing.JLabel jLabel387;
    private javax.swing.JLabel jLabel388;
    private javax.swing.JLabel jLabel389;
    private javax.swing.JLabel jLabel390;
    private javax.swing.JLabel jLabel391;
    private javax.swing.JLabel jLabel392;
    private javax.swing.JLabel jLabel393;
    private javax.swing.JLabel jLabel394;
    private javax.swing.JLabel jLabel395;
    private javax.swing.JLabel jLabel396;
    private javax.swing.JLabel jLabel397;
    private javax.swing.JLabel jLabel398;
    private javax.swing.JLabel jLabel399;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel400;
    private javax.swing.JLabel jLabel401;
    private javax.swing.JLabel jLabel402;
    private javax.swing.JLabel jLabel403;
    private javax.swing.JLabel jLabel404;
    private javax.swing.JLabel jLabel405;
    private javax.swing.JLabel jLabel406;
    private javax.swing.JLabel jLabel407;
    private javax.swing.JLabel jLabel408;
    private javax.swing.JLabel jLabel409;
    private javax.swing.JLabel jLabel410;
    private javax.swing.JLabel jLabel411;
    private javax.swing.JLabel jLabel412;
    private javax.swing.JLabel jLabel413;
    private javax.swing.JLabel jLabel414;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel950;
    private javax.swing.JLabel jLabel951;
    private javax.swing.JLabel jLabel952;
    private javax.swing.JLabel jLabel953;
    private javax.swing.JLabel jLabel954;
    private javax.swing.JLabel jLabel955;
    private javax.swing.JLabel jLabel956;
    private javax.swing.JLabel jLabel957;
    private javax.swing.JLabel jLabel958;
    private javax.swing.JLabel jLabel959;
    private javax.swing.JLabel jLabel960;
    private javax.swing.JLabel jLabel961;
    private javax.swing.JLabel jLabel962;
    private javax.swing.JLabel jLabel963;
    private javax.swing.JLabel jLabel964;
    private javax.swing.JLabel jLabel965;
    private javax.swing.JLabel jLabel966;
    private javax.swing.JLabel jLabel967;
    private javax.swing.JLabel jLabel968;
    private javax.swing.JLabel jLabel969;
    private javax.swing.JLabel jLabel970;
    private javax.swing.JLabel jLabel971;
    private javax.swing.JLabel jLabel972;
    private javax.swing.JLabel jLabel973;
    private javax.swing.JLabel jLabel974;
    private javax.swing.JLabel jLabel975;
    private javax.swing.JLabel jLabel976;
    private javax.swing.JLabel jLabel977;
    private javax.swing.JLabel jLabel978;
    private javax.swing.JLabel jLabel979;
    private javax.swing.JLabel jLabel980;
    private javax.swing.JLabel jLabel981;
    private javax.swing.JLabel jLabel982;
    private javax.swing.JLabel jLabel983;
    private javax.swing.JLabel jLabel984;
    private javax.swing.JLabel jLabel985;
    private javax.swing.JLabel jLabel986;
    private javax.swing.JLabel jLabel987;
    private javax.swing.JLabel jLabel988;
    private javax.swing.JLabel jLabel989;
    private javax.swing.JLabel jLabel990;
    private javax.swing.JLabel jLabel991;
    private javax.swing.JLabel jLabel992;
    private javax.swing.JLabel jLabel993;
    private javax.swing.JLabel jLabel994;
    private javax.swing.JLabel jLabel995;
    private javax.swing.JLabel jLabel996;
    private javax.swing.JLabel jLabel997;
    private javax.swing.JLabel jLabel998;
    private javax.swing.JLabel jLabel999;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JTextField jTextField100;
    private javax.swing.JTextField jTextField101;
    private javax.swing.JTextField jTextField102;
    private javax.swing.JTextField jTextField103;
    private javax.swing.JTextField jTextField104;
    private javax.swing.JTextField jTextField105;
    private javax.swing.JTextField jTextField106;
    private javax.swing.JTextField jTextField107;
    private javax.swing.JTextField jTextField108;
    private javax.swing.JTextField jTextField97;
    private javax.swing.JTextField jTextField98;
    private javax.swing.JTextField jTextField99;
    private javax.swing.JTabbedPane partidosYposiciones;
    private javax.swing.JLabel pbajos01;
    private javax.swing.JLabel pbajos02;
    private javax.swing.JLabel pbajos03;
    private javax.swing.JLabel qatar01;
    private javax.swing.JLabel qatar02;
    private javax.swing.JLabel qatar03;
    private javax.swing.JLabel senegal01;
    private javax.swing.JLabel senegal02;
    private javax.swing.JLabel senegal03;
    private javax.swing.JTable tablaA;
    private javax.swing.JTable tablaB;
    private javax.swing.JTable tablaC;
    private javax.swing.JTable tablaD;
    private javax.swing.JTable tablaE;
    private javax.swing.JTable tablaF;
    private javax.swing.JTable tablaG;
    private javax.swing.JTable tablaH;
    private javax.swing.JTextField tfA01;
    private javax.swing.JTextField tfA02;
    private javax.swing.JTextField tfA03;
    private javax.swing.JTextField tfA04;
    private javax.swing.JTextField tfA05;
    private javax.swing.JTextField tfA06;
    private javax.swing.JTextField tfA07;
    private javax.swing.JTextField tfA08;
    private javax.swing.JTextField tfA09;
    private javax.swing.JTextField tfA10;
    private javax.swing.JTextField tfA11;
    private javax.swing.JTextField tfA12;
    private javax.swing.JTextField tfB01;
    private javax.swing.JTextField tfB02;
    private javax.swing.JTextField tfB03;
    private javax.swing.JTextField tfB04;
    private javax.swing.JTextField tfB05;
    private javax.swing.JTextField tfB06;
    private javax.swing.JTextField tfB07;
    private javax.swing.JTextField tfB08;
    private javax.swing.JTextField tfB09;
    private javax.swing.JTextField tfB10;
    private javax.swing.JTextField tfB11;
    private javax.swing.JTextField tfB12;
    private javax.swing.JTextField tfC01;
    private javax.swing.JTextField tfC02;
    private javax.swing.JTextField tfC03;
    private javax.swing.JTextField tfC04;
    private javax.swing.JTextField tfC05;
    private javax.swing.JTextField tfC06;
    private javax.swing.JTextField tfC07;
    private javax.swing.JTextField tfC08;
    private javax.swing.JTextField tfC09;
    private javax.swing.JTextField tfC10;
    private javax.swing.JTextField tfC11;
    private javax.swing.JTextField tfC12;
    private javax.swing.JTextField tfD01;
    private javax.swing.JTextField tfD02;
    private javax.swing.JTextField tfD03;
    private javax.swing.JTextField tfD04;
    private javax.swing.JTextField tfD05;
    private javax.swing.JTextField tfD06;
    private javax.swing.JTextField tfD07;
    private javax.swing.JTextField tfD08;
    private javax.swing.JTextField tfD09;
    private javax.swing.JTextField tfD10;
    private javax.swing.JTextField tfD11;
    private javax.swing.JTextField tfD12;
    private javax.swing.JTextField tfE01;
    private javax.swing.JTextField tfE02;
    private javax.swing.JTextField tfE03;
    private javax.swing.JTextField tfE04;
    private javax.swing.JTextField tfE05;
    private javax.swing.JTextField tfE06;
    private javax.swing.JTextField tfE07;
    private javax.swing.JTextField tfE08;
    private javax.swing.JTextField tfE09;
    private javax.swing.JTextField tfE10;
    private javax.swing.JTextField tfE11;
    private javax.swing.JTextField tfE12;
    private javax.swing.JTextField tfF01;
    private javax.swing.JTextField tfF02;
    private javax.swing.JTextField tfF03;
    private javax.swing.JTextField tfF04;
    private javax.swing.JTextField tfF05;
    private javax.swing.JTextField tfF06;
    private javax.swing.JTextField tfF07;
    private javax.swing.JTextField tfF08;
    private javax.swing.JTextField tfF09;
    private javax.swing.JTextField tfF10;
    private javax.swing.JTextField tfF11;
    private javax.swing.JTextField tfF12;
    private javax.swing.JTextField tfG01;
    private javax.swing.JTextField tfG02;
    private javax.swing.JTextField tfG03;
    private javax.swing.JTextField tfG04;
    private javax.swing.JTextField tfG05;
    private javax.swing.JTextField tfG06;
    private javax.swing.JTextField tfG07;
    private javax.swing.JTextField tfG08;
    private javax.swing.JTextField tfG09;
    private javax.swing.JTextField tfG10;
    private javax.swing.JTextField tfG11;
    private javax.swing.JTextField tfG12;
    private javax.swing.JTextField tfH01;
    private javax.swing.JTextField tfH02;
    private javax.swing.JTextField tfH03;
    private javax.swing.JTextField tfH04;
    private javax.swing.JTextField tfH05;
    private javax.swing.JTextField tfH06;
    private javax.swing.JTextField tfH07;
    private javax.swing.JTextField tfH08;
    private javax.swing.JTextField tfH09;
    private javax.swing.JTextField tfH10;
    private javax.swing.JTextField tfH11;
    private javax.swing.JTextField tfH12;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
