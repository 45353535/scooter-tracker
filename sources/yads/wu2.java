package yads;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class wu2 extends uu2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j83 f117603j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j83 f117604k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f117605l;

    public wu2(lj2 lj2Var, long j10, long j11, long j12, long j13, long j14, List list, long j15, j83 j83Var, j83 j83Var2, long j16, long j17) {
        super(lj2Var, j10, j11, j12, j14, list, j15, j16, j17);
        this.f117603j = j83Var;
        this.f117604k = j83Var2;
        this.f117605l = j13;
    }

    @Override // yads.zu2
    public final lj2 a(gm2 gm2Var) {
        j83 j83Var = this.f117603j;
        if (j83Var == null) {
            return this.f118839a;
        }
        yv0 yv0Var = gm2Var.f111277a;
        return new lj2(j83Var.a(yv0Var.f118387b, 0L, yv0Var.f118394i, 0L), 0L, -1L);
    }

    @Override // yads.uu2
    public final long a(long j10) {
        if (this.f116784f != null) {
            return r0.size();
        }
        long j11 = this.f117605l;
        if (j11 != -1) {
            return (j11 - this.f116782d) + 1;
        }
        if (j10 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f118840b));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.f116783e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = cp.f109502a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // yads.uu2
    public final lj2 a(long j10, gm2 gm2Var) {
        long j11;
        List list = this.f116784f;
        if (list != null) {
            j11 = ((xu2) list.get((int) (j10 - this.f116782d))).f117969a;
        } else {
            j11 = (j10 - this.f116782d) * this.f116783e;
        }
        long j12 = j11;
        j83 j83Var = this.f117604k;
        yv0 yv0Var = gm2Var.f111277a;
        return new lj2(j83Var.a(yv0Var.f118387b, j10, yv0Var.f118394i, j12), 0L, -1L);
    }
}
