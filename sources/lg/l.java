package lg;

import com.google.common.util.concurrent.h0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f94290b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f94291c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f94292d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f94293e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray f94294a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    private final h b(h hVar) {
        if (e() == 127) {
            return hVar;
        }
        if (hVar.f94281c) {
            f94293e.incrementAndGet(this);
        }
        int i10 = f94291c.get(this) & 127;
        while (this.f94294a.get(i10) != null) {
            Thread.yield();
        }
        this.f94294a.lazySet(i10, hVar);
        f94291c.incrementAndGet(this);
        return null;
    }

    private final void c(h hVar) {
        if (hVar == null || !hVar.f94281c) {
            return;
        }
        f94293e.decrementAndGet(this);
    }

    private final int e() {
        return f94291c.get(this) - f94292d.get(this);
    }

    private final h m() {
        h hVar;
        while (true) {
            int i10 = f94292d.get(this);
            if (i10 - f94291c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f94292d.compareAndSet(this, i10, i10 + 1) && (hVar = (h) this.f94294a.getAndSet(i11, null)) != null) {
                c(hVar);
                return hVar;
            }
        }
    }

    private final boolean n(d dVar) {
        h hVarM = m();
        if (hVarM == null) {
            return false;
        }
        dVar.a(hVarM);
        return true;
    }

    private final h o(boolean z10) {
        h hVar;
        do {
            hVar = (h) f94290b.get(this);
            if (hVar == null || hVar.f94281c != z10) {
                int i10 = f94292d.get(this);
                int i11 = f94291c.get(this);
                while (i10 != i11) {
                    if (z10 && f94293e.get(this) == 0) {
                        return null;
                    }
                    i11--;
                    h hVarQ = q(i11, z10);
                    if (hVarQ != null) {
                        return hVarQ;
                    }
                }
                return null;
            }
        } while (!androidx.concurrent.futures.a.a(f94290b, this, hVar, null));
        return hVar;
    }

    private final h p(int i10) {
        int i11 = f94292d.get(this);
        int i12 = f94291c.get(this);
        boolean z10 = i10 == 1;
        while (i11 != i12) {
            if (z10 && f94293e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            h hVarQ = q(i11, z10);
            if (hVarQ != null) {
                return hVarQ;
            }
            i11 = i13;
        }
        return null;
    }

    private final h q(int i10, boolean z10) {
        int i11 = i10 & 127;
        h hVar = (h) this.f94294a.get(i11);
        if (hVar == null || hVar.f94281c != z10 || !h0.a(this.f94294a, i11, hVar, null)) {
            return null;
        }
        if (z10) {
            f94293e.decrementAndGet(this);
        }
        return hVar;
    }

    private final long s(int i10, Ref$ObjectRef ref$ObjectRef) {
        h hVar;
        do {
            hVar = (h) f94290b.get(this);
            if (hVar == null) {
                return -2L;
            }
            if (((hVar.f94281c ? 1 : 2) & i10) == 0) {
                return -2L;
            }
            long jA = j.f94288f.a() - hVar.f94280b;
            long j10 = j.f94284b;
            if (jA < j10) {
                return j10 - jA;
            }
        } while (!androidx.concurrent.futures.a.a(f94290b, this, hVar, null));
        ref$ObjectRef.f93280b = hVar;
        return -1L;
    }

    public final h a(h hVar, boolean z10) {
        if (z10) {
            return b(hVar);
        }
        h hVar2 = (h) f94290b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int i() {
        return f94290b.get(this) != null ? e() + 1 : e();
    }

    public final void j(d dVar) {
        h hVar = (h) f94290b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (n(dVar)) {
        }
    }

    public final h k() {
        h hVar = (h) f94290b.getAndSet(this, null);
        return hVar == null ? m() : hVar;
    }

    public final h l() {
        return o(true);
    }

    public final long r(int i10, Ref$ObjectRef ref$ObjectRef) {
        h hVarM = i10 == 3 ? m() : p(i10);
        if (hVarM == null) {
            return s(i10, ref$ObjectRef);
        }
        ref$ObjectRef.f93280b = hVarM;
        return -1L;
    }
}
