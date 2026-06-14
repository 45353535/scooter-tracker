package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class TopKSelector<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Comparator f30319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f30320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f30321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f30322e;

    private TopKSelector(Comparator comparator, int i10) {
        this.f30319b = (Comparator) Preconditions.checkNotNull(comparator, "comparator");
        this.f30318a = i10;
        Preconditions.checkArgument(i10 >= 0, "k (%s) must be >= 0", i10);
        Preconditions.checkArgument(i10 <= 1073741823, "k (%s) must be <= Integer.MAX_VALUE / 2", i10);
        this.f30320c = new Object[IntMath.checkedMultiply(i10, 2)];
        this.f30321d = 0;
        this.f30322e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int b(int i10, int i11, int i12) {
        Object objA = NullnessCasts.a(this.f30320c[i12]);
        Object[] objArr = this.f30320c;
        objArr[i12] = objArr[i11];
        int i13 = i10;
        while (i10 < i11) {
            if (this.f30319b.compare(NullnessCasts.a(this.f30320c[i10]), objA) < 0) {
                c(i13, i10);
                i13++;
            }
            i10++;
        }
        Object[] objArr2 = this.f30320c;
        objArr2[i11] = objArr2[i13];
        objArr2[i13] = objA;
        return i13;
    }

    private void c(int i10, int i11) {
        Object[] objArr = this.f30320c;
        Object obj = objArr[i10];
        objArr[i10] = objArr[i11];
        objArr[i11] = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d() {
        int i10 = (this.f30318a * 2) - 1;
        int iLog2 = IntMath.log2(i10, RoundingMode.CEILING) * 3;
        int iMax = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (iMax >= i10) {
                break;
            }
            int iB = b(iMax, i10, ((iMax + i10) + 1) >>> 1);
            int i13 = this.f30318a;
            if (iB <= i13) {
                if (iB >= i13) {
                    break;
                }
                iMax = Math.max(iB, iMax + 1);
                i12 = iB;
            } else {
                i10 = iB - 1;
            }
            i11++;
            if (i11 >= iLog2) {
                Arrays.sort(this.f30320c, iMax, i10 + 1, this.f30319b);
                break;
            }
        }
        this.f30321d = this.f30318a;
        this.f30322e = NullnessCasts.a(this.f30320c[i12]);
        while (true) {
            i12++;
            if (i12 >= this.f30318a) {
                return;
            }
            if (this.f30319b.compare(NullnessCasts.a(this.f30320c[i12]), NullnessCasts.a(this.f30322e)) > 0) {
                this.f30322e = this.f30320c[i12];
            }
        }
    }

    public static <T extends Comparable<? super T>> TopKSelector<T> greatest(int i10) {
        return greatest(i10, Ordering.natural());
    }

    public static <T extends Comparable<? super T>> TopKSelector<T> least(int i10) {
        return least(i10, Ordering.natural());
    }

    /* JADX WARN: Multi-variable type inference failed */
    TopKSelector a(TopKSelector topKSelector) {
        for (int i10 = 0; i10 < topKSelector.f30321d; i10++) {
            offer(NullnessCasts.a(topKSelector.f30320c[i10]));
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void offer(@ParametricNullness T t10) {
        int i10 = this.f30318a;
        if (i10 == 0) {
            return;
        }
        int i11 = this.f30321d;
        if (i11 == 0) {
            this.f30320c[0] = t10;
            this.f30322e = t10;
            this.f30321d = 1;
            return;
        }
        if (i11 < i10) {
            Object[] objArr = this.f30320c;
            this.f30321d = i11 + 1;
            objArr[i11] = t10;
            if (this.f30319b.compare(t10, NullnessCasts.a(this.f30322e)) > 0) {
                this.f30322e = t10;
                return;
            }
            return;
        }
        if (this.f30319b.compare(t10, NullnessCasts.a(this.f30322e)) < 0) {
            Object[] objArr2 = this.f30320c;
            int i12 = this.f30321d;
            int i13 = i12 + 1;
            this.f30321d = i13;
            objArr2[i12] = t10;
            if (i13 == this.f30318a * 2) {
                d();
            }
        }
    }

    public void offerAll(Iterable<? extends T> iterable) {
        offerAll(iterable.iterator());
    }

    public List<T> topK() {
        Object[] objArr = this.f30320c;
        Arrays.sort(objArr, 0, this.f30321d, this.f30319b);
        int i10 = this.f30321d;
        int i11 = this.f30318a;
        if (i10 > i11) {
            Object[] objArr2 = this.f30320c;
            Arrays.fill(objArr2, i11, objArr2.length, (Object) null);
            int i12 = this.f30318a;
            this.f30321d = i12;
            this.f30322e = this.f30320c[i12 - 1];
        }
        return DesugarCollections.unmodifiableList(Arrays.asList(Arrays.copyOf(objArr, this.f30321d)));
    }

    public static <T> TopKSelector<T> greatest(int i10, Comparator<? super T> comparator) {
        return new TopKSelector<>(Ordering.from(comparator).reverse(), i10);
    }

    public static <T> TopKSelector<T> least(int i10, Comparator<? super T> comparator) {
        return new TopKSelector<>(comparator, i10);
    }

    public void offerAll(Iterator<? extends T> it) {
        while (it.hasNext()) {
            offer(it.next());
        }
    }
}
