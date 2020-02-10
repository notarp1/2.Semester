import ui.IUI;
import ui.TUI;
import data.IData;
import data.DemoData;
import data.DemoDataArray;

public class Main {
    public static void main(String[]  args) {
        boolean ListAllowed = false;
        IData data;
        if (ListAllowed)
            data = new DemoData();
        else
            data = new DemoDataArray();

        IUI ui = new TUI(data);
        while (true){
            ui.showMenu();
        }
    }
}
