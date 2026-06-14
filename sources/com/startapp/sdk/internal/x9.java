package com.startapp.sdk.internal;

import com.startapp.sdk.common.utils.Pair;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class x9 extends z1 {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final g9 f65531j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f65532k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public String f65533l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public String f65534m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public String f65535n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public String f65536o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f65537p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Map f65538q0;

    public x9(g9 g9Var) {
        super(8);
        this.f65531j0 = g9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.startapp.sdk.internal.z1
    public final void a(ve veVar) {
        super.a(veVar);
        g9 g9Var = this.f65531j0;
        Long l10 = g9Var.f64557h;
        String string = l10 != null ? l10.toString() : g.a();
        veVar.a(g.f64534b, string, true, true);
        veVar.a(g.f64535c, g.a(string), true, true);
        veVar.a("category", g9Var.f64550a.f64622a, true, true);
        veVar.a("value", g9Var.f64553d, false, true);
        veVar.a("d", g9Var.f64556g, false, true);
        veVar.a("appActivity", g9Var.f64558i, false, true);
        veVar.a("details", g9Var.f64554e, false, true);
        veVar.a("detailsJson", g9Var.f64555f, false, true);
        veVar.a("isService", Boolean.valueOf(g9Var.f64559j), false, true);
        veVar.a("orientation", this.f65532k0, false, true);
        veVar.a("usedRam", this.f65533l0, false, true);
        veVar.a("freeRam", this.f65534m0, false, true);
        veVar.a("sessionTime", null, false, true);
        veVar.a("cellScanRes", this.f65535n0, false, true);
        veVar.a("sens", this.f65536o0, false, true);
        veVar.a("bt", this.f65537p0, false, true);
        Pair pairA = com.startapp.sdk.adsbase.g.a();
        Pair pairB = com.startapp.sdk.adsbase.g.b();
        veVar.a((String) pairA.first, pairA.second, false, true);
        veVar.a((String) pairB.first, pairB.second, false, true);
        Map map = this.f65538q0;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                veVar.a((String) entry.getKey(), entry.getValue(), false, true);
            }
        }
        veVar.a("rcd", null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    @Override // com.startapp.sdk.internal.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.content.Context r10, com.startapp.sdk.adsbase.model.AdPreferences r11) {
        /*
            r9 = this;
            super.b(r10, r11)
            android.content.res.Resources r11 = r10.getResources()
            r0 = 2
            r1 = 1
            if (r11 == 0) goto L1d
            android.content.res.Configuration r11 = r11.getConfiguration()
            if (r11 == 0) goto L1d
            int r11 = r11.orientation
            if (r11 != r0) goto L18
            java.lang.String r11 = "landscape"
            goto L1f
        L18:
            if (r11 != r1) goto L1d
            java.lang.String r11 = "portrait"
            goto L1f
        L1d:
            java.lang.String r11 = "undefined"
        L1f:
            r9.f65532k0 = r11
            java.lang.String[] r11 = new java.lang.String[r0]
            r0 = 0
            r2 = 0
            r11[r0] = r2
            r11[r1] = r2
            java.lang.String r2 = "activity"
            java.lang.Object r10 = r10.getSystemService(r2)     // Catch: java.lang.Throwable -> L5a
            android.app.ActivityManager r10 = (android.app.ActivityManager) r10     // Catch: java.lang.Throwable -> L5a
            if (r10 == 0) goto L6f
            android.app.ActivityManager$MemoryInfo r2 = new android.app.ActivityManager$MemoryInfo     // Catch: java.lang.Throwable -> L5a
            r2.<init>()     // Catch: java.lang.Throwable -> L5a
            r10.getMemoryInfo(r2)     // Catch: java.lang.Throwable -> L5a
            long r3 = r2.availMem     // Catch: java.lang.Throwable -> L5a
            r5 = 1048576(0x100000, double:5.180654E-318)
            long r3 = r3 / r5
            java.lang.String r10 = java.lang.Long.toString(r3)     // Catch: java.lang.Throwable -> L5a
            r11[r0] = r10     // Catch: java.lang.Throwable -> L5a
            java.lang.Long r10 = com.startapp.sdk.internal.q0.a(r2)     // Catch: java.lang.Throwable -> L5a
            long r3 = r10.longValue()     // Catch: java.lang.Throwable -> L5a
            long r7 = r2.availMem     // Catch: java.lang.Throwable -> L5a
            long r3 = r3 - r7
            long r3 = r3 / r5
            java.lang.String r10 = java.lang.Long.toString(r3)     // Catch: java.lang.Throwable -> L5a
            r11[r1] = r10     // Catch: java.lang.Throwable -> L5a
            goto L6f
        L5a:
            r10 = move-exception
            java.lang.Class<java.lang.SecurityException> r2 = java.lang.SecurityException.class
            boolean r2 = com.startapp.sdk.internal.vi.a(r10, r2)
            if (r2 != 0) goto L6f
            java.lang.Class<android.os.RemoteException> r2 = android.os.RemoteException.class
            boolean r2 = com.startapp.sdk.internal.vi.a(r10, r2)
            if (r2 == 0) goto L6c
            goto L6f
        L6c:
            com.startapp.sdk.internal.g9.a(r10)
        L6f:
            r10 = r11[r0]
            r9.f65534m0 = r10
            r10 = r11[r1]
            r9.f65533l0 = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.internal.x9.b(android.content.Context, com.startapp.sdk.adsbase.model.AdPreferences):void");
    }

    public final String toString() {
        return this.f65531j0.toString();
    }
}
