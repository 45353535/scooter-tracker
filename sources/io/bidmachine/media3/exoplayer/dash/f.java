package io.bidmachine.media3.exoplayer.dash;

import android.os.Handler;
import android.os.Message;
import ga.b1;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import n9.h;
import n9.v;
import n9.x;
import oa.r0;
import oa.s0;
import q9.o0;
import u9.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ka.b f80781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f80782c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private y9.c f80786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f80787h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f80788i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f80789j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f80790k;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TreeMap f80785f = new TreeMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f80784e = o0.B(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final za.b f80783d = new za.b();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f80791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f80792b;

        public a(long j10, long j11) {
            this.f80791a = j10;
            this.f80792b = j11;
        }
    }

    public interface b {
        void onDashManifestPublishTimeExpired(long j10);

        void onDashManifestRefreshRequested();
    }

    public final class c implements s0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b1 f80793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d0 f80794b = new d0();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final xa.b f80795c = new xa.b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f80796d = -9223372036854775807L;

        c(ka.b bVar) {
            this.f80793a = b1.m(bVar);
        }

        private xa.b h() {
            this.f80795c.c();
            if (this.f80793a.U(this.f80794b, this.f80795c, 0, false) != -4) {
                return null;
            }
            this.f80795c.n();
            return this.f80795c;
        }

        private void l(long j10, long j11) {
            f.this.f80784e.sendMessage(f.this.f80784e.obtainMessage(1, new a(j10, j11)));
        }

        private void m() {
            while (this.f80793a.N(false)) {
                xa.b bVarH = h();
                if (bVarH != null) {
                    long j10 = bVarH.f104990g;
                    v vVarA = f.this.f80783d.a(bVarH);
                    if (vVarA != null) {
                        za.a aVar = (za.a) vVarA.d(0);
                        if (f.h(aVar.f119326a, aVar.f119327b)) {
                            n(j10, aVar);
                        }
                    }
                }
            }
            this.f80793a.t();
        }

        private void n(long j10, za.a aVar) {
            long jF = f.f(aVar);
            if (jF == -9223372036854775807L) {
                return;
            }
            l(j10, jF);
        }

        @Override // oa.s0
        public void a(q9.d0 d0Var, int i10, int i11) {
            this.f80793a.c(d0Var, i10);
        }

        @Override // oa.s0
        public /* synthetic */ int b(h hVar, int i10, boolean z10) {
            return r0.b(this, hVar, i10, z10);
        }

        @Override // oa.s0
        public /* synthetic */ void c(q9.d0 d0Var, int i10) {
            r0.c(this, d0Var, i10);
        }

        @Override // oa.s0
        public /* synthetic */ void d(long j10) {
            r0.a(this, j10);
        }

        @Override // oa.s0
        public void e(long j10, int i10, int i11, int i12, s0.a aVar) {
            this.f80793a.e(j10, i10, i11, i12, aVar);
            m();
        }

        @Override // oa.s0
        public void f(io.bidmachine.media3.common.a aVar) {
            this.f80793a.f(aVar);
        }

        @Override // oa.s0
        public int g(h hVar, int i10, boolean z10, int i11) {
            return this.f80793a.b(hVar, i10, z10);
        }

        public boolean i(long j10) {
            return f.this.j(j10);
        }

        public void j(ha.e eVar) {
            long j10 = this.f80796d;
            if (j10 == -9223372036854775807L || eVar.f73011h > j10) {
                this.f80796d = eVar.f73011h;
            }
            f.this.m(eVar);
        }

        public boolean k(ha.e eVar) {
            long j10 = this.f80796d;
            return f.this.n(j10 != -9223372036854775807L && j10 < eVar.f73010g);
        }

        public void o() {
            this.f80793a.V();
        }
    }

    public f(y9.c cVar, b bVar, ka.b bVar2) {
        this.f80786g = cVar;
        this.f80782c = bVar;
        this.f80781b = bVar2;
    }

    private Map.Entry e(long j10) {
        return this.f80785f.ceilingEntry(Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long f(za.a aVar) {
        try {
            return o0.X0(o0.H(aVar.f119330e));
        } catch (x unused) {
            return -9223372036854775807L;
        }
    }

    private void g(long j10, long j11) {
        Long l10 = (Long) this.f80785f.get(Long.valueOf(j11));
        if (l10 == null) {
            this.f80785f.put(Long.valueOf(j11), Long.valueOf(j10));
        } else if (l10.longValue() > j10) {
            this.f80785f.put(Long.valueOf(j11), Long.valueOf(j10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean h(String str, String str2) {
        if ("urn:mpeg:dash:event:2012".equals(str)) {
            return "1".equals(str2) || "2".equals(str2) || "3".equals(str2);
        }
        return false;
    }

    private void i() {
        if (this.f80788i) {
            this.f80789j = true;
            this.f80788i = false;
            this.f80782c.onDashManifestRefreshRequested();
        }
    }

    private void l() {
        this.f80782c.onDashManifestPublishTimeExpired(this.f80787h);
    }

    private void p() {
        Iterator it = this.f80785f.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < this.f80786g.f108412h) {
                it.remove();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f80790k) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.f80791a, aVar.f80792b);
        return true;
    }

    boolean j(long j10) {
        y9.c cVar = this.f80786g;
        boolean z10 = false;
        if (!cVar.f108408d) {
            return false;
        }
        if (this.f80789j) {
            return true;
        }
        Map.Entry entryE = e(cVar.f108412h);
        if (entryE != null && ((Long) entryE.getValue()).longValue() < j10) {
            this.f80787h = ((Long) entryE.getKey()).longValue();
            l();
            z10 = true;
        }
        if (z10) {
            i();
        }
        return z10;
    }

    public c k() {
        return new c(this.f80781b);
    }

    void m(ha.e eVar) {
        this.f80788i = true;
    }

    boolean n(boolean z10) {
        if (!this.f80786g.f108408d) {
            return false;
        }
        if (this.f80789j) {
            return true;
        }
        if (!z10) {
            return false;
        }
        i();
        return true;
    }

    public void o() {
        this.f80790k = true;
        this.f80784e.removeCallbacksAndMessages(null);
    }

    public void q(y9.c cVar) {
        this.f80789j = false;
        this.f80787h = -9223372036854775807L;
        this.f80786g = cVar;
        p();
    }
}
