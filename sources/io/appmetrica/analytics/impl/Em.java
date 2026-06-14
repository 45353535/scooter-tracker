package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.executors.SynchronizedBlockingExecutor;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.FinalConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class Em {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fm f75744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile NetworkTask f75745b;

    public Em(@NotNull Fm fm) {
        this.f75744a = fm;
    }

    @NotNull
    public final Context b() {
        return this.f75744a.f75784a;
    }

    @Nullable
    public final synchronized NetworkTask c() throws Throwable {
        NetworkTask networkTask;
        try {
            try {
                if (g()) {
                    networkTask = this.f75745b;
                    if (networkTask == null || networkTask.isRemoved()) {
                        C5101fm c5101fmD = d();
                        C5016ce c5016ce = C5016ce.f76966a;
                        C4998bm c4998bm = new C4998bm(new C5298ne(), C5468ua.H.p());
                        FinalConfigProvider finalConfigProvider = new FinalConfigProvider(c5101fmD);
                        try {
                            NetworkTask networkTask2 = new NetworkTask(new SynchronizedBlockingExecutor(), new C5513w5(this.f75744a.f75784a), new AllHostsExponentialBackoffPolicy(C5016ce.f76966a.a(EnumC4964ae.STARTUP)), new Cm(this, new Vl(), new FullUrlFormer(c4998bm, finalConfigProvider), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), finalConfigProvider), CollectionsKt.emptyList(), C5016ce.f76968c);
                            this.f75745b = networkTask2;
                            networkTask = networkTask2;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                } else {
                    networkTask = null;
                }
                return networkTask;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @NotNull
    public final C5101fm d() {
        return (C5101fm) this.f75744a.f75795l.a();
    }

    @NotNull
    public final C5204jm e() {
        C5204jm c5204jm;
        Ml ml = this.f75744a.f75795l;
        synchronized (ml) {
            c5204jm = ml.f78426c.f76392a;
        }
        return c5204jm;
    }

    public final void f() {
        C5204jm c5204jm;
        Ml ml = this.f75744a.f75795l;
        synchronized (ml) {
            c5204jm = ml.f78426c.f76392a;
        }
        C5306nm c5306nm = c5204jm.f77542c;
        C5281mm c5281mmA = c5306nm.a(c5306nm.f77855m);
        String strA = c5204jm.f77540a;
        String str = c5204jm.f77541b;
        ro roVar = this.f75744a.f75797n;
        String str2 = c5204jm.f77543d;
        roVar.getClass();
        if (!ro.a(str2)) {
            c5281mmA.f77770a = this.f75744a.f75796m.a().f78675id;
        }
        String str3 = c5204jm.f77540a;
        if (str3 == null || str3.length() == 0) {
            strA = this.f75744a.f75791h.a();
            str = "";
        }
        List<String> list = this.f75744a.f75786c.f77032e;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        c5281mmA.f77776g = list;
        C5204jm c5204jm2 = new C5204jm(strA, str, new C5306nm(c5281mmA));
        b(c5204jm2);
        a(c5204jm2);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006a A[PHI: r3
  0x006a: PHI (r3v4 boolean) = (r3v3 boolean), (r3v7 boolean), (r3v7 boolean) binds: [B:18:0x0033, B:27:0x0065, B:28:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean g() {
        /*
            r7 = this;
            r0 = 1
            monitor-enter(r7)
            io.appmetrica.analytics.impl.ua r1 = io.appmetrica.analytics.impl.C5468ua.H     // Catch: java.lang.Throwable -> L30
            io.appmetrica.analytics.impl.L6 r1 = r1.h()     // Catch: java.lang.Throwable -> L30
            boolean r1 = r1.isRestrictedForSdk()     // Catch: java.lang.Throwable -> L30
            r2 = 0
            if (r1 == 0) goto L11
            monitor-exit(r7)
            return r2
        L11:
            io.appmetrica.analytics.impl.jm r1 = r7.e()     // Catch: java.lang.Throwable -> L30
            java.util.Set r3 = io.appmetrica.analytics.impl.AbstractC5127gm.f77275a     // Catch: java.lang.Throwable -> L30
            boolean r3 = r1.f77562w     // Catch: java.lang.Throwable -> L30
            if (r3 != 0) goto L32
            long r3 = r1.f77554o     // Catch: java.lang.Throwable -> L30
            io.appmetrica.analytics.impl.Gm r5 = r1.f77565z     // Catch: java.lang.Throwable -> L30
            int r5 = r5.f75834a     // Catch: java.lang.Throwable -> L30
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L30
            long r3 = r3 + r5
            io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider r5 = io.appmetrica.analytics.impl.AbstractC5127gm.f77276b     // Catch: java.lang.Throwable -> L30
            long r5 = r5.currentTimeSeconds()     // Catch: java.lang.Throwable -> L30
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2e
            goto L32
        L2e:
            r3 = r2
            goto L33
        L30:
            r0 = move-exception
            goto L6d
        L32:
            r3 = r0
        L33:
            if (r3 != 0) goto L6a
            java.lang.String r3 = r1.f77543d     // Catch: java.lang.Throwable -> L30
            boolean r3 = io.appmetrica.analytics.impl.AbstractC5127gm.a(r3)     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L4e
            java.lang.String r3 = r1.f77540a     // Catch: java.lang.Throwable -> L30
            boolean r3 = io.appmetrica.analytics.impl.AbstractC5127gm.a(r3)     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L4e
            java.lang.String r3 = r1.f77541b     // Catch: java.lang.Throwable -> L30
            boolean r3 = io.appmetrica.analytics.impl.AbstractC5127gm.a(r3)     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L4e
            r2 = r0
        L4e:
            r3 = r2 ^ 1
            io.appmetrica.analytics.impl.Fm r4 = r7.f75744a     // Catch: java.lang.Throwable -> L30
            io.appmetrica.analytics.impl.K3 r4 = r4.f75794k     // Catch: java.lang.Throwable -> L30
            io.appmetrica.analytics.impl.fm r5 = r7.d()     // Catch: java.lang.Throwable -> L30
            java.util.Map r5 = r5.f77177h     // Catch: java.lang.Throwable -> L30
            io.appmetrica.analytics.impl.Fm r6 = r7.f75744a     // Catch: java.lang.Throwable -> L30
            io.appmetrica.analytics.impl.H3 r6 = r6.f75793j     // Catch: java.lang.Throwable -> L30
            r4.getClass()     // Catch: java.lang.Throwable -> L30
            boolean r1 = io.appmetrica.analytics.impl.K3.a(r5, r1, r6)     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L6a
            if (r1 != 0) goto L6a
            goto L6b
        L6a:
            r0 = r3
        L6b:
            monitor-exit(r7)
            return r0
        L6d:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L30
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Em.g():boolean");
    }

    public final synchronized void h() {
        this.f75745b = null;
    }

    @NotNull
    public final X4 a() {
        return this.f75744a.f75789f;
    }

    public final synchronized void b(C5204jm c5204jm) {
        this.f75744a.f75795l.a(c5204jm);
        C5178im c5178im = this.f75744a.f75790g;
        c5178im.f77440b.a(c5204jm.f77540a);
        c5178im.f77440b.b(c5204jm.f77541b);
        c5178im.f77439a.save(c5204jm.f77542c);
        this.f75744a.f75788e.a(c5204jm);
    }

    public final synchronized boolean a(@Nullable List<String> list, @NotNull Map<String, String> map) {
        return !AbstractC5127gm.a(e(), list, map, new Dm(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    @androidx.annotation.VisibleForTesting
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C5204jm a(@org.jetbrains.annotations.NotNull io.appmetrica.analytics.impl.C5153hm r9, @org.jetbrains.annotations.NotNull io.appmetrica.analytics.impl.C5101fm r10, long r11) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Em.a(io.appmetrica.analytics.impl.hm, io.appmetrica.analytics.impl.fm, long):io.appmetrica.analytics.impl.jm");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:14:0x0037, B:16:0x003e), top: B:23:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(@org.jetbrains.annotations.NotNull io.appmetrica.analytics.impl.C5153hm r4, @org.jetbrains.annotations.NotNull io.appmetrica.analytics.impl.C5101fm r5, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = io.appmetrica.analytics.impl.no.a(r6)     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L34
            java.lang.String r0 = "Date"
            java.lang.Object r6 = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getFromMapIgnoreCase(r6, r0)     // Catch: java.lang.Throwable -> L32
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L32
            boolean r0 = io.appmetrica.analytics.impl.no.a(r6)     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L34
            r0 = 0
            java.lang.Object r6 = r6.get(r0)     // Catch: java.lang.Throwable -> L34
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L34
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "E, d MMM yyyy HH:mm:ss z"
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.lang.Throwable -> L34
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L34
            java.util.Date r6 = r0.parse(r6)     // Catch: java.lang.Throwable -> L34
            long r0 = r6.getTime()     // Catch: java.lang.Throwable -> L34
            java.lang.Long r6 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L34
            goto L35
        L32:
            r4 = move-exception
            goto L56
        L34:
            r6 = 0
        L35:
            if (r6 == 0) goto L3c
            long r0 = r6.longValue()     // Catch: java.lang.Throwable -> L32
            goto L3e
        L3c:
            r0 = 0
        L3e:
            java.lang.Long r6 = r4.f77338l     // Catch: java.lang.Throwable -> L32
            io.appmetrica.analytics.impl.ck r2 = io.appmetrica.analytics.impl.AbstractC4996bk.f76918a     // Catch: java.lang.Throwable -> L32
            r2.a(r0, r6)     // Catch: java.lang.Throwable -> L32
            io.appmetrica.analytics.impl.jm r4 = r3.a(r4, r5, r0)     // Catch: java.lang.Throwable -> L32
            r3.h()     // Catch: java.lang.Throwable -> L32
            r3.b(r4)     // Catch: java.lang.Throwable -> L32
            kotlin.Unit r5 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r3)
            r3.a(r4)
            return
        L56:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Em.a(io.appmetrica.analytics.impl.hm, io.appmetrica.analytics.impl.fm, java.util.Map):void");
    }

    public final void a(C5204jm c5204jm) {
        ArrayList arrayList;
        Fm fm = this.f75744a;
        Jl jl = fm.f75787d;
        String str = fm.f75785b;
        synchronized (jl.f76008a.f76095b) {
            try {
                Ll ll = jl.f76008a;
                ll.f76096c = c5204jm;
                Collection collection = (Collection) ll.f76094a.f78497a.get(str);
                if (collection == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(collection);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Ul) it.next()).a(c5204jm);
        }
    }

    public final void a(@NotNull Nl nl) {
        synchronized (this) {
            this.f75745b = null;
        }
        Fm fm = this.f75744a;
        fm.f75787d.a(fm.f75789f.f76662a, nl, e());
    }

    public final synchronized void a(@NotNull C5050dm c5050dm) {
        try {
            this.f75744a.f75795l.a(c5050dm);
            C5101fm c5101fmD = d();
            if (c5101fmD.f77180k) {
                List list = c5101fmD.f77179j;
                if (list != null && !list.isEmpty()) {
                    if (!no.a(list, c5101fmD.f77174e)) {
                        C5204jm c5204jmE = e();
                        C5306nm c5306nm = c5204jmE.f77542c;
                        C5281mm c5281mmA = c5306nm.a(c5306nm.f77855m);
                        String str = c5204jmE.f77540a;
                        String str2 = c5204jmE.f77541b;
                        c5281mmA.f77776g = list;
                        C5204jm c5204jm = new C5204jm(str, str2, new C5306nm(c5281mmA));
                        b(c5204jm);
                        a(c5204jm);
                    }
                } else {
                    if (c5101fmD.f77174e != null && (!r5.isEmpty())) {
                        C5204jm c5204jmE2 = e();
                        C5306nm c5306nm2 = c5204jmE2.f77542c;
                        C5281mm c5281mmA2 = c5306nm2.a(c5306nm2.f77855m);
                        String str3 = c5204jmE2.f77540a;
                        String str4 = c5204jmE2.f77541b;
                        c5281mmA2.f77776g = null;
                        C5204jm c5204jm2 = new C5204jm(str3, str4, new C5306nm(c5281mmA2));
                        b(c5204jm2);
                        a(c5204jm2);
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
