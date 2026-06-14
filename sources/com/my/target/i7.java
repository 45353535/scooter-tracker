package com.my.target;

import android.content.Context;
import com.my.target.h6;
import com.my.target.l;

/* JADX INFO: loaded from: classes11.dex */
public final class i7 extends l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o7 f59844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f59845i;

    public static class a implements l.a {
        @Override // com.my.target.l.a
        public v a() {
            return p7.b();
        }

        @Override // com.my.target.l.a
        public s b() {
            return n7.a();
        }

        @Override // com.my.target.l.a
        public boolean c() {
            return false;
        }

        @Override // com.my.target.l.a
        public q d() {
            return m7.a();
        }
    }

    public static class b implements l.a {
        @Override // com.my.target.l.a
        public v a() {
            return p7.b();
        }

        @Override // com.my.target.l.a
        public s b() {
            return c8.a();
        }

        @Override // com.my.target.l.a
        public boolean c() {
            return false;
        }

        @Override // com.my.target.l.a
        public q d() {
            return b8.a();
        }
    }

    public i7(l.a aVar, j jVar, h6.a aVar2, o7 o7Var, String str) {
        super(aVar, jVar, aVar2);
        this.f59844h = o7Var;
        this.f59845i = str;
    }

    public static l a(l.a aVar, j jVar, h6.a aVar2) {
        return new i7(aVar, jVar, aVar2, null, null);
    }

    public static l a(l.a aVar, o7 o7Var, j jVar, h6.a aVar2) {
        return new i7(aVar, jVar, aVar2, o7Var, null);
    }

    public static l a(l.a aVar, String str, j jVar, h6.a aVar2) {
        return new i7(aVar, jVar, aVar2, null, str);
    }

    @Override // com.my.target.l
    public void a(h6 h6Var, Context context, l.b bVar) {
        n nVarB = n.b();
        if (this.f59845i != null) {
            o7 o7Var = (o7) a((o7) this.f60014a.d().a(this.f59845i, u.b(""), this.f59844h, this.f60015b, this.f60016c, h6Var, null, nVarB, context), nVarB, context);
            bVar.a(o7Var, o7Var == null ? nVarB.a() : null);
            return;
        }
        o7 o7Var2 = this.f59844h;
        if (o7Var2 != null) {
            o7 o7Var3 = (o7) a(o7Var2, nVarB, context);
            bVar.a(o7Var3, o7Var3 == null ? nVarB.a() : null);
        } else {
            super.a(h6Var, context, bVar);
        }
    }
}
