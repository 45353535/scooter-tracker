package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class q3 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f23555a;

    public q3(r3 r3Var) {
        this.f23555a = r3Var.f23562a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23555a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f23555a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
