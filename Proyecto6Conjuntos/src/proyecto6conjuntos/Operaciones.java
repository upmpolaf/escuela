
package proyecto6conjuntos;

import java.util.Scanner;


public class Operaciones {
    static int[] A;
    static int[] B;
    
    public void ejecutar(){
        /*
        crear();
        union(A,B);
        interseccion(A,B);
        diferencia(A,B);
        */
        
        
    }
    public void crear(){
        int t1;
        int t2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Tamaño de  A");
        t1 = leer.nextInt();
        System.out.println("Tamaño de  B");
        t2 = leer.nextInt();
        
        A = new int[t1]; 
        B = new int[t2]; 
        
        A= leer(t1, 'A');
        B= leer(t2, 'B');
    }
    public int[] leer(int t,char nom){
       int[] arre = new int[t];
        Scanner leer = new Scanner(System.in);
        
        for(int i=0;i<t
                ;i++){
            System.out.println("INGRESE VALOR DE"+nom);
            arre[i] = leer.nextInt();
        }
        return arre;
    }
    
    public boolean pertenece(int x, int[] q){
        boolean p=false;
        
        for(int i=0;i<q.length;i++){
            if(x==q[i]){
                p=true;
            }
        }
        return p;
    }
   public void union(int[] p, int[] q){
       int[] c = new int[p.length+q.length];
       int cont = 0;
       int j = 0;
       for(int i=0;i<p.length;i++){
           if(pertenece(p[i],q)){
               cont++;
           }else{
               c[j] = p[i];
               j++;
               }
       }
       for(int i=0;i<q.length;i++){
           c[j] = q[i];
               j++;
       
       }
       int[] aux =  new int[c.length-cont];
       for(int i=0;i<aux.length;i++){
           aux[i]=c[i];
       }
       
       imprimir(aux);
       
   }
   
    public void interseccion(int[] p, int [] q){
    int [] c;
    int j = 0;
            if (p.length<=q.length) {
                c= new int [p.length];
                
            }else{
                 c= new int [q.length];
            }
            for (int i = 0; i <p.length ; i++) {
                if (pertenece(p[i],q) ) {
                    c[j] = p [i];
                    j++;
                    
                }
                
            }
            int[]aux = new int [j];
            for (int i = 0; i < j; i++) {
                aux[i]= c[i];
            
        }
            imprimir(aux);
}
    
    
     public void diferencia (int[] p, int [] q){
        int [] c;
    int j = 0;
            if (p.length<=q.length) {
                c= new int [p.length];
                
            }else{
                 c= new int [q.length];
            }
            for (int i = 0; i <p.length ; i++) {
                if (!pertenece(p[i],q) ) {
                    c[j] = p [i];
                    j++;
                    
                }
                
            }
            int[]aux = new int [j];
            for (int i = 0; i < j; i++) {
                aux[i]= c[i];
            
        }
            imprimir(aux);
    }
    public void diferenciaSimetrica(int []p , int [] q){
        boolean igual=false;
        int pos=0;
        int aux [] = new int[p.length+q.length];
        for(int i =0;i<p.length;i++){
            aux[pos] = p[i];
            pos++;
        }
        for(int j =0;j<q.length;j++){
            aux[pos] = q[j];
            pos++;
        }
        for(int i =0;i<p.length;i++){
        for(int j =0;j<q.length;j++){
            if(p[i]!=q[j]){
                for(int k =0;k<aux.length;k++){
                    if(p[i]==aux[k]){
                        aux[k]=-1;
                    }
                }
            }
        }
        }
        for(int k =0;k<aux.length;k++){
            if(aux[k]!=-1){
                System.out.print(aux[k]);
            }
        }
            System.out.println("]");
        
        
        
        
        
    }
   public void imprimir (int[] q ){
       System.out.println("\t");
       System.out.println("El resultado es el siguiete:  ");
       
       for(int i=0;i<q.length;i++){
           System.out.print(q[i]);
           if(i<(q.length-1)){
               System.out.print(", ");
           }
       }
       System.out.println("...");
   }
   
   
}
