package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5739o1 extends AbstractC5749q1 implements InterfaceC5720k2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long[] f85325h;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC5720k2
    public final /* synthetic */ void j(Long l10) {
        AbstractC5773v1.i(this, l10);
    }

    public C5739o1(Spliterator spliterator, AbstractC5667a abstractC5667a, long[] jArr) {
        super(spliterator, abstractC5667a, jArr.length);
        this.f85325h = jArr;
    }

    public C5739o1(C5739o1 c5739o1, Spliterator spliterator, long j10, long j11) {
        super(c5739o1, spliterator, j10, j11, c5739o1.f85325h.length);
        this.f85325h = c5739o1.f85325h;
    }

    @Override // j$.util.stream.AbstractC5749q1
    public final AbstractC5749q1 b(Spliterator spliterator, long j10, long j11) {
        return new C5739o1(this, spliterator, j10, j11);
    }

    @Override // j$.util.stream.AbstractC5749q1, j$.util.stream.InterfaceC5725l2
    public final void accept(long j10) {
        int i10 = this.f85343f;
        if (i10 >= this.f85344g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f85343f));
        }
        long[] jArr = this.f85325h;
        this.f85343f = i10 + 1;
        jArr[i10] = j10;
    }
}
