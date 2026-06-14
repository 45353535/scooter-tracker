package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class yb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt f118132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gm2 f118133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mo f118134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v20 f118135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f118136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f118137f;

    public yb0(long j10, gm2 gm2Var, mo moVar, wt wtVar, long j11, v20 v20Var) {
        this.f118136e = j10;
        this.f118133b = gm2Var;
        this.f118134c = moVar;
        this.f118137f = j11;
        this.f118132a = wtVar;
        this.f118135d = v20Var;
    }

    public final yb0 a(long j10, gm2 gm2Var) throws ro {
        long jA;
        long jA2;
        v20 v20VarD = this.f118133b.d();
        v20 v20VarD2 = gm2Var.d();
        if (v20VarD == null) {
            return new yb0(j10, gm2Var, this.f118134c, this.f118132a, this.f118137f, v20VarD);
        }
        if (!v20VarD.a()) {
            return new yb0(j10, gm2Var, this.f118134c, this.f118132a, this.f118137f, v20VarD2);
        }
        long jC = v20VarD.c(j10);
        if (jC == 0) {
            return new yb0(j10, gm2Var, this.f118134c, this.f118132a, this.f118137f, v20VarD2);
        }
        long jB = v20VarD.b();
        long jA3 = v20VarD.a(jB);
        long j11 = jC + jB;
        long j12 = j11 - 1;
        long jB2 = v20VarD.b(j12, j10) + v20VarD.a(j12);
        long jB3 = v20VarD2.b();
        long jA4 = v20VarD2.a(jB3);
        long j13 = this.f118137f;
        if (jB2 == jA4) {
            jA = j11 - jB3;
        } else {
            if (jB2 < jA4) {
                throw new ro();
            }
            if (jA4 < jA3) {
                jA2 = j13 - (v20VarD2.a(jA3, j10) - jB);
                return new yb0(j10, gm2Var, this.f118134c, this.f118132a, jA2, v20VarD2);
            }
            jA = v20VarD.a(jA4, j10) - jB3;
        }
        jA2 = jA + j13;
        return new yb0(j10, gm2Var, this.f118134c, this.f118132a, jA2, v20VarD2);
    }

    public final long a(long j10) {
        return this.f118135d.b(j10 - this.f118137f, this.f118136e) + this.f118135d.a(j10 - this.f118137f);
    }
}
