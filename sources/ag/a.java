package ag;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends kotlin.random.a {
    @Override // kotlin.random.d
    public int k(int i10, int i11) {
        return ThreadLocalRandom.current().nextInt(i10, i11);
    }

    @Override // kotlin.random.d
    public long m(long j10) {
        return ThreadLocalRandom.current().nextLong(j10);
    }

    @Override // kotlin.random.d
    public long n(long j10, long j11) {
        return ThreadLocalRandom.current().nextLong(j10, j11);
    }

    @Override // kotlin.random.a
    public Random o() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        Intrinsics.checkNotNullExpressionValue(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
