/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.oop.util;

/**
 *
 * @author OWNER
 */
public class CalculatorHelper
{
    public CalculatorHelper()
    {
        
    }
  public double add(double x, double y)
  {
      return x+y;
  }
  
  public double sub(double x, double y)
  {
      return x-y;
  }
  
  public double mul(double x, double y)
  {
      return x*y;
  }
  
  public double div(double x, double y)
  {
      return x/y;
  }
  
  public double powerMethod(double x, double y) 
  {
            double a=1;
            for(double i=1; i<=y; i=i+1.0)
            {
                a=a*x;
            }
            return a;
  } 
  
  public double maxMethod(double x, double y)
    {
        if(x>y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
    
    public double minMethod(double x, double y)
    {
        if(x<y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
} 
