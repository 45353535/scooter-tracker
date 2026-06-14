package lg;

import eg.h0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import jg.e0;
import jg.z;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import lf.m;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Executor, Closeable, AutoCloseable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C1082a f94243i = new C1082a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f94244j = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f94245k = AtomicLongFieldUpdater.newUpdater(a.class, "controlState$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f94246l = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e0 f94247m = new e0("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f94249c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f94250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f94251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lg.d f94252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lg.d f94253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z f94254h;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: lg.a$a, reason: collision with other inner class name */
    public static final class C1082a {
        public /* synthetic */ C1082a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1082a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.f94266d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.f94265c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.f94264b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.f94267e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.f94268f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f94264b = new d("CPU_ACQUIRED", 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f94265c = new d("BLOCKING", 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f94266d = new d("PARKING", 2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f94267e = new d("DORMANT", 3);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f94268f = new d("TERMINATED", 4);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ d[] f94269g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f94270h;

        static {
            d[] dVarArrD = d();
            f94269g = dVarArrD;
            f94270h = qf.a.a(dVarArrD);
        }

        private d(String str, int i10) {
        }

        private static final /* synthetic */ d[] d() {
            return new d[]{f94264b, f94265c, f94266d, f94267e, f94268f};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f94269g.clone();
        }
    }

    public a(int i10, int i11, long j10, String str) {
        this.f94248b = i10;
        this.f94249c = i11;
        this.f94250d = j10;
        this.f94251e = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 > 0) {
            this.f94252f = new lg.d();
            this.f94253g = new lg.d();
            this.f94254h = new z((i10 + 1) * 2);
            this.controlState$volatile = ((long) i10) << 42;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
    }

    private final int R(c cVar) {
        Object objH = cVar.h();
        while (objH != f94247m) {
            if (objH == null) {
                return 0;
            }
            c cVar2 = (c) objH;
            int iG = cVar2.g();
            if (iG != 0) {
                return iG;
            }
            objH = cVar2.h();
        }
        return -1;
    }

    private final c U() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f94244j;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f94254h.b((int) (2097151 & j10));
            if (cVar == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int iR = R(cVar);
            if (iR >= 0 && f94244j.compareAndSet(this, j10, ((long) iR) | j11)) {
                cVar.p(f94247m);
                return cVar;
            }
        }
    }

    private final void i0(long j10) {
        if (u0() || s0(j10)) {
            return;
        }
        u0();
    }

    private final boolean n(h hVar) {
        return hVar.f94281c ? this.f94253g.a(hVar) : this.f94252f.a(hVar);
    }

    private final int o() {
        synchronized (this.f94254h) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j10 = f94245k.get(this);
                int i10 = (int) (j10 & 2097151);
                int iE = kotlin.ranges.g.e(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (iE >= this.f94248b) {
                    return 0;
                }
                if (i10 >= this.f94249c) {
                    return 0;
                }
                int i11 = ((int) (y().get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f94254h.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i11);
                this.f94254h.c(i11, cVar);
                if (i11 != ((int) (2097151 & f94245k.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = iE + 1;
                cVar.start();
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final c q() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !Intrinsics.areEqual(a.this, this)) {
            return null;
        }
        return cVar;
    }

    private final h r0(c cVar, h hVar, boolean z10) {
        d dVar;
        if (cVar == null || (dVar = cVar.f94258d) == d.f94268f) {
            return hVar;
        }
        if (!hVar.f94281c && dVar == d.f94265c) {
            return hVar;
        }
        cVar.f94262h = true;
        return cVar.f94256b.a(hVar, z10);
    }

    private final boolean s0(long j10) {
        if (kotlin.ranges.g.e(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f94248b) {
            int iO = o();
            if (iO == 1 && this.f94248b > 1) {
                o();
            }
            if (iO > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean t0(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f94245k.get(aVar);
        }
        return aVar.s0(j10);
    }

    private final boolean u0() {
        c cVarU;
        do {
            cVarU = U();
            if (cVarU == null) {
                return false;
            }
        } while (!c.f94255j.compareAndSet(cVarU, -1, 0));
        LockSupport.unpark(cVarU);
        return true;
    }

    public static /* synthetic */ void w(a aVar, Runnable runnable, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        aVar.s(runnable, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater y() {
        return f94245k;
    }

    public final boolean V(c cVar) {
        long j10;
        int iG;
        if (cVar.h() != f94247m) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f94244j;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            iG = cVar.g();
            cVar.p(this.f94254h.b((int) (2097151 & j10)));
        } while (!f94244j.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | ((long) iG)));
        return true;
    }

    public final void W(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f94244j;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int iR = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (iR == i10) {
                iR = i11 == 0 ? R(cVar) : i11;
            }
            if (iR >= 0) {
                if (f94244j.compareAndSet(this, j10, j11 | ((long) iR))) {
                    return;
                }
            }
        }
    }

    public final void b0(h hVar) {
        try {
            hVar.run();
        } catch (Throwable th2) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
            } finally {
                eg.b.a();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        e0(10000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e0(long r8) throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = M()
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Ld
            return
        Ld:
            lg.a$c r0 = r7.q()
            jg.z r1 = r7.f94254h
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = m()     // Catch: java.lang.Throwable -> L8f
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L8f
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r3 = (int) r3
            monitor-exit(r1)
            if (r2 > r3) goto L4d
            r1 = r2
        L25:
            jg.z r4 = r7.f94254h
            java.lang.Object r4 = r4.b(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            lg.a$c r4 = (lg.a.c) r4
            if (r4 == r0) goto L48
        L32:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L41
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r8)
            goto L32
        L41:
            lg.l r4 = r4.f94256b
            lg.d r5 = r7.f94253g
            r4.j(r5)
        L48:
            if (r1 == r3) goto L4d
            int r1 = r1 + 1
            goto L25
        L4d:
            lg.d r8 = r7.f94253g
            r8.b()
            lg.d r8 = r7.f94252f
            r8.b()
        L57:
            if (r0 == 0) goto L5f
            lg.h r8 = r0.f(r2)
            if (r8 != 0) goto L8b
        L5f:
            lg.d r8 = r7.f94252f
            java.lang.Object r8 = r8.e()
            lg.h r8 = (lg.h) r8
            if (r8 != 0) goto L8b
            lg.d r8 = r7.f94253g
            java.lang.Object r8 = r8.e()
            lg.h r8 = (lg.h) r8
            if (r8 != 0) goto L8b
            if (r0 == 0) goto L7a
            lg.a$d r8 = lg.a.d.f94268f
            r0.s(r8)
        L7a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = z()
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = y()
            r8.set(r7, r0)
            return
        L8b:
            r7.b0(r8)
            goto L57
        L8f:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.a.e0(long):void");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        w(this, runnable, false, false, 6, null);
    }

    public final boolean isTerminated() {
        return f94246l.get(this) == 1;
    }

    public final void n0() {
        if (u0() || t0(this, 0L, 1, null)) {
            return;
        }
        u0();
    }

    public final h p(Runnable runnable, boolean z10) {
        long jA = j.f94288f.a();
        if (!(runnable instanceof h)) {
            return j.b(runnable, jA, z10);
        }
        h hVar = (h) runnable;
        hVar.f94280b = jA;
        hVar.f94281c = z10;
        return hVar;
    }

    public final void s(Runnable runnable, boolean z10, boolean z11) {
        eg.b.a();
        h hVarP = p(runnable, z10);
        boolean z12 = hVarP.f94281c;
        long jAddAndGet = z12 ? f94245k.addAndGet(this, 2097152L) : 0L;
        h hVarR0 = r0(q(), hVarP, z11);
        if (hVarR0 != null && !n(hVarR0)) {
            throw new RejectedExecutionException(this.f94251e + " was terminated");
        }
        if (z12) {
            i0(jAddAndGet);
        } else {
            n0();
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iA = this.f94254h.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            c cVar = (c) this.f94254h.b(i15);
            if (cVar != null) {
                int i16 = cVar.f94256b.i();
                int i17 = b.$EnumSwitchMapping$0[cVar.f94258d.ordinal()];
                if (i17 == 1) {
                    i12++;
                } else if (i17 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i17 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i16);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i17 == 4) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i16);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (i17 != 5) {
                        throw new m();
                    }
                    i14++;
                }
            }
        }
        long j10 = f94245k.get(this);
        return this.f94251e + '@' + h0.b(this) + "[Pool Size {core = " + this.f94248b + ", max = " + this.f94249c + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f94252f.c() + ", global blocking queue size = " + this.f94253g.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f94248b - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public final class c extends Thread {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f94255j = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l f94256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Ref$ObjectRef f94257c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d f94258d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f94259e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f94260f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f94261g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f94262h;
        private volatile int indexInArray;

        @Nullable
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        private c() {
            setDaemon(true);
            setContextClassLoader(a.this.getClass().getClassLoader());
            this.f94256b = new l();
            this.f94257c = new Ref$ObjectRef();
            this.f94258d = d.f94267e;
            this.nextParkedWorker = a.f94247m;
            int iNanoTime = (int) System.nanoTime();
            this.f94261g = iNanoTime == 0 ? 42 : iNanoTime;
        }

        private final void b(h hVar) {
            this.f94259e = 0L;
            if (this.f94258d == d.f94266d) {
                this.f94258d = d.f94265c;
            }
            if (!hVar.f94281c) {
                a.this.b0(hVar);
                return;
            }
            if (s(d.f94265c)) {
                a.this.n0();
            }
            a.this.b0(hVar);
            a.y().addAndGet(a.this, -2097152L);
            if (this.f94258d != d.f94268f) {
                this.f94258d = d.f94267e;
            }
        }

        private final h d(boolean z10) {
            h hVarM;
            h hVarM2;
            if (z10) {
                boolean z11 = k(a.this.f94248b * 2) == 0;
                if (z11 && (hVarM2 = m()) != null) {
                    return hVarM2;
                }
                h hVarK = this.f94256b.k();
                if (hVarK != null) {
                    return hVarK;
                }
                if (!z11 && (hVarM = m()) != null) {
                    return hVarM;
                }
            } else {
                h hVarM3 = m();
                if (hVarM3 != null) {
                    return hVarM3;
                }
            }
            return t(3);
        }

        private final h e() {
            h hVarL = this.f94256b.l();
            if (hVarL != null) {
                return hVarL;
            }
            h hVar = (h) a.this.f94253g.e();
            return hVar == null ? t(1) : hVar;
        }

        private final boolean j() {
            return this.nextParkedWorker != a.f94247m;
        }

        private final void l() {
            if (this.f94259e == 0) {
                this.f94259e = System.nanoTime() + a.this.f94250d;
            }
            LockSupport.parkNanos(a.this.f94250d);
            if (System.nanoTime() - this.f94259e >= 0) {
                this.f94259e = 0L;
                u();
            }
        }

        private final h m() {
            if (k(2) == 0) {
                h hVar = (h) a.this.f94252f.e();
                return hVar != null ? hVar : (h) a.this.f94253g.e();
            }
            h hVar2 = (h) a.this.f94253g.e();
            return hVar2 != null ? hVar2 : (h) a.this.f94252f.e();
        }

        private final void n() {
            loop0: while (true) {
                boolean z10 = false;
                while (!a.this.isTerminated() && this.f94258d != d.f94268f) {
                    h hVarF = f(this.f94262h);
                    if (hVarF != null) {
                        this.f94260f = 0L;
                        b(hVarF);
                    } else {
                        this.f94262h = false;
                        if (this.f94260f == 0) {
                            r();
                        } else if (z10) {
                            s(d.f94266d);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f94260f);
                            this.f94260f = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
                break loop0;
            }
            s(d.f94268f);
        }

        private final boolean q() {
            long j10;
            if (this.f94258d == d.f94264b) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterY = a.y();
            do {
                j10 = atomicLongFieldUpdaterY.get(aVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!a.y().compareAndSet(aVar, j10, j10 - 4398046511104L));
            this.f94258d = d.f94264b;
            return true;
        }

        private final void r() {
            if (!j()) {
                a.this.V(this);
                return;
            }
            f94255j.set(this, -1);
            while (j() && f94255j.get(this) == -1 && !a.this.isTerminated() && this.f94258d != d.f94268f) {
                s(d.f94266d);
                Thread.interrupted();
                l();
            }
        }

        private final h t(int i10) {
            int i11 = (int) (a.y().get(a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int iK = k(i11);
            a aVar = a.this;
            long jMin = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                iK++;
                if (iK > i11) {
                    iK = 1;
                }
                c cVar = (c) aVar.f94254h.b(iK);
                if (cVar != null && cVar != this) {
                    long jR = cVar.f94256b.r(i10, this.f94257c);
                    if (jR == -1) {
                        Ref$ObjectRef ref$ObjectRef = this.f94257c;
                        h hVar = (h) ref$ObjectRef.f93280b;
                        ref$ObjectRef.f93280b = null;
                        return hVar;
                    }
                    if (jR > 0) {
                        jMin = Math.min(jMin, jR);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f94260f = jMin;
            return null;
        }

        private final void u() {
            a aVar = a.this;
            synchronized (aVar.f94254h) {
                try {
                    if (aVar.isTerminated()) {
                        return;
                    }
                    if (((int) (a.y().get(aVar) & 2097151)) <= aVar.f94248b) {
                        return;
                    }
                    if (f94255j.compareAndSet(this, -1, 1)) {
                        int i10 = this.indexInArray;
                        o(0);
                        aVar.W(this, i10, 0);
                        int andDecrement = (int) (2097151 & a.y().getAndDecrement(aVar));
                        if (andDecrement != i10) {
                            Object objB = aVar.f94254h.b(andDecrement);
                            Intrinsics.checkNotNull(objB);
                            c cVar = (c) objB;
                            aVar.f94254h.c(i10, cVar);
                            cVar.o(i10);
                            aVar.W(cVar, andDecrement, i10);
                        }
                        aVar.f94254h.c(andDecrement, null);
                        Unit unit = Unit.f93236a;
                        this.f94258d = d.f94268f;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final h f(boolean z10) {
            return q() ? d(z10) : e();
        }

        public final int g() {
            return this.indexInArray;
        }

        public final Object h() {
            return this.nextParkedWorker;
        }

        public final int k(int i10) {
            int i11 = this.f94261g;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f94261g = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final void o(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f94251e);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void p(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            n();
        }

        public final boolean s(d dVar) {
            d dVar2 = this.f94258d;
            boolean z10 = dVar2 == d.f94264b;
            if (z10) {
                a.y().addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f94258d = dVar;
            }
            return z10;
        }

        public c(a aVar, int i10) {
            this();
            o(i10);
        }
    }
}
