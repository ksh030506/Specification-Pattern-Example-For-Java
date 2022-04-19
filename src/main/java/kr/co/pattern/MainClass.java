package kr.co.pattern;

import kr.co.pattern.spec.AndSpecification;
import kr.co.pattern.spec.custom.PersonAgeSpecification;
import kr.co.pattern.spec.custom.PersonNameSpecification;

public class MainClass {
    public static void main(String[] args) {
        Person man = new Person("김상현", 20);
        Person woman = new Person("김상현", 9);

        AndSpecification<Person> andSpecification = AndSpecification.of(new PersonAgeSpecification(), new PersonNameSpecification());
        boolean satisfiedBy1 = andSpecification.isSatisfiedBy(man);
        boolean satisfiedBy2 = andSpecification.isSatisfiedBy(woman);
        System.out.println("satisfiedBy1 = " + satisfiedBy1);
        System.out.println("satisfiedBy2 = " + satisfiedBy2);
    }
}
