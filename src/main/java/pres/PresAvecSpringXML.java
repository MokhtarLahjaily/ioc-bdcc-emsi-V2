package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresAvecSpringXML {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        //IMetier metier = (IMetier) ctx.getBean("metier"); // by name
        //by type
        IMetier metier =  ctx.getBean(IMetier.class);
        System.out.println("RES="+metier.calcul());

    }
}
