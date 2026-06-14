package ic;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f0 implements c0, x, a0, z, e0, d0, i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yc.b f74212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f74213c = new CopyOnWriteArrayList();

    class a extends b {
        a() {
            super(null);
        }

        @Override // pd.w
        public void onRun() {
            f0.this.s().j();
            f0.this.f74213c.remove(this);
        }
    }

    private static abstract class b implements u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f74215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f74216c;

        private b() {
        }

        private long e() {
            return Math.max(this.f74216c - System.currentTimeMillis(), 0L);
        }

        public void a() {
            this.f74215b = e();
            jd.h.c(this);
        }

        public void b(long j10) {
            this.f74215b = j10;
            this.f74216c = System.currentTimeMillis() + j10;
            d();
        }

        @Override // pd.w
        public /* synthetic */ void c(Throwable th2) {
            t.a(this, th2);
        }

        public void d() {
            long j10 = this.f74215b;
            if (j10 > 0) {
                jd.h.e(this, j10);
            } else {
                jd.h.d(this);
            }
        }

        @Override // pd.w, java.lang.Runnable
        public /* synthetic */ void run() {
            pd.v.b(this);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public f0(yc.b bVar) {
        this.f74212b = bVar;
    }

    @Override // ic.e0
    public void a(String str) {
    }

    @Override // ic.i
    public void b() {
    }

    @Override // ic.d0
    public void e() {
    }

    @Override // ic.c0
    public void l() {
        Iterator it = this.f74213c.iterator();
        while (it.hasNext()) {
            ((b) it.next()).d();
        }
    }

    @Override // ic.c0
    public void pause() {
        Iterator it = this.f74213c.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
    }

    public yc.b s() {
        return this.f74212b;
    }

    public abstract String t();

    @Override // ic.x
    public void a(Integer num) {
    }

    @Override // ic.x
    public void b(Integer num) {
    }

    @Override // ic.c0
    public void a(long j10) {
        a aVar = new a();
        this.f74213c.add(aVar);
        aVar.b(j10);
    }

    public void a() {
        Iterator it = this.f74213c.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        this.f74213c.clear();
    }

    @Override // ic.a0
    public void k() {
    }

    @Override // ic.z
    public void c(long j10, long j11, float f10) {
    }
}
