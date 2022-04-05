package com.company.java.organisms;

public class AnimalMain {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();

		AnimalTrainer trainer = new AnimalTrainer();
		trainer.teach(dog);
		trainer.teach(cat);

	}

}
