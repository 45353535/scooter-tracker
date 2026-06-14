package jf;

import com.google.common.util.concurrent.h0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import jf.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements e, AutoCloseable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f85854g = AtomicLongFieldUpdater.newUpdater(c.class, "top");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f85855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f85856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f85857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicReferenceArray f85858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f85859f;

    @NotNull
    private volatile /* synthetic */ long top;

    public c(int i10) {
        this.f85855b = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(("capacity should be positive but it is " + i10).toString());
        }
        if (i10 > 536870911) {
            throw new IllegalArgumentException(("capacity should be less or equal to 536870911 but it is " + i10).toString());
        }
        this.top = 0L;
        int iHighestOneBit = Integer.highestOneBit((i10 * 4) - 1) * 2;
        this.f85856c = iHighestOneBit;
        this.f85857d = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
        this.f85858e = new AtomicReferenceArray(iHighestOneBit + 1);
        this.f85859f = new int[iHighestOneBit + 1];
    }

    private final int m() {
        long j10;
        long j11;
        int i10;
        do {
            j10 = this.top;
            if (j10 == 0) {
                return 0;
            }
            j11 = ((j10 >> 32) & 4294967295L) + 1;
            i10 = (int) (4294967295L & j10);
            if (i10 == 0) {
                return 0;
            }
        } while (!f85854g.compareAndSet(this, j10, (j11 << 32) | ((long) this.f85859f[i10])));
        return i10;
    }

    private final void o(int i10) {
        long j10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("index should be positive");
        }
        do {
            j10 = this.top;
            this.f85859f[i10] = (int) (4294967295L & j10);
        } while (!f85854g.compareAndSet(this, j10, ((((j10 >> 32) & 4294967295L) + 1) << 32) | ((long) i10)));
    }

    private final Object p() {
        int iM = m();
        if (iM == 0) {
            return null;
        }
        return this.f85858e.getAndSet(iM, null);
    }

    private final boolean q(Object obj) {
        int iIdentityHashCode = ((System.identityHashCode(obj) * (-1640531527)) >>> this.f85857d) + 1;
        for (int i10 = 0; i10 < 8; i10++) {
            if (h0.a(this.f85858e, iIdentityHashCode, null, obj)) {
                o(iIdentityHashCode);
                return true;
            }
            iIdentityHashCode--;
            if (iIdentityHashCode == 0) {
                iIdentityHashCode = this.f85856c;
            }
        }
        return false;
    }

    @Override // jf.e
    public final void O(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        s(instance);
        if (q(instance)) {
            return;
        }
        d(instance);
    }

    protected Object c(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        return instance;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        e.a.a(this);
    }

    protected void d(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // jf.e
    public final void dispose() {
        while (true) {
            Object objP = p();
            if (objP == null) {
                return;
            } else {
                d(objP);
            }
        }
    }

    @Override // jf.e
    public final Object h0() {
        Object objC;
        Object objP = p();
        return (objP == null || (objC = c(objP)) == null) ? n() : objC;
    }

    protected abstract Object n();

    protected void s(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }
}
