package yads;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ir implements c30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final er f112088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c30 f112089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c33 f112090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c30 f112091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pr f112092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f112093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f112094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f112095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Uri f112096i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h30 f112097j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h30 f112098k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c30 f112099l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f112100m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f112101n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f112102o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public kw2 f112103p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f112104q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f112105r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f112106s;

    public ir(er erVar, c30 c30Var, nt0 nt0Var, gr grVar, pr prVar, int i10) {
        this.f112088a = erVar;
        this.f112089b = nt0Var;
        this.f112092e = prVar == null ? pr.f114750a : prVar;
        this.f112093f = (i10 & 1) != 0;
        this.f112094g = false;
        this.f112095h = false;
        if (c30Var != null) {
            this.f112091d = c30Var;
            this.f112090c = grVar != null ? new c33(c30Var, grVar) : null;
        } else {
            this.f112091d = rb2.f115395a;
            this.f112090c = null;
        }
    }

    @Override // yads.c30
    public final void a(e63 e63Var) {
        e63Var.getClass();
        this.f112089b.a(e63Var);
        this.f112091d.a(e63Var);
    }

    @Override // yads.c30
    public final Map c() {
        return !j() ? this.f112091d.c() : Collections.EMPTY_MAP;
    }

    @Override // yads.c30
    public final void close() {
        this.f112097j = null;
        this.f112096i = null;
        this.f112101n = 0L;
        try {
            g();
        } catch (Throwable th2) {
            if (j() || (th2 instanceof br)) {
                this.f112104q = true;
            }
            throw th2;
        }
    }

    @Override // yads.c30
    public final Uri e() {
        return this.f112096i;
    }

    public final void g() {
        c30 c30Var = this.f112099l;
        if (c30Var == null) {
            return;
        }
        try {
            c30Var.close();
        } finally {
            this.f112098k = null;
            this.f112099l = null;
            kw2 kw2Var = this.f112103p;
            if (kw2Var != null) {
                ((iw2) this.f112088a).a((qr) kw2Var);
                this.f112103p = null;
            }
        }
    }

    public final er h() {
        return this.f112088a;
    }

    public final pr i() {
        return this.f112092e;
    }

    public final boolean j() {
        return this.f112099l == this.f112089b;
    }

    @Override // yads.c30
    public final long a(h30 h30Var) {
        try {
            String strA = this.f112092e.a(h30Var);
            h30Var.getClass();
            Uri uri = h30Var.f111452a;
            long j10 = h30Var.f111453b;
            int i10 = h30Var.f111454c;
            byte[] bArr = h30Var.f111455d;
            Map map = h30Var.f111456e;
            long j11 = h30Var.f111457f;
            long j12 = h30Var.f111458g;
            int i11 = h30Var.f111460i;
            Object obj = h30Var.f111461j;
            fi.a(uri, "The uri must be set.");
            h30 h30Var2 = new h30(uri, j10, i10, bArr, map, j11, j12, strA, i11, obj);
            this.f112097j = h30Var2;
            er erVar = this.f112088a;
            Uri uri2 = h30Var2.f111452a;
            String strA2 = ((iw2) erVar).b(strA).a();
            Uri uri3 = strA2 == null ? null : Uri.parse(strA2);
            if (uri3 != null) {
                uri2 = uri3;
            }
            this.f112096i = uri2;
            this.f112101n = h30Var.f111457f;
            boolean z10 = (this.f112094g && this.f112104q) || (this.f112095h && h30Var.f111458g == -1);
            this.f112105r = z10;
            if (z10) {
                this.f112102o = -1L;
            } else {
                long jA = j5.a(((iw2) this.f112088a).b(strA));
                this.f112102o = jA;
                if (jA != -1) {
                    long j13 = jA - h30Var.f111457f;
                    this.f112102o = j13;
                    if (j13 < 0) {
                        throw new d30(2008);
                    }
                }
            }
            long jMin = h30Var.f111458g;
            if (jMin != -1) {
                long j14 = this.f112102o;
                if (j14 != -1) {
                    jMin = Math.min(j14, jMin);
                }
                this.f112102o = jMin;
            }
            long j15 = this.f112102o;
            if (j15 > 0 || j15 == -1) {
                a(h30Var2, false);
            }
            long j16 = h30Var.f111458g;
            return j16 != -1 ? j16 : this.f112102o;
        } catch (Throwable th2) {
            if (j() || (th2 instanceof br)) {
                this.f112104q = true;
            }
            throw th2;
        }
    }

    @Override // yads.y20
    public final int c(byte[] bArr, int i10, int i11) {
        long j10;
        if (i11 == 0) {
            return 0;
        }
        if (this.f112102o == 0) {
            return -1;
        }
        h30 h30Var = this.f112097j;
        h30Var.getClass();
        h30 h30Var2 = this.f112098k;
        h30Var2.getClass();
        try {
            if (this.f112101n >= this.f112106s) {
                a(h30Var, true);
            }
            c30 c30Var = this.f112099l;
            c30Var.getClass();
            int iC = c30Var.c(bArr, i10, i11);
            if (iC != -1) {
                long j11 = iC;
                this.f112101n += j11;
                this.f112100m += j11;
                long j12 = this.f112102o;
                if (j12 != -1) {
                    this.f112102o = j12 - j11;
                    return iC;
                }
            } else {
                if (j()) {
                    j10 = -1;
                } else {
                    long j13 = h30Var2.f111458g;
                    if (j13 != -1) {
                        j10 = -1;
                        if (this.f112100m < j13) {
                        }
                    }
                    String str = h30Var.f111459h;
                    int i12 = w83.f117341a;
                    this.f112102o = 0L;
                    if (this.f112099l == this.f112090c) {
                        dz dzVar = new dz();
                        dzVar.f110112a.put("exo_len", Long.valueOf(this.f112101n));
                        dzVar.f110113b.remove("exo_len");
                        ((iw2) this.f112088a).a(str, dzVar);
                        return iC;
                    }
                }
                long j14 = this.f112102o;
                if (j14 <= 0) {
                    if (j14 == j10) {
                    }
                }
                g();
                a(h30Var, false);
                return c(bArr, i10, i11);
            }
            return iC;
        } catch (Throwable th2) {
            if (j() || (th2 instanceof br)) {
                this.f112104q = true;
            }
            throw th2;
        }
    }

    public final void a(h30 h30Var, boolean z10) throws InterruptedIOException {
        kw2 kw2VarB;
        long j10;
        h30 h30Var2;
        c30 c30Var;
        String str = h30Var.f111459h;
        int i10 = w83.f117341a;
        if (this.f112105r) {
            kw2VarB = null;
        } else if (this.f112093f) {
            try {
                er erVar = this.f112088a;
                long j11 = this.f112101n;
                long j12 = this.f112102o;
                iw2 iw2Var = (iw2) erVar;
                synchronized (iw2Var) {
                    iw2Var.a();
                    while (true) {
                        kw2VarB = iw2Var.b(str, j11, j12);
                        if (kw2VarB != null) {
                            break;
                        } else {
                            iw2Var.wait();
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            kw2VarB = ((iw2) this.f112088a).b(str, this.f112101n, this.f112102o);
        }
        if (kw2VarB == null) {
            c30 c30Var2 = this.f112091d;
            Uri uri = h30Var.f111452a;
            long j13 = h30Var.f111453b;
            int i11 = h30Var.f111454c;
            byte[] bArr = h30Var.f111455d;
            Map map = h30Var.f111456e;
            String str2 = h30Var.f111459h;
            int i12 = h30Var.f111460i;
            j10 = -1;
            Object obj = h30Var.f111461j;
            long j14 = this.f112101n;
            long j15 = this.f112102o;
            fi.a(uri, "The uri must be set.");
            h30Var2 = new h30(uri, j13, i11, bArr, map, j14, j15, str2, i12, obj);
            kw2VarB = kw2VarB;
            c30Var = c30Var2;
        } else {
            j10 = -1;
            if (kw2VarB.f115134e) {
                Uri uriFromFile = Uri.fromFile(kw2VarB.f115135f);
                long j16 = kw2VarB.f115132c;
                long j17 = this.f112101n - j16;
                long jMin = kw2VarB.f115133d - j17;
                long j18 = this.f112102o;
                if (j18 != -1) {
                    jMin = Math.min(jMin, j18);
                }
                long j19 = jMin;
                int i13 = h30Var.f111454c;
                byte[] bArr2 = h30Var.f111455d;
                Map map2 = h30Var.f111456e;
                String str3 = h30Var.f111459h;
                int i14 = h30Var.f111460i;
                Object obj2 = h30Var.f111461j;
                fi.a(uriFromFile, "The uri must be set.");
                h30Var2 = new h30(uriFromFile, j16, i13, bArr2, map2, j17, j19, str3, i14, obj2);
                c30Var = this.f112089b;
            } else {
                long jMin2 = kw2VarB.f115133d;
                if (jMin2 == -1) {
                    jMin2 = this.f112102o;
                } else {
                    long j20 = this.f112102o;
                    if (j20 != -1) {
                        jMin2 = Math.min(jMin2, j20);
                    }
                }
                long j21 = jMin2;
                Uri uri2 = h30Var.f111452a;
                long j22 = h30Var.f111453b;
                int i15 = h30Var.f111454c;
                byte[] bArr3 = h30Var.f111455d;
                Map map3 = h30Var.f111456e;
                String str4 = h30Var.f111459h;
                int i16 = h30Var.f111460i;
                Object obj3 = h30Var.f111461j;
                long j23 = this.f112101n;
                fi.a(uri2, "The uri must be set.");
                h30Var2 = new h30(uri2, j22, i15, bArr3, map3, j23, j21, str4, i16, obj3);
                c30Var = this.f112090c;
                if (c30Var == null) {
                    c30Var = this.f112091d;
                    ((iw2) this.f112088a).a((qr) kw2VarB);
                    kw2VarB = null;
                }
            }
        }
        this.f112106s = (this.f112105r || c30Var != this.f112091d) ? Long.MAX_VALUE : this.f112101n + 102400;
        if (z10) {
            c30 c30Var3 = this.f112099l;
            c30 c30Var4 = this.f112091d;
            if (c30Var3 != c30Var4) {
                throw new IllegalStateException();
            }
            if (c30Var == c30Var4) {
                return;
            }
            try {
                g();
            } catch (Throwable th2) {
                if (!kw2VarB.f115134e) {
                    ((iw2) this.f112088a).a((qr) kw2VarB);
                }
                throw th2;
            }
        }
        if (kw2VarB != null && !kw2VarB.f115134e) {
            this.f112103p = kw2VarB;
        }
        this.f112099l = c30Var;
        this.f112098k = h30Var2;
        this.f112100m = 0L;
        long jA = c30Var.a(h30Var2);
        dz dzVar = new dz();
        if (h30Var2.f111458g == j10 && jA != j10) {
            this.f112102o = jA;
            dzVar.f110112a.put("exo_len", Long.valueOf(this.f112101n + jA));
            dzVar.f110113b.remove("exo_len");
        }
        if (!j()) {
            Uri uriE = c30Var.e();
            this.f112096i = uriE;
            Uri uri3 = !h30Var.f111452a.equals(uriE) ? this.f112096i : null;
            if (uri3 == null) {
                dzVar.f110113b.add("exo_redir");
                dzVar.f110112a.remove("exo_redir");
            } else {
                String string = uri3.toString();
                HashMap map4 = dzVar.f110112a;
                string.getClass();
                map4.put("exo_redir", string);
                dzVar.f110113b.remove("exo_redir");
            }
        }
        if (this.f112099l == this.f112090c) {
            ((iw2) this.f112088a).a(str, dzVar);
        }
    }
}
