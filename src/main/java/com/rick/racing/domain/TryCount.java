package com.rick.racing.domain;

import java.util.Objects;

public class TryCount {

    private static final int MIN_TRY_COUNT = 0;
    private static final String EXCEPTION_MESSAGE_MINIMUM_TRY_COUNT = "시도 수는 0보다 커야 합니다.";

    private final int value;

    private TryCount(final int count) {
        this.value = count;
    }

    public static TryCount create(final int value) {
        if (value <= MIN_TRY_COUNT) {
            throw new IllegalArgumentException(EXCEPTION_MESSAGE_MINIMUM_TRY_COUNT);
        }
        return new TryCount(value);
    }

    @Override
    public boolean equals(Object target) {
        if (this == target) {
            return true;
        }
        if (target == null || getClass() != target.getClass()) {
            return false;
        }
        TryCount tryCount = (TryCount) target;
        return value == tryCount.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public TryCount increase() {
        return TryCount.create(this.value + 1);
    }
}