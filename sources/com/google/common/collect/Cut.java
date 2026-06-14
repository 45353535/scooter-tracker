package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class Cut<C extends Comparable> implements Comparable<Cut<C>>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Comparable f29411b;

    /* JADX INFO: renamed from: com.google.common.collect.Cut$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29412a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f29412a = iArr;
            try {
                iArr[BoundType.CLOSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29412a[BoundType.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static final class AboveAll extends Cut<Comparable<?>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final AboveAll f29413c = new AboveAll();

        private AboveAll() {
            super("");
        }

        private Object readResolve() {
            return f29413c;
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public int compareTo(Cut<Comparable<?>> cut) {
            return cut == this ? 0 : 1;
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.google.common.collect.Cut
        void k(StringBuilder sb2) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        void l(StringBuilder sb2) {
            sb2.append("+∞)");
        }

        @Override // com.google.common.collect.Cut
        Comparable m() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.Cut
        Comparable n(DiscreteDomain discreteDomain) {
            return discreteDomain.maxValue();
        }

        @Override // com.google.common.collect.Cut
        boolean o(Comparable comparable) {
            return false;
        }

        @Override // com.google.common.collect.Cut
        Comparable q(DiscreteDomain discreteDomain) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        BoundType r() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        BoundType s() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        Cut t(BoundType boundType, DiscreteDomain discreteDomain) {
            throw new AssertionError("this statement should be unreachable");
        }

        public String toString() {
            return "+∞";
        }

        @Override // com.google.common.collect.Cut
        Cut u(BoundType boundType, DiscreteDomain discreteDomain) {
            throw new IllegalStateException();
        }
    }

    private static final class AboveValue<C extends Comparable> extends Cut<C> {
        AboveValue(Comparable comparable) {
            super((Comparable) Preconditions.checkNotNull(comparable));
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((Cut) obj);
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return ~this.f29411b.hashCode();
        }

        @Override // com.google.common.collect.Cut
        Cut j(DiscreteDomain discreteDomain) {
            Comparable comparableQ = q(discreteDomain);
            return comparableQ != null ? Cut.i(comparableQ) : Cut.d();
        }

        @Override // com.google.common.collect.Cut
        void k(StringBuilder sb2) {
            sb2.append('(');
            sb2.append(this.f29411b);
        }

        @Override // com.google.common.collect.Cut
        void l(StringBuilder sb2) {
            sb2.append(this.f29411b);
            sb2.append(']');
        }

        @Override // com.google.common.collect.Cut
        Comparable n(DiscreteDomain discreteDomain) {
            return this.f29411b;
        }

        @Override // com.google.common.collect.Cut
        boolean o(Comparable comparable) {
            return Range.a(this.f29411b, comparable) < 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Cut
        Comparable q(DiscreteDomain discreteDomain) {
            return discreteDomain.next(this.f29411b);
        }

        @Override // com.google.common.collect.Cut
        BoundType r() {
            return BoundType.OPEN;
        }

        @Override // com.google.common.collect.Cut
        BoundType s() {
            return BoundType.CLOSED;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Cut
        Cut t(BoundType boundType, DiscreteDomain discreteDomain) {
            int i10 = AnonymousClass1.f29412a[boundType.ordinal()];
            if (i10 == 1) {
                Comparable next = discreteDomain.next(this.f29411b);
                return next == null ? Cut.h() : Cut.i(next);
            }
            if (i10 == 2) {
                return this;
            }
            throw new AssertionError();
        }

        public String toString() {
            return "/" + this.f29411b + "\\";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Cut
        Cut u(BoundType boundType, DiscreteDomain discreteDomain) {
            int i10 = AnonymousClass1.f29412a[boundType.ordinal()];
            if (i10 == 1) {
                return this;
            }
            if (i10 != 2) {
                throw new AssertionError();
            }
            Comparable next = discreteDomain.next(this.f29411b);
            return next == null ? Cut.d() : Cut.i(next);
        }
    }

    private static final class BelowAll extends Cut<Comparable<?>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final BelowAll f29414c = new BelowAll();

        private BelowAll() {
            super("");
        }

        private Object readResolve() {
            return f29414c;
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public int compareTo(Cut<Comparable<?>> cut) {
            return cut == this ? 0 : -1;
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.google.common.collect.Cut
        Cut j(DiscreteDomain discreteDomain) {
            try {
                return Cut.i(discreteDomain.minValue());
            } catch (NoSuchElementException unused) {
                return this;
            }
        }

        @Override // com.google.common.collect.Cut
        void k(StringBuilder sb2) {
            sb2.append("(-∞");
        }

        @Override // com.google.common.collect.Cut
        void l(StringBuilder sb2) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        Comparable m() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.Cut
        Comparable n(DiscreteDomain discreteDomain) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        boolean o(Comparable comparable) {
            return true;
        }

        @Override // com.google.common.collect.Cut
        Comparable q(DiscreteDomain discreteDomain) {
            return discreteDomain.minValue();
        }

        @Override // com.google.common.collect.Cut
        BoundType r() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        BoundType s() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        Cut t(BoundType boundType, DiscreteDomain discreteDomain) {
            throw new IllegalStateException();
        }

        public String toString() {
            return "-∞";
        }

        @Override // com.google.common.collect.Cut
        Cut u(BoundType boundType, DiscreteDomain discreteDomain) {
            throw new AssertionError("this statement should be unreachable");
        }
    }

    private static final class BelowValue<C extends Comparable> extends Cut<C> {
        BelowValue(Comparable comparable) {
            super((Comparable) Preconditions.checkNotNull(comparable));
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((Cut) obj);
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return this.f29411b.hashCode();
        }

        @Override // com.google.common.collect.Cut
        void k(StringBuilder sb2) {
            sb2.append('[');
            sb2.append(this.f29411b);
        }

        @Override // com.google.common.collect.Cut
        void l(StringBuilder sb2) {
            sb2.append(this.f29411b);
            sb2.append(')');
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Cut
        Comparable n(DiscreteDomain discreteDomain) {
            return discreteDomain.previous(this.f29411b);
        }

        @Override // com.google.common.collect.Cut
        boolean o(Comparable comparable) {
            return Range.a(this.f29411b, comparable) <= 0;
        }

        @Override // com.google.common.collect.Cut
        Comparable q(DiscreteDomain discreteDomain) {
            return this.f29411b;
        }

        @Override // com.google.common.collect.Cut
        BoundType r() {
            return BoundType.CLOSED;
        }

        @Override // com.google.common.collect.Cut
        BoundType s() {
            return BoundType.OPEN;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Cut
        Cut t(BoundType boundType, DiscreteDomain discreteDomain) {
            int i10 = AnonymousClass1.f29412a[boundType.ordinal()];
            if (i10 == 1) {
                return this;
            }
            if (i10 != 2) {
                throw new AssertionError();
            }
            Comparable comparablePrevious = discreteDomain.previous(this.f29411b);
            return comparablePrevious == null ? Cut.h() : new AboveValue(comparablePrevious);
        }

        public String toString() {
            return "\\" + this.f29411b + "/";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Cut
        Cut u(BoundType boundType, DiscreteDomain discreteDomain) {
            int i10 = AnonymousClass1.f29412a[boundType.ordinal()];
            if (i10 == 1) {
                Comparable comparablePrevious = discreteDomain.previous(this.f29411b);
                return comparablePrevious == null ? Cut.d() : new AboveValue(comparablePrevious);
            }
            if (i10 == 2) {
                return this;
            }
            throw new AssertionError();
        }
    }

    Cut(Comparable comparable) {
        this.f29411b = comparable;
    }

    static Cut d() {
        return AboveAll.f29413c;
    }

    static Cut g(Comparable comparable) {
        return new AboveValue(comparable);
    }

    static Cut h() {
        return BelowAll.f29414c;
    }

    static Cut i(Comparable comparable) {
        return new BelowValue(comparable);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cut) {
            try {
                if (compareTo((Cut) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();

    Cut j(DiscreteDomain discreteDomain) {
        return this;
    }

    abstract void k(StringBuilder sb2);

    abstract void l(StringBuilder sb2);

    Comparable m() {
        return this.f29411b;
    }

    abstract Comparable n(DiscreteDomain discreteDomain);

    abstract boolean o(Comparable comparable);

    abstract Comparable q(DiscreteDomain discreteDomain);

    abstract BoundType r();

    abstract BoundType s();

    abstract Cut t(BoundType boundType, DiscreteDomain discreteDomain);

    abstract Cut u(BoundType boundType, DiscreteDomain discreteDomain);

    @Override // java.lang.Comparable
    public int compareTo(Cut<C> cut) {
        if (cut == h()) {
            return 1;
        }
        if (cut == d()) {
            return -1;
        }
        int iA = Range.a(this.f29411b, cut.f29411b);
        return iA != 0 ? iA : Boolean.compare(this instanceof AboveValue, cut instanceof AboveValue);
    }
}
