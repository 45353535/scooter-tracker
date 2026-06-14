package j$.util.stream;

import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5669a1 implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f85191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85192b;

    @Override // j$.util.stream.F0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC5773v1.r(this, consumer);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 h(long j10, long j11, IntFunction intFunction) {
        return AbstractC5773v1.u(this, j10, j11);
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
        AbstractC5773v1.o(this, (Integer[]) objArr, i10);
    }

    @Override // j$.util.stream.E0
    public final void e(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i10 = 0; i10 < this.f85192b; i10++) {
            intConsumer.accept(this.f85191a[i10]);
        }
    }

    @Override // j$.util.stream.E0
    public final void r(int i10, Object obj) {
        int i11 = this.f85192b;
        System.arraycopy(this.f85191a, 0, (int[]) obj, i10, i11);
    }

    public C5669a1(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f85191a = new int[(int) j10];
        this.f85192b = 0;
    }

    public C5669a1(int[] iArr) {
        this.f85191a = iArr;
        this.f85192b = iArr.length;
    }

    @Override // j$.util.stream.F0
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this.f85191a, 0, this.f85192b, IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION);
    }

    @Override // j$.util.stream.E0, j$.util.stream.F0
    public final j$.util.b0 spliterator() {
        return Spliterators.spliterator(this.f85191a, 0, this.f85192b, IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION);
    }

    @Override // j$.util.stream.E0
    public final Object d() {
        int[] iArr = this.f85191a;
        int length = iArr.length;
        int i10 = this.f85192b;
        return length == i10 ? iArr : Arrays.copyOf(iArr, i10);
    }

    @Override // j$.util.stream.F0
    public final long count() {
        return this.f85192b;
    }

    public String toString() {
        int[] iArr = this.f85191a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.f85192b), Arrays.toString(iArr));
    }
}
