package j$.util.stream;

import j$.util.C5800x;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public interface B extends InterfaceC5697g {
    B a(j$.time.format.r rVar);

    j$.util.B average();

    B b();

    Stream boxed();

    B c();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    B d();

    B distinct();

    B e();

    j$.util.B findAny();

    j$.util.B findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    boolean h();

    InterfaceC5723l0 i();

    @Override // j$.util.stream.InterfaceC5697g
    j$.util.H iterator();

    B limit(long j10);

    Stream mapToObj(DoubleFunction doubleFunction);

    j$.util.B max();

    j$.util.B min();

    boolean p();

    @Override // j$.util.stream.InterfaceC5697g
    B parallel();

    B peek(DoubleConsumer doubleConsumer);

    IntStream r();

    double reduce(double d10, DoubleBinaryOperator doubleBinaryOperator);

    j$.util.B reduce(DoubleBinaryOperator doubleBinaryOperator);

    @Override // j$.util.stream.InterfaceC5697g
    B sequential();

    B skip(long j10);

    B sorted();

    @Override // j$.util.stream.InterfaceC5697g
    j$.util.T spliterator();

    double sum();

    C5800x summaryStatistics();

    double[] toArray();

    boolean w();
}
