package com.designpatterns;

public class ProfessionFactory {

    public Profession getProfession(String typeOfProfession)
    {
        if(typeOfProfession==null)
        {
            return null;
        }
        if (typeOfProfession.equalsIgnoreCase("doctor"))
        {
            return new Doctor();
        }
        else if(typeOfProfession.equalsIgnoreCase("teacher"))
        {
            return new Teacher();
        }
        return null;
    }
}
