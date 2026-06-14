package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public final class Tm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f76523a;

    public Tm() {
        HashMap map = new HashMap();
        this.f76523a = map;
        Nm nm = new Nm();
        Om om = new Om();
        Pm pm = new Pm();
        Qm qm = new Qm();
        map.put(C5306nm.class, nm);
        map.put(C5004c2.class, om);
        map.put(Cif.class, pm);
        map.put(A3.class, qm);
    }

    public static Um a(Class cls) {
        return (Um) Sm.f76464a.f76523a.get(cls);
    }
}
