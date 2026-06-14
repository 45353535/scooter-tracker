package kotlin.random;

import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends d {
    @Override // kotlin.random.d
    public int g(int i10) {
        return e.f(o().nextInt(), i10);
    }

    @Override // kotlin.random.d
    public double h() {
        return o().nextDouble();
    }

    @Override // kotlin.random.d
    public int i() {
        return o().nextInt();
    }

    @Override // kotlin.random.d
    public int j(int i10) {
        return o().nextInt(i10);
    }

    @Override // kotlin.random.d
    public long l() {
        return o().nextLong();
    }

    public abstract Random o();
}
