package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5702h implements Collector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.stream.Collector f85272a;

    public /* synthetic */ C5702h(java.util.stream.Collector collector) {
        this.f85272a = collector;
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ BiConsumer accumulator() {
        return this.f85272a.accumulator();
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Set characteristics() {
        return Y2.a(this.f85272a.characteristics());
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ BinaryOperator combiner() {
        return this.f85272a.combiner();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.Collector collector = this.f85272a;
        if (obj instanceof C5702h) {
            obj = ((C5702h) obj).f85272a;
        }
        return collector.equals(obj);
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Function finisher() {
        return this.f85272a.finisher();
    }

    public final /* synthetic */ int hashCode() {
        return this.f85272a.hashCode();
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Supplier supplier() {
        return this.f85272a.supplier();
    }
}
