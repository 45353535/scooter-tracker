package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5744p1 extends AbstractC5749q1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object[] f85333h;

    public C5744p1(Spliterator spliterator, AbstractC5667a abstractC5667a, Object[] objArr) {
        super(spliterator, abstractC5667a, objArr.length);
        this.f85333h = objArr;
    }

    public C5744p1(C5744p1 c5744p1, Spliterator spliterator, long j10, long j11) {
        super(c5744p1, spliterator, j10, j11, c5744p1.f85333h.length);
        this.f85333h = c5744p1.f85333h;
    }

    @Override // j$.util.stream.AbstractC5749q1
    public final AbstractC5749q1 b(Spliterator spliterator, long j10, long j11) {
        return new C5744p1(this, spliterator, j10, j11);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i10 = this.f85343f;
        if (i10 >= this.f85344g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f85343f));
        }
        Object[] objArr = this.f85333h;
        this.f85343f = i10 + 1;
        objArr[i10] = obj;
    }
}
