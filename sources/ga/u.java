package ga;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import ga.c0;
import ga.t;
import io.bidmachine.media3.common.a;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
final class u implements c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f72453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m1 f72454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f72455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f72456e = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference f72457f = new AtomicReference();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ListenableFuture f72458g;

    private final class a implements c1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f72459b = 0;

        public a() {
        }

        @Override // ga.c1
        public int d(u9.d0 d0Var, t9.f fVar, int i10) {
            int i11 = this.f72459b;
            if (i11 == 2) {
                fVar.a(4);
                return -4;
            }
            if ((i10 & 2) != 0 || i11 == 0) {
                d0Var.f105308b = u.this.f72454c.b(0).a(0);
                this.f72459b = 1;
                return -5;
            }
            if (!u.this.f72456e.get()) {
                return -3;
            }
            int length = u.this.f72455d.length;
            fVar.a(1);
            fVar.f104990g = 0L;
            if ((i10 & 4) == 0) {
                fVar.m(length);
                fVar.f104988e.put(u.this.f72455d, 0, length);
            }
            if ((i10 & 1) == 0) {
                this.f72459b = 2;
            }
            return -4;
        }

        @Override // ga.c1
        public boolean isReady() {
            return u.this.f72456e.get();
        }

        @Override // ga.c1
        public void maybeThrowError() throws IOException {
            Throwable th2 = (Throwable) u.this.f72457f.get();
            if (th2 != null) {
                throw new IOException(th2);
            }
        }

        @Override // ga.c1
        public int skipData(long j10) {
            return 0;
        }
    }

    public u(Uri uri, String str, t tVar) {
        this.f72453b = uri;
        this.f72454c = new m1(new n9.f0(new a.b().u0(str).N()));
        this.f72455d = uri.toString().getBytes(StandardCharsets.UTF_8);
    }

    @Override // ga.c0, ga.d1
    public boolean a(io.bidmachine.media3.exoplayer.l1 l1Var) {
        return !this.f72456e.get();
    }

    @Override // ga.c0
    public void c(c0.a aVar, long j10) {
        aVar.f(this);
        new t.a(this.f72453b);
        throw null;
    }

    @Override // ga.c0, ga.d1
    public long getBufferedPositionUs() {
        return this.f72456e.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // ga.c0, ga.d1
    public long getNextLoadPositionUs() {
        return this.f72456e.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // ga.c0
    public m1 getTrackGroups() {
        return this.f72454c;
    }

    public void h() {
        ListenableFuture listenableFuture = this.f72458g;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
        }
    }

    @Override // ga.c0, ga.d1
    public boolean isLoading() {
        return !this.f72456e.get();
    }

    @Override // ga.c0
    public long j(ja.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            if (c1VarArr[i10] != null && (rVarArr[i10] == null || !zArr[i10])) {
                c1VarArr[i10] = null;
            }
            if (c1VarArr[i10] == null && rVarArr[i10] != null) {
                c1VarArr[i10] = new a();
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // ga.c0
    public long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // ga.c0
    public void maybeThrowPrepareError() {
    }

    @Override // ga.c0, ga.d1
    public void reevaluateBuffer(long j10) {
    }

    @Override // ga.c0
    public long seekToUs(long j10) {
        return j10;
    }

    @Override // ga.c0
    public long b(long j10, u9.m0 m0Var) {
        return j10;
    }

    @Override // ga.c0
    public void discardBuffer(long j10, boolean z10) {
    }
}
