package devnata;

import java.util.Arrays;

public class Array {
    private int[] items;
    private int count; //number of items in the array

    public Array(int length){
        items = new int[length];
    }

    public void insert (int item){
        //if the array is full, resize it
        if (items.length == count){
            //create a new array - twice the size
            int[] newItems = new int[count * 2];

            // copy all the existing items to it
            for (int i = 0; i < count; i++){
                newItems[i] = items[i];
            }
            //set "items" to this new array
            items = newItems;
        }
        //add the new item at the end
        items[count++] = item;
        //count++;
    }

    public void removeAt(int index){
        // Validate the index
        if (index < 0 || index >= count){
            throw  new IllegalArgumentException();
        }
        //Shift the items to the left to fill the hole
        for (int i = index; i < count-1; i++) //System.arraycopy(items, index + 1, items, index, count - index);
            items[i] = items[i + 1];
        count--; //delete the last empty index
    }

    public int searchIndex(int item) {
        //if found, return item, if not, return -1
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;

        return -1;
    }

    public void printArray(){

        this.insert(1);
        this.insert(2);
        this.insert(3);
        System.out.println("Posição do item no array:" + this.searchIndex(5));

        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }

        System.out.println(Arrays.toString(items));
       // System.out.println(count);

        }
    }

