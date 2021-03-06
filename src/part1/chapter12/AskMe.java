package part1.chapter12;

import java.util.Random;

// Перечисление возможных ответов
enum Answers {
    NO, YES, MAYBE, LATER, SOON, NEVER
}

class Question {
    Answers ask() {
        Random rand = new Random();
        int prob = (int) (100 * rand.nextDouble());

        if (prob < 15) {
            return Answers.MAYBE; // 15%
        } else if (prob < 30) {
            return Answers.NO; // 15%
        } else if (prob < 60) {
            return Answers.YES; // 30%
        } else if (prob < 75) {
           return Answers.LATER; // 15%
        } else if (prob < 98) {
            return Answers.SOON; // 13%
        } else {
            return Answers.NEVER; // 2%
        }
    }
}
public class AskMe {
    static void answer(Answers result) {
        switch (result) {
            case NO -> System.out.println("Нет");
            case YES -> System.out.println("Да");
            case MAYBE -> System.out.println("Может быть");
            case LATER -> System.out.println("Позднее");
            case SOON -> System.out.println("Вскоре");
            case NEVER -> System.out.println("Никогда");
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
