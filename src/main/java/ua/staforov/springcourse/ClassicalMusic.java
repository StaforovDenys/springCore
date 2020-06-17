package ua.staforov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
//@Scope("singleton")
//@Scope("prototype")

public class ClassicalMusic implements Music {
    @PreDestroy
    public void doMyInit(){
        System.out.println("Doing my initialization");
   }
   @PreDestroy
   public void doMyDestroy(){
       System.out.println("Doing my destroying");
   }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
