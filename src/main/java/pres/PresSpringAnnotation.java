package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("dao","metier","ext");
        IMetier metier = (IMetier) ctx.getBean("metier"); // by name
        //by type
        //IMetier metier =  ctx.getBean(IMetier.class);
        System.out.println("RES="+metier.calcul());

    }
}
