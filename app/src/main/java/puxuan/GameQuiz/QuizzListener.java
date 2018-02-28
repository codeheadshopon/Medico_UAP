package puxuan.GameQuiz;

import puxuan.GameQuiz.model.QuizzContent;
import puxuan.GameQuiz.model.QuizzQuestion;

/**
 * Created by etien on 10/02/2016.
 */
public interface QuizzListener {
    void nextQuestion();
    QuizzQuestion getCurrentQuestion();
    QuizzContent getQuizzContent();

}
