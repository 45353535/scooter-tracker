package vh;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f106845a = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f106846b = 65536;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final g0 f106847c = new g0(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f106848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReference[] f106849e;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f106848d = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f106849e = atomicReferenceArr;
    }

    private h0() {
    }

    private final AtomicReference a() {
        return f106849e[(int) (Thread.currentThread().getId() & (((long) f106848d) - 1))];
    }

    public static final void b(g0 segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.f106838f != null || segment.f106839g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f106836d) {
            return;
        }
        AtomicReference atomicReferenceA = f106845a.a();
        g0 g0Var = f106847c;
        g0 g0Var2 = (g0) atomicReferenceA.getAndSet(g0Var);
        if (g0Var2 == g0Var) {
            return;
        }
        int i10 = g0Var2 != null ? g0Var2.f106835c : 0;
        if (i10 >= f106846b) {
            atomicReferenceA.set(g0Var2);
            return;
        }
        segment.f106838f = g0Var2;
        segment.f106834b = 0;
        segment.f106835c = i10 + 8192;
        atomicReferenceA.set(segment);
    }

    public static final g0 c() {
        AtomicReference atomicReferenceA = f106845a.a();
        g0 g0Var = f106847c;
        g0 g0Var2 = (g0) atomicReferenceA.getAndSet(g0Var);
        if (g0Var2 == g0Var) {
            return new g0();
        }
        if (g0Var2 == null) {
            atomicReferenceA.set(null);
            return new g0();
        }
        atomicReferenceA.set(g0Var2.f106838f);
        g0Var2.f106838f = null;
        g0Var2.f106835c = 0;
        return g0Var2;
    }
}
