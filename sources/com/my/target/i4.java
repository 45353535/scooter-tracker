package com.my.target;

import android.content.Context;
import com.my.target.h6;
import com.my.target.l;

/* JADX INFO: loaded from: classes11.dex */
public final class i4 extends l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t4 f59843h;

    public static class a implements l.a {
        @Override // com.my.target.l.a
        public v a() {
            return v.a();
        }

        @Override // com.my.target.l.a
        public s b() {
            return s4.a();
        }

        @Override // com.my.target.l.a
        public boolean c() {
            return true;
        }

        @Override // com.my.target.l.a
        public q d() {
            return r4.a();
        }
    }

    public i4(j jVar, h6.a aVar, t4 t4Var) {
        super(new a(), jVar, aVar);
        this.f59843h = t4Var;
    }

    public static l a(j jVar, h6.a aVar) {
        return new i4(jVar, aVar, null);
    }

    public static l a(t4 t4Var, j jVar, h6.a aVar) {
        return new i4(jVar, aVar, t4Var);
    }

    @Override // com.my.target.l
    public void a(h6 h6Var, Context context, l.b bVar) {
        if (this.f59843h != null) {
            n nVarB = n.b();
            t4 t4Var = (t4) a(this.f59843h, nVarB, context);
            bVar.a(t4Var, t4Var != null ? null : nVarB.a());
            return;
        }
        super.a(h6Var, context, bVar);
    }
}
