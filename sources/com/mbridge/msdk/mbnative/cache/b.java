package com.mbridge.msdk.mbnative.cache;

import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b<K, V> {
    public long a() {
        g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarD == null) {
            gVarD = h.b().a();
        }
        return gVarD.a0() * 1000;
    }

    public abstract V a(K k10, int i10);

    public abstract void a(K k10, V v10);

    public abstract void a(K k10, V v10, String str);

    public abstract void a(String str, Campaign campaign, String str2);

    public V b(K k10, int i10) {
        return null;
    }

    public long b() {
        g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarD == null) {
            gVarD = h.b().a();
        }
        return gVarD.b0() * 1000;
    }
}
