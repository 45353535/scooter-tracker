package com.iabtcf.utils;

import j$.util.function.IntPredicate$CC;
import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements IntPredicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IntIterable f36477a;

    public /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return IntPredicate$CC.$default$and(this, intPredicate);
    }

    public /* synthetic */ IntPredicate negate() {
        return IntPredicate$CC.$default$negate(this);
    }

    public /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return IntPredicate$CC.$default$or(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final boolean test(int i10) {
        return this.f36477a.contains(i10);
    }
}
