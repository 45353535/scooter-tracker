package com.startapp.sdk.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes11.dex */
public final class d6 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator f64407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparator f64408b;

    public d6(Comparator comparator, Comparator comparator2) {
        this.f64407a = comparator;
        this.f64408b = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.f64407a.compare(obj, obj2);
        return iCompare == 0 ? this.f64408b.compare(obj, obj2) : iCompare;
    }
}
