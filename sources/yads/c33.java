package yads;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class c33 implements c30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c30 f109190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a30 f109191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f109192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f109193d;

    public c33(c30 c30Var, gr grVar) {
        this.f109190a = (c30) fi.a(c30Var);
        this.f109191b = (a30) fi.a(grVar);
    }

    @Override // yads.c30
    public final void a(e63 e63Var) {
        e63Var.getClass();
        this.f109190a.a(e63Var);
    }

    @Override // yads.c30
    public final Map c() {
        return this.f109190a.c();
    }

    @Override // yads.c30
    public final void close() throws fr {
        try {
            this.f109190a.close();
            if (this.f109192c) {
                this.f109192c = false;
                gr grVar = (gr) this.f109191b;
                if (grVar.f111307d == null) {
                    return;
                }
                try {
                    grVar.a();
                } catch (IOException e10) {
                    throw new fr(e10);
                }
            }
        } catch (Throwable th2) {
            if (this.f109192c) {
                this.f109192c = false;
                gr grVar2 = (gr) this.f109191b;
                if (grVar2.f111307d != null) {
                    try {
                        grVar2.a();
                    } catch (IOException e11) {
                        throw new fr(e11);
                    }
                }
            }
            throw th2;
        }
    }

    @Override // yads.c30
    public final Uri e() {
        return this.f109190a.e();
    }

    @Override // yads.y20
    public final int c(byte[] bArr, int i10, int i11) throws fr {
        if (this.f109193d == 0) {
            return -1;
        }
        int iC = this.f109190a.c(bArr, i10, i11);
        if (iC > 0) {
            gr grVar = (gr) this.f109191b;
            h30 h30Var = grVar.f111307d;
            if (h30Var != null) {
                int i12 = 0;
                while (i12 < iC) {
                    try {
                        if (grVar.f111311h == grVar.f111308e) {
                            grVar.a();
                            grVar.a(h30Var);
                        }
                        int iMin = (int) Math.min(iC - i12, grVar.f111308e - grVar.f111311h);
                        OutputStream outputStream = grVar.f111310g;
                        int i13 = w83.f117341a;
                        outputStream.write(bArr, i10 + i12, iMin);
                        i12 += iMin;
                        long j10 = iMin;
                        grVar.f111311h += j10;
                        grVar.f111312i += j10;
                    } catch (IOException e10) {
                        throw new fr(e10);
                    }
                }
            }
            long j11 = this.f109193d;
            if (j11 != -1) {
                this.f109193d = j11 - ((long) iC);
            }
        }
        return iC;
    }

    @Override // yads.c30
    public final long a(h30 h30Var) throws fr {
        h30 h30Var2 = h30Var;
        long jA = this.f109190a.a(h30Var2);
        this.f109193d = jA;
        if (jA == 0) {
            return 0L;
        }
        long j10 = h30Var2.f111458g;
        if (j10 == -1 && jA != -1 && j10 != jA) {
            h30Var2 = new h30(h30Var2.f111452a, h30Var2.f111453b, h30Var2.f111454c, h30Var2.f111455d, h30Var2.f111456e, h30Var2.f111457f, jA, h30Var2.f111459h, h30Var2.f111460i, h30Var2.f111461j);
        }
        this.f109192c = true;
        gr grVar = (gr) this.f109191b;
        grVar.getClass();
        h30Var2.f111459h.getClass();
        if (h30Var2.f111458g == -1 && (h30Var2.f111460i & 2) == 2) {
            grVar.f111307d = null;
        } else {
            grVar.f111307d = h30Var2;
            grVar.f111308e = (h30Var2.f111460i & 4) == 4 ? grVar.f111305b : Long.MAX_VALUE;
            grVar.f111312i = 0L;
            try {
                grVar.a(h30Var2);
            } catch (IOException e10) {
                throw new fr(e10);
            }
        }
        return this.f109193d;
    }
}
