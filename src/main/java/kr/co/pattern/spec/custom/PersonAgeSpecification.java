package kr.co.pattern.spec.custom;

import kr.co.pattern.Person;
import kr.co.pattern.spec.AbstractSpecification;

public class PersonAgeSpecification extends AbstractSpecification<Person> {

    @Override
    public boolean isSatisfiedBy(Person candidate) {
        return candidate.getAge() >= 10;
    }

}
