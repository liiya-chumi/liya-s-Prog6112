/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exam;
// creat an interface 
public interface IProductCalculations {
    
    // 2. Interfaces only declare the methods. They end with a semicolon (;) and have NO curly braces { }
    // 3. We pass the price in the brackets so the method has data to calculate
    double getVat(double productPrice);
    
  
    double getCommission(double productPrice);
    
    double getTotal(double productPrice);
}