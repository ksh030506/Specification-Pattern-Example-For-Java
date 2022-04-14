package kr.co.pattern.spec;

public class aa extends AndSpecification<String> {


    public aa(Specification<String> some, Specification<String> other) {
        super(some, other);
    }
}
