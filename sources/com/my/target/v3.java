package com.my.target;

import android.content.Context;
import com.my.target.v;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class v3 extends v.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f60926b;

    public v3(int i10) {
        this.f60926b = i10;
    }

    public static v a(int i10) {
        return new v3(i10);
    }

    @Override // com.my.target.v.a
    public Map a(j jVar, h6 h6Var, Context context) {
        Map mapA = super.a(jVar, h6Var, context);
        mapA.put("duration", Integer.toString(this.f60926b));
        return mapA;
    }
}
