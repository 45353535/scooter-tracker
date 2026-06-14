package j$.util.stream;

import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public class I0 implements F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f85051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85052b;

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 h(long j10, long j11, IntFunction intFunction) {
        return AbstractC5773v1.w(this, j10, j11, intFunction);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.F0
    public final F0 b(int i10) {
        throw new IndexOutOfBoundsException();
    }

    public I0(long j10, IntFunction intFunction) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f85051a = (Object[]) intFunction.apply((int) j10);
        this.f85052b = 0;
    }

    public I0(Object[] objArr) {
        this.f85051a = objArr;
        this.f85052b = objArr.length;
    }

    @Override // j$.util.stream.F0
    public final Spliterator spliterator() {
        int i10 = this.f85052b;
        Object[] objArr = this.f85051a;
        Spliterators.a(((Object[]) Objects.requireNonNull(objArr)).length, 0, i10);
        return new j$.util.h0(objArr, 0, i10, IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION);
    }

    @Override // j$.util.stream.F0
    public final void i(Object[] objArr, int i10) {
        System.arraycopy(this.f85051a, 0, objArr, i10, this.f85052b);
    }

    @Override // j$.util.stream.F0
    public final Object[] o(IntFunction intFunction) {
        Object[] objArr = this.f85051a;
        if (objArr.length == this.f85052b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.F0
    public final long count() {
        return this.f85052b;
    }

    @Override // j$.util.stream.F0
    public final void forEach(Consumer consumer) {
        for (int i10 = 0; i10 < this.f85052b; i10++) {
            consumer.p(this.f85051a[i10]);
        }
    }

    public String toString() {
        Object[] objArr = this.f85051a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.f85052b), Arrays.toString(objArr));
    }
}
