package j$.util.stream;

import j$.util.stream.Collector;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class H1 extends AbstractC5773v1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ BinaryOperator f85043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ BiConsumer f85044i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Supplier f85045j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Collector f85046k;

    @Override // j$.util.stream.AbstractC5773v1
    public final Q1 Q() {
        return new I1(this.f85045j, this.f85044i, this.f85043h);
    }

    @Override // j$.util.stream.AbstractC5773v1, j$.util.stream.G3
    public final int d() {
        if (this.f85046k.characteristics().contains(Collector.Characteristics.UNORDERED)) {
            return EnumC5671a3.f85208r;
        }
        return 0;
    }

    public H1(EnumC5676b3 enumC5676b3, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        this.f85043h = binaryOperator;
        this.f85044i = biConsumer;
        this.f85045j = supplier;
        this.f85046k = collector;
    }
}
