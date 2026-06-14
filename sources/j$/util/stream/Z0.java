package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class Z0 extends I0 implements InterfaceC5782x0 {
    @Override // j$.util.stream.InterfaceC5725l2, j$.util.stream.InterfaceC5710i2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d10) {
        AbstractC5773v1.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void accept(int i10) {
        AbstractC5773v1.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ void accept(long j10) {
        AbstractC5773v1.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC5782x0
    public final F0 a() {
        int i10 = this.f85052b;
        Object[] objArr = this.f85051a;
        if (i10 >= objArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f85052b), Integer.valueOf(objArr.length)));
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        Object[] objArr = this.f85051a;
        if (j10 != objArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j10), Integer.valueOf(objArr.length)));
        }
        this.f85052b = 0;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
        int i10 = this.f85052b;
        Object[] objArr = this.f85051a;
        if (i10 < objArr.length) {
            this.f85052b = 1 + i10;
            objArr[i10] = obj;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(objArr.length)));
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void k() {
        int i10 = this.f85052b;
        Object[] objArr = this.f85051a;
        if (i10 < objArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f85052b), Integer.valueOf(objArr.length)));
        }
    }

    @Override // j$.util.stream.I0
    public final String toString() {
        Object[] objArr = this.f85051a;
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(objArr.length - this.f85052b), Arrays.toString(objArr));
    }
}
