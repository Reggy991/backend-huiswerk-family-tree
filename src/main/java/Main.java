public class Main {
    public static void main(String[] args) {
        Person mother1 = new Person("Reggy", "Haverkort - van Liempd", "vrouw", 31);
        Person father1 = new Person("Beau", "Haverkort", "man", 34);
        Person child1 = new Person("Ryo", "Haverkort", "man", 0);
        Person sibling1 = new Person("Bodhi", "Haverkort", "vrouw", 0);
        Pet pet1 = new Pet("Goa", 2, "Beagle");
        Person child2 = new Person("Pietje", "Puk", "man", -1);

        child1.addParents(child1, mother1, father1);
        mother1.addPet(mother1, pet1);
        child1.addSibling(child1, sibling1);
        child2.addParents(child2, sibling1, child1);

        System.out.println(child1.getMother().getName());
        System.out.println(child1.getFather().getName());
        System.out.println(mother1.getChildren().get(0).getName());
        System.out.println(father1.getChildren().get(0).getName());

        System.out.println(mother1.getPets().get(0).getName());

        System.out.println(child1.getSiblings().get(0).getName());

        System.out.println(child2.getMother().getName());

        String outputGrandchild = mother1.getGrandChildren().get(0).getName();
        System.out.println(outputGrandchild);
    }
}
