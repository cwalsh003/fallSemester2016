import java.util.ArrayList;

/**
 * Created by cwalsh on 9/4/16.
 */
public class Pqueue {



    public static void main(String[] args){
        Pqueue p = new Pqueue();

        p.enqueue("X", 10);
        p.enqueue("Y", 1);
        p.enqueue("Z", 3);


        System.out.println(p.dequeue());
        System.out.println(p.dequeue());
        System.out.println(p.dequeue());



    }

    private ArrayList<Pqueue> queue;
    private int priority = 0;
    private String element;

    public Pqueue(){
        this.element = "";
        this.queue = new ArrayList<>();
        this.priority = 0;
    }

    public Pqueue(String val, int ind) {
        this.element = val;
       this.priority = ind;
    }

    public void enqueue(String val, int ind) {
        queue.add(new Pqueue(val, ind));
    }
    public String dequeue(){
        int max = -99999;
        int ind = 0;
        String el = " ";
        for(Pqueue q : queue ){
            if(q.priority > max){
                max = q.priority;
                el =   q.element;
                ind = queue.indexOf(q);
            }
        }
            queue.remove(ind);
            return el;
    }
}
