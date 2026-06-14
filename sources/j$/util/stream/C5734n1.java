package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5734n1 extends AbstractC5749q1 implements InterfaceC5715j2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f85318h;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC5715j2
    public final /* synthetic */ void m(Integer num) {
        AbstractC5773v1.g(this, num);
    }

    public C5734n1(Spliterator spliterator, AbstractC5667a abstractC5667a, int[] iArr) {
        super(spliterator, abstractC5667a, iArr.length);
        this.f85318h = iArr;
    }

    public C5734n1(C5734n1 c5734n1, Spliterator spliterator, long j10, long j11) {
        super(c5734n1, spliterator, j10, j11, c5734n1.f85318h.length);
        this.f85318h = c5734n1.f85318h;
    }

    @Override // j$.util.stream.AbstractC5749q1
    public final AbstractC5749q1 b(Spliterator spliterator, long j10, long j11) {
        return new C5734n1(this, spliterator, j10, j11);
    }

    @Override // j$.util.stream.AbstractC5749q1, j$.util.stream.InterfaceC5725l2
    public final void accept(int i10) {
        int i11 = this.f85343f;
        if (i11 >= this.f85344g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f85343f));
        }
        int[] iArr = this.f85318h;
        this.f85343f = i11 + 1;
        iArr[i11] = i10;
    }
}
