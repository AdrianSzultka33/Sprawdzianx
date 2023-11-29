package workshop;
import java.util.ArrayList;
import java.util.List;

public class Worker {

    public void start() {
        Tool pila = new Tool( "pila");
        pila.useTool();
        Tool jajko = new Tool("jajko");

        List<Tool> tools = new ArrayList<>();
        tools.add(pila);
        tools.add(jajko);

        for (Tool tool: tools) {
            tool.useTool();
        }
    }

}