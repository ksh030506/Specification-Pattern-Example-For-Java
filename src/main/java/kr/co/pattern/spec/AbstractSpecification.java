package kr.co.pattern.spec;

public abstract class AbstractSpecification<T> implements Specification<T> {

    public Specification and(Specification other) {
        return new AndSpecification<T>(this, other);
    }

    public Specification or(Specification other) {
        return new OrSpecification<T>(this, other);
    }

    public Specification not() {
        return new NotSpecification<T>(this);
    }

}
