package kr.co.pattern.spec;

import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper = true)
@Value(staticConstructor = "of")
public class AndSpecification<T> extends AbstractSpecification<T> {
    Specification some;
    Specification other;

    public boolean isSatisfiedBy(T candidate) {
        return some.isSatisfiedBy(candidate) && other.isSatisfiedBy(candidate);
    }
}