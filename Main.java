/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exam;

/**
 *
 * @author Student
 */
// Main class to demonstrate the report 
public class Main { 
    // Program entry point 
    public static void main(String[] args) { 
        // Creates a Product object 
        Product product = new Product(); 
        // Records a sale of 10 Pen units 
        product.addProduct("Pen", 10); 
        // Records a sale of 20 Book units 
        product.addProduct("Book", 20); 
        // Records a sale of 5 Pencil units 
        product.addProduct("Pencil", 5); 
        // Creates a PrintProduct object linked to the product 
        PrintProduct printer = new PrintProduct(product); 
        // Prints the full sales report
                printer.printReport(); 
    } 
}
