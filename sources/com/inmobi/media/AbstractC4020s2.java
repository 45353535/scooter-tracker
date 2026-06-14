package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: renamed from: com.inmobi.media.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4020s2 implements InterfaceC4176y8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f39495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4166xn f39496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableStateFlow f39497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Mutex f39498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f39499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Job f39500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ee f39501g;

    public AbstractC4020s2(CoroutineScope coroutineScope, C4091un viewabilityModel, C4166xn viewabilityCriteria, MutableStateFlow lifecycleObserver) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(viewabilityModel, "viewabilityModel");
        Intrinsics.checkNotNullParameter(viewabilityCriteria, "viewabilityCriteria");
        Intrinsics.checkNotNullParameter(lifecycleObserver, "lifecycleObserver");
        this.f39495a = coroutineScope;
        this.f39496b = viewabilityCriteria;
        this.f39497c = lifecycleObserver;
        this.f39498d = ng.f.b(false, 1, null);
        this.f39499e = new AtomicBoolean(false);
        this.f39501g = new Ee(coroutineScope, viewabilityModel);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.inmobi.media.AbstractC4020s2 r5, kotlin.coroutines.jvm.internal.d r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof com.inmobi.media.C3921o2
            if (r0 == 0) goto L16
            r0 = r6
            com.inmobi.media.o2 r0 = (com.inmobi.media.C3921o2) r0
            int r1 = r0.f39152d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f39152d = r1
            goto L1b
        L16:
            com.inmobi.media.o2 r0 = new com.inmobi.media.o2
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f39150b
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f39152d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlinx.coroutines.sync.Mutex r0 = r0.f39149a
            kotlin.d.b(r6)
            goto L48
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.d.b(r6)
            kotlinx.coroutines.sync.Mutex r6 = r5.f39498d
            r0.f39149a = r6
            r0.f39152d = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = r6
        L48:
            com.inmobi.media.Bn r6 = r5.c()     // Catch: java.lang.Throwable -> L77
            com.inmobi.media.wg r1 = r6.f36641a     // Catch: java.lang.Throwable -> L77
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.f39857f     // Catch: java.lang.Throwable -> L77
            r2.set(r3)     // Catch: java.lang.Throwable -> L77
            kotlinx.coroutines.Job r2 = r1.f39856e     // Catch: java.lang.Throwable -> L77
            com.inmobi.media.H6.a(r2)     // Catch: java.lang.Throwable -> L77
            r1.f39856e = r4     // Catch: java.lang.Throwable -> L77
            com.inmobi.media.Cn r1 = r6.f36644d     // Catch: java.lang.Throwable -> L77
            kotlinx.coroutines.Job r1 = r1.f36686a     // Catch: java.lang.Throwable -> L77
            com.inmobi.media.H6.a(r1)     // Catch: java.lang.Throwable -> L77
            com.inmobi.media.Cn r1 = r6.f36644d     // Catch: java.lang.Throwable -> L77
            r1.f36686a = r4     // Catch: java.lang.Throwable -> L77
            kotlinx.coroutines.Job r1 = r6.f36645e     // Catch: java.lang.Throwable -> L77
            com.inmobi.media.H6.a(r1)     // Catch: java.lang.Throwable -> L77
            r6.f36645e = r4     // Catch: java.lang.Throwable -> L77
            com.inmobi.media.Ee r5 = r5.f39501g     // Catch: java.lang.Throwable -> L77
            r5.b()     // Catch: java.lang.Throwable -> L77
            kotlin.Unit r5 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L77
            r0.unlock(r4)
            return r5
        L77:
            r5 = move-exception
            r0.unlock(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC4020s2.a(com.inmobi.media.s2, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.inmobi.media.AbstractC4020s2 r5, kotlin.coroutines.jvm.internal.d r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof com.inmobi.media.C3946p2
            if (r0 == 0) goto L16
            r0 = r6
            com.inmobi.media.p2 r0 = (com.inmobi.media.C3946p2) r0
            int r1 = r0.f39238d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f39238d = r1
            goto L1b
        L16:
            com.inmobi.media.p2 r0 = new com.inmobi.media.p2
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f39236b
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f39238d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlinx.coroutines.sync.Mutex r0 = r0.f39235a
            kotlin.d.b(r6)
            goto L48
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.d.b(r6)
            kotlinx.coroutines.sync.Mutex r6 = r5.f39498d
            r0.f39235a = r6
            r0.f39238d = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = r6
        L48:
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.f39499e     // Catch: java.lang.Throwable -> L56
            boolean r6 = r6.get()     // Catch: java.lang.Throwable -> L56
            if (r6 == 0) goto L58
            com.inmobi.media.Ee r6 = r5.f39501g     // Catch: java.lang.Throwable -> L56
            r6.a()     // Catch: java.lang.Throwable -> L56
            goto L5d
        L56:
            r5 = move-exception
            goto L94
        L58:
            com.inmobi.media.Ee r6 = r5.f39501g     // Catch: java.lang.Throwable -> L56
            r6.b()     // Catch: java.lang.Throwable -> L56
        L5d:
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.f39499e     // Catch: java.lang.Throwable -> L56
            boolean r6 = r6.get()     // Catch: java.lang.Throwable -> L56
            if (r6 == 0) goto L75
            com.inmobi.media.Bn r5 = r5.c()     // Catch: java.lang.Throwable -> L56
            com.inmobi.media.wg r5 = r5.f36641a     // Catch: java.lang.Throwable -> L56
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.f39857f     // Catch: java.lang.Throwable -> L56
            r1 = 0
            r6.set(r1)     // Catch: java.lang.Throwable -> L56
            r5.a()     // Catch: java.lang.Throwable -> L56
            goto L8e
        L75:
            com.inmobi.media.Bn r5 = r5.c()     // Catch: java.lang.Throwable -> L56
            com.inmobi.media.wg r5 = r5.f36641a     // Catch: java.lang.Throwable -> L56
            kotlinx.coroutines.flow.MutableStateFlow r6 = r5.f39853b     // Catch: java.lang.Throwable -> L56
            com.inmobi.media.Mn r1 = com.inmobi.media.Mn.f37387a     // Catch: java.lang.Throwable -> L56
            r6.setValue(r1)     // Catch: java.lang.Throwable -> L56
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.f39857f     // Catch: java.lang.Throwable -> L56
            r6.set(r3)     // Catch: java.lang.Throwable -> L56
            kotlinx.coroutines.Job r6 = r5.f39856e     // Catch: java.lang.Throwable -> L56
            com.inmobi.media.H6.a(r6)     // Catch: java.lang.Throwable -> L56
            r5.f39856e = r4     // Catch: java.lang.Throwable -> L56
        L8e:
            kotlin.Unit r5 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L56
            r0.unlock(r4)
            return r5
        L94:
            r0.unlock(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC4020s2.b(com.inmobi.media.s2, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public abstract Bn c();

    @Override // com.inmobi.media.InterfaceC4176y8
    public final void a() {
        this.f39499e.set(false);
        this.f39501g.b();
        Bn bnC = c();
        C4134wg c4134wg = bnC.f36641a;
        c4134wg.f39857f.set(true);
        H6.a(c4134wg.f39856e);
        c4134wg.f39856e = null;
        H6.a(bnC.f36644d.f36686a);
        bnC.f36644d.f36686a = null;
        H6.a(bnC.f36645e);
        bnC.f36645e = null;
        H6.a(this.f39500f);
        this.f39500f = null;
    }

    @Override // com.inmobi.media.InterfaceC4176y8
    public final Flow b() {
        if (this.f39500f == null) {
            this.f39500f = eg.i.d(this.f39495a, null, null, new C3896n2(this.f39497c, null, this), 3, null);
            Unit unit = Unit.f93236a;
        }
        Bn bnC = c();
        if (bnC.f36645e == null) {
            C4134wg c4134wg = bnC.f36641a;
            c4134wg.a();
            bnC.f36645e = eg.i.d(bnC.f36642b.f36755a, null, null, new C4216zn(c4134wg.f39853b, null, bnC), 3, null);
            Unit unit2 = Unit.f93236a;
        }
        return hg.i.J(hg.i.L(bnC.f36643c, new C3971q2(this, null)), new C3995r2(this, null));
    }
}
