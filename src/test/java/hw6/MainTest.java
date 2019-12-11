package hw6;

import hw6.DayOfWeek;
import hw6.Family;
import hw6.Human;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    private Human father;
    private Human mother;
    private Human child1;
    private Family family;

    @Before
    public void before() {
        this.father = new Human("Donatello","Cell", 1960) ;
        this.mother = new Human("April","Cell", 1970);
        this.child1 = new Human("Michelangelo","Cell", 1994, 90, new String[][]{{DayOfWeek.SUNDAY.name(), "Task_1"}, {DayOfWeek.FRIDAY.name(), "Task_2"}});
        this.family = new Family(father, mother);
    }

    @Test
    public void toStringTest() {
        assertEquals("Human{name='Donatello', surname='Cell', year=1960}", father.toString());
        System.out.println("toString test passed");
    }

    @Test
    public void checkAddChild() {
        family.addChild(child1);
        assertEquals(1, family.getChildren().length);
        assertEquals(family, child1.getFamily());
        System.out.println("addChild test passed");
    }


    @Test
    public void checkDeleteChild() {
        family.addChild(child1);
        assertEquals(1, family.getChildren().length);
        family.deleteChild(0);
        assertEquals(0, family.getChildren().length);
        System.out.println("deleteChild1 test passed");
    }

    @Test
    public void checkDeleteChild2() {
        family.addChild(child1);
        assertEquals(1, family.getChildren().length);
        family.deleteChild(1);
        assertEquals(1, family.getChildren().length);
        System.out.println("deleteChild2 test passed");
    }

    @Test
    public void countFamily() {
        assertEquals(2, family.countFamily());
        System.out.println("countFamily test passed");
    }
}
