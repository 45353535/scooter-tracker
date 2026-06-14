package yads;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class pd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cp0 f114624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f114625b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f114626c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f114627d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b30 f114628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public oj0 f114629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public fe1 f114630g;

    public pd0(bd0 bd0Var) {
        this.f114624a = bd0Var;
    }

    public static jl1 a(Class cls) {
        try {
            return (jl1) cls.getConstructor(null).newInstance(null);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    public final void b(b30 b30Var) {
        if (b30Var != this.f114628e) {
            this.f114628e = b30Var;
            this.f114625b.clear();
            this.f114627d.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.k23 a(int r4) {
        /*
            r3 = this;
            java.util.HashMap r0 = r3.f114625b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L19
            java.util.HashMap r0 = r3.f114625b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            yads.k23 r4 = (yads.k23) r4
            return r4
        L19:
            yads.b30 r0 = r3.f114628e
            r0.getClass()
            java.lang.Class<yads.jl1> r1 = yads.jl1.class
            if (r4 == 0) goto L66
            r2 = 1
            if (r4 == r2) goto L56
            r2 = 2
            if (r4 == r2) goto L45
            r2 = 3
            if (r4 == r2) goto L35
            r1 = 4
            if (r4 == r1) goto L2f
            goto L72
        L2f:
            yads.w00 r1 = new yads.w00     // Catch: java.lang.ClassNotFoundException -> L72
            r1.<init>()     // Catch: java.lang.ClassNotFoundException -> L72
            goto L73
        L35:
            java.lang.String r0 = "com.monetization.ads.exo.source.rtsp.RtspMediaSource$Factory"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L72
            java.lang.Class r0 = r0.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L72
            yads.x00 r1 = new yads.x00     // Catch: java.lang.ClassNotFoundException -> L72
            r1.<init>()     // Catch: java.lang.ClassNotFoundException -> L72
            goto L73
        L45:
            java.lang.String r2 = "com.monetization.ads.exo.source.hls.HlsMediaSource$Factory"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L72
            java.lang.Class r1 = r2.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L72
            yads.y00 r2 = new yads.y00     // Catch: java.lang.ClassNotFoundException -> L72
            r2.<init>()     // Catch: java.lang.ClassNotFoundException -> L72
        L54:
            r1 = r2
            goto L73
        L56:
            java.lang.String r2 = "com.monetization.ads.exo.source.smoothstreaming.SsMediaSource$Factory"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L72
            java.lang.Class r1 = r2.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L72
            yads.b10 r2 = new yads.b10     // Catch: java.lang.ClassNotFoundException -> L72
            r2.<init>()     // Catch: java.lang.ClassNotFoundException -> L72
            goto L54
        L66:
            java.lang.Class<com.monetization.ads.exo.source.dash.DashMediaSource$Factory> r2 = com.monetization.ads.exo.source.dash.DashMediaSource.Factory.class
            java.lang.Class r1 = r2.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L72
            yads.e10 r2 = new yads.e10     // Catch: java.lang.ClassNotFoundException -> L72
            r2.<init>()     // Catch: java.lang.ClassNotFoundException -> L72
            goto L54
        L72:
            r1 = 0
        L73:
            java.util.HashMap r0 = r3.f114625b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0.put(r2, r1)
            if (r1 == 0) goto L87
            java.util.HashSet r0 = r3.f114626c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.add(r4)
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.pd0.a(int):yads.k23");
    }

    public final /* synthetic */ jl1 a(b30 b30Var) {
        return new bi2(b30Var, this.f114624a);
    }
}
