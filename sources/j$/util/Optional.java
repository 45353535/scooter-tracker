package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class Optional<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Optional f84798b = new Optional();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f84799a;

    public Optional() {
        this.f84799a = null;
    }

    public static <T> Optional<T> empty() {
        return f84798b;
    }

    public Optional(Object obj) {
        this.f84799a = Objects.requireNonNull(obj);
    }

    public static <T> Optional<T> of(T t10) {
        return new Optional<>(t10);
    }

    public static <T> Optional<T> ofNullable(T t10) {
        return t10 == null ? empty() : of(t10);
    }

    public T get() {
        T t10 = (T) this.f84799a;
        if (t10 != null) {
            return t10;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean isPresent() {
        return this.f84799a != null;
    }

    public <U> Optional<U> map(Function<? super T, ? extends U> function) {
        Objects.requireNonNull(function);
        if (!isPresent()) {
            return empty();
        }
        return ofNullable(function.apply((Object) this.f84799a));
    }

    public T orElse(T t10) {
        T t11 = (T) this.f84799a;
        return t11 != null ? t11 : t10;
    }

    public T orElseGet(Supplier<? extends T> supplier) {
        T t10 = (T) this.f84799a;
        return t10 != null ? t10 : supplier.get();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public <X extends Throwable> T orElseThrow(Supplier<? extends X> supplier) throws X {
        T t10 = (T) this.f84799a;
        if (t10 != null) {
            return t10;
        }
        throw supplier.get();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return Objects.equals(this.f84799a, ((Optional) obj).f84799a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f84799a);
    }

    public final String toString() {
        Object obj = this.f84799a;
        if (obj != null) {
            return String.format("Optional[%s]", obj);
        }
        return "Optional.empty";
    }
}
