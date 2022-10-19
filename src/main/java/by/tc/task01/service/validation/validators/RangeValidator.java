package by.tc.task01.service.validation.validators;

import by.tc.task01.service.validation.ValueValidator;

public class RangeValidator implements ValueValidator {
    @Override
    public boolean validate(Object obj) {
        try{
           String range = (String)obj;
           String[] nums = range.split("-");
           if (nums.length != 2)
               return false;
            for (String num : nums) {
                if (Double.parseDouble(num) < 0)
                    return false;
            }
           return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
