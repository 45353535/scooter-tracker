package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class c3 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23448a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f23450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e3 f23451d;

    public c3(e3 e3Var) {
        this.f23451d = e3Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f23448a + 1 >= this.f23451d.f23462b.size()) {
            if (this.f23451d.f23463c.isEmpty()) {
                return false;
            }
            if (this.f23450c == null) {
                this.f23450c = this.f23451d.f23463c.entrySet().iterator();
            }
            if (!this.f23450c.hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f23449b = true;
        int i10 = this.f23448a + 1;
        this.f23448a = i10;
        if (i10 < this.f23451d.f23462b.size()) {
            return (Map.Entry) this.f23451d.f23462b.get(this.f23448a);
        }
        if (this.f23450c == null) {
            this.f23450c = this.f23451d.f23463c.entrySet().iterator();
        }
        return (Map.Entry) this.f23450c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f23449b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f23449b = false;
        e3 e3Var = this.f23451d;
        int i10 = e3.f23460h;
        e3Var.a();
        if (this.f23448a >= this.f23451d.f23462b.size()) {
            if (this.f23450c == null) {
                this.f23450c = this.f23451d.f23463c.entrySet().iterator();
            }
            this.f23450c.remove();
            return;
        }
        e3 e3Var2 = this.f23451d;
        int i11 = this.f23448a;
        this.f23448a = i11 - 1;
        e3Var2.a();
        Object obj = ((b3) e3Var2.f23462b.remove(i11)).f23444b;
        if (e3Var2.f23463c.isEmpty()) {
            return;
        }
        Iterator it = e3Var2.c().entrySet().iterator();
        e3Var2.f23462b.add(new b3(e3Var2, (Map.Entry) it.next()));
        it.remove();
    }
}
