package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23518a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f23520c;

    public l(s sVar) {
        this.f23520c = sVar;
        this.f23519b = sVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23518a < this.f23519b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f23518a;
        if (i10 >= this.f23519b) {
            throw new NoSuchElementException();
        }
        this.f23518a = i10 + 1;
        return Byte.valueOf(this.f23520c.d(i10));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
