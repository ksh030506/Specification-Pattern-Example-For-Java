package kr.co.pattern.spec;

import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper = true)
@Value(staticConstructor = "of")
public class NotSpecification<T> extends AbstractSpecification<T> {
    Specification wrapped;

    public boolean isSatisfiedBy(T candidate) {
        return !wrapped.isSatisfiedBy(candidate);
    }
}
