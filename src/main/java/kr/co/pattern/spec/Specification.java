package kr.co.pattern.spec;

public interface Specification<T> {
    Specification and(Specification other);
    Specification or(Specification other);
    Specification not();
    boolean isSatisfiedBy(T candidate);
}