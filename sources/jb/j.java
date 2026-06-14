package jb;

import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.common.a;
import java.util.ArrayList;
import java.util.Arrays;
import jb.i;
import n9.x;
import oa.v0;
import q9.d0;

/* JADX INFO: loaded from: classes12.dex */
final class j extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a f85757n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f85758o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f85759p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private v0.c f85760q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private v0.a f85761r;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v0.c f85762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v0.a f85763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f85764c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final v0.b[] f85765d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f85766e;

        public a(v0.c cVar, v0.a aVar, byte[] bArr, v0.b[] bVarArr, int i10) {
            this.f85762a = cVar;
            this.f85763b = aVar;
            this.f85764c = bArr;
            this.f85765d = bVarArr;
            this.f85766e = i10;
        }
    }

    j() {
    }

    static void n(d0 d0Var, long j10) {
        if (d0Var.b() < d0Var.g() + 4) {
            d0Var.T(Arrays.copyOf(d0Var.e(), d0Var.g() + 4));
        } else {
            d0Var.V(d0Var.g() + 4);
        }
        byte[] bArrE = d0Var.e();
        bArrE[d0Var.g() - 4] = (byte) (j10 & 255);
        bArrE[d0Var.g() - 3] = (byte) ((j10 >>> 8) & 255);
        bArrE[d0Var.g() - 2] = (byte) ((j10 >>> 16) & 255);
        bArrE[d0Var.g() - 1] = (byte) ((j10 >>> 24) & 255);
    }

    private static int o(byte b10, a aVar) {
        return !aVar.f85765d[p(b10, aVar.f85766e, 1)].f96660a ? aVar.f85762a.f96670g : aVar.f85762a.f96671h;
    }

    static int p(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static boolean r(d0 d0Var) {
        try {
            return v0.o(1, d0Var, true);
        } catch (x unused) {
            return false;
        }
    }

    @Override // jb.i
    protected void e(long j10) {
        super.e(j10);
        this.f85759p = j10 != 0;
        v0.c cVar = this.f85760q;
        this.f85758o = cVar != null ? cVar.f96670g : 0;
    }

    @Override // jb.i
    protected long f(d0 d0Var) {
        if ((d0Var.e()[0] & 1) == 1) {
            return -1L;
        }
        int iO = o(d0Var.e()[0], (a) q9.a.i(this.f85757n));
        long j10 = this.f85759p ? (this.f85758o + iO) / 4 : 0;
        n(d0Var, j10);
        this.f85759p = true;
        this.f85758o = iO;
        return j10;
    }

    @Override // jb.i
    protected boolean i(d0 d0Var, long j10, i.b bVar) throws x {
        if (this.f85757n != null) {
            q9.a.e(bVar.f85755a);
            return false;
        }
        a aVarQ = q(d0Var);
        this.f85757n = aVarQ;
        if (aVarQ == null) {
            return true;
        }
        v0.c cVar = aVarQ.f85762a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.f96673j);
        arrayList.add(aVarQ.f85764c);
        bVar.f85755a = new a.b().U("audio/ogg").u0("audio/vorbis").Q(cVar.f96668e).p0(cVar.f96667d).R(cVar.f96665b).v0(cVar.f96666c).g0(arrayList).n0(v0.d(ImmutableList.copyOf(aVarQ.f85763b.f96658b))).N();
        return true;
    }

    @Override // jb.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f85757n = null;
            this.f85760q = null;
            this.f85761r = null;
        }
        this.f85758o = 0;
        this.f85759p = false;
    }

    a q(d0 d0Var) throws x {
        v0.c cVar = this.f85760q;
        if (cVar == null) {
            this.f85760q = v0.l(d0Var);
            return null;
        }
        v0.a aVar = this.f85761r;
        if (aVar == null) {
            this.f85761r = v0.j(d0Var);
            return null;
        }
        byte[] bArr = new byte[d0Var.g()];
        System.arraycopy(d0Var.e(), 0, bArr, 0, d0Var.g());
        return new a(cVar, aVar, bArr, v0.m(d0Var, cVar.f96665b), v0.b(r4.length - 1));
    }
}
