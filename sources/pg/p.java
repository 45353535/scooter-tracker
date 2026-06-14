package pg;

import com.google.common.util.concurrent.h0;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f98343a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f98344b = 65536;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final m f98345c = m.f98335h.b(new byte[0], 0, 0, null, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f98346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f98347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f98348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f98349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f98350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final AtomicReferenceArray f98351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicReferenceArray f98352j;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f98346d = iHighestOneBit;
        int iE = kotlin.ranges.g.e(iHighestOneBit / 2, 1);
        f98347e = iE;
        String str = Intrinsics.areEqual(System.getProperty("java.vm.name"), "Dalvik") ? "0" : "4194304";
        f98348f = str;
        String property = System.getProperty("kotlinx.io.pool.size.bytes", str);
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        Integer intOrNull = StringsKt.toIntOrNull(property);
        int iE2 = intOrNull != null ? kotlin.ranges.g.e(intOrNull.intValue(), 0) : 0;
        f98349g = iE2;
        f98350h = kotlin.ranges.g.e(iE2 / iE, 8192);
        f98351i = new AtomicReferenceArray(iHighestOneBit);
        f98352j = new AtomicReferenceArray(iE);
    }

    private p() {
    }

    private final int a(long j10) {
        return (int) (j10 & Thread.currentThread().getId());
    }

    private final int b() {
        return a(((long) f98346d) - 1);
    }

    private final int c() {
        return a(((long) f98347e) - 1);
    }

    public static final void d(m segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.e() != null || segment.g() != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        n nVarC = segment.c();
        if (nVarC != null && nVarC.c()) {
            return;
        }
        AtomicReferenceArray atomicReferenceArray = f98351i;
        int iB = f98343a.b();
        segment.r(0);
        segment.f98340e = true;
        while (true) {
            m mVar = (m) atomicReferenceArray.get(iB);
            if (mVar != f98345c) {
                int iD = mVar != null ? mVar.d() : 0;
                if (iD >= f98344b) {
                    if (f98349g > 0) {
                        e(segment);
                        return;
                    }
                    return;
                } else {
                    segment.q(mVar);
                    segment.p(iD + 8192);
                    if (h0.a(atomicReferenceArray, iB, mVar, segment)) {
                        return;
                    }
                }
            }
        }
    }

    private static final void e(m mVar) {
        mVar.r(0);
        mVar.f98340e = true;
        int iC = f98343a.c();
        AtomicReferenceArray atomicReferenceArray = f98352j;
        int i10 = 0;
        while (true) {
            m mVar2 = (m) atomicReferenceArray.get(iC);
            if (mVar2 != f98345c) {
                int iD = (mVar2 != null ? mVar2.d() : 0) + 8192;
                if (iD > f98350h) {
                    int i11 = f98347e;
                    if (i10 >= i11) {
                        return;
                    }
                    i10++;
                    iC = (iC + 1) & (i11 - 1);
                } else {
                    mVar.q(mVar2);
                    mVar.p(iD);
                    if (h0.a(atomicReferenceArray, iC, mVar2, mVar)) {
                        return;
                    }
                }
            }
        }
    }

    public static final m f() {
        m mVar;
        m mVar2;
        AtomicReferenceArray atomicReferenceArray = f98351i;
        int iB = f98343a.b();
        do {
            mVar = f98345c;
            mVar2 = (m) atomicReferenceArray.getAndSet(iB, mVar);
        } while (Intrinsics.areEqual(mVar2, mVar));
        if (mVar2 == null) {
            atomicReferenceArray.set(iB, null);
            return f98349g > 0 ? g() : m.f98335h.a();
        }
        atomicReferenceArray.set(iB, mVar2.e());
        mVar2.q(null);
        mVar2.p(0);
        return mVar2;
    }

    private static final m g() {
        AtomicReferenceArray atomicReferenceArray = f98352j;
        int iC = f98343a.c();
        int i10 = 0;
        while (true) {
            m mVar = f98345c;
            m mVar2 = (m) atomicReferenceArray.getAndSet(iC, mVar);
            if (!Intrinsics.areEqual(mVar2, mVar)) {
                if (mVar2 != null) {
                    atomicReferenceArray.set(iC, mVar2.e());
                    mVar2.q(null);
                    mVar2.p(0);
                    return mVar2;
                }
                atomicReferenceArray.set(iC, null);
                int i11 = f98347e;
                if (i10 >= i11) {
                    return m.f98335h.a();
                }
                iC = (iC + 1) & (i11 - 1);
                i10++;
            }
        }
    }

    public static final n h() {
        return new l();
    }
}
