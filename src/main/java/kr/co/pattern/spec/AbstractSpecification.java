package kr.co.pattern.spec;

public abstract class AbstractSpecification<T> implements Specification<T> {

    public Specification and(Specification other) {
        return AndSpecification.of(this, other);
    }

    public Specification or(Specification other) {
        return OrSpecification.of(this, other);
    }

    public Specification not() {
        return NotSpecification.of(this);
    }

}
