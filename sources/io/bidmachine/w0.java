package io.bidmachine;

import android.util.Pair;
import io.bidmachine.protobuf.AdCachePlacementControl;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
class w0 implements v8.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile w0 f82001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f82002d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f82003a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f82004b = new ArrayList();

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(u uVar, u uVar2) {
            return -Double.compare(uVar.F(), uVar2.F());
        }
    }

    w0() {
    }

    public static w0 f() {
        w0 w0Var;
        w0 w0Var2 = f82001c;
        if (w0Var2 != null) {
            return w0Var2;
        }
        synchronized (w0.class) {
            try {
                w0Var = f82001c;
                if (w0Var == null) {
                    w0Var = new w0();
                    f82001c = w0Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return w0Var;
    }

    private AdCachePlacementControl g(AdRequestParameters adRequestParameters) {
        return (AdCachePlacementControl) f82002d.get(adRequestParameters.getAdsType().getName());
    }

    static void m(Map map) {
        Map map2 = f82002d;
        map2.clear();
        if (map != null) {
            map2.putAll(map);
        }
    }

    @Override // v8.a
    public final List a(AdRequestParameters adRequestParameters) {
        ArrayList arrayList;
        synchronized (this.f82003a) {
            try {
                arrayList = new ArrayList();
                for (u uVar : this.f82004b) {
                    if (adRequestParameters.isParametersMatched(uVar.B())) {
                        arrayList.add(new Pair(Double.valueOf(uVar.F()), uVar.f81958o));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    boolean e(u uVar) {
        boolean zContains;
        synchronized (this.f82003a) {
            zContains = this.f82004b.contains(uVar);
        }
        return zContains;
    }

    int h(AdRequestParameters adRequestParameters) {
        AdCachePlacementControl adCachePlacementControlG = g(adRequestParameters);
        int maxRetainCount = adCachePlacementControlG != null ? adCachePlacementControlG.getMaxRetainCount() : 0;
        if (maxRetainCount > 0) {
            return maxRetainCount;
        }
        return 2;
    }

    int i(AdRequestParameters adRequestParameters) {
        AdCachePlacementControl adCachePlacementControlG = g(adRequestParameters);
        int maxCacheSize = adCachePlacementControlG != null ? adCachePlacementControlG.getMaxCacheSize() : 0;
        if (maxCacheSize > 0) {
            return maxCacheSize;
        }
        return 8;
    }

    List j(AdRequestParameters adRequestParameters) {
        synchronized (this.f82003a) {
            try {
                ArrayList arrayList = new ArrayList();
                for (u uVar : this.f82004b) {
                    if (uVar.G() == x0.Idle && adRequestParameters.isParametersMatched(uVar.B())) {
                        arrayList.add(uVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    return arrayList;
                }
                Collections.sort(arrayList, new a());
                return arrayList.subList(0, Math.min(h(adRequestParameters), arrayList.size()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    u k(AdRequestParameters adRequestParameters) {
        synchronized (this.f82003a) {
            try {
                int iH = h(adRequestParameters);
                int i10 = 0;
                final u uVar = null;
                u uVar2 = null;
                for (u uVar3 : this.f82004b) {
                    if (!uVar3.X() && adRequestParameters.isParametersMatched(uVar3.B())) {
                        x0 x0VarG = uVar3.G();
                        x0 x0Var = x0.Idle;
                        if (x0VarG == x0Var) {
                            if (uVar == null || uVar3.F() > uVar.F()) {
                                uVar = uVar3;
                            }
                        } else if (uVar3.G() == x0.Busy) {
                            i10++;
                            if (uVar2 == null) {
                                uVar2 = uVar3;
                            }
                            if (i10 >= iH) {
                                uVar2.w(null);
                                uVar2.n();
                                uVar2.T(x0Var);
                                if (uVar == null || uVar2.F() >= uVar.F()) {
                                    uVar = uVar2;
                                }
                            }
                        }
                    }
                }
                if (uVar == null || !adRequestParameters.isPricePassedByPriceFloor(uVar.F())) {
                    return null;
                }
                uVar.S(true);
                uVar.T(x0.Busy);
                io.bidmachine.core.a.b("AdResponseManager", new ce.b() { // from class: io.bidmachine.t0
                    @Override // ce.b
                    public final Object get() {
                        return String.format("receive - %s", uVar);
                    }
                });
                this.f82004b.remove(uVar);
                this.f82004b.add(uVar);
                return uVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void l(final u uVar) {
        io.bidmachine.core.a.b("AdResponseManager", new ce.b() { // from class: io.bidmachine.v0
            @Override // ce.b
            public final Object get() {
                return String.format("remove - %s", uVar);
            }
        });
        uVar.S(false);
        synchronized (this.f82003a) {
            this.f82004b.remove(uVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void n(final io.bidmachine.u r13) {
        /*
            r12 = this;
            boolean r0 = r13.m()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = "AdResponseManager"
            io.bidmachine.u0 r1 = new io.bidmachine.u0
            r1.<init>()
            io.bidmachine.core.a.b(r0, r1)
            java.lang.Object r0 = r12.f82003a
            monitor-enter(r0)
            io.bidmachine.AdRequestParameters r1 = r13.B()     // Catch: java.lang.Throwable -> L53
            java.util.List r2 = r12.f82004b     // Catch: java.lang.Throwable -> L53
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L53
            r3 = 0
            r4 = 0
            r5 = r4
            r6 = r5
            r4 = r3
        L23:
            boolean r7 = r2.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r7 == 0) goto L65
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L53
            io.bidmachine.u r7 = (io.bidmachine.u) r7     // Catch: java.lang.Throwable -> L53
            io.bidmachine.AdRequestParameters r8 = r7.B()     // Catch: java.lang.Throwable -> L53
            boolean r8 = r1.isParametersMatched(r8)     // Catch: java.lang.Throwable -> L53
            if (r8 != 0) goto L3a
            goto L23
        L3a:
            int r6 = r6 + 1
            io.bidmachine.x0 r8 = r7.G()     // Catch: java.lang.Throwable -> L53
            io.bidmachine.x0 r9 = io.bidmachine.x0.Idle     // Catch: java.lang.Throwable -> L53
            if (r8 != r9) goto L57
            if (r4 == 0) goto L55
            double r8 = r4.F()     // Catch: java.lang.Throwable -> L53
            double r10 = r7.F()     // Catch: java.lang.Throwable -> L53
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 <= 0) goto L23
            goto L55
        L53:
            r13 = move-exception
            goto Lb1
        L55:
            r4 = r7
            goto L23
        L57:
            io.bidmachine.x0 r8 = r7.G()     // Catch: java.lang.Throwable -> L53
            io.bidmachine.x0 r9 = io.bidmachine.x0.Busy     // Catch: java.lang.Throwable -> L53
            if (r8 != r9) goto L23
            int r5 = r5 + 1
            if (r3 != 0) goto L23
            r3 = r7
            goto L23
        L65:
            io.bidmachine.x0 r2 = r13.G()     // Catch: java.lang.Throwable -> L53
            io.bidmachine.x0 r7 = io.bidmachine.x0.Busy     // Catch: java.lang.Throwable -> L53
            if (r2 != r7) goto L89
            if (r3 == 0) goto L89
            int r2 = r12.h(r1)     // Catch: java.lang.Throwable -> L53
            if (r5 < r2) goto L89
            io.bidmachine.x0 r2 = io.bidmachine.x0.Idle     // Catch: java.lang.Throwable -> L53
            r3.T(r2)     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto L8a
            double r7 = r4.F()     // Catch: java.lang.Throwable -> L53
            double r9 = r3.F()     // Catch: java.lang.Throwable -> L53
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 <= 0) goto L89
            goto L8a
        L89:
            r3 = r4
        L8a:
            int r1 = r12.i(r1)     // Catch: java.lang.Throwable -> L53
            if (r6 < r1) goto Laa
            if (r3 == 0) goto Laa
            double r1 = r13.F()     // Catch: java.lang.Throwable -> L53
            double r4 = r3.F()     // Catch: java.lang.Throwable -> L53
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 < 0) goto La8
            r1 = 1
            r3.N(r1)     // Catch: java.lang.Throwable -> L53
            java.util.List r1 = r12.f82004b     // Catch: java.lang.Throwable -> L53
            r1.remove(r3)     // Catch: java.lang.Throwable -> L53
            goto Laa
        La8:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            return
        Laa:
            java.util.List r1 = r12.f82004b     // Catch: java.lang.Throwable -> L53
            r1.add(r13)     // Catch: java.lang.Throwable -> L53
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            return
        Lb1:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.w0.n(io.bidmachine.u):void");
    }
}
