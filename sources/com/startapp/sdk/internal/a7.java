package com.startapp.sdk.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hi f64255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f3 f64256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x6 f64257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f64258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f64259e;

    static {
        Intrinsics.checkNotNullExpressionValue(a7.class.getSimpleName(), "getSimpleName(...)");
    }

    public a7(Object emitterObj, hi startEvent, f3 clock) {
        Intrinsics.checkNotNullParameter(emitterObj, "emitterObj");
        Intrinsics.checkNotNullParameter(startEvent, "startEvent");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f64255a = startEvent;
        this.f64256b = clock;
        this.f64257c = new x6(emitterObj);
        this.f64258d = new ArrayList();
        this.f64259e = new LinkedHashMap();
    }

    public final void a(Object emitterObject, Object obj) {
        Intrinsics.checkNotNullParameter(emitterObject, "emitterObject");
        Intrinsics.checkNotNullParameter(obj, "relativeEmitterObject");
        if (this.f64257c.a(emitterObject)) {
            x6 x6Var = this.f64257c;
            x6Var.getClass();
            Intrinsics.checkNotNullParameter(obj, "obj");
            if (x6Var.a(obj)) {
                return;
            }
            x6Var.f65528b.add(new x6(obj));
        }
    }

    public final void a(p8 emitterObject, HashMap keyValues) {
        Intrinsics.checkNotNullParameter(emitterObject, "emitterObject");
        Intrinsics.checkNotNullParameter(keyValues, "keyValues");
        if (this.f64257c.a(emitterObject)) {
            long jA = this.f64256b.a();
            for (Map.Entry entry : keyValues.entrySet()) {
                hi hiVar = (hi) entry.getKey();
                String str = (String) entry.getValue();
                List arrayList = (List) this.f64259e.get(hiVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f64259e.put(hiVar, arrayList);
                }
                arrayList.add(new Pair(str, Long.valueOf(jA)));
            }
        }
    }
}
