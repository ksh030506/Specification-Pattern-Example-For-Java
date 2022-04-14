package kr.co.pattern.spec;

public class OrSpecification<T> extends AbstractSpecification<T> {
    private final Specification<T> some;
    private final Specification<T> other;

    public OrSpecification(Specification<T> some, Specification<T> other) {
        this.some = some;
        this.other = other;
    }

    @Override
    public Specification<T> not() {
        return null;
    }

    public boolean isSatisfiedBy(T candidate) {
        return some.isSatisfiedBy(candidate) || other.isSatisfiedBy(candidate);
    }
}
