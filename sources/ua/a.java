package ua;

import io.bidmachine.media3.common.a;
import java.util.Collections;
import oa.a;
import oa.s0;
import q9.d0;
import ua.e;

/* JADX INFO: loaded from: classes12.dex */
final class a extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f105333e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f105334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f105335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f105336d;

    public a(s0 s0Var) {
        super(s0Var);
    }

    @Override // ua.e
    protected boolean b(d0 d0Var) throws e.a {
        if (this.f105334b) {
            d0Var.X(1);
        } else {
            int iH = d0Var.H();
            int i10 = (iH >> 4) & 15;
            this.f105336d = i10;
            if (i10 == 2) {
                this.f105357a.f(new a.b().U("video/x-flv").u0("audio/mpeg").R(1).v0(f105333e[(iH >> 2) & 3]).N());
                this.f105335c = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f105357a.f(new a.b().U("video/x-flv").u0(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").R(1).v0(8000).N());
                this.f105335c = true;
            } else if (i10 != 10) {
                throw new e.a("Audio format not supported: " + this.f105336d);
            }
            this.f105334b = true;
        }
        return true;
    }

    @Override // ua.e
    protected boolean c(d0 d0Var, long j10) {
        if (this.f105336d == 2) {
            int iA = d0Var.a();
            this.f105357a.c(d0Var, iA);
            this.f105357a.e(j10, 1, iA, 0, null);
            return true;
        }
        int iH = d0Var.H();
        if (iH != 0 || this.f105335c) {
            if (this.f105336d == 10 && iH != 1) {
                return false;
            }
            int iA2 = d0Var.a();
            this.f105357a.c(d0Var, iA2);
            this.f105357a.e(j10, 1, iA2, 0, null);
            return true;
        }
        int iA3 = d0Var.a();
        byte[] bArr = new byte[iA3];
        d0Var.l(bArr, 0, iA3);
        a.b bVarE = oa.a.e(bArr);
        this.f105357a.f(new a.b().U("video/x-flv").u0("audio/mp4a-latm").S(bVarE.f96448c).R(bVarE.f96447b).v0(bVarE.f96446a).g0(Collections.singletonList(bArr)).N());
        this.f105335c = true;
        return false;
    }
}
