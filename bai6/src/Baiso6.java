/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Baiso6 {

    
    public static void main(String[] args) {
         DSSV ds=new DSSV();
        SVSP sv1=new SVSP("Nga",2000,7,"QN",7);
        SVSP sv2=new SVSP("Thơm",2000,8,"SG",8);
        ds.them(sv1);
        ds.them(sv2);
        ds.lietKe("SP");
        ds.dsTN();
    }
    }
    
