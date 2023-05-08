import java.util.ArrayList;

/**
 * Escreva uma descrição da classe MenuSobremesa aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class MenuSobremesa extends Menu
{
    public String getName(){
        return "Menu sobremesa";
    }
    
    public String getDescription(){
        return "As melhores sobremesas que seu paladar pode querer";
    }
    
    public double getPrice() {
        return super.getPrice();
    }
}
