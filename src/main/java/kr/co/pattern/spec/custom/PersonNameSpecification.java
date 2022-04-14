package kr.co.pattern.spec.custom;

import kr.co.pattern.Person;
import kr.co.pattern.spec.AbstractSpecification;

public class PersonNameSpecification extends AbstractSpecification<Person> {

    @Override
    public boolean isSatisfiedBy(Person candidate) {
        return candidate.getName().equals("김상현");
    }
}
