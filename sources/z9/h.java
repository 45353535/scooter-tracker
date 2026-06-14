package z9;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import io.bidmachine.media3.common.DrmInitData;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import v9.c2;
import z9.e0;
import z9.g;
import z9.h;
import z9.n;
import z9.u;
import z9.w;

/* JADX INFO: loaded from: classes12.dex */
public class h implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UUID f119235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0.c f119236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n0 f119237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f119238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f119239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f119240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f119241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final g f119242i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ka.m f119243j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C1339h f119244k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f119245l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f119246m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f119247n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Set f119248o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f119249p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private e0 f119250q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private z9.g f119251r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private z9.g f119252s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Looper f119253t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Handler f119254u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f119255v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private byte[] f119256w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private c2 f119257x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    volatile d f119258y;

    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f119262d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f119259a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private UUID f119260b = n9.f.f95290d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e0.c f119261c = k0.f119283d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f119263e = new int[0];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f119264f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ka.m f119265g = new ka.k();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f119266h = 300000;

        public h a(n0 n0Var) {
            return new h(this.f119260b, this.f119261c, n0Var, this.f119259a, this.f119262d, this.f119263e, this.f119264f, this.f119265g, this.f119266h);
        }

        public b b(ka.m mVar) {
            this.f119265g = (ka.m) q9.a.e(mVar);
            return this;
        }

        public b c(boolean z10) {
            this.f119262d = z10;
            return this;
        }

        public b d(boolean z10) {
            this.f119264f = z10;
            return this;
        }

        public b e(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (i10 != 2 && i10 != 1) {
                    z10 = false;
                }
                q9.a.a(z10);
            }
            this.f119263e = (int[]) iArr.clone();
            return this;
        }

        public b f(UUID uuid, e0.c cVar) {
            this.f119260b = (UUID) q9.a.e(uuid);
            this.f119261c = (e0.c) q9.a.e(cVar);
            return this;
        }
    }

    private class c implements e0.b {
        private c() {
        }

        @Override // z9.e0.b
        public void a(e0 e0Var, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) q9.a.e(h.this.f119258y)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    private class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (z9.g gVar : h.this.f119246m) {
                if (gVar.n(bArr)) {
                    gVar.t(message.what);
                    return;
                }
            }
        }
    }

    public static final class e extends Exception {
        private e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class f implements w.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u.a f119269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n f119270c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f119271d;

        public f(u.a aVar) {
            this.f119269b = aVar;
        }

        public static /* synthetic */ void a(f fVar) {
            if (fVar.f119271d) {
                return;
            }
            n nVar = fVar.f119270c;
            if (nVar != null) {
                nVar.b(fVar.f119269b);
            }
            h.this.f119247n.remove(fVar);
            fVar.f119271d = true;
        }

        public static /* synthetic */ void b(f fVar, io.bidmachine.media3.common.a aVar) {
            if (h.this.f119249p == 0 || fVar.f119271d) {
                return;
            }
            h hVar = h.this;
            fVar.f119270c = hVar.s((Looper) q9.a.e(hVar.f119253t), fVar.f119269b, aVar, false);
            h.this.f119247n.add(fVar);
        }

        public void c(final io.bidmachine.media3.common.a aVar) {
            ((Handler) q9.a.e(h.this.f119254u)).post(new Runnable() { // from class: z9.j
                @Override // java.lang.Runnable
                public final void run() {
                    h.f.b(this.f119280b, aVar);
                }
            });
        }

        @Override // z9.w.b
        public void release() {
            q9.o0.Z0((Handler) q9.a.e(h.this.f119254u), new Runnable() { // from class: z9.i
                @Override // java.lang.Runnable
                public final void run() {
                    h.f.a(this.f119277b);
                }
            });
        }
    }

    private class g implements g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f119273a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private z9.g f119274b;

        public g() {
        }

        @Override // z9.g.a
        public void a(z9.g gVar) {
            this.f119273a.add(gVar);
            if (this.f119274b != null) {
                return;
            }
            this.f119274b = gVar;
            gVar.z();
        }

        public void b(z9.g gVar) {
            this.f119273a.remove(gVar);
            if (this.f119274b == gVar) {
                this.f119274b = null;
                if (this.f119273a.isEmpty()) {
                    return;
                }
                z9.g gVar2 = (z9.g) this.f119273a.iterator().next();
                this.f119274b = gVar2;
                gVar2.z();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // z9.g.a
        public void onProvisionCompleted() {
            this.f119274b = null;
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) this.f119273a);
            this.f119273a.clear();
            UnmodifiableIterator it = immutableListCopyOf.iterator();
            while (it.hasNext()) {
                ((z9.g) it.next()).u();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // z9.g.a
        public void onProvisionError(Exception exc, boolean z10) {
            this.f119274b = null;
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) this.f119273a);
            this.f119273a.clear();
            UnmodifiableIterator it = immutableListCopyOf.iterator();
            while (it.hasNext()) {
                ((z9.g) it.next()).v(exc, z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z9.h$h, reason: collision with other inner class name */
    class C1339h implements g.b {
        private C1339h() {
        }

        @Override // z9.g.b
        public void a(z9.g gVar, int i10) {
            if (h.this.f119245l != -9223372036854775807L) {
                h.this.f119248o.remove(gVar);
                ((Handler) q9.a.e(h.this.f119254u)).removeCallbacksAndMessages(gVar);
            }
        }

        @Override // z9.g.b
        public void b(final z9.g gVar, int i10) {
            if (i10 == 1 && h.this.f119249p > 0 && h.this.f119245l != -9223372036854775807L) {
                h.this.f119248o.add(gVar);
                ((Handler) q9.a.e(h.this.f119254u)).postAtTime(new Runnable() { // from class: z9.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        gVar.b(null);
                    }
                }, gVar, SystemClock.uptimeMillis() + h.this.f119245l);
            } else if (i10 == 0) {
                h.this.f119246m.remove(gVar);
                if (h.this.f119251r == gVar) {
                    h.this.f119251r = null;
                }
                if (h.this.f119252s == gVar) {
                    h.this.f119252s = null;
                }
                h.this.f119242i.b(gVar);
                if (h.this.f119245l != -9223372036854775807L) {
                    ((Handler) q9.a.e(h.this.f119254u)).removeCallbacksAndMessages(gVar);
                    h.this.f119248o.remove(gVar);
                }
            }
            h.this.B();
        }
    }

    private void A(Looper looper) {
        if (this.f119258y == null) {
            this.f119258y = new d(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        if (this.f119250q != null && this.f119249p == 0 && this.f119246m.isEmpty() && this.f119247n.isEmpty()) {
            ((e0) q9.a.e(this.f119250q)).release();
            this.f119250q = null;
        }
    }

    private void C() {
        UnmodifiableIterator it = ImmutableSet.copyOf((Collection) this.f119248o).iterator();
        while (it.hasNext()) {
            ((n) it.next()).b(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void D() {
        UnmodifiableIterator it = ImmutableSet.copyOf((Collection) this.f119247n).iterator();
        while (it.hasNext()) {
            ((f) it.next()).release();
        }
    }

    private void F(n nVar, u.a aVar) {
        nVar.b(aVar);
        if (this.f119245l != -9223372036854775807L) {
            nVar.b(null);
        }
    }

    private void G(boolean z10) {
        if (z10 && this.f119253t == null) {
            q9.u.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) q9.a.e(this.f119253t)).getThread()) {
            q9.u.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f119253t.getThread().getName(), new IllegalStateException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public n s(Looper looper, u.a aVar, io.bidmachine.media3.common.a aVar2, boolean z10) {
        List listX;
        A(looper);
        DrmInitData drmInitData = aVar2.f80565s;
        if (drmInitData == null) {
            return z(n9.w.k(aVar2.f80561o), z10);
        }
        z9.g gVar = null;
        byte b10 = 0;
        if (this.f119256w == null) {
            listX = x((DrmInitData) q9.a.e(drmInitData), this.f119235b, false);
            if (listX.isEmpty()) {
                e eVar = new e(this.f119235b);
                q9.u.d("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.l(eVar);
                }
                return new c0(new n.a(eVar, 6003));
            }
        } else {
            listX = null;
        }
        if (this.f119239f) {
            Iterator it = this.f119246m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                z9.g gVar2 = (z9.g) it.next();
                if (Objects.equals(gVar2.f119202a, listX)) {
                    gVar = gVar2;
                    break;
                }
            }
        } else {
            gVar = this.f119252s;
        }
        if (gVar != null) {
            gVar.a(aVar);
            return gVar;
        }
        z9.g gVarW = w(listX, false, aVar, z10);
        if (!this.f119239f) {
            this.f119252s = gVarW;
        }
        this.f119246m.add(gVarW);
        return gVarW;
    }

    private static boolean t(n nVar) {
        if (nVar.getState() != 1) {
            return false;
        }
        Throwable cause = ((n.a) q9.a.e(nVar.getError())).getCause();
        return (cause instanceof ResourceBusyException) || a0.e(cause);
    }

    private boolean u(DrmInitData drmInitData) {
        if (this.f119256w != null) {
            return true;
        }
        if (x(drmInitData, this.f119235b, true).isEmpty()) {
            if (drmInitData.f80510e != 1 || !drmInitData.e(0).d(n9.f.f95288b)) {
                return false;
            }
            q9.u.h("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f119235b);
        }
        String str = drmInitData.f80509d;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? q9.o0.f98837a >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    private z9.g v(List list, boolean z10, u.a aVar) {
        q9.a.e(this.f119250q);
        z9.g gVar = new z9.g(this.f119235b, this.f119250q, this.f119242i, this.f119244k, list, this.f119255v, this.f119241h | z10, z10, this.f119256w, this.f119238e, this.f119237d, (Looper) q9.a.e(this.f119253t), this.f119243j, (c2) q9.a.e(this.f119257x));
        gVar.a(aVar);
        if (this.f119245l != -9223372036854775807L) {
            gVar.a(null);
        }
        return gVar;
    }

    private z9.g w(List list, boolean z10, u.a aVar, boolean z11) {
        z9.g gVarV = v(list, z10, aVar);
        if (t(gVarV) && !this.f119248o.isEmpty()) {
            C();
            F(gVarV, aVar);
            gVarV = v(list, z10, aVar);
        }
        if (!t(gVarV) || !z11 || this.f119247n.isEmpty()) {
            return gVarV;
        }
        D();
        if (!this.f119248o.isEmpty()) {
            C();
        }
        F(gVarV, aVar);
        return v(list, z10, aVar);
    }

    private static List x(DrmInitData drmInitData, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(drmInitData.f80510e);
        for (int i10 = 0; i10 < drmInitData.f80510e; i10++) {
            DrmInitData.SchemeData schemeDataE = drmInitData.e(i10);
            if ((schemeDataE.d(uuid) || (n9.f.f95289c.equals(uuid) && schemeDataE.d(n9.f.f95288b))) && (schemeDataE.f80515f != null || z10)) {
                arrayList.add(schemeDataE);
            }
        }
        return arrayList;
    }

    private synchronized void y(Looper looper) {
        try {
            Looper looper2 = this.f119253t;
            if (looper2 == null) {
                this.f119253t = looper;
                this.f119254u = new Handler(looper);
            } else {
                q9.a.g(looper2 == looper);
                q9.a.e(this.f119254u);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private n z(int i10, boolean z10) {
        e0 e0Var = (e0) q9.a.e(this.f119250q);
        if ((e0Var.getCryptoType() == 2 && f0.f119198d) || q9.o0.M0(this.f119240g, i10) == -1 || e0Var.getCryptoType() == 1) {
            return null;
        }
        z9.g gVar = this.f119251r;
        if (gVar == null) {
            z9.g gVarW = w(ImmutableList.of(), true, null, z10);
            this.f119246m.add(gVarW);
            this.f119251r = gVarW;
        } else {
            gVar.a(null);
        }
        return this.f119251r;
    }

    public void E(int i10, byte[] bArr) {
        q9.a.g(this.f119246m.isEmpty());
        if (i10 == 1 || i10 == 3) {
            q9.a.e(bArr);
        }
        this.f119255v = i10;
        this.f119256w = bArr;
    }

    @Override // z9.w
    public n a(u.a aVar, io.bidmachine.media3.common.a aVar2) {
        G(false);
        q9.a.g(this.f119249p > 0);
        q9.a.i(this.f119253t);
        return s(this.f119253t, aVar, aVar2, true);
    }

    @Override // z9.w
    public w.b b(u.a aVar, io.bidmachine.media3.common.a aVar2) {
        q9.a.g(this.f119249p > 0);
        q9.a.i(this.f119253t);
        f fVar = new f(aVar);
        fVar.c(aVar2);
        return fVar;
    }

    @Override // z9.w
    public void c(Looper looper, c2 c2Var) {
        y(looper);
        this.f119257x = c2Var;
    }

    @Override // z9.w
    public int d(io.bidmachine.media3.common.a aVar) {
        G(false);
        int cryptoType = ((e0) q9.a.e(this.f119250q)).getCryptoType();
        DrmInitData drmInitData = aVar.f80565s;
        if (drmInitData == null) {
            if (q9.o0.M0(this.f119240g, n9.w.k(aVar.f80561o)) == -1) {
                return 0;
            }
        } else if (!u(drmInitData)) {
            return 1;
        }
        return cryptoType;
    }

    @Override // z9.w
    public final void prepare() {
        G(true);
        int i10 = this.f119249p;
        this.f119249p = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f119250q == null) {
            e0 e0VarAcquireExoMediaDrm = this.f119236c.acquireExoMediaDrm(this.f119235b);
            this.f119250q = e0VarAcquireExoMediaDrm;
            e0VarAcquireExoMediaDrm.a(new c());
        } else if (this.f119245l != -9223372036854775807L) {
            for (int i11 = 0; i11 < this.f119246m.size(); i11++) {
                ((z9.g) this.f119246m.get(i11)).a(null);
            }
        }
    }

    @Override // z9.w
    public final void release() {
        G(true);
        int i10 = this.f119249p - 1;
        this.f119249p = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f119245l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f119246m);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((z9.g) arrayList.get(i11)).b(null);
            }
        }
        D();
        B();
    }

    private h(UUID uuid, e0.c cVar, n0 n0Var, HashMap map, boolean z10, int[] iArr, boolean z11, ka.m mVar, long j10) {
        q9.a.e(uuid);
        q9.a.b(!n9.f.f95288b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f119235b = uuid;
        this.f119236c = cVar;
        this.f119237d = n0Var;
        this.f119238e = map;
        this.f119239f = z10;
        this.f119240g = iArr;
        this.f119241h = z11;
        this.f119243j = mVar;
        this.f119242i = new g();
        this.f119244k = new C1339h();
        this.f119255v = 0;
        this.f119246m = new ArrayList();
        this.f119247n = Sets.newIdentityHashSet();
        this.f119248o = Sets.newIdentityHashSet();
        this.f119245l = j10;
    }
}
