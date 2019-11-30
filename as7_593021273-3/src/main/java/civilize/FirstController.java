package civilize;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class FirstController {
 
        
    @GetMapping("/Cal")
    public String BMI(Model BMI,@RequestParam("Weight")Float weight,@RequestParam("Height")Float height) {
    	
    	float h = height/100;
    	float bmi = weight/(h*h);
    	
    	if (bmi>40) {
        	BMI.addAttribute("BMI","อ้วนขั้นสูงสุด ");
    	}else if(bmi >35){
    		BMI.addAttribute("BMI","อ้วนขั้นสอง");
    	}else if(bmi >28.5){
    		BMI.addAttribute("BMI","อ้วนขั้นหนึ่ง");
    	}else if(bmi >23.5){
    		BMI.addAttribute("BMI","น้ำหนักเกินเเล้ว");
    	}else if(bmi >18.5){
    		BMI.addAttribute("BMI","น้ำหนักอยู่ในเกณฑ์ปกติ");
    	}else {
    		BMI.addAttribute("BMI","น้ำหนักต่ำกว่าเกณฑ์ ");
    	}
         	
    	return"/CalBMI";
    }
   
    
    
}
