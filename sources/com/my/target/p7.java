package com.my.target;

import android.content.Context;
import com.my.target.a2;
import com.my.target.v;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class p7 extends v.a {
    public static p7 b() {
        return new p7();
    }

    @Override // com.my.target.v.a
    public int a(j jVar, Context context) {
        return v8.a(context).c();
    }

    @Override // com.my.target.v.a
    public Map a(j jVar, h6 h6Var, Context context) {
        Map mapA = super.a(jVar, h6Var, context);
        a2.b bVarA = a2.f59081e.a(jVar.g().f59410h);
        String str = bVarA.f59089a;
        if (!str.isEmpty()) {
            mapA.put("exb", str);
            gb.a("NativeAdServiceBuilder: Exclude list - " + str);
        }
        String str2 = bVarA.f59090b;
        if (!str2.isEmpty()) {
            mapA.put("excrid", str2);
        }
        return mapA;
    }
}
