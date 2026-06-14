package com.startapp.sdk.internal;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class y2 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f65593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f65594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f65595c;

    public y2(int i10, Object obj) {
        this.f65593a = obj;
        this.f65594b = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f65595c < this.f65594b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f65593a;
        int i10 = this.f65595c;
        this.f65595c = i10 + 1;
        return Array.get(obj, i10);
    }
}
