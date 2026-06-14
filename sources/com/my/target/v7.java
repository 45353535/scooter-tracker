package com.my.target;

import android.content.Context;
import com.my.target.h6;
import com.my.target.l;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class v7 extends l {

    public static class a implements l.a {
        @Override // com.my.target.l.a
        public v a() {
            return v.a();
        }

        @Override // com.my.target.l.a
        public s b() {
            return x7.a();
        }

        @Override // com.my.target.l.a
        public boolean c() {
            return false;
        }

        @Override // com.my.target.l.a
        public q d() {
            return w7.a();
        }
    }

    public interface b extends l.b {
    }

    public v7(j jVar, h6.a aVar) {
        super(new a(), jVar, aVar);
    }

    public static l a(j jVar, h6.a aVar) {
        return new v7(jVar, aVar);
    }

    @Override // com.my.target.l
    public w a(u uVar, k2 k2Var, Map map, Context context) {
        if (this.f60015b.e() > 0) {
            gb.a("NativeAppwallAdFactory: Check cached data");
            w1 w1VarB = w1.b(context);
            String strA = w1VarB != null ? w1VarB.a(this.f60015b.i(), this.f60015b.e()) : null;
            if (strA != null) {
                gb.a("NativeAppwallAdFactory: Cached data loaded successfully");
                uVar.a(true);
                return new w(null, strA);
            }
            gb.a("NativeAppwallAdFactory: No cached data");
        }
        return super.a(uVar, k2Var, map, context);
    }
}
