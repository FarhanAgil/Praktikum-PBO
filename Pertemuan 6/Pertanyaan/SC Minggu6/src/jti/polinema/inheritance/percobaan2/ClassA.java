/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.inheritance.percobaan2;

/**
 *
 * @author ASUS
 */
public class ClassA {
  public int x;
  public int y;
  
  public void setX(int x){
  this.x = x;    
  }
  public void setY(int y){
  this.y = y;   
  }
  public void getNilai(){
      System.out.println("Nilai x:" + x);
      System.out.println("Nilai Y:" + y);
  }
}
