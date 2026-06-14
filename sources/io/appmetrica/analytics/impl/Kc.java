package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class Kc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f76022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f76023b;

    public Kc(Object obj) {
        this(new HashMap(), obj);
    }

    public final void a(Object obj, Object obj2) {
        this.f76022a.put(obj, obj2);
    }

    public Kc(HashMap map, Object obj) {
        this.f76022a = map;
        this.f76023b = obj;
    }

    public final Object a(Object obj) {
        Object obj2 = this.f76022a.get(obj);
        return obj2 == null ? this.f76023b : obj2;
    }
}
