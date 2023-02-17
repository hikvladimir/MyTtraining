package task_arr;

public class Array1 {
    public static void main(String[] args) {
        String text = "Каждый  охотник желает знать, где сидит фазан";
        String[] color = text.split(",?\\s+");
        for (int i=0; i<color.length; i++) {
            System.out.println(color[i]);

        }
        System.out.println();
        String bk;
        int y=0;
        for (int x=(color.length-1); x>0; x--) {
            bk=color[y];
            color[y]=color[x];
            color[x]=bk;
            ++y;
            if (y>x) break;

        }
        for (int i=0; i<color.length; i++) {
            System.out.println(color[i]);

        }


    }
}

