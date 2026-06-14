package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.BiFunction;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes12.dex */
public final class Fn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final En f75798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiFunction f75799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Hf f75800c;

    public Fn() {
        this(new Cn(), new C5418sa(), C5186j4.l().n());
    }

    public final ArrayList a(Thread thread, Thread thread2) {
        Map mapC;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new Dn());
        try {
            mapC = this.f75798a.c();
        } catch (SecurityException unused) {
            mapC = null;
        }
        if (mapC != null) {
            treeMap.putAll(mapC);
        }
        if (thread2 != null) {
            treeMap.remove(thread2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread3 = (Thread) entry.getKey();
            if (thread3 != thread && thread3 != thread2) {
                arrayList.add((C5581yn) this.f75799b.apply(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }

    public Fn(En en, C5418sa c5418sa, C5564y6 c5564y6) {
        this.f75798a = en;
        this.f75799b = c5418sa;
        this.f75800c = c5564y6;
    }
}
