package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class iz0 implements zd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bq2 f112187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f112188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kz0 f112189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lz0 f112190d;

    public /* synthetic */ iz0(Context context) {
        this(context, new bq2());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    @Override // yads.zd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.rd a() {
        /*
            r7 = this;
            yads.lz0 r0 = r7.f112190d
            r0.getClass()
            android.content.Intent r0 = yads.lz0.a()
            yads.bq2 r1 = r7.f112187a
            android.content.Context r2 = r7.f112188b
            r1.getClass()
            r1 = 0
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L1b
            r3 = 0
            android.content.pm.ResolveInfo r2 = r2.resolveService(r0, r3)     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            boolean r2 = yads.lb1.f113032a
            r2 = r1
        L1e:
            if (r2 == 0) goto L65
            com.monetization.ads.core.identifiers.ad.huawei.a r2 = new com.monetization.ads.core.identifiers.ad.huawei.a     // Catch: java.lang.Throwable -> L63
            r2.<init>()     // Catch: java.lang.Throwable -> L63
            android.content.Context r3 = r7.f112188b     // Catch: java.lang.Throwable -> L63
            r4 = 1
            boolean r0 = r3.bindService(r0, r2, r4)     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L60
            yads.kz0 r0 = r7.f112189c     // Catch: java.lang.Throwable -> L63
            r0.getClass()     // Catch: java.lang.Throwable -> L63
            java.util.concurrent.LinkedBlockingQueue r3 = r2.f58979a     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L63
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L63
            r5 = 5
            java.lang.Object r3 = r3.poll(r5, r4)     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L63
            com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService r3 = (com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService) r3     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L63
            if (r3 == 0) goto L58
            java.lang.String r4 = r3.getOaid()     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L63
            boolean r3 = r3.getOaidTrackLimited()     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L63
            yads.sd r0 = r0.f112897a     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L63
            r0.getClass()     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L63
            if (r4 == 0) goto L58
            yads.rd r0 = new yads.rd     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L63
            r0.<init>(r4, r3)     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L63
            goto L59
        L56:
            boolean r0 = yads.lb1.f113032a     // Catch: java.lang.Throwable -> L63
        L58:
            r0 = r1
        L59:
            android.content.Context r3 = r7.f112188b     // Catch: java.lang.Throwable -> L63
            r3.unbindService(r2)     // Catch: java.lang.Throwable -> L63
            r1 = r0
            goto L65
        L60:
            boolean r0 = yads.lb1.f113032a     // Catch: java.lang.Throwable -> L63
            goto L65
        L63:
            boolean r0 = yads.lb1.f113032a
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.iz0.a():yads.rd");
    }

    public iz0(Context context, bq2 bq2Var) {
        this.f112187a = bq2Var;
        this.f112188b = context.getApplicationContext();
        this.f112189c = new kz0();
        this.f112190d = new lz0();
    }
}
