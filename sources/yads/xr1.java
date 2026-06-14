package yads;

import android.util.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class xr1 implements ru2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f117935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f117936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f117937c;

    public xr1(long j10, long[] jArr, long[] jArr2) {
        this.f117935a = jArr;
        this.f117936b = jArr2;
        this.f117937c = j10 == -9223372036854775807L ? w83.a(jArr2[jArr2.length - 1]) : j10;
    }

    @Override // yads.ru2
    public final long a() {
        return -1L;
    }

    @Override // yads.nu2
    public final boolean b() {
        return true;
    }

    @Override // yads.nu2
    public final long c() {
        return this.f117937c;
    }

    @Override // yads.ru2
    public final long a(long j10) {
        return w83.a(((Long) a(j10, this.f117935a, this.f117936b).second).longValue());
    }

    @Override // yads.nu2
    public final lu2 b(long j10) {
        long j11 = this.f117937c;
        int i10 = w83.f117341a;
        Pair pairA = a(w83.b(Math.max(0L, Math.min(j10, j11))), this.f117936b, this.f117935a);
        pu2 pu2Var = new pu2(w83.a(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue());
        return new lu2(pu2Var, pu2Var);
    }

    public static Pair a(long j10, long[] jArr, long[] jArr2) {
        int iB = w83.b(jArr, j10, true);
        long j11 = jArr[iB];
        long j12 = jArr2[iB];
        int i10 = iB + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i10] == j11 ? 0.0d : (j10 - j11) / (r6 - j11)) * (jArr2[i10] - j12))) + j12));
    }
}
