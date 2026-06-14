package jg;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f85900b = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f85901c = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f85902d = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (androidx.concurrent.futures.a.a(jg.p.f85900b, r3, r2, ((jg.y) r4).f85924a) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final jg.p g() {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = n()
            java.lang.Object r0 = r0.get(r7)
            jg.p r0 = (jg.p) r0
            r1 = 0
            r2 = r0
        Lc:
            r3 = r1
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = m()
            java.lang.Object r4 = r4.get(r2)
            if (r4 != r7) goto L26
            if (r0 != r2) goto L1a
            goto L25
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = n()
            boolean r0 = androidx.concurrent.futures.a.a(r1, r7, r0, r2)
            if (r0 != 0) goto L25
            goto L0
        L25:
            return r2
        L26:
            boolean r5 = r7.p()
            if (r5 == 0) goto L2d
            return r1
        L2d:
            boolean r5 = r4 instanceof jg.y
            if (r5 == 0) goto L4f
            if (r3 == 0) goto L44
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = m()
            jg.y r4 = (jg.y) r4
            jg.p r4 = r4.f85924a
            boolean r2 = androidx.concurrent.futures.a.a(r5, r3, r2, r4)
            if (r2 != 0) goto L42
            goto L0
        L42:
            r2 = r3
            goto Lc
        L44:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = n()
            java.lang.Object r2 = r4.get(r2)
            jg.p r2 = (jg.p) r2
            goto Ld
        L4f:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r3)
            r3 = r4
            jg.p r3 = (jg.p) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.p.g():jg.p");
    }

    private final p h(p pVar) {
        while (pVar.p()) {
            pVar = (p) f85901c.get(pVar);
        }
        return pVar;
    }

    private final void i(p pVar) {
        p pVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f85901c;
        do {
            pVar2 = (p) atomicReferenceFieldUpdater.get(pVar);
            if (j() != pVar) {
                return;
            }
        } while (!androidx.concurrent.futures.a.a(f85901c, pVar, pVar2, this));
        if (p()) {
            pVar.g();
        }
    }

    private final y s() {
        y yVar = (y) f85902d.get(this);
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(this);
        f85902d.set(this, yVar2);
        return yVar2;
    }

    public final boolean c(p pVar, int i10) {
        p pVarL;
        do {
            pVarL = l();
            if (pVarL instanceof n) {
                return (((n) pVarL).f85898e & i10) == 0 && pVarL.c(pVar, i10);
            }
        } while (!pVarL.d(pVar, this));
        return true;
    }

    public final boolean d(p pVar, p pVar2) {
        f85901c.set(pVar, this);
        f85900b.set(pVar, pVar2);
        if (!androidx.concurrent.futures.a.a(f85900b, this, pVar2, pVar)) {
            return false;
        }
        pVar.i(pVar2);
        return true;
    }

    public final boolean e(p pVar) {
        f85901c.set(pVar, this);
        f85900b.set(pVar, this);
        while (j() == this) {
            if (androidx.concurrent.futures.a.a(f85900b, this, this, pVar)) {
                pVar.i(this);
                return true;
            }
        }
        return false;
    }

    public final void f(int i10) {
        c(new n(i10), i10);
    }

    public final Object j() {
        return f85900b.get(this);
    }

    public final p k() {
        p pVar;
        Object objJ = j();
        y yVar = objJ instanceof y ? (y) objJ : null;
        if (yVar != null && (pVar = yVar.f85924a) != null) {
            return pVar;
        }
        Intrinsics.checkNotNull(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (p) objJ;
    }

    public final p l() {
        p pVarG = g();
        return pVarG == null ? h((p) f85901c.get(this)) : pVarG;
    }

    public boolean p() {
        return j() instanceof y;
    }

    public boolean q() {
        return r() == null;
    }

    public final p r() {
        Object objJ;
        p pVar;
        do {
            objJ = j();
            if (objJ instanceof y) {
                return ((y) objJ).f85924a;
            }
            if (objJ == this) {
                return (p) objJ;
            }
            Intrinsics.checkNotNull(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            pVar = (p) objJ;
        } while (!androidx.concurrent.futures.a.a(f85900b, this, objJ, pVar.s()));
        pVar.g();
        return null;
    }

    public String toString() {
        return new kotlin.jvm.internal.l0(this) { // from class: jg.p.a
            @Override // kotlin.jvm.internal.l0, kotlin.reflect.KProperty0
            public Object get() {
                return eg.h0.a(this.receiver);
            }
        } + '@' + eg.h0.b(this);
    }
}
