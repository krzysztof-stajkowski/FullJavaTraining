package org.example.ZadaniaZKamilem.konstruktory;

    class Cat {
        private String name;
        private int age;

        public Cat(){
        }

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    class Dog {
        private String name;
        private int age;

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public static void main(String[] args) {
            Cat cat = new Cat("Puszek", 15);
            Dog dog = new Dog("Azor", 14);
            System.out.println(cat.toString());
            System.out.println(dog.toString());
        }
    }
