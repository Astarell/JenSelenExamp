import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class Test1 {

    @Test
    @Tag("Group1")
    public void test1(){
        System.out.println("Test 1 MASTER");
    }

    @Test
    @Tag("Group2")
    public void test2(){
        System.out.println("Test 2 MASTER");
    }
}
