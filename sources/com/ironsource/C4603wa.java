package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.ironsource.wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4603wa {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f45723i = "WaterfallLifeCycleHolder";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.ironsource.mediationsdk.t f45727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f45728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f45729f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ConcurrentHashMap<String, CopyOnWriteArrayList<com.ironsource.mediationsdk.t>> f45724a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f45725b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f45726c = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Timer f45730g = new Timer();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ConcurrentHashMap<String, AdInfo> f45731h = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.ironsource.wa$a */
    class a extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f45732a;

        a(String str) {
            this.f45732a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.f45732a + " from memory");
                C4603wa.this.f45724a.remove(this.f45732a);
                ironLog.verbose("waterfall size is currently " + C4603wa.this.f45724a.size());
                ironLog.verbose("removing adInfo with id " + this.f45732a + " from memory");
                C4603wa.this.f45731h.remove(this.f45732a);
                ironLog.verbose("adInfo size is currently " + C4603wa.this.f45731h.size());
            } finally {
                cancel();
            }
        }
    }

    public C4603wa(List<String> list, int i10) {
        this.f45728e = list;
        this.f45729f = i10;
    }

    public synchronized void a(com.ironsource.mediationsdk.t tVar) {
        try {
            IronLog.INTERNAL.verbose();
            com.ironsource.mediationsdk.t tVar2 = this.f45727d;
            if (tVar2 != null && !tVar2.equals(tVar)) {
                this.f45727d.q();
            }
            this.f45727d = tVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean b(com.ironsource.mediationsdk.t r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Throwable -> L2f
            r0.verbose()     // Catch: java.lang.Throwable -> L2f
            r1 = 1
            if (r6 == 0) goto L55
            boolean r2 = r6.o()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L10
            goto L55
        L10:
            com.ironsource.mediationsdk.t r2 = r5.f45727d     // Catch: java.lang.Throwable -> L2f
            r3 = 0
            if (r2 != 0) goto L16
            goto L56
        L16:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r2 = r6.w()     // Catch: java.lang.Throwable -> L2f
            com.ironsource.mediationsdk.LoadWhileShowSupportState r4 = com.ironsource.mediationsdk.LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK     // Catch: java.lang.Throwable -> L2f
            if (r2 != r4) goto L31
            com.ironsource.mediationsdk.t r2 = r5.f45727d     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = r2.c()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = r6.c()     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L31
            goto L55
        L2f:
            r6 = move-exception
            goto L76
        L31:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r2 = r6.w()     // Catch: java.lang.Throwable -> L2f
            com.ironsource.mediationsdk.LoadWhileShowSupportState r4 = com.ironsource.mediationsdk.LoadWhileShowSupportState.NONE     // Catch: java.lang.Throwable -> L2f
            if (r2 == r4) goto L45
            java.util.List<java.lang.String> r2 = r5.f45728e     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = r6.j()     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r2.contains(r4)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L56
        L45:
            com.ironsource.mediationsdk.t r2 = r5.f45727d     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = r2.j()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = r6.j()     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L56
        L55:
            r3 = r1
        L56:
            if (r3 == 0) goto L72
            if (r6 == 0) goto L72
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r2.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r6 = r6.c()     // Catch: java.lang.Throwable -> L2f
            r2.append(r6)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r6 = " will not be added to the auction request"
            r2.append(r6)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L2f
            r0.verbose(r6)     // Catch: java.lang.Throwable -> L2f
        L72:
            r6 = r3 ^ 1
            monitor-exit(r5)
            return r6
        L76:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2f
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C4603wa.b(com.ironsource.mediationsdk.t):boolean");
    }

    public CopyOnWriteArrayList<com.ironsource.mediationsdk.t> c() {
        CopyOnWriteArrayList<com.ironsource.mediationsdk.t> copyOnWriteArrayList = this.f45724a.get(this.f45725b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    public String d() {
        return this.f45725b;
    }

    public int e() {
        return this.f45724a.size();
    }

    public com.ironsource.mediationsdk.t f() {
        return this.f45727d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean g() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.ironsource.mediationsdk.t r0 = r2.f45727d     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            java.lang.String r0 = r0.u()     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = r2.f45726c     // Catch: java.lang.Throwable -> L13
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            r0 = 1
            goto L16
        L13:
            r0 = move-exception
            goto L18
        L15:
            r0 = 0
        L16:
            monitor-exit(r2)
            return r0
        L18:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C4603wa.g():boolean");
    }

    public void a(CopyOnWriteArrayList<com.ironsource.mediationsdk.t> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        b();
        this.f45724a.put(str, copyOnWriteArrayList);
        if (!TextUtils.isEmpty(this.f45726c)) {
            if (g()) {
                ironLog.verbose("ad from previous waterfall " + this.f45726c + " is still showing - the current waterfall " + this.f45725b + " will be deleted instead");
                String str2 = this.f45725b;
                this.f45725b = this.f45726c;
                this.f45726c = str2;
            }
            this.f45730g.schedule(new a(this.f45726c), this.f45729f);
        }
        this.f45726c = this.f45725b;
        this.f45725b = str;
    }

    private void b() {
        for (com.ironsource.mediationsdk.t tVar : c()) {
            if (!tVar.equals(this.f45727d)) {
                tVar.q();
            }
        }
    }

    public boolean a() {
        return this.f45724a.size() > 5;
    }

    public void a(String str, W8 w82, C4638yb c4638yb) {
        if (TextUtils.isEmpty(str) || w82 == null) {
            return;
        }
        this.f45731h.put(str, new AdInfo(w82, c4638yb));
    }

    public AdInfo a(String str) {
        if (this.f45731h.containsKey(str)) {
            return this.f45731h.get(str);
        }
        return null;
    }
}
