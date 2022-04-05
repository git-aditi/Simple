package com.company.java.organisms;

public class AnimalTrainer {

	public Animal teach(Animal anim) { // Covariant method
		// argument (Animal anim) and return type public (Animal) teach

		// do animal things
		anim.move();
		anim.eat();

		if (anim instanceof Cat) {
			Cat cat = (Cat) anim;
			cat.meow();
		} else if (anim instanceof Dog) {
			Dog dog = (Dog) anim;
			dog.bark();
		}

		return anim;
	}

}
