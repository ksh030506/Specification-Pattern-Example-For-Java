package kr.co.pattern.spec;

public class AndSpecification<T> extends AbstractSpecification<T> {

    private final Specification some;
    private final Specification other;

    public AndSpecification(Specification some, Specification other) {
        this.some = some;
        this.other = other;
    }

    public boolean isSatisfiedBy(T candidate) {
        return some.isSatisfiedBy(candidate) && other.isSatisfiedBy(candidate);
    }
}