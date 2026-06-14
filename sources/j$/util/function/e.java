package j$.util.function;

import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements IntPredicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntPredicate f84927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IntPredicate f84928c;

    public /* synthetic */ e(IntPredicate intPredicate, IntPredicate intPredicate2, int i10) {
        this.f84926a = i10;
        this.f84927b = intPredicate;
        this.f84928c = intPredicate2;
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        switch (this.f84926a) {
        }
        return IntPredicate$CC.$default$and(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate negate() {
        switch (this.f84926a) {
        }
        return IntPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        switch (this.f84926a) {
        }
        return IntPredicate$CC.$default$or(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final boolean test(int i10) {
        switch (this.f84926a) {
            case 0:
                return this.f84927b.test(i10) || this.f84928c.test(i10);
            default:
                return this.f84927b.test(i10) && this.f84928c.test(i10);
        }
    }
}
