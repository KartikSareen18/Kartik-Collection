package List;

import java.util.AbstractList;
import java.util.Arrays;

public class List<E> extends AbstractList<E>{
    private int size = 0;
    private Object dataList[];
    private int i = 0;

    public List(){
        dataList = new Object[10];
        i=0;
    }

    public E get(int index){
        return (E)dataList[index];
    }

    public boolean add(E e){
        dataList[i]=e;
        i++;
        if(i>=size)
            increaseSize();
        return true;
    }

    public E remove(int index){
        if(size< index)
            return null;
        Object x=dataList[index];
        for(int j=index;j<size-1;j++)
            dataList[j]=dataList[j+1];
        i--;
        size--;
        return (E)x;
    }

    public int size() {
        return size;
    }

    private void increaseSize(){
        size=dataList.length*2;
        dataList=Arrays.copyOf(dataList,size);
    }

    public String toString(){
        String str="";
        for (int j = 0; j < i; j++)
            str=str+dataList[j]+" ";
        return str;
    }
}