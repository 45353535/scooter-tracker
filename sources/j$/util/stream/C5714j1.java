package j$.util.stream;

import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5714j1 implements D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f85289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85290b;

    @Override // j$.util.stream.F0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC5773v1.s(this, consumer);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 h(long j10, long j11, IntFunction intFunction) {
        return AbstractC5773v1.v(this, j10, j11);
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
        AbstractC5773v1.p(this, (Long[]) objArr, i10);
    }

    @Override // j$.util.stream.E0
    public final void e(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i10 = 0; i10 < this.f85290b; i10++) {
            longConsumer.accept(this.f85289a[i10]);
        }
    }

    @Override // j$.util.stream.E0
    public final void r(int i10, Object obj) {
        int i11 = this.f85290b;
        System.arraycopy(this.f85289a, 0, (long[]) obj, i10, i11);
    }

    public C5714j1(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f85289a = new long[(int) j10];
        this.f85290b = 0;
    }

    public C5714j1(long[] jArr) {
        this.f85289a = jArr;
        this.f85290b = jArr.length;
    }

    @Override // j$.util.stream.F0
    public final Spliterator spliterator() {
        int i10 = this.f85290b;
        long[] jArr = this.f85289a;
        Spliterators.a(((long[]) Objects.requireNonNull(jArr)).length, 0, i10);
        return new j$.util.q0(jArr, 0, i10, IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION);
    }

    @Override // j$.util.stream.E0, j$.util.stream.F0
    public final j$.util.b0 spliterator() {
        int i10 = this.f85290b;
        long[] jArr = this.f85289a;
        Spliterators.a(((long[]) Objects.requireNonNull(jArr)).length, 0, i10);
        return new j$.util.q0(jArr, 0, i10, IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION);
    }

    @Override // j$.util.stream.E0
    public final Object d() {
        long[] jArr = this.f85289a;
        int length = jArr.length;
        int i10 = this.f85290b;
        return length == i10 ? jArr : Arrays.copyOf(jArr, i10);
    }

    @Override // j$.util.stream.F0
    public final long count() {
        return this.f85290b;
    }

    public String toString() {
        long[] jArr = this.f85289a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.f85290b), Arrays.toString(jArr));
    }
}
