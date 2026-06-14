package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class r6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f65187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f65188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s2 f65189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t2 f65190d;

    public r6(Context context, String str, s2 s2Var, t2 t2Var) {
        this.f65187a = context;
        this.f65188b = str;
        this.f65189c = s2Var;
        this.f65190d = t2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = r4.f65187a     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = "startapp_ads"
            java.lang.String r3 = java.io.File.separator     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = "interstitials"
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = r4.f65188b     // Catch: java.lang.Throwable -> L5b
            if (r3 != 0) goto L16
            goto L4e
        L16:
            java.lang.String r1 = com.startapp.sdk.internal.g7.a(r1, r2)     // Catch: java.lang.Throwable -> L4c
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L4c
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L4c
            boolean r1 = r2.exists()     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L4e
            boolean r1 = r2.isDirectory()     // Catch: java.lang.Throwable -> L4c
            if (r1 != 0) goto L2c
            goto L4e
        L2c:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L4c
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L4c
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L4e
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4c
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L4c
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L4c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r3 = r1.readObject()     // Catch: java.lang.Throwable -> L4c
            r1.close()     // Catch: java.lang.Throwable -> L4c
            r2.close()     // Catch: java.lang.Throwable -> L4c
            goto L5d
        L4c:
            r1 = move-exception
            goto L50
        L4e:
            r3 = r0
            goto L5d
        L50:
            r2 = 2
            boolean r2 = com.startapp.sdk.internal.g7.a(r2)     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L4e
            com.startapp.sdk.internal.g9.a(r1)     // Catch: java.lang.Throwable -> L5b
            goto L4e
        L5b:
            r1 = move-exception
            goto L71
        L5d:
            com.startapp.sdk.adsbase.cache.DiskAdCacheManager$DiskCachedAd r3 = (com.startapp.sdk.adsbase.cache.DiskAdCacheManager$DiskCachedAd) r3     // Catch: java.lang.Throwable -> L5b
            android.os.Handler r1 = new android.os.Handler     // Catch: java.lang.Throwable -> L5b
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L5b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L5b
            com.startapp.sdk.internal.q6 r2 = new com.startapp.sdk.internal.q6     // Catch: java.lang.Throwable -> L5b
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L5b
            r1.post(r2)     // Catch: java.lang.Throwable -> L5b
            goto L7c
        L71:
            com.startapp.sdk.internal.g9.a(r1)
            android.content.Context r1 = r4.f65187a
            com.startapp.sdk.internal.s2 r2 = r4.f65189c
            r3 = 1
            com.startapp.sdk.internal.a0.a(r1, r2, r0, r3)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.internal.r6.run():void");
    }
}
