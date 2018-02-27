import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class SampleEmptyTest {

    @TestComment(commentText = "new comment", commentAuthor = "Dima")
    @TestCase(id = "QAAUT-136") // добавь к этому Java методу информацию под категорией TestCase со значением id=QAAUT-136
    @Test
    public void sampleTest() {

        /*
        * Вот этот блок кода можно применить что бы получить аннотации над методом.
        */
     /*   Class myClass = SampleEmptyTest.class; //
        Method method = null; //
        try {
            method = myClass.getMethod("sampleTest"); // спрашиваем Java: "Как называется, метод внутри которого
            // ты сейчас выполняешь этот кусочек кода". Проще говоря - "Где я выполнился?"
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        TestCase testCaseAnnotation = method.getAnnotation(TestCase.class); // Где бы я не выполнялся, Java верни
        // аннотацию из метода в котором я выполняюсь. Похожим образом можно сделать для класса.
        System.out.println("ANNOTATION: " + testCaseAnnotation);
        System.out.println("Test Case id: " + testCaseAnnotation.id()); // верни значение внутри аннотации*/
    }

}
