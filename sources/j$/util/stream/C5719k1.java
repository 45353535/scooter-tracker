package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5719k1 extends C5714j1 implements InterfaceC5777w0 {
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

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC5720k2
    public final /* synthetic */ void j(Long l10) {
        AbstractC5773v1.i(this, l10);
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

    @Override // j$.util.stream.InterfaceC5777w0, j$.util.stream.InterfaceC5782x0
    public final D0 a() {
        int i10 = this.f85290b;
        long[] jArr = this.f85289a;
        if (i10 >= jArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f85290b), Integer.valueOf(jArr.length)));
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void l(long j10) {
        long[] jArr = this.f85289a;
        if (j10 != jArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j10), Integer.valueOf(jArr.length)));
        }
        this.f85290b = 0;
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void accept(long j10) {
        int i10 = this.f85290b;
        long[] jArr = this.f85289a;
        if (i10 < jArr.length) {
            this.f85290b = 1 + i10;
            jArr[i10] = j10;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(jArr.length)));
    }

    @Override // j$.util.stream.InterfaceC5725l2
    public final void k() {
        int i10 = this.f85290b;
        long[] jArr = this.f85289a;
        if (i10 < jArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f85290b), Integer.valueOf(jArr.length)));
        }
    }

    @Override // j$.util.stream.C5714j1
    public final String toString() {
        long[] jArr = this.f85289a;
        return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(jArr.length - this.f85290b), Arrays.toString(jArr));
    }
}
