package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.errorprone.annotations.Immutable;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@Immutable
@Beta
@ElementTypesAreNonnullByDefault
public final class ElementOrder<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Type f30600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Comparator f30601b;

    public enum Type {
        UNORDERED,
        STABLE,
        INSERTION,
        SORTED
    }

    private ElementOrder(Type type, Comparator comparator) {
        this.f30600a = (Type) Preconditions.checkNotNull(type);
        this.f30601b = comparator;
        Preconditions.checkState((type == Type.SORTED) == (comparator != null));
    }

    public static <S> ElementOrder<S> insertion() {
        return new ElementOrder<>(Type.INSERTION, null);
    }

    public static <S extends Comparable<? super S>> ElementOrder<S> natural() {
        return new ElementOrder<>(Type.SORTED, Ordering.natural());
    }

    public static <S> ElementOrder<S> sorted(Comparator<S> comparator) {
        return new ElementOrder<>(Type.SORTED, (Comparator) Preconditions.checkNotNull(comparator));
    }

    public static <S> ElementOrder<S> stable() {
        return new ElementOrder<>(Type.STABLE, null);
    }

    public static <S> ElementOrder<S> unordered() {
        return new ElementOrder<>(Type.UNORDERED, null);
    }

    ElementOrder a() {
        return this;
    }

    Map b(int i10) {
        int iOrdinal = this.f30600a.ordinal();
        if (iOrdinal == 0) {
            return Maps.newHashMapWithExpectedSize(i10);
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return Maps.newLinkedHashMapWithExpectedSize(i10);
        }
        if (iOrdinal == 3) {
            return Maps.newTreeMap(comparator());
        }
        throw new AssertionError();
    }

    public Comparator<T> comparator() {
        Comparator<T> comparator = this.f30601b;
        if (comparator != null) {
            return comparator;
        }
        throw new UnsupportedOperationException("This ordering does not define a comparator.");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ElementOrder)) {
            return false;
        }
        ElementOrder elementOrder = (ElementOrder) obj;
        return this.f30600a == elementOrder.f30600a && Objects.equal(this.f30601b, elementOrder.f30601b);
    }

    public int hashCode() {
        return Objects.hashCode(this.f30600a, this.f30601b);
    }

    public String toString() {
        MoreObjects.ToStringHelper toStringHelperAdd = MoreObjects.toStringHelper(this).add("type", this.f30600a);
        Comparator comparator = this.f30601b;
        if (comparator != null) {
            toStringHelperAdd.add("comparator", comparator);
        }
        return toStringHelperAdd.toString();
    }

    public Type type() {
        return this.f30600a;
    }
}
