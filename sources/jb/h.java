package jb;

import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.common.a;
import java.util.Arrays;
import java.util.List;
import jb.i;
import n9.v;
import oa.k0;
import oa.v0;
import q9.d0;

/* JADX INFO: loaded from: classes12.dex */
final class h extends i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f85739o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte[] f85740p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f85741n;

    h() {
    }

    private static boolean n(d0 d0Var, byte[] bArr) {
        if (d0Var.a() < bArr.length) {
            return false;
        }
        int iF = d0Var.f();
        byte[] bArr2 = new byte[bArr.length];
        d0Var.l(bArr2, 0, bArr.length);
        d0Var.W(iF);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean o(d0 d0Var) {
        return n(d0Var, f85739o);
    }

    @Override // jb.i
    protected long f(d0 d0Var) {
        return c(k0.e(d0Var.e()));
    }

    @Override // jb.i
    protected boolean i(d0 d0Var, long j10, i.b bVar) {
        if (n(d0Var, f85739o)) {
            byte[] bArrCopyOf = Arrays.copyOf(d0Var.e(), d0Var.g());
            int iC = k0.c(bArrCopyOf);
            List listA = k0.a(bArrCopyOf);
            if (bVar.f85755a != null) {
                return true;
            }
            bVar.f85755a = new a.b().U("audio/ogg").u0("audio/opus").R(iC).v0(48000).g0(listA).N();
            return true;
        }
        byte[] bArr = f85740p;
        if (!n(d0Var, bArr)) {
            q9.a.i(bVar.f85755a);
            return false;
        }
        q9.a.i(bVar.f85755a);
        if (this.f85741n) {
            return true;
        }
        this.f85741n = true;
        d0Var.X(bArr.length);
        v vVarD = v0.d(ImmutableList.copyOf(v0.k(d0Var, false, false).f96658b));
        if (vVarD == null) {
            return true;
        }
        bVar.f85755a = bVar.f85755a.b().n0(vVarD.b(bVar.f85755a.f80558l)).N();
        return true;
    }

    @Override // jb.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f85741n = false;
        }
    }
}
