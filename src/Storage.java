import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Storage<T extends Number> {
    private int size;
private T[]arr;
    public Storage(int size){
        this.size=size;
        arr= (T[]) new Number[size];
        Arrays.fill(arr,0);
    }
    public void showStorage()
    {
        System.out.print("[");
        for (int i=0;i<size;i++)
            System.out.print(arr[i]+",");
        System.out.print("]");
    }
    Random r=new Random();
    public void fillStorage(T number, int index)
    {
        for(int i=0;i<size;i++)
            if(index==i)arr[index]=number;
    }
    public void addNextEl(T number,int index)
    {

       int tmpIndex=index;
       if(tmpIndex>size)tmpIndex=size;
       T[] newArr=(T[])new Number[size+1];
       for(int i=0;i<tmpIndex;i++)
           newArr[i]=arr[i];
       newArr[tmpIndex]=number;
       for (int i=tmpIndex;i<size;i++)
           newArr[i+1]=arr[i];
       arr=newArr;
       size++;
    }
    public void throwByIndex(int index)
    {
        for(int i=0;i<size;i++)
            if(index==i)arr[i]=null;
    }
    public void removeByIndex(int index)
    {
        int tmpIndex=index;
        if(size==1)return;
        else if(tmpIndex>=size)tmpIndex=size-1;
        else if(tmpIndex<0)tmpIndex=0;
        T[]newArr=(T[])new Number[size-1];
        for(int i=0;i<size;i++) {
            if (i < tmpIndex) newArr[i] = arr[i];
            else if (i > tmpIndex) newArr[i - 1] = arr[i];
        }
        arr=newArr;
        size--;
    }


}
