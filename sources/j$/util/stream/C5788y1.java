package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* JADX INFO: renamed from: j$.util.stream.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5788y1 extends AbstractC5773v1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f85402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f85403i;

    public /* synthetic */ C5788y1(EnumC5676b3 enumC5676b3, Object obj, int i10) {
        this.f85402h = i10;
        this.f85403i = obj;
    }

    @Override // j$.util.stream.AbstractC5773v1
    public final Q1 Q() {
        switch (this.f85402h) {
            case 0:
                return new P1((LongBinaryOperator) this.f85403i);
            case 1:
                return new B1((DoubleBinaryOperator) this.f85403i);
            case 2:
                return new G1((BinaryOperator) this.f85403i);
            default:
                return new M1((IntBinaryOperator) this.f85403i);
        }
    }
}
