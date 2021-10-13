package devnata;

import java.util.ArrayList;

public class ModArrayList<Data> extends ArrayList<Data> {

    public Data getUsingMod(int index){
        int validIndex = Math.abs(index) % this.size();
        return this.get(validIndex);
    }

    @Override
    public void add(int index, Data element) {
        super.add(index, element);
    }
}
