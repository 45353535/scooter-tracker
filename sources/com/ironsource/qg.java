package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC4478p3;
import com.ironsource.N0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class qg<Smash extends AbstractC4478p3<?>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    AbstractC4478p3<?> f44747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f44748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f44749f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    rg f44751h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ConcurrentHashMap<String, CopyOnWriteArrayList<Smash>> f44744a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44745b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f44746c = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Timer f44750g = new Timer();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f44752i = 5;

    class a extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f44753a;

        a(String str) {
            this.f44753a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.f44753a + " from memory");
                qg.this.f44744a.remove(this.f44753a);
                ironLog.verbose("waterfall size is currently " + qg.this.f44744a.size());
            } finally {
                cancel();
            }
        }
    }

    public qg(List<String> list, int i10, rg rgVar) {
        this.f44748e = list;
        this.f44749f = i10;
        this.f44751h = rgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean e() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.ironsource.p3<?> r0 = r2.f44747d     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            boolean r0 = r0.C()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            com.ironsource.p3<?> r0 = r2.f44747d     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r0.h()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r2.f44746c     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            r0 = 1
            goto L1e
        L1b:
            r0 = move-exception
            goto L20
        L1d:
            r0 = 0
        L1e:
            monitor-exit(r2)
            return r0
        L20:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.qg.e():boolean");
    }

    public synchronized void a(AbstractC4478p3<?> abstractC4478p3) {
        IronLog.INTERNAL.verbose();
        AbstractC4478p3<?> abstractC4478p32 = this.f44747d;
        if (abstractC4478p32 != null && !abstractC4478p32.equals(abstractC4478p3)) {
            this.f44747d.M();
        }
    }

    public synchronized void b(AbstractC4478p3<?> abstractC4478p3) {
        IronLog.INTERNAL.verbose();
        this.f44747d = abstractC4478p3;
    }

    public String c() {
        return this.f44745b;
    }

    public AbstractC4478p3<?> d() {
        return this.f44747d;
    }

    public List<Smash> b() {
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = this.f44744a.get(this.f44745b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList() : copyOnWriteArrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004b A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {all -> 0x0012, blocks: (B:3:0x0001, B:31:0x004b, B:6:0x0008, B:8:0x000d, B:13:0x0014, B:15:0x0018, B:18:0x001f, B:20:0x0023, B:23:0x0030, B:25:0x0034, B:27:0x003c), top: B:36:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean a(com.ironsource.N0.a r1, java.lang.String r2, java.lang.String r3, com.ironsource.mediationsdk.LoadWhileShowSupportState r4, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface r5, com.ironsource.mediationsdk.IronSource.a r6) {
        /*
            r0 = this;
            monitor-enter(r0)
            boolean r5 = r0.a(r5, r6, r2)     // Catch: java.lang.Throwable -> L12
            if (r5 == 0) goto L8
            goto L48
        L8:
            com.ironsource.N0$a r5 = com.ironsource.N0.a.AUTOMATIC_LOAD_WHILE_SHOW     // Catch: java.lang.Throwable -> L12
            r6 = 1
            if (r1 == r5) goto L14
            com.ironsource.N0$a r5 = com.ironsource.N0.a.MANUAL_WITH_LOAD_ON_SHOW     // Catch: java.lang.Throwable -> L12
            if (r1 == r5) goto L14
            goto L49
        L12:
            r1 = move-exception
            goto L63
        L14:
            com.ironsource.p3<?> r1 = r0.f44747d     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L49
            boolean r1 = r1.C()     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L1f
            goto L49
        L1f:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r1 = com.ironsource.mediationsdk.LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK     // Catch: java.lang.Throwable -> L12
            if (r4 != r1) goto L30
            com.ironsource.p3<?> r1 = r0.f44747d     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.c()     // Catch: java.lang.Throwable -> L12
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L30
            goto L48
        L30:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r1 = com.ironsource.mediationsdk.LoadWhileShowSupportState.NONE     // Catch: java.lang.Throwable -> L12
            if (r4 == r1) goto L3c
            java.util.List<java.lang.String> r1 = r0.f44748e     // Catch: java.lang.Throwable -> L12
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L49
        L3c:
            com.ironsource.p3<?> r1 = r0.f44747d     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.n()     // Catch: java.lang.Throwable -> L12
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L49
        L48:
            r6 = 0
        L49:
            if (r6 != 0) goto L61
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r3.<init>()     // Catch: java.lang.Throwable -> L12
            r3.append(r2)     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = " will not be added to the auction request"
            r3.append(r2)     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L12
            r1.verbose(r2)     // Catch: java.lang.Throwable -> L12
        L61:
            monitor-exit(r0)
            return r6
        L63:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.qg.a(com.ironsource.N0$a, java.lang.String, java.lang.String, com.ironsource.mediationsdk.LoadWhileShowSupportState, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface, com.ironsource.mediationsdk.IronSource$a):boolean");
    }

    public boolean a(AdapterBaseInterface adapterBaseInterface, IronSource.a aVar, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof AdapterSettingsInterface) || !((AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(C4456nf.a(aVar))) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }

    public void a(N0.a aVar, CopyOnWriteArrayList<Smash> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        a();
        if (aVar != N0.a.AUTOMATIC_LOAD_WHILE_SHOW && aVar != N0.a.MANUAL_WITH_LOAD_ON_SHOW) {
            this.f44744a.clear();
            this.f44744a.put(str, copyOnWriteArrayList);
        } else {
            this.f44744a.put(str, copyOnWriteArrayList);
            if (!TextUtils.isEmpty(this.f44746c)) {
                if (e()) {
                    ironLog.verbose("ad from previous waterfall " + this.f44746c + " is still showing - the current waterfall " + this.f44745b + " will be deleted instead");
                    String str2 = this.f44745b;
                    this.f44745b = this.f44746c;
                    this.f44746c = str2;
                }
                this.f44750g.schedule(new a(this.f44746c), this.f44749f);
            }
        }
        this.f44746c = this.f44745b;
        this.f44745b = str;
        if (this.f44744a.size() > 5) {
            this.f44751h.a(this.f44744a.size());
        }
    }

    private void a() {
        for (Smash smash : b()) {
            if (!smash.equals(this.f44747d)) {
                smash.M();
            }
        }
    }
}
