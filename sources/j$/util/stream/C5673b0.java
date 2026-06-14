package j$.util.stream;

import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;

/* JADX INFO: renamed from: j$.util.stream.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5673b0 implements LongBinaryOperator, Consumer, IntFunction, LongFunction, BinaryOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85222a;

    public /* synthetic */ C5673b0(int i10) {
        this.f85222a = i10;
    }

    private final void accept$j$$util$stream$Node$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1(Object obj) {
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public void p(Object obj) {
        int i10 = this.f85222a;
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f85222a) {
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f85222a) {
            case 1:
                break;
            case 14:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j10) {
        switch (this.f85222a) {
            case 3:
                return AbstractC5773v1.D(j10);
            case 4:
            default:
                return AbstractC5773v1.L(j10);
            case 5:
                return AbstractC5773v1.K(j10);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j10, long j11) {
        return j10 + j11;
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i10) {
        switch (this.f85222a) {
            case 2:
                return new Object[i10];
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 14:
            case 15:
            default:
                return new Double[i10];
            case 10:
                return new Object[i10];
            case 11:
                return new Integer[i10];
            case 12:
                return new Long[i10];
            case 13:
                return new Double[i10];
            case 16:
                return new Integer[i10];
            case 17:
                return new Integer[i10];
            case 18:
                return new Long[i10];
            case 19:
                return new Long[i10];
            case 20:
                return new Double[i10];
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f85222a) {
            case 4:
                return new M0((InterfaceC5792z0) obj, (InterfaceC5792z0) obj2);
            case 5:
            case 7:
            default:
                return new Q0((F0) obj, (F0) obj2);
            case 6:
                return new N0((B0) obj, (B0) obj2);
            case 8:
                return new O0((D0) obj, (D0) obj2);
        }
    }
}
