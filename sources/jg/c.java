package jg;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f85865b = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f85866c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public c(c cVar) {
        this._prev$volatile = cVar;
    }

    private final c d() {
        c cVarH = h();
        while (cVarH != null && cVarH.k()) {
            cVarH = (c) f85866c.get(cVarH);
        }
        return cVarH;
    }

    private final c e() {
        c cVarF;
        c cVarF2 = f();
        Intrinsics.checkNotNull(cVarF2);
        while (cVarF2.k() && (cVarF = cVarF2.f()) != null) {
            cVarF2 = cVarF;
        }
        return cVarF2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g() {
        return f85865b.get(this);
    }

    public final void c() {
        f85866c.set(this, null);
    }

    public final c f() {
        Object objG = g();
        if (objG == b.f85862a) {
            return null;
        }
        return (c) objG;
    }

    public final c h() {
        return (c) f85866c.get(this);
    }

    public abstract boolean k();

    public final boolean l() {
        return f() == null;
    }

    public final boolean m() {
        return androidx.concurrent.futures.a.a(f85865b, this, null, b.f85862a);
    }

    public final void n() {
        Object obj;
        if (l()) {
            return;
        }
        while (true) {
            c cVarD = d();
            c cVarE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f85866c;
            do {
                obj = atomicReferenceFieldUpdater.get(cVarE);
            } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, cVarE, obj, ((c) obj) == null ? null : cVarD));
            if (cVarD != null) {
                f85865b.set(cVarD, cVarE);
            }
            if (!cVarE.k() || cVarE.l()) {
                if (cVarD == null || !cVarD.k()) {
                    return;
                }
            }
        }
    }

    public final boolean o(c cVar) {
        return androidx.concurrent.futures.a.a(f85865b, this, null, cVar);
    }
}
