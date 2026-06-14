package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5717k implements Collector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Supplier f85295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiConsumer f85296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BinaryOperator f85297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function f85298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f85299e;

    public C5717k(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, Set set) {
        this.f85295a = supplier;
        this.f85296b = biConsumer;
        this.f85297c = binaryOperator;
        this.f85298d = function;
        this.f85299e = set;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5717k(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Set set) {
        this(supplier, biConsumer, binaryOperator, new j$.time.format.a(13), set);
        Set set2 = Collectors.f85010a;
    }

    @Override // j$.util.stream.Collector
    public final BiConsumer accumulator() {
        return this.f85296b;
    }

    @Override // j$.util.stream.Collector
    public final Supplier supplier() {
        return this.f85295a;
    }

    @Override // j$.util.stream.Collector
    public final BinaryOperator combiner() {
        return this.f85297c;
    }

    @Override // j$.util.stream.Collector
    public final Function finisher() {
        return this.f85298d;
    }

    @Override // j$.util.stream.Collector
    public final Set characteristics() {
        return this.f85299e;
    }
}
