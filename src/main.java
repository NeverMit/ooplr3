import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size;
        Random random=new Random();
        System.out.println("Enter size\n");
        size=scanner.nextInt();
       Storage s=new Storage(size);
        int index;
        for (int i=0;i<size;i++) {
            s.fillStorage(i+1, i);
        }
        s.showStorage();
        System.out.print("\n==============================\n");
        System.out.print("Choose the number of iterations\n1->100\n2->1000\n3->10000\n");
        int mainChoice=scanner.nextInt();
        switch (mainChoice)
        {
            case 1:
                long start=System.currentTimeMillis();
                for(int i=0;i<100;i++)
                {
                    int choice1=random.nextInt(3);
                    switch (choice1)
                    {
                        case 0:
                            int newIndex = random.nextInt(10);
                            System.out.print("\nWill be added with index " + newIndex + "\n");
                            Number newEl = random.nextInt(100);
                            System.out.print("Will be added " + newEl + "\n");
                            s.addNextEl(newEl, newIndex);
                            s.showStorage();
                            System.out.print("\n");
                            break;
                        case 1:
                            int throwIndex=random.nextInt(size-1);
                            System.out.print("Will be thrown with index "+throwIndex+"\n");
                            s.throwByIndex(throwIndex);
                            s.showStorage();
                            System.out.print("\n");
                            break;
                        case 2:
                            int removeIndex=random.nextInt(size-1);
                            System.out.print("Will be removed with index "+removeIndex+"\n");
                            s.removeByIndex(removeIndex);
                            s.showStorage();
                            System.out.print("\n");
                            break;
                    }

                }
                long finish =System.currentTimeMillis();
                long elapsed =finish-start;
                System.out.println("Time has been taken, ms : "+elapsed);
                break;
            case 2:
                long start2=System.currentTimeMillis();
                for(int i=0;i<1000;i++)
                {
                    int choice2=random.nextInt(3);
                    switch (choice2){
                        case 0:
                            int newIndex = random.nextInt(10);
                            System.out.print("\nWill be added with index " + newIndex + "\n");
                            Number newEl = random.nextInt(100);
                            System.out.print("Will be added " + newEl + "\n");
                            s.addNextEl(newEl, newIndex);
                            s.showStorage();
                            System.out.print("\n");
                            break;
                        case 1:
                            int throwIndex=random.nextInt(size-1);
                            System.out.print("Will be thrown with index "+throwIndex+"\n");
                            s.throwByIndex(throwIndex);
                            s.showStorage();
                            System.out.print("\n");
                            break;
                        case 2:
                            int removeIndex=random.nextInt(size-1);
                            System.out.print("Will be removed with index "+removeIndex+"\n");
                            s.removeByIndex(removeIndex);
                            s.showStorage();
                            System.out.print("\n");
                            break;
                    }

                }
                long finish2 =System.currentTimeMillis();
                long elapsed2 =finish2-start2;
                System.out.println("Time has been taken, ms : "+elapsed2);
                break;
            case 3:
                long start3=System.currentTimeMillis();
                for(int i=0;i<10000;i++)
                {
                    int choice3=random.nextInt(3);
                    switch (choice3){
                        case 0:
                            int newIndex = random.nextInt(10);
                            System.out.print("\nWill be added with index " + newIndex + "\n");
                            Number newEl = random.nextInt(100);
                            System.out.print("Will be added " + newEl + "\n");
                            s.addNextEl(newEl, newIndex);
                            s.showStorage();
                            System.out.print("\n");
                            break;
                        case 1:
                            int throwIndex=random.nextInt(size-1);
                            System.out.print("Will be thrown with index "+throwIndex+"\n");
                            s.throwByIndex(throwIndex);
                            s.showStorage();
                            System.out.print("\n");
                            break;
                        case 2:
                            int removeIndex=random.nextInt(size-1);
                            System.out.print("Will be removed with index "+removeIndex+"\n");
                            s.removeByIndex(removeIndex);
                            s.showStorage();
                            System.out.print("\n");
                            break;
                    }

                }
                long finish3 =System.currentTimeMillis();
                long elapsed3 =finish3-start3;
                System.out.println("Time has been taken, ms : "+elapsed3);
                break;

        }


    }



}
