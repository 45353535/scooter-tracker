package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class o1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f23542a;

    public o1(Iterator it) {
        this.f23542a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23542a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f23542a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f23542a.remove();
    }
}
