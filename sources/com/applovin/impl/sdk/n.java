package com.applovin.impl.sdk;

import android.app.ActivityManager;
import com.applovin.impl.n7;
import com.applovin.impl.w3;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a f10768l = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f10769a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f10771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f10772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f10773e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f10776h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Object f10777i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f10770b = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f10774f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f10775g = new AtomicBoolean();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f10778j = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f10779k = new Object();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f10780a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10781b;

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public long b() {
            return this.f10780a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a((Object) this) && b() == aVar.b() && a() == aVar.a();
        }

        public int hashCode() {
            long jB = b();
            return ((((int) (jB ^ (jB >>> 32))) + 59) * 59) + a();
        }

        public String toString() {
            return "FullScreenAdTracker.LostShowAttemptsData(lastAttemptedTimeMillis=" + b() + ", attemptCount=" + a() + ")";
        }

        static /* synthetic */ int a(a aVar) {
            int i10 = aVar.f10781b;
            aVar.f10781b = i10 + 1;
            return i10;
        }

        public int a() {
            return this.f10781b;
        }
    }

    n(k kVar) {
        this.f10769a = kVar;
    }

    public Long c() {
        return this.f10772d;
    }

    public boolean d() {
        return this.f10770b.get();
    }

    public boolean e() {
        return this.f10775g.get();
    }

    public void a(boolean z10) {
        synchronized (this.f10774f) {
            try {
                this.f10775g.set(z10);
                if (z10) {
                    this.f10776h = System.currentTimeMillis();
                    this.f10769a.O();
                    if (o.a()) {
                        this.f10769a.O().a("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f10776h);
                    }
                    ActivityManager.MemoryInfo memoryInfoA = n7.a((ActivityManager) k.o().getSystemService("activity"));
                    if (memoryInfoA != null) {
                        this.f10773e = memoryInfoA.availMem;
                    }
                    final Long l10 = (Long) this.f10769a.a(x4.J1);
                    if (l10.longValue() >= 0) {
                        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.g2
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f10646b.a(l10);
                            }
                        }, l10.longValue());
                    }
                } else {
                    this.f10776h = 0L;
                    this.f10769a.O();
                    if (o.a()) {
                        this.f10769a.O().a("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long b() {
        return this.f10771c;
    }

    public void c(String str) {
        synchronized (this.f10779k) {
            try {
                a aVar = (a) this.f10778j.get(str);
                if (aVar == null) {
                    aVar = new a();
                    this.f10778j.put(str, aVar);
                }
                aVar.f10780a = System.currentTimeMillis();
                a.a(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(Object obj) {
        if (!w3.a(obj) && this.f10770b.compareAndSet(true, false)) {
            this.f10777i = null;
            this.f10769a.O();
            if (o.a()) {
                this.f10769a.O().a("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public a b(String str) {
        a aVar;
        synchronized (this.f10779k) {
            aVar = (a) this.f10778j.get(str);
            if (aVar == null) {
                aVar = f10768l;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10) {
        if (e() && System.currentTimeMillis() - this.f10776h >= l10.longValue()) {
            this.f10769a.O();
            if (o.a()) {
                this.f10769a.O().a("FullScreenAdTracker", "Resetting \"pending display\" state...");
            }
            this.f10775g.set(false);
        }
    }

    public Object a() {
        return this.f10777i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(final java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = com.applovin.impl.w3.a(r8)
            if (r0 == 0) goto L8
            goto L8f
        L8:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f10770b
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L8f
            r7.f10777i = r8
            long r0 = java.lang.System.currentTimeMillis()
            r7.f10771c = r0
            com.applovin.impl.sdk.k r0 = r7.f10769a
            r0.O()
            boolean r0 = com.applovin.impl.sdk.o.a()
            if (r0 == 0) goto L43
            com.applovin.impl.sdk.k r0 = r7.f10769a
            com.applovin.impl.sdk.o r0 = r0.O()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Setting fullscreen ad displayed: "
            r1.append(r2)
            long r2 = r7.f10771c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FullScreenAdTracker"
            r0.a(r2, r1)
        L43:
            android.content.Context r0 = com.applovin.impl.sdk.k.o()
            java.lang.String r1 = "activity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            android.app.ActivityManager$MemoryInfo r0 = com.applovin.impl.n7.a(r0)
            r1 = 0
            if (r0 == 0) goto L69
            long r3 = r7.f10773e
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L69
            long r5 = r0.availMem
            long r3 = r3 - r5
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r7.f10772d = r0
            r7.f10773e = r1
            goto L6c
        L69:
            r0 = 0
            r7.f10772d = r0
        L6c:
            java.lang.String r0 = "com.applovin.fullscreen_ad_displayed"
            com.applovin.impl.sdk.AppLovinBroadcastManager.sendBroadcastWithAdObject(r0, r8)
            com.applovin.impl.sdk.k r0 = r7.f10769a
            com.applovin.impl.x4 r3 = com.applovin.impl.x4.K1
            java.lang.Object r0 = r0.a(r3)
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 < 0) goto L8f
            com.applovin.impl.sdk.h2 r1 = new com.applovin.impl.sdk.h2
            r1.<init>()
            long r2 = r0.longValue()
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(r1, r2)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.n.a(java.lang.Object):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10, Object obj) {
        if (this.f10770b.get() && System.currentTimeMillis() - this.f10771c >= l10.longValue()) {
            this.f10769a.O();
            if (o.a()) {
                this.f10769a.O().a("FullScreenAdTracker", "Resetting \"display\" state...");
            }
            b(obj);
        }
    }

    public void a(String str) {
        synchronized (this.f10779k) {
            this.f10778j.remove(str);
        }
    }
}
