package com.my.target;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class o7 extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f60455b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f60456c;

    public static o7 f() {
        return new o7();
    }

    public void a(b7 b7Var) {
        this.f60455b.add(b7Var);
    }

    public List c() {
        return new ArrayList(this.f60455b);
    }

    public b7 d() {
        if (this.f60455b.size() > 0) {
            return (b7) this.f60455b.get(0);
        }
        return null;
    }

    public long e() {
        return this.f60456c;
    }

    @Override // com.my.target.t
    public int a() {
        return this.f60455b.size();
    }

    public void a(long j10) {
        this.f60456c = j10;
    }
}
