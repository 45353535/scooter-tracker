package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class w2 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f23613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e3 f23614c;

    public w2(e3 e3Var) {
        this.f23614c = e3Var;
        this.f23612a = e3Var.f23462b.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f23612a;
        if (i10 > 0 && i10 <= this.f23614c.f23462b.size()) {
            return true;
        }
        if (this.f23613b == null) {
            this.f23613b = this.f23614c.f23466f.entrySet().iterator();
        }
        return this.f23613b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f23613b == null) {
            this.f23613b = this.f23614c.f23466f.entrySet().iterator();
        }
        if (this.f23613b.hasNext()) {
            if (this.f23613b == null) {
                this.f23613b = this.f23614c.f23466f.entrySet().iterator();
            }
            return (Map.Entry) this.f23613b.next();
        }
        List list = this.f23614c.f23462b;
        int i10 = this.f23612a - 1;
        this.f23612a = i10;
        return (Map.Entry) list.get(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
