import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class Test2 {

    @Test
    @Tag("Group1")
    public void test1(){
        System.out.println("Test 3 MASTER");
    }

    @Test
    @Tag("Group2")
    public void test2(){
        System.out.println("Test 4 MASTER");
    }
}
