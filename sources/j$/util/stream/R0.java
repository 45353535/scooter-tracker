package j$.util.stream;

import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public class R0 implements InterfaceC5792z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double[] f85131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85132b;

    @Override // j$.util.stream.F0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC5773v1.q(this, consumer);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 h(long j10, long j11, IntFunction intFunction) {
        return AbstractC5773v1.t(this, j10, j11);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC5773v1.m(this, intFunction);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.F0
    public final /* bridge */ /* synthetic */ F0 b(int i10) {
        b(i10);
        throw null;
    }

    @Override // j$.util.stream.E0, j$.util.stream.F0
    public final E0 b(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void i(Object[] objArr, int i10) {
        AbstractC5773v1.n(this, (Double[]) objArr, i10);
    }

    @Override // j$.util.stream.E0
    public final void e(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i10 = 0; i10 < this.f85132b; i10++) {
            doubleConsumer.accept(this.f85131a[i10]);
        }
    }

    @Override // j$.util.stream.E0
    public final void r(int i10, Object obj) {
        int i11 = this.f85132b;
        System.arraycopy(this.f85131a, 0, (double[]) obj, i10, i11);
    }

    public R0(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f85131a = new double[(int) j10];
        this.f85132b = 0;
    }

    public R0(double[] dArr) {
        this.f85131a = dArr;
        this.f85132b = dArr.length;
    }

    @Override // j$.util.stream.F0
    public final Spliterator spliterator() {
        int i10 = this.f85132b;
        double[] dArr = this.f85131a;
        Spliterators.a(((double[]) Objects.requireNonNull(dArr)).length, 0, i10);
        return new j$.util.i0(dArr, 0, i10, IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION);
    }

    @Override // j$.util.stream.E0, j$.util.stream.F0
    public final j$.util.b0 spliterator() {
        int i10 = this.f85132b;
        double[] dArr = this.f85131a;
        Spliterators.a(((double[]) Objects.requireNonNull(dArr)).length, 0, i10);
        return new j$.util.i0(dArr, 0, i10, IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION);
    }

    @Override // j$.util.stream.E0
    public final Object d() {
        double[] dArr = this.f85131a;
        int length = dArr.length;
        int i10 = this.f85132b;
        return length == i10 ? dArr : Arrays.copyOf(dArr, i10);
    }

    @Override // j$.util.stream.F0
    public final long count() {
        return this.f85132b;
    }

    public String toString() {
        double[] dArr = this.f85131a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.f85132b), Arrays.toString(dArr));
    }
}
