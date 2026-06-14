package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5674b1 extends C5669a1 implements InterfaceC5772v0 {
    @Override // j$.util.stream.InterfaceC5725l2, j$.util.stream.InterfaceC5710i2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d10) {
        AbstractC5773v1.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void accept(long j10) {
        AbstractC5773v1.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC5715j2
    public final /* synthetic */ void m(Integer num) {
        AbstractC5773v1.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC5782x0
    public final /* bridge */ /* synthetic */ F0 a() {
        a();
        return this;
    }

    @Override // j$.util.stream.InterfaceC5772v0, j$.util.stream.InterfaceC5782x0
    public final B0 a() {
        int i10 = this.f85192b;
        int[] iArr = this.f85191a;
        if (i10 >= iArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f85192b), Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        int[] iArr = this.f85191a;
        if (j10 != iArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j10), Integer.valueOf(iArr.length)));
        }
        this.f85192b = 0;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void accept(int i10) {
        int i11 = this.f85192b;
        int[] iArr = this.f85191a;
        if (i11 < iArr.length) {
            this.f85192b = 1 + i11;
            iArr[i11] = i10;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void k() {
        int i10 = this.f85192b;
        int[] iArr = this.f85191a;
        if (i10 < iArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f85192b), Integer.valueOf(iArr.length)));
        }
    }

    @Override // j$.util.stream.C5669a1
    public final String toString() {
        int[] iArr = this.f85191a;
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(iArr.length - this.f85192b), Arrays.toString(iArr));
    }
}
