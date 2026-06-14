package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.d1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final d1 f61494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f61495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f61496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f61497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f61498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f61499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    long f61500g;

    private f1(d1 d1Var, int i10, int i11, int i12, int i13) {
        this.f61494a = d1Var;
        this.f61495b = i10;
        this.f61496c = i11;
        this.f61497d = i12;
        this.f61498e = i13;
        Long lB = d1Var.b("timestamp_base");
        if (lB == null) {
            this.f61499f = 0L;
        } else {
            this.f61499f = lB.longValue();
        }
        this.f61500g = d1Var.l();
    }

    public static f1 a(d1 d1Var) {
        return a(d1Var, 1000, 500, 500, 100);
    }

    public x1 b() {
        return new y1(this.f61494a);
    }

    public z1 c() {
        return new a2(this.f61494a, "default_session");
    }

    public boolean d(byte[] bArr, long j10) {
        try {
            if (this.f61494a.f(6L) >= this.f61496c) {
                long jLongValue = 0;
                if (this.f61494a.a(6L, bArr) == 0) {
                    x2.a("MyTrackerRepository: maximum count of custom events is exceeded, event has been skipped");
                    Long lB = this.f61494a.b("custom_events_skipped_count");
                    if (lB != null) {
                        jLongValue = lB.longValue();
                    }
                    long j11 = jLongValue + 1;
                    x2.a("MyTrackerRepository: skipped custom events count: " + j11);
                    this.f61494a.a("custom_events_skipped_count", Long.valueOf(j11));
                    return false;
                }
            }
            return a(6, bArr, false, true, j10);
        } catch (Throwable th2) {
            x2.b("MyTrackerRepository error: event serialization failed, type: 6", th2);
            return false;
        }
    }

    public List e() {
        ArrayList arrayList = new ArrayList();
        d1.b bVarH = null;
        try {
            bVarH = this.f61494a.h();
            while (bVarH.b()) {
                f fVarA = f.a(bVarH.m(), bVarH.n(), bVarH.o(), bVarH.p(), bVarH.e());
                if (fVarA != null) {
                    arrayList.add(fVarA.a(Long.valueOf(bVarH.a())));
                }
            }
            bVarH.close();
            return arrayList;
        } catch (Throwable th2) {
            try {
                x2.b("MyTrackerRepository error: error while reading purchases", th2);
                return arrayList;
            } finally {
                if (bVarH != null) {
                    bVarH.close();
                }
            }
        }
    }

    public long f() {
        try {
            Long lB = this.f61494a.b("custom_events_skipped_count");
            if (lB == null) {
                return 0L;
            }
            return lB.longValue();
        } catch (Throwable th2) {
            x2.b("Error: get custom events skipped count", th2);
            return 0L;
        }
    }

    public List g() {
        ArrayList arrayList = new ArrayList();
        d1.e eVarK = null;
        try {
            eVarK = this.f61494a.k();
            while (eVarK.b()) {
                o0 o0VarA = o0.a(eVarK.m(), eVarK.n(), eVarK.e());
                if (o0VarA != null) {
                    arrayList.add(o0VarA.a(Long.valueOf(eVarK.a())));
                }
            }
            eVarK.close();
            return arrayList;
        } catch (Throwable th2) {
            try {
                x2.b("MyTrackerRepository error: error while reading purchases", th2);
                return arrayList;
            } finally {
                if (eVarK != null) {
                    eVarK.close();
                }
            }
        }
    }

    public long h() {
        return this.f61500g;
    }

    public boolean i(byte[] bArr, long j10) {
        return a(1, bArr, true, false, j10);
    }

    public boolean j(byte[] bArr, long j10) {
        return c(9, bArr, j10);
    }

    public boolean k(byte[] bArr, long j10) {
        return c(13, bArr, j10);
    }

    public boolean l(byte[] bArr, long j10) {
        return a(25, bArr, false, true, j10);
    }

    public boolean m(byte[] bArr, long j10) {
        return a(7, bArr, true, true, j10);
    }

    public boolean n(byte[] bArr, long j10) {
        return a(26, bArr, false, true, j10);
    }

    public boolean o(byte[] bArr, long j10) {
        return a(28, bArr, false, true, j10);
    }

    public boolean p(byte[] bArr, long j10) {
        return a(29, bArr, false, true, j10);
    }

    public boolean q(byte[] bArr, long j10) {
        return a(2, bArr, true, false, j10);
    }

    public boolean r(byte[] bArr, long j10) {
        return a(8, bArr, true, true, j10);
    }

    public boolean s(byte[] bArr, long j10) {
        return a(5, bArr, true, false, j10);
    }

    static f1 a(d1 d1Var, int i10, int i11, int i12, int i13) {
        try {
            return new f1(d1Var, i10, i11, i12, i13);
        } catch (Throwable th2) {
            x2.b("MyTrackerRepository error: failed to create MyTrackerRepository instance", th2);
            return null;
        }
    }

    public boolean b(long j10) {
        return c(3, new byte[0], j10);
    }

    public boolean c(byte[] bArr, long j10) {
        return a(32, bArr, true, false, j10);
    }

    public boolean h(byte[] bArr, long j10) {
        return a(31, bArr, true, false, j10);
    }

    public long i() {
        return this.f61499f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public boolean j() {
        ?? B;
        d1.f fVarA;
        try {
            d1.c cVarI = this.f61494a.i();
            try {
                B = cVarI.b();
                try {
                    cVarI.close();
                    fVarA = this.f61494a.a("default_session");
                } catch (Exception unused) {
                }
            } finally {
            }
        } catch (Exception unused2) {
            B = 0;
        }
        try {
            B = B;
            if (fVarA.b()) {
                B++;
            }
            fVarA.close();
            return B != 0;
        } finally {
        }
    }

    public boolean b(byte[] bArr, long j10) {
        return a(33, bArr, true, false, j10);
    }

    void c(long j10) {
        try {
            this.f61494a.a("timestamp_base", Long.valueOf(j10));
            this.f61499f = j10;
        } catch (Throwable th2) {
            x2.b("MyTrackerRepository error: ", th2);
        }
    }

    public boolean a(byte[] bArr, long j10) {
        return a(14, bArr, true, false, j10);
    }

    public boolean b(int i10, byte[] bArr, long j10) {
        Throwable th2;
        int i11;
        boolean z10 = i10 == 20 || i10 == 21;
        if (i10 == 24) {
            try {
                long j11 = i10;
                if (this.f61494a.f(j11) >= this.f61496c && this.f61494a.a(j11, bArr) == 0) {
                    x2.a("MyTrackerRepository: maximum count of mini-app custom events is exceeded, event has been skipped");
                    return false;
                }
                i11 = i10;
                try {
                    return a(i11, bArr, z10, true, j10);
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                th2 = th4;
                i11 = i10;
            }
        } else {
            i11 = i10;
            return a(i11, bArr, z10, true, j10);
        }
        x2.b("MyTrackerRepository error: event serialization failed, type: " + i11, th2);
        return false;
    }

    public boolean f(byte[] bArr, long j10) {
        return a(10, bArr, true, false, j10);
    }

    public boolean a(int i10, byte[] bArr, long j10) {
        return a(i10, bArr, true, true, j10);
    }

    private boolean c(int i10, byte[] bArr, long j10) {
        try {
            return a(i10, bArr, false, true, j10);
        } catch (Throwable th2) {
            x2.b("MyTrackerRepository error: event serialization failed, type: " + i10, th2);
            return false;
        }
    }

    public boolean a(long j10, long j11) {
        AutoCloseable autoCloseable = null;
        try {
            d1.f fVarA = this.f61494a.a("default_session");
            long jB = 0;
            if (fVarA.b()) {
                long jA = fVarA.a();
                long jM = fVarA.m();
                long jC = fVarA.c();
                if (this.f61499f == 0) {
                    c(jM);
                }
                x2.a("MyTrackerRepository: finish previous session");
                if (j11 == 0) {
                    this.f61494a.a(jA, jM - this.f61499f, true, 0L);
                } else {
                    d1 d1Var = this.f61494a;
                    long j12 = this.f61499f;
                    d1Var.a(jA, jM - j12, false, j11 - j12);
                }
                long jG = this.f61494a.g(jA);
                x2.a("MyTrackerRepository: session timestamps count: " + jG);
                long j13 = (long) this.f61497d;
                if (jG > j13) {
                    jB = this.f61494a.b(jA, jG - j13);
                    x2.a("MyTrackerRepository: maximum count of session timestamps is exceeded, remove oldest timestamps, count: " + jB);
                }
                x2.a("MyTrackerRepository: start new session");
                this.f61494a.a(jA, j10, jC + jB);
            } else {
                x2.a("MyTrackerRepository: insert session");
                if (this.f61494a.a("default_session", j10) == d1.f61407y) {
                    x2.b("MyTrackerRepository error: session insertion failed ");
                    fVarA.close();
                    return false;
                }
                if (this.f61499f == 0) {
                    c(j10);
                }
            }
            fVarA.close();
            return true;
        } catch (Throwable th2) {
            try {
                x2.b("MyTrackerRepository error: session insertion failed ", th2);
                return false;
            } finally {
                if (0 != 0) {
                    autoCloseable.close();
                }
            }
        }
    }

    public void b(o0 o0Var) {
        Long lB = o0Var.b();
        if (lB != null) {
            try {
                this.f61494a.b(lB.longValue());
            } catch (Throwable th2) {
                x2.b("MyTrackerRepository error: error while removing raw purchase with id " + lB, th2);
            }
        }
    }

    public b d() {
        try {
            return this.f61494a.f();
        } catch (Throwable th2) {
            x2.b("MyTrackerRepository error: ", th2);
            return null;
        }
    }

    public void b(f fVar) {
        Long lB = fVar.b();
        if (lB != null) {
            try {
                this.f61494a.a(lB.longValue());
            } catch (Throwable th2) {
                x2.b("MyTrackerRepository error: error while removing raw appgallery purchase with id " + lB, th2);
            }
        }
    }

    public boolean g(byte[] bArr, long j10) {
        return a(27, bArr, false, true, j10);
    }

    public boolean e(byte[] bArr, long j10) {
        return a(15, bArr, true, true, j10);
    }

    public void a(o0 o0Var) {
        String string = o0Var.d().toString();
        String strA = o0Var.a();
        try {
            if (this.f61494a.j() >= this.f61498e) {
                x2.a("MyTrackerRepository: max count of raw purchases is reached");
                x2.a("MyTrackerRepository: raw purchase with data: " + string + ", signature " + strA + " isn't inserted");
                return;
            }
            long jA = this.f61494a.a(string, strA, o0Var.f());
            if (jA >= 0) {
                x2.a("MyTrackerRepository: raw purchase was inserted; id: " + jA + ", data: " + string + ", signature: " + strA);
                o0Var.a(Long.valueOf(jA));
            }
        } catch (Throwable th2) {
            x2.b("MyTrackerRepository error: can't insert raw purchase with data: " + string + ", signature " + strA, th2);
        }
    }

    public void a(f fVar) {
        String string = fVar.e().toString();
        String strA = fVar.a();
        String strF = fVar.f();
        int iG = fVar.g();
        try {
            if (this.f61494a.g() >= this.f61498e) {
                x2.a("MyTrackerRepository: max count of raw purchases is reached");
                x2.a("MyTrackerRepository: appgalleery raw purchase with data: " + string + ", signature " + strA + " isn't inserted");
                return;
            }
            long jA = this.f61494a.a(string, strA, strF, iG, fVar.h());
            if (jA >= 0) {
                x2.a("MyTrackerRepository: appgallery raw purchase was inserted; id: " + jA + ", data: " + string + ", signature: " + strA);
                fVar.a(Long.valueOf(jA));
            }
        } catch (Throwable th2) {
            x2.b("MyTrackerRepository error: can't insert appgallery raw purchase with data: " + string + ", signature " + strA, th2);
        }
    }

    public boolean a(int i10, byte[] bArr, boolean z10, boolean z11, long j10) {
        long jA;
        long jC;
        boolean z12;
        long j11;
        boolean z13 = z10;
        try {
            jA = d1.f61407y;
            if (z11) {
                d1.c cVarB = null;
                try {
                    cVarB = this.f61494a.b(i10, bArr);
                    if (cVarB.b()) {
                        jA = cVarB.a();
                        jC = cVarB.c();
                    } else {
                        jC = 0;
                    }
                    cVarB.close();
                } catch (Throwable th2) {
                    if (cVarB != null) {
                        cVarB.close();
                    }
                    throw th2;
                }
            } else {
                jC = 0;
            }
        } catch (Throwable th3) {
            th = th3;
            z13 = false;
            x2.b("MyTrackerRepository error: event insertion failed, type: " + i10, th);
            return z13;
        }
        try {
            if (jA == d1.f61407y) {
                x2.a("MyTrackerRepository: insert " + i10 + " event");
                long jA2 = this.f61494a.a(i10, bArr, z13);
                if (jA2 == d1.f61407y || !z13) {
                    j11 = jA2;
                    z12 = false;
                } else {
                    j11 = jA2;
                    z12 = false;
                    this.f61500g++;
                }
                jA = j11;
            } else {
                z12 = false;
                x2.a("MyTrackerRepository: aggregate " + i10 + " event");
            }
            if (jA == d1.f61407y) {
                x2.b("MyTrackerRepository error: event insertion failed, type: " + i10);
                return z12;
            }
            if (this.f61499f == 0) {
                c(j10);
            }
            this.f61494a.c(jA, j10 - this.f61499f);
            long jD = this.f61494a.d(jA);
            x2.a("MyTrackerRepository: event timestamps count: " + jD);
            long j12 = (long) this.f61495b;
            if (jD <= j12) {
                return true;
            }
            long jA3 = this.f61494a.a(jA, jD - j12);
            this.f61494a.d(jA, jC + jA3);
            x2.a("MyTrackerRepository: maximum count of event timestamps is exceeded, remove oldest timestamps, count: " + jA3);
            return true;
        } catch (Throwable th4) {
            th = th4;
            x2.b("MyTrackerRepository error: event insertion failed, type: " + i10, th);
            return z13;
        }
    }

    public boolean a() {
        try {
            this.f61494a.c();
            this.f61494a.b();
            this.f61494a.e();
            this.f61494a.d();
            this.f61494a.a();
            this.f61494a.a("custom_events_skipped_count", (Long) null);
            this.f61500g = 0L;
            d1.f fVarA = this.f61494a.a("default_session");
            try {
                if (fVarA.b()) {
                    c(fVarA.m());
                } else {
                    c(0L);
                }
                fVarA.close();
                return true;
            } finally {
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    public void a(byte[] bArr) {
        try {
            this.f61494a.i(14L);
            this.f61494a.a(bArr);
        } catch (Throwable th2) {
            x2.b("MyTrackerRepository error: ", th2);
        }
    }

    public void a(long j10) {
        try {
            this.f61494a.c(j10);
        } catch (Throwable th2) {
            x2.b("MyTrackerRepository error: ", th2);
        }
    }
}
