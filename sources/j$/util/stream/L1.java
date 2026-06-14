package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public final class L1 extends AbstractC5773v1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ IntBinaryOperator f85084h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f85085i;

    @Override // j$.util.stream.AbstractC5773v1
    public final Q1 Q() {
        return new K1(this.f85085i, this.f85084h);
    }

    public L1(EnumC5676b3 enumC5676b3, IntBinaryOperator intBinaryOperator, int i10) {
        this.f85084h = intBinaryOperator;
        this.f85085i = i10;
    }
}
