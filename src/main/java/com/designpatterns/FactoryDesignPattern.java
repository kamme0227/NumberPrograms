package com.designpatterns;

public class FactoryDesignPattern {

    public static void main(String[] args)
    {
      ProfessionFactory professionFactory=new ProfessionFactory();

      Profession doc=professionFactory.getProfession("doctor");
      doc.print();
    }
}
