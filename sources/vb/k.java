package vb;

import com.google.common.primitives.Ints;
import io.bidmachine.media3.common.a;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import oa.p;
import oa.s0;
import q9.o0;
import vb.l0;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q9.d0 f106182a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f106184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f106185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f106186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f106187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s0 f106188g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f106190i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f106191j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f106192k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private io.bidmachine.media3.common.a f106193l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f106194m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f106195n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f106189h = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f106198q = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f106183b = new AtomicInteger();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f106196o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f106197p = -1;

    public k(String str, int i10, int i11, String str2) {
        this.f106182a = new q9.d0(new byte[i11]);
        this.f106184c = str;
        this.f106185d = i10;
        this.f106186e = str2;
    }

    private boolean c(q9.d0 d0Var, byte[] bArr, int i10) {
        int iMin = Math.min(d0Var.a(), i10 - this.f106190i);
        d0Var.l(bArr, this.f106190i, iMin);
        int i11 = this.f106190i + iMin;
        this.f106190i = i11;
        return i11 == i10;
    }

    private void d() {
        byte[] bArrE = this.f106182a.e();
        if (this.f106193l == null) {
            io.bidmachine.media3.common.a aVarH = oa.p.h(bArrE, this.f106187f, this.f106184c, this.f106185d, this.f106186e, null);
            this.f106193l = aVarH;
            this.f106188g.f(aVarH);
        }
        this.f106194m = oa.p.b(bArrE);
        this.f106192k = Ints.checkedCast(o0.b1(oa.p.g(bArrE), this.f106193l.F));
    }

    private void e() throws n9.x {
        p.b bVarI = oa.p.i(this.f106182a.e());
        h(bVarI);
        this.f106194m = bVarI.f96637d;
        long j10 = bVarI.f96638e;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        this.f106192k = j10;
    }

    private void f() throws n9.x {
        p.b bVarK = oa.p.k(this.f106182a.e(), this.f106183b);
        if (this.f106195n == 3) {
            h(bVarK);
        }
        this.f106194m = bVarK.f96637d;
        long j10 = bVarK.f96638e;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        this.f106192k = j10;
    }

    private boolean g(q9.d0 d0Var) {
        while (d0Var.a() > 0) {
            int i10 = this.f106191j << 8;
            this.f106191j = i10;
            int iH = i10 | d0Var.H();
            this.f106191j = iH;
            int iC = oa.p.c(iH);
            this.f106195n = iC;
            if (iC != 0) {
                byte[] bArrE = this.f106182a.e();
                int i11 = this.f106191j;
                bArrE[0] = (byte) ((i11 >> 24) & 255);
                bArrE[1] = (byte) ((i11 >> 16) & 255);
                bArrE[2] = (byte) ((i11 >> 8) & 255);
                bArrE[3] = (byte) (i11 & 255);
                this.f106190i = 4;
                this.f106191j = 0;
                return true;
            }
        }
        return false;
    }

    private void h(p.b bVar) {
        int i10;
        int i11 = bVar.f96635b;
        if (i11 == -2147483647 || (i10 = bVar.f96636c) == -1) {
            return;
        }
        io.bidmachine.media3.common.a aVar = this.f106193l;
        if (aVar != null && i10 == aVar.E && i11 == aVar.F && Objects.equals(bVar.f96634a, aVar.f80561o)) {
            return;
        }
        io.bidmachine.media3.common.a aVar2 = this.f106193l;
        io.bidmachine.media3.common.a aVarN = (aVar2 == null ? new a.b() : aVar2.b()).f0(this.f106187f).U(this.f106186e).u0(bVar.f96634a).R(bVar.f96636c).v0(bVar.f96635b).j0(this.f106184c).s0(this.f106185d).N();
        this.f106193l = aVarN;
        this.f106188g.f(aVarN);
    }

    @Override // vb.m
    public void a(q9.d0 d0Var) throws n9.x {
        q9.a.i(this.f106188g);
        while (d0Var.a() > 0) {
            switch (this.f106189h) {
                case 0:
                    if (g(d0Var)) {
                        int i10 = this.f106195n;
                        if (i10 == 3 || i10 == 4) {
                            this.f106189h = 4;
                        } else if (i10 != 1) {
                            this.f106189h = 2;
                        } else {
                            this.f106189h = 1;
                        }
                    }
                    break;
                case 1:
                    if (c(d0Var, this.f106182a.e(), 18)) {
                        d();
                        this.f106182a.W(0);
                        this.f106188g.c(this.f106182a, 18);
                        this.f106189h = 6;
                    }
                    break;
                case 2:
                    if (c(d0Var, this.f106182a.e(), 7)) {
                        this.f106196o = oa.p.j(this.f106182a.e());
                        this.f106189h = 3;
                    }
                    break;
                case 3:
                    if (c(d0Var, this.f106182a.e(), this.f106196o)) {
                        e();
                        this.f106182a.W(0);
                        this.f106188g.c(this.f106182a, this.f106196o);
                        this.f106189h = 6;
                    }
                    break;
                case 4:
                    if (c(d0Var, this.f106182a.e(), 6)) {
                        int iL = oa.p.l(this.f106182a.e());
                        this.f106197p = iL;
                        int i11 = this.f106190i;
                        if (i11 > iL) {
                            int i12 = i11 - iL;
                            this.f106190i = i11 - i12;
                            d0Var.W(d0Var.f() - i12);
                        }
                        this.f106189h = 5;
                    }
                    break;
                case 5:
                    if (c(d0Var, this.f106182a.e(), this.f106197p)) {
                        f();
                        this.f106182a.W(0);
                        this.f106188g.c(this.f106182a, this.f106197p);
                        this.f106189h = 6;
                    }
                    break;
                case 6:
                    int iMin = Math.min(d0Var.a(), this.f106194m - this.f106190i);
                    this.f106188g.c(d0Var, iMin);
                    int i13 = this.f106190i + iMin;
                    this.f106190i = i13;
                    if (i13 == this.f106194m) {
                        q9.a.g(this.f106198q != -9223372036854775807L);
                        this.f106188g.e(this.f106198q, this.f106195n == 4 ? 0 : 1, this.f106194m, 0, null);
                        this.f106198q += this.f106192k;
                        this.f106189h = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // vb.m
    public void b(oa.t tVar, l0.d dVar) {
        dVar.a();
        this.f106187f = dVar.b();
        this.f106188g = tVar.track(dVar.c(), 1);
    }

    @Override // vb.m
    public void packetStarted(long j10, int i10) {
        this.f106198q = j10;
    }

    @Override // vb.m
    public void seek() {
        this.f106189h = 0;
        this.f106190i = 0;
        this.f106191j = 0;
        this.f106198q = -9223372036854775807L;
        this.f106183b.set(0);
    }

    @Override // vb.m
    public void packetFinished(boolean z10) {
    }
}
