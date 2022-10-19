package by.tc.task01.service.validation.validators;

import by.tc.task01.service.validation.ValueValidator;

import java.awt.*;

public class ColorValidator implements ValueValidator {
    @Override
    public boolean validate(Object obj) {
        try{
            return Color.getColor((String)obj) != null;
        }
        catch (Exception e){
            return false;
        }
    }
}
