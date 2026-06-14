package j$.util.stream;

import java.util.function.DoubleBinaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public final class E1 extends AbstractC5773v1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ DoubleBinaryOperator f85021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f85022i;

    @Override // j$.util.stream.AbstractC5773v1
    public final Q1 Q() {
        return new C5793z1(this.f85022i, this.f85021h);
    }

    public E1(EnumC5676b3 enumC5676b3, DoubleBinaryOperator doubleBinaryOperator, double d10) {
        this.f85021h = doubleBinaryOperator;
        this.f85022i = d10;
    }
}
