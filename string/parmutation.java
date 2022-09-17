package string;

import javax.xml.validation.SchemaFactoryConfigurationError;

public class parmutation {
    public static void main(String[] args) {
        String name="thisismyname";
   String temp="is";
    String sub=name.substring(0,temp.length());
    System.out.println(sub);
    for(int i=1;i<name.length();i++){
         sub=name.substring(i,temp.length());
        if(sub.contains(temp)){
            System.out.println(i);
            break;
        }

    }
        

        
    }
    
}
