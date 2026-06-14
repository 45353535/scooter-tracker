package jb;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import lb.t;
import oa.l0;
import oa.q;
import oa.r;
import oa.s;
import oa.s0;
import oa.w;
import oa.x;
import q9.d0;

/* JADX INFO: loaded from: classes12.dex */
public class d implements r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f85719d = new x() { // from class: jb.c
        @Override // oa.x
        public /* synthetic */ x a(t.a aVar) {
            return w.d(this, aVar);
        }

        @Override // oa.x
        public /* synthetic */ x b(int i10) {
            return w.b(this, i10);
        }

        @Override // oa.x
        public final r[] createExtractors() {
            return d.d();
        }

        @Override // oa.x
        public /* synthetic */ x experimentalSetTextTrackTranscodingEnabled(boolean z10) {
            return w.c(this, z10);
        }

        @Override // oa.x
        public /* synthetic */ r[] createExtractors(Uri uri, Map map) {
            return w.a(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private oa.t f85720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f85721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f85722c;

    public static /* synthetic */ r[] d() {
        return new r[]{new d()};
    }

    private static d0 e(d0 d0Var) {
        d0Var.W(0);
        return d0Var;
    }

    private boolean f(s sVar) {
        f fVar = new f();
        if (fVar.a(sVar, true) && (fVar.f85729b & 2) == 2) {
            int iMin = Math.min(fVar.f85736i, 8);
            d0 d0Var = new d0(iMin);
            sVar.peekFully(d0Var.e(), 0, iMin);
            if (b.p(e(d0Var))) {
                this.f85721b = new b();
            } else if (j.r(e(d0Var))) {
                this.f85721b = new j();
            } else if (h.o(e(d0Var))) {
                this.f85721b = new h();
            }
            return true;
        }
        return false;
    }

    @Override // oa.r
    public int a(s sVar, l0 l0Var) throws n9.x {
        q9.a.i(this.f85720a);
        if (this.f85721b == null) {
            if (!f(sVar)) {
                throw n9.x.a("Failed to determine bitstream type", null);
            }
            sVar.resetPeekPosition();
        }
        if (!this.f85722c) {
            s0 s0VarTrack = this.f85720a.track(0, 1);
            this.f85720a.endTracks();
            this.f85721b.d(this.f85720a, s0VarTrack);
            this.f85722c = true;
        }
        return this.f85721b.g(sVar, l0Var);
    }

    @Override // oa.r
    public void b(oa.t tVar) {
        this.f85720a = tVar;
    }

    @Override // oa.r
    public boolean c(s sVar) {
        try {
            return f(sVar);
        } catch (n9.x unused) {
            return false;
        }
    }

    @Override // oa.r
    public /* synthetic */ List getSniffFailureDetails() {
        return q.a(this);
    }

    @Override // oa.r
    public /* synthetic */ r getUnderlyingImplementation() {
        return q.b(this);
    }

    @Override // oa.r
    public void seek(long j10, long j11) {
        i iVar = this.f85721b;
        if (iVar != null) {
            iVar.m(j10, j11);
        }
    }

    @Override // oa.r
    public void release() {
    }
}
