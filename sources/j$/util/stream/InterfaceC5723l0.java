package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5723l0 extends InterfaceC5697g {
    InterfaceC5723l0 a(j$.time.format.r rVar);

    B asDoubleStream();

    j$.util.B average();

    InterfaceC5723l0 b();

    Stream boxed();

    InterfaceC5723l0 c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    InterfaceC5723l0 d();

    InterfaceC5723l0 distinct();

    InterfaceC5723l0 e();

    j$.util.D findAny();

    j$.util.D findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    boolean g();

    @Override // j$.util.stream.InterfaceC5697g
    j$.util.O iterator();

    B l();

    InterfaceC5723l0 limit(long j10);

    Stream mapToObj(LongFunction longFunction);

    j$.util.D max();

    j$.util.D min();

    @Override // j$.util.stream.InterfaceC5697g
    InterfaceC5723l0 parallel();

    InterfaceC5723l0 peek(LongConsumer longConsumer);

    boolean q();

    long reduce(long j10, LongBinaryOperator longBinaryOperator);

    j$.util.D reduce(LongBinaryOperator longBinaryOperator);

    boolean s();

    @Override // j$.util.stream.InterfaceC5697g
    InterfaceC5723l0 sequential();

    InterfaceC5723l0 skip(long j10);

    InterfaceC5723l0 sorted();

    @Override // j$.util.stream.InterfaceC5697g
    j$.util.Y spliterator();

    long sum();

    j$.util.A summaryStatistics();

    long[] toArray();

    IntStream u();
}
