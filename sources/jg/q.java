package jg;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f85905a = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public q(boolean z10) {
        this._cur$volatile = new r(8, z10);
    }

    public final boolean a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f85905a;
        while (true) {
            r rVar = (r) atomicReferenceFieldUpdater.get(this);
            int iA = rVar.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                androidx.concurrent.futures.a.a(f85905a, this, rVar, rVar.l());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f85905a;
        while (true) {
            r rVar = (r) atomicReferenceFieldUpdater.get(this);
            if (rVar.d()) {
                return;
            } else {
                androidx.concurrent.futures.a.a(f85905a, this, rVar, rVar.l());
            }
        }
    }

    public final int c() {
        return ((r) f85905a.get(this)).g();
    }

    public final Object e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f85905a;
        while (true) {
            r rVar = (r) atomicReferenceFieldUpdater.get(this);
            Object objM = rVar.m();
            if (objM != r.f85909h) {
                return objM;
            }
            androidx.concurrent.futures.a.a(f85905a, this, rVar, rVar.l());
        }
    }
}
