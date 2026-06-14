package yads;

import j$.util.Objects;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class mr1 implements dm2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f113590e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dm2 f113591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f113592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f113593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lazy f113594d;

    public mr1(yg ygVar, Lazy lazy, boolean z10, Executor executor) {
        this.f113591a = ygVar;
        this.f113592b = z10;
        this.f113593c = executor;
        this.f113594d = lazy;
    }

    public static void a(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ArraysKt.toList((Object[]) entry.getValue()));
        }
        linkedHashMap.toString();
        boolean z10 = lb1.f113032a;
    }

    @Override // yads.dm2
    public final void reportAnr(final Map map) {
        if (this.f113591a != null) {
            this.f113593c.execute(new Runnable() { // from class: yads.op
                @Override // java.lang.Runnable
                public final void run() {
                    mr1.a(this.f114380b, map);
                }
            });
        } else {
            boolean z10 = lb1.f113032a;
        }
    }

    @Override // yads.nl0
    public final void reportError(final String str, final Throwable th2) {
        if (this.f113592b) {
            if (this.f113591a != null) {
                this.f113593c.execute(new Runnable() { // from class: yads.rp
                    @Override // java.lang.Runnable
                    public final void run() {
                        mr1.a(this.f115539b, str, th2);
                    }
                });
            } else {
                boolean z10 = lb1.f113032a;
            }
        }
    }

    @Override // yads.dm2
    public final void reportUnhandledException(final Throwable th2) {
        if (this.f113591a != null) {
            this.f113593c.execute(new Runnable() { // from class: yads.pp
                @Override // java.lang.Runnable
                public final void run() {
                    mr1.a(this.f114732b, th2);
                }
            });
        } else {
            boolean z10 = lb1.f113032a;
        }
    }

    public static void a(String str, Throwable th2) {
        Objects.toString(th2);
        boolean z10 = lb1.f113032a;
    }

    public static void a(String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ArraysKt.contentDeepToString(new Object[]{entry.getValue()}));
        }
        linkedHashMap.toString();
        boolean z10 = lb1.f113032a;
    }

    public static void a(Throwable th2) {
        Objects.toString(th2);
        boolean z10 = lb1.f113032a;
    }

    public static final void a(mr1 mr1Var, Map map) {
        try {
            mr1Var.getClass();
            a(map);
            mr1Var.f113591a.reportAnr(map);
        } catch (Throwable unused) {
            boolean z10 = lb1.f113032a;
        }
    }

    public static final void a(mr1 mr1Var, String str, Throwable th2) {
        try {
            mr1Var.getClass();
            a(str, th2);
            mr1Var.f113591a.reportError(str, th2);
        } catch (Throwable unused) {
            boolean z10 = lb1.f113032a;
        }
    }

    @Override // yads.dm2
    public final void a(final zl2 zl2Var) {
        if (this.f113591a != null) {
            this.f113593c.execute(new Runnable() { // from class: yads.qp
                @Override // java.lang.Runnable
                public final void run() {
                    mr1.a(this.f115113b, zl2Var);
                }
            });
        } else {
            boolean z10 = lb1.f113032a;
        }
    }

    public static final void a(mr1 mr1Var, zl2 zl2Var) {
        try {
            l93.a((vr3) mr1Var.f113594d.getValue(), zl2Var);
            a(zl2Var.f118733a, zl2Var.f118734b);
            mr1Var.f113591a.a(zl2Var);
        } catch (Throwable unused) {
            boolean z10 = lb1.f113032a;
        }
    }

    public static final void a(mr1 mr1Var, Throwable th2) {
        try {
            mr1Var.getClass();
            a(th2);
            mr1Var.f113591a.reportUnhandledException(th2);
        } catch (Throwable unused) {
            boolean z10 = lb1.f113032a;
        }
    }
}
