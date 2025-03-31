public class SpecialtyCoffee extends Coffee
{
    public String flavor;

    public SpecialtyCoffee(String size, boolean isSkinny, int shots, String type, String flavor){
        super(size, isSkinny, shots, type);
        this.flavor = flavor;
    }

    public SpecialtyCoffee(){
        super();
        this.flavor = "Vanilla";
    }
    
    public SpecialtyCoffee(String size, String type, String flavor){
        this.flavor = flavor;
    }


} 