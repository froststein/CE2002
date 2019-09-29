#include <iostream>  #include <string>  

using namespace std;

enum COLOR { Green, Blue, White, Black, Brown };

class Animal {
public:
	Animal() : _name("unknown") {
		cout << "constructing Animal object " << _name << endl;
	}

	Animal(string n, COLOR c) : _name(n), _color(c) {
		cout << "constructing Animal Object " << _name << " color " << _color << endl;
	}

	~Animal() {
		cout << "destructing Animal object " << _name << endl;
	}
	
	virtual void speak() const {
		cout << "Animal speaks " << endl;
	}
	virtual void move() = 0;

private:
	string _name;
	COLOR _color;
};

class Mammal :public Animal {
	public:
		virtual void eat() const {
			cout << "Mammal eat" << endl;
		}
		Mammal(){}
		Mammal(string n,COLOR c):Animal(n,c){}
		~Mammal() {
			cout << "destructing Mammal object " << endl;
		}
		void move() const {
			cout << "Mammal move" << endl;
		}
	};

class Dog :public Mammal {
	string owner;
public:
	Dog(string n, COLOR c, string o) :Mammal(n, c) { owner = o; }
	~Dog() { cout << "destructing Dog object " << endl; }
	void speak() const {
		cout << "Woof" << endl;
	}
	void move() {
		cout << "Dog move" << endl;
	}
	void eat() const { cout << "Dog eat" << endl; }
};

class Cat :public Mammal {
	string owner;
public:
	Cat(string n, COLOR c, string o) :Mammal(n, c) { owner = o; }
	~Cat() { cout << "destructing Cat object " << endl; }
	void speak() const {
		cout << "Cat Meow" << endl;
	}
	void move() {
		cout << "Cat move" << endl;
	}
	void eat() const { cout << "Cat eat" << endl; }
};

class Lion :public Mammal {
	string owner;
public:
	Lion(string n, COLOR c, string o) :Mammal(n, c) { owner = o; }
	~Lion() { cout << "destructing Lion object " << endl; }
	void speak() const {
		cout << "Lion Roar" << endl;
	}
	void move() {
		cout << "Lion move" << endl;
	}
	void eat() const { cout << "Lion eat" << endl; }
};

int main() {
	//declare array of size 3 to store animals
		//store animals in array
	int choice = 0, i = 0, j = 0;
	Animal** animals = new Animal * [3];
	animals[0] = new Dog("doggo", Blue, "steve");
	animals[1] = new Cat("catto", White, "lisa");
	animals[2] = new Lion("leo", Brown, "leon");
	// Mammal[0]= new Dog();
	// Mammal[1]= new Cat();
	// Mammal[2]= new Lion(); 
	do {
		cout << "Select the animal to send to Zoo: " << endl;
		cout << "(1)Dog (2)Cat (3)Lion (4)Move all animals (5)Quit" << endl;
		cin >> choice;
		//create switch statement
		switch (choice) {
		case 1: animals[0]->move();
			animals[0]->speak();
			//animals[0]->eat();
			break;
		case 2: animals[1]->move();
			animals[1]->speak();
			//animals[1]->eat();
			break;
		case 3: animals[2]->move();
			animals[2]->speak();
			//animals[2]->eat();
			break;
		case 4:
			for (i = 0; i < 3; i++) {
				animals[i]->move();
				animals[i]->speak();
				//animals[i]->eat();
			}
			break;
		default:
			break;
		}

	} while (choice > 0 and choice < 5);
	for (j = 0; i < 3; i++) {
		delete animals[j];
	}
	delete[] animals;
	cout << "Program exiting …. " << endl;
	return 0;
}