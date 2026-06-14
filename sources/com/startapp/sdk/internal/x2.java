package com.startapp.sdk.internal;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f65501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f65502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lb f65503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lb f65504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lb f65505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lb f65506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lb f65507h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lb f65508i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lb f65509j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final lb f65510k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AdPreferences.Placement f65511l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ActivityExtra f65512m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AdPreferences f65513n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f65516q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f65517r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f65518s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r2 f65519t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final o2 f65520u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f65522w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f65523x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Long f65524y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public m f65525z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Ad f65514o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f65515p = new AtomicBoolean(false);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ConcurrentHashMap f65521v = new ConcurrentHashMap();

    public x2(Context context, AdPreferences.Placement placement, AdPreferences adPreferences, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5, lb lbVar6, lb lbVar7, lb lbVar8, lb lbVar9, lb lbVar10) {
        this.f65511l = placement;
        this.f65513n = adPreferences;
        if (context instanceof Activity) {
            Context contextA = x0.a(context);
            this.f65500a = contextA == null ? context : contextA;
            this.f65512m = new ActivityExtra((Activity) context);
        } else {
            this.f65500a = context;
            this.f65512m = null;
        }
        this.f65523x = true;
        this.f65501b = lbVar;
        this.f65502c = lbVar2;
        this.f65503d = lbVar3;
        this.f65504e = lbVar4;
        this.f65505f = lbVar5;
        this.f65506g = lbVar6;
        this.f65507h = lbVar7;
        this.f65508i = lbVar8;
        this.f65509j = lbVar9;
        this.f65510k = lbVar10;
        this.f65519t = new r2(this);
        this.f65520u = new o2(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002a  */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.startapp.sdk.adsbase.StartAppAd r5, com.startapp.sdk.adsbase.k r6, boolean r7, boolean r8, java.lang.String r9) {
        /*
            r4 = this;
            j$.util.concurrent.ConcurrentHashMap r0 = r4.f65521v
            monitor-enter(r0)
            com.startapp.sdk.adsbase.Ad r1 = r4.f65514o     // Catch: java.lang.Throwable -> L28
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2a
            boolean r1 = r1.isReady()     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L2a
            com.startapp.sdk.adsbase.Ad r1 = r4.f65514o     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L15
            r1 = r3
            goto L19
        L15:
            boolean r1 = r1.hasAdCacheTtlPassed()     // Catch: java.lang.Throwable -> L28
        L19:
            if (r1 != 0) goto L2a
            if (r7 == 0) goto L1e
            goto L2a
        L1e:
            if (r5 == 0) goto L65
            if (r6 == 0) goto L65
            android.content.Context r7 = r4.f65500a     // Catch: java.lang.Throwable -> L28
            com.startapp.sdk.internal.a0.b(r7, r6, r5, r2)     // Catch: java.lang.Throwable -> L28
            goto L65
        L28:
            r5 = move-exception
            goto L67
        L2a:
            if (r5 == 0) goto L50
            if (r6 == 0) goto L50
            j$.util.concurrent.ConcurrentHashMap r7 = r4.f65521v     // Catch: java.lang.Throwable -> L28
            java.lang.Object r7 = r7.get(r6)     // Catch: java.lang.Throwable -> L37
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L37
            goto L3c
        L37:
            r7 = move-exception
            com.startapp.sdk.internal.g9.a(r7)     // Catch: java.lang.Throwable -> L28
            r7 = 0
        L3c:
            if (r7 != 0) goto L4d
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L28
            r7.<init>()     // Catch: java.lang.Throwable -> L28
            j$.util.concurrent.ConcurrentHashMap r1 = r4.f65521v     // Catch: java.lang.Throwable -> L28
            r1.put(r6, r7)     // Catch: java.lang.Throwable -> L49
            goto L4d
        L49:
            r6 = move-exception
            com.startapp.sdk.internal.g9.a(r6)     // Catch: java.lang.Throwable -> L28
        L4d:
            r7.add(r5)     // Catch: java.lang.Throwable -> L28
        L50:
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.f65515p     // Catch: java.lang.Throwable -> L28
            boolean r5 = r5.compareAndSet(r3, r2)     // Catch: java.lang.Throwable -> L28
            if (r5 == 0) goto L65
            com.startapp.sdk.internal.r2 r5 = r4.f65519t     // Catch: java.lang.Throwable -> L28
            r5.e()     // Catch: java.lang.Throwable -> L28
            com.startapp.sdk.internal.o2 r5 = r4.f65520u     // Catch: java.lang.Throwable -> L28
            r5.e()     // Catch: java.lang.Throwable -> L28
            r4.b(r9, r8)     // Catch: java.lang.Throwable -> L28
        L65:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return
        L67:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.internal.x2.a(com.startapp.sdk.adsbase.StartAppAd, com.startapp.sdk.adsbase.k, boolean, boolean, java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    public final void b(String str, boolean z10) {
        String str2;
        ?? r02 = this.f65514o;
        if (r02 != 0) {
            r02.setVideoCancelCallBack(false);
        }
        if (!this.f65518s || (str2 = this.f65517r) == null) {
            a(str, z10);
            return;
        }
        this.f65518s = false;
        s2 s2Var = new s2(this, new w2(this), z10);
        Context context = this.f65500a;
        ((Executor) com.startapp.sdk.components.a.a(context).C.a()).execute(new r6(context, str2, s2Var, new t2(this)));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r7 = this;
            com.startapp.sdk.adsbase.Ad r0 = r7.f65514o
            if (r0 == 0) goto L6f
            boolean r0 = r0.isReady()
            if (r0 == 0) goto L6f
            android.content.Context r0 = r7.f65500a
            com.startapp.sdk.adsbase.Ad r1 = r7.f65514o
            r2 = 0
            if (r1 == 0) goto L46
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            boolean r4 = r1 instanceof com.startapp.sdk.internal.o8
            if (r4 == 0) goto L32
            com.startapp.sdk.internal.o8 r1 = (com.startapp.sdk.internal.o8) r1
            java.lang.String r1 = r1.a()
            java.util.ArrayList r1 = com.startapp.sdk.internal.u0.a(r1, r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.Boolean r0 = com.startapp.sdk.internal.u0.a(r0, r1, r2, r3, r4)
            boolean r0 = r0.booleanValue()
            goto L47
        L32:
            boolean r4 = r1 instanceof com.startapp.sdk.internal.gb
            if (r4 == 0) goto L46
            com.startapp.sdk.internal.gb r1 = (com.startapp.sdk.internal.gb) r1
            java.util.List r1 = r1.f64561a
            java.util.ArrayList r0 = com.startapp.sdk.internal.u0.a(r0, r1, r2, r3, r2)
            int r0 = r0.size()
            if (r0 != 0) goto L46
            r0 = 1
            goto L47
        L46:
            r0 = r2
        L47:
            if (r0 != 0) goto L65
            com.startapp.sdk.adsbase.Ad r0 = r7.f65514o
            if (r0 != 0) goto L4e
            goto L52
        L4e:
            boolean r2 = r0.hasAdCacheTtlPassed()
        L52:
            if (r2 == 0) goto L55
            goto L65
        L55:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f65515p
            boolean r0 = r0.get()
            if (r0 != 0) goto L63
            com.startapp.sdk.internal.r2 r0 = r7.f65519t
            r0.d()
            return
        L63:
            r1 = r7
            goto L7d
        L65:
            r5 = 0
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 1
            r1 = r7
            r1.a(r2, r3, r4, r5, r6)
            return
        L6f:
            r1 = r7
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f65515p
            boolean r0 = r0.get()
            if (r0 != 0) goto L7d
            com.startapp.sdk.internal.o2 r0 = r1.f65520u
            r0.d()
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.internal.x2.a():void");
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    public final void a(String str, boolean z10) {
        Ad jjVar;
        Ad wdVar;
        if (z10) {
            Long lH = AdsCommonMetaData.k().h();
            if (lH != null && this.f65524y != null && SystemClock.elapsedRealtime() - this.f65524y.longValue() < lH.longValue()) {
                a0.a(this.f65500a, new w2(this), new u2(this.f65500a, this.f65511l, this.f65501b, this.f65502c, this.f65504e, this.f65505f, this.f65506g, this.f65507h, this.f65508i, this.f65509j, this.f65510k), true);
                vi.a(6, this.f65500a, "Failed to load " + this.f65511l.name() + " ad: NO FILL");
                return;
            }
            this.f65524y = Long.valueOf(SystemClock.elapsedRealtime());
        }
        int i10 = v2.f65368a[this.f65511l.ordinal()];
        if (i10 == 1) {
            jjVar = new jj(this.f65500a, AdPreferences.Placement.INAPP_OVERLAY, this.f65501b, this.f65502c, this.f65504e, this.f65505f, this.f65506g, this.f65507h, this.f65508i, this.f65509j, this.f65510k);
        } else if (i10 == 2) {
            boolean z11 = new Random().nextInt(100) < AdsCommonMetaData.k().w();
            boolean zIsForceOfferWall3D = this.f65513n.isForceOfferWall3D();
            boolean zIsForceOfferWall2D = this.f65513n.isForceOfferWall2D();
            WeakHashMap weakHashMap = vi.f65408a;
            if ((z11 || zIsForceOfferWall3D) && !zIsForceOfferWall2D) {
                wdVar = new wd(this.f65500a, this.f65501b, this.f65502c, this.f65504e, this.f65505f, this.f65506g, this.f65507h, this.f65508i, this.f65509j, this.f65510k, this.f65503d);
                jjVar = wdVar;
            } else {
                jjVar = new xd(this.f65500a, this.f65501b, this.f65502c, this.f65504e, this.f65505f, this.f65506g, this.f65507h, this.f65508i, this.f65509j, this.f65510k);
            }
        } else if (i10 == 3) {
            wdVar = new we(this.f65500a, this.f65501b, this.f65502c, this.f65504e, this.f65505f, this.f65506g, this.f65507h, this.f65508i, this.f65509j, this.f65510k);
            jjVar = wdVar;
        } else if (i10 != 4) {
            jjVar = new ae(this.f65500a, this.f65501b, this.f65502c, this.f65504e, this.f65505f, this.f65506g, this.f65507h, this.f65508i, this.f65509j, this.f65510k);
        } else {
            jjVar = new zg(this.f65500a, this.f65501b, this.f65502c, this.f65504e, this.f65505f, this.f65506g, this.f65507h, this.f65508i, this.f65509j, this.f65510k);
        }
        this.f65514o = jjVar;
        ((z6) ((y6) this.f65501b.a())).a(this, this.f65514o);
        this.f65514o.setActivityExtra(this.f65512m);
        this.f65513n.setAutoLoadAmount(this.f65522w);
        this.f65514o.load(this.f65513n, new w2(this), str);
        this.f65516q = System.currentTimeMillis();
    }
}
