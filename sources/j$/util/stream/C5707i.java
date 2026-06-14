package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5707i implements java.util.stream.Collector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Collector f85278a;

    public /* synthetic */ C5707i(Collector collector) {
        this.f85278a = collector;
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BiConsumer accumulator() {
        return this.f85278a.accumulator();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Set characteristics() {
        return Y2.a(this.f85278a.characteristics());
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BinaryOperator combiner() {
        return this.f85278a.combiner();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Collector collector = this.f85278a;
        if (obj instanceof C5707i) {
            obj = ((C5707i) obj).f85278a;
        }
        return collector.equals(obj);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Function finisher() {
        return this.f85278a.finisher();
    }

    public final /* synthetic */ int hashCode() {
        return this.f85278a.hashCode();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Supplier supplier() {
        return this.f85278a.supplier();
    }
}
