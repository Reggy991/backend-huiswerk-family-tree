import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void addParents() {
        // ------------------ Arrange
        Person mother1 = new Person("Reggy", "Haverkort - van Liempd", "vrouw", 31);
        Person father1 = new Person("Beau", "Haverkort", "man", 34);
        Person child1 = new Person("Ryo", "Haverkort", "man", 0);

        // ------------------ Act
        child1.addParents(child1, mother1, father1);

        String outputMother = child1.getMother().getName();
        String outputFather = child1.getFather().getName();
        String outputChildMother = mother1.getChildren().get(0).getName();
        String outputChildFather = father1.getChildren().get(0).getName();

        // ------------------ Assert
        assertEquals("Reggy", outputMother);
        assertEquals("Beau", outputFather);
        assertEquals("Ryo", outputChildMother);
        assertEquals("Ryo", outputChildFather);
    }

    @Test
    void addChildToChildren() {

    }

    @Test
    void addPet() {
    }

    @Test
    void addSibling() {
        // ------------------ Arrange
        Person child1 = new Person("Ryo", "Haverkort", "man", 0);
        Person sibling1 = new Person("Bodhi", "Haverkort", "vrouw", 0);

        // ------------------ Act
        child1.addSibling(child1, sibling1);

        String outputSibling = child1.getSiblings().get(0).getName();

        // ------------------ Assert
        assertEquals("Bodhi", outputSibling);
    }

    @Test
    void getGrandChildren() {
        // ------------------ Arrange
        Person mother = new Person("Reggy", "Haverkort - van Liempd", "vrouw", 31);
        Person father = new Person("Beau", "Haverkort", "man", 34);
        Person child = new Person("Ryo", "Haverkort", "man", 0);
        Person grandchild = new Person("Pietje", "Puk", "man", -1);

        // ------------------ Act
        child.addParents(child, mother, father);
        grandchild.addChildToChildren(grandchild, child);
        mother.getGrandChildren();

        String outputGrandchild = mother.getGrandChildren().get(0).getName();

        // ------------------ Assert
        assertEquals("Pietje", outputGrandchild);
    }

    @Test
    void getName() {
        // ------------------ Arrange
        Person person = new Person("Reggy", "Haverkort - van Liempd", "vrouw", 31);

        // ------------------ Act
        String outputName = person.getName();

        // ------------------ Assert
        assertEquals("Reggy", outputName);
    }

    @Test
    void setName() {
    }

    @Test
    void getMiddleName() {
    }

    @Test
    void setMiddleName() {
    }

    @Test
    void getLastName() {
    }

    @Test
    void setLastName() {
    }

    @Test
    void getSex() {
    }

    @Test
    void setSex() {
    }

    @Test
    void getAge() {
    }

    @Test
    void setAge() {
    }

    @Test
    void getMother() {
    }

    @Test
    void setMother() {
    }

    @Test
    void getFather() {
    }

    @Test
    void setFather() {
    }

    @Test
    void getSiblings() {
    }

    @Test
    void setSiblings() {
    }

    @Test
    void getChildren() {
    }

    @Test
    void setChildren() {
    }

    @Test
    void getPets() {
    }

    @Test
    void setPets() {
    }

}