package TaskPackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Realization {
    public static String[] replace(Queue<Integer> queue, Queue<Integer> answerQ) {
        Integer el;
        while (queue.size() > 1) {
            el = queue.remove();
            answerQ.add(queue.remove());
            answerQ.add(el);
        }
        if (!queue.isEmpty()) {
            answerQ.add(queue.remove());
        }
        return makeList(answerQ);
    }

    public static String[] replaceWithQueue(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < args.length; i++) {
            queue.add(Integer.valueOf(args[i]));
        }
        Queue<Integer> q = new LinkedList<>();
        return replace(queue, q);
    }

    public static String[] replaceWithMyQueue(String[] args) {
        Queue<Integer> myQueue = new MyQueue<>();
        for (int i = 0; i < args.length; i++) {
            myQueue.add(Integer.valueOf(args[i]));
        }
        Queue<Integer> q = new MyQueue<>();
        return replace(myQueue, q);
    }

    public static String[] makeList(Queue<Integer> queue) {
        ArrayList<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            list.add(queue.remove());
        }
        String[] answerList = new String[list.size()];
        for (int i = 0; i < answerList.length; i++) {
            answerList[i] = String.valueOf(list.get(i));
        }
        return answerList;
    }
}
