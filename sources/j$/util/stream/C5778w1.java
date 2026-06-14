package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* JADX INFO: renamed from: j$.util.stream.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5778w1 extends AbstractC5773v1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ LongBinaryOperator f85392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f85393i;

    @Override // j$.util.stream.AbstractC5773v1
    public final Q1 Q() {
        return new O1(this.f85393i, this.f85392h);
    }

    public C5778w1(EnumC5676b3 enumC5676b3, LongBinaryOperator longBinaryOperator, long j10) {
        this.f85392h = longBinaryOperator;
        this.f85393i = j10;
    }
}
