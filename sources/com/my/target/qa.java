package com.my.target;

import android.content.Context;
import com.my.target.h6;
import com.my.target.l;

/* JADX INFO: loaded from: classes11.dex */
public final class qa extends l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ua f60666h;

    public static class a implements l.a {
        @Override // com.my.target.l.a
        public v a() {
            return v.a();
        }

        @Override // com.my.target.l.a
        public s b() {
            return ta.a();
        }

        @Override // com.my.target.l.a
        public boolean c() {
            return false;
        }

        @Override // com.my.target.l.a
        public q d() {
            return sa.a();
        }
    }

    public qa(j jVar, h6.a aVar, ua uaVar) {
        super(new a(), jVar, aVar);
        this.f60666h = uaVar;
    }

    public static l a(j jVar, h6.a aVar) {
        return new qa(jVar, aVar, null);
    }

    public static l a(ua uaVar, j jVar, h6.a aVar) {
        return new qa(jVar, aVar, uaVar);
    }

    @Override // com.my.target.l
    public void a(h6 h6Var, Context context, l.b bVar) {
        n nVarB = n.b();
        ua uaVar = this.f60666h;
        if (uaVar != null) {
            ua uaVar2 = (ua) a(uaVar, nVarB, context);
            bVar.a(uaVar2, uaVar2 != null ? null : nVarB.a());
        } else {
            super.a(h6Var, context, bVar);
        }
    }
}
