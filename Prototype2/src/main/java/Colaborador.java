import java.util.ArrayList;
import java.util.List;

public class Colaborador implements Cloneable{

    private List<String> empList;

    public Colaborador(){
        empList = new ArrayList<String>();
    }

    public Colaborador(List<String> list){
        this.empList=list;
    }
    public void loadData(){

        empList.add("Luis Sakamoto");
        empList.add("Marcelo Malevolente");
        empList.add("Mauricio Calsinea");
        empList.add("Paula Oliveira");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<String>();
        for(String s : this.getEmpList()){
            temp.add(s);
        }
        return new Colaborador(temp);
    }

}