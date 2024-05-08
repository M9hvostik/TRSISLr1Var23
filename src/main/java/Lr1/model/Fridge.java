/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lr1.model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 0
 */
public class Fridge {
    private static Fridge instance;
    private int maxSizeFridge = 10;
    private List<Product> fridge = new ArrayList<>(maxSizeFridge);
    
    private Fridge() {};
    
    public static Fridge getInstance() 
    {
        if (instance == null) {
          instance = new Fridge();
        }
        return instance;
   }
    
    public List<Product> setMaxSizeFridge(int size)
    {
        maxSizeFridge = size;
        int currentSize = fridge.size();
        List<Product> removedProducts = new ArrayList<>();
        while(maxSizeFridge<currentSize)
        {
            removedProducts.add(fridge.remove(currentSize-1));
            currentSize-=1;
        }
        return removedProducts;
    }
    
    public boolean putProduct(Product product)
    {
        if (fridge.size() < maxSizeFridge)
        {
            fridge.add(product);
            return true;
        }
        return false;
    }
    
    public boolean putProduct(String name, String productionDate, String expirationDate) throws ParseException
    {
        if (fridge.size() < maxSizeFridge)
        {
            fridge.add(new Product(name,productionDate, expirationDate));
            return true;
        }
        return false;
    }
    
    public Product takeProduct(int index)
    {

        return fridge.remove(index);       
    }
    
    public Product takeProduct(Product product)
    {
        int index = fridge.indexOf(product);
        if(index == -1)
            return null;
        
        return fridge.remove(index);
        
    }
    
    public Product takeProduct(String name, String productionDate, String expirationDate) throws ParseException
    {
        Product product = new Product(name, productionDate, expirationDate);
        int index = fridge.indexOf(product);
        if(index == -1)
            return null;
        
        return fridge.remove(index);
        
    }
    
    public final List<Product> getFridge()
    {
        return fridge;
    }
    
    public int getMaxSizeFridge()
    {
        return maxSizeFridge;
    }
    public void updateProduct(int index, String name,String productionDate, String expirationDate ) throws ParseException
    {
        Product product = fridge.get(index);
        product.setName(name);
        product.setProductionDate(productionDate);
        product.setExpirationDate(expirationDate);
   
    }
    
}