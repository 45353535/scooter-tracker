package org.bidon.mintegral.ext;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f97439a = "17.0.31.0";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f97440b = "MAL_17.0.31";

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r7.equals("EXCEPTION_RETURN_EMPTY") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (r7.equals("NO_ADS_SOURCE") != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        return new org.bidon.sdk.config.BidonError.NoFill(org.bidon.mintegral.a.a());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final org.bidon.sdk.config.BidonError a(java.lang.String r7) {
        /*
            if (r7 == 0) goto L44
            int r0 = r7.hashCode()
            r1 = -1761315864(0xffffffff970473e8, float:-4.2797795E-25)
            if (r0 == r1) goto L32
            r1 = -244577426(0xfffffffff16c0b6e, float:-1.1688365E30)
            if (r0 == r1) goto L29
            r1 = 706920753(0x2a22c131, float:1.4455517E-13)
            if (r0 == r1) goto L16
            goto L44
        L16:
            java.lang.String r0 = "EXCEPTION_TIMEOUT"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L1f
            goto L44
        L1f:
            org.bidon.sdk.config.BidonError$FillTimedOut r7 = new org.bidon.sdk.config.BidonError$FillTimedOut
            org.bidon.sdk.adapter.DemandId r0 = org.bidon.mintegral.a.a()
            r7.<init>(r0)
            return r7
        L29:
            java.lang.String r0 = "EXCEPTION_RETURN_EMPTY"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L3a
            goto L44
        L32:
            java.lang.String r0 = "NO_ADS_SOURCE"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L44
        L3a:
            org.bidon.sdk.config.BidonError$NoFill r7 = new org.bidon.sdk.config.BidonError$NoFill
            org.bidon.sdk.adapter.DemandId r0 = org.bidon.mintegral.a.a()
            r7.<init>(r0)
            return r7
        L44:
            org.bidon.sdk.config.BidonError$Unspecified r1 = new org.bidon.sdk.config.BidonError$Unspecified
            org.bidon.sdk.adapter.DemandId r2 = org.bidon.mintegral.a.a()
            java.lang.Throwable r3 = new java.lang.Throwable
            r3.<init>(r7)
            r5 = 4
            r6 = 0
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.mintegral.ext.a.a(java.lang.String):org.bidon.sdk.config.BidonError");
    }

    public static final String b() {
        return f97439a;
    }

    public static final String c() {
        return f97440b;
    }
}
