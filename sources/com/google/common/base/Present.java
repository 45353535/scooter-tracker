package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class Present<T> extends Optional<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f28930b;

    Present(Object obj) {
        this.f28930b = obj;
    }

    @Override // com.google.common.base.Optional
    public Set<T> asSet() {
        return Collections.singleton(this.f28930b);
    }

    @Override // com.google.common.base.Optional
    public boolean equals(Object obj) {
        if (obj instanceof Present) {
            return this.f28930b.equals(((Present) obj).f28930b);
        }
        return false;
    }

    @Override // com.google.common.base.Optional
    public T get() {
        return (T) this.f28930b;
    }

    @Override // com.google.common.base.Optional
    public int hashCode() {
        return this.f28930b.hashCode() + 1502476572;
    }

    @Override // com.google.common.base.Optional
    public boolean isPresent() {
        return true;
    }

    @Override // com.google.common.base.Optional
    public T or(T t10) {
        Preconditions.checkNotNull(t10, "use Optional.orNull() instead of Optional.or(null)");
        return (T) this.f28930b;
    }

    @Override // com.google.common.base.Optional
    public T orNull() {
        return (T) this.f28930b;
    }

    @Override // com.google.common.base.Optional
    public String toString() {
        return "Optional.of(" + this.f28930b + ")";
    }

    @Override // com.google.common.base.Optional
    public <V> Optional<V> transform(Function<? super T, V> function) {
        return new Present(Preconditions.checkNotNull(function.apply((Object) this.f28930b), "the Function passed to Optional.transform() must not return null."));
    }

    @Override // com.google.common.base.Optional
    public Optional<T> or(Optional<? extends T> optional) {
        Preconditions.checkNotNull(optional);
        return this;
    }

    @Override // com.google.common.base.Optional
    public T or(Supplier<? extends T> supplier) {
        Preconditions.checkNotNull(supplier);
        return (T) this.f28930b;
    }
}
