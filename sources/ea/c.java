package ea;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ga.f0;
import io.bidmachine.media3.exoplayer.h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import n9.v;
import q9.o0;
import u9.d0;
import u9.j0;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends h implements Handler.Callback {
    private long A;
    private v B;
    private long C;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final a f69001s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final b f69002t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Handler f69003u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final xa.b f69004v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final boolean f69005w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private xa.a f69006x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f69007y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f69008z;

    public c(b bVar, Looper looper) {
        this(bVar, looper, a.f69000a);
    }

    private void H(v vVar, List list) {
        for (int i10 = 0; i10 < vVar.e(); i10++) {
            io.bidmachine.media3.common.a wrappedMetadataFormat = vVar.d(i10).getWrappedMetadataFormat();
            if (wrappedMetadataFormat == null || !this.f69001s.a(wrappedMetadataFormat)) {
                list.add(vVar.d(i10));
            } else {
                xa.a aVarB = this.f69001s.b(wrappedMetadataFormat);
                byte[] bArr = (byte[]) q9.a.e(vVar.d(i10).getWrappedMetadataBytes());
                this.f69004v.c();
                this.f69004v.m(bArr.length);
                ((ByteBuffer) o0.i(this.f69004v.f104988e)).put(bArr);
                this.f69004v.n();
                v vVarA = aVarB.a(this.f69004v);
                if (vVarA != null) {
                    H(vVarA, list);
                }
            }
        }
    }

    private long I(long j10) {
        q9.a.g(j10 != -9223372036854775807L);
        q9.a.g(this.C != -9223372036854775807L);
        return j10 - this.C;
    }

    private void J(v vVar) {
        Handler handler = this.f69003u;
        if (handler != null) {
            handler.obtainMessage(1, vVar).sendToTarget();
        } else {
            K(vVar);
        }
    }

    private void K(v vVar) {
        this.f69002t.f(vVar);
    }

    private boolean L(long j10) {
        boolean z10;
        v vVar = this.B;
        if (vVar == null || (!this.f69005w && vVar.f95660b > I(j10))) {
            z10 = false;
        } else {
            J(this.B);
            this.B = null;
            z10 = true;
        }
        if (this.f69007y && this.B == null) {
            this.f69008z = true;
        }
        return z10;
    }

    private void M() {
        if (this.f69007y || this.B != null) {
            return;
        }
        this.f69004v.c();
        d0 d0VarL = l();
        int iE = E(d0VarL, this.f69004v, 0);
        if (iE != -4) {
            if (iE == -5) {
                this.A = ((io.bidmachine.media3.common.a) q9.a.e(d0VarL.f105308b)).f80566t;
                return;
            }
            return;
        }
        if (this.f69004v.f()) {
            this.f69007y = true;
            return;
        }
        if (this.f69004v.f104990g >= n()) {
            xa.b bVar = this.f69004v;
            bVar.f108164k = this.A;
            bVar.n();
            v vVarA = ((xa.a) o0.i(this.f69006x)).a(this.f69004v);
            if (vVarA != null) {
                ArrayList arrayList = new ArrayList(vVarA.e());
                H(vVarA, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.B = new v(I(this.f69004v.f104990g), arrayList);
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void C(io.bidmachine.media3.common.a[] aVarArr, long j10, long j11, f0.b bVar) {
        this.f69006x = this.f69001s.b(aVarArr[0]);
        v vVar = this.B;
        if (vVar != null) {
            this.B = vVar.c((vVar.f95660b + this.C) - j11);
        }
        this.C = j11;
    }

    @Override // io.bidmachine.media3.exoplayer.j2
    public int a(io.bidmachine.media3.common.a aVar) {
        if (this.f69001s.a(aVar)) {
            return j0.a(aVar.N == 0 ? 4 : 2);
        }
        return j0.a(0);
    }

    @Override // io.bidmachine.media3.exoplayer.i2, io.bidmachine.media3.exoplayer.j2
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        K((v) message.obj);
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public boolean isEnded() {
        return this.f69008z;
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public boolean isReady() {
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public void render(long j10, long j11) {
        boolean zL = true;
        while (zL) {
            M();
            zL = L(j10);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void t() {
        this.B = null;
        this.f69006x = null;
        this.C = -9223372036854775807L;
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void w(long j10, boolean z10) {
        this.B = null;
        this.f69007y = false;
        this.f69008z = false;
    }

    public c(b bVar, Looper looper, a aVar) {
        this(bVar, looper, aVar, false);
    }

    public c(b bVar, Looper looper, a aVar, boolean z10) {
        super(5);
        this.f69002t = (b) q9.a.e(bVar);
        this.f69003u = looper == null ? null : o0.z(looper, this);
        this.f69001s = (a) q9.a.e(aVar);
        this.f69005w = z10;
        this.f69004v = new xa.b();
        this.C = -9223372036854775807L;
    }
}
