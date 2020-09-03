/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhandocommatrizes2;

import java.util.Scanner;

/**
 *
 * @author lwcio
 */
public class TrabalhandoComMatrizes2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Digite a quantidade de linhas da matriz: ");
            int linha = sc.nextInt();
            sc.nextLine();
            System.out.printf("Didite a quantidade de colunas da matriz: ");
            int col = sc.nextInt();
            
            int mat[][] = new int[linha][col];
            
            System.out.println("Digite os elementos da matriz");
            for(int i =0 ; i< mat.length; i++){
                for(int j =0 ; j< mat[i].length;j++){
                    mat[i][j]= sc.nextInt();
                    
                }
            }
            
            
            System.out.printf("Digite um numero para se buscado na matriz: ");
            int num = sc.nextInt();
            
            for(int i =0; i< mat.length;i++){
                for(int j =0; j< mat[i].length;j++){
                    if(mat[i][j]==num){
                        
                        System.out.printf("Position" + i +","+j);
                        if (j > 0) {
                            System.out.println("Left: " + mat[i][j-1]);
                        }
                        if (i > 0) {
                            System.out.println("Up: " + mat[i-1][j]);
                        }
                        if (j < mat[i].length-1) {
                            System.out.println("Right: " + mat[i][j+1]);
                        }
                        if (i < mat.length-1) {
                            System.out.println("Down: " + mat[i+1][j]);
                        }
                        
                        
                    }
                }
            }
        }
        
    }
    
}
