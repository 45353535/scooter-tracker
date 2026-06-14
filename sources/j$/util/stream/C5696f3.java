package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5696f3 extends AbstractC5701g3 implements LongConsumer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f85262c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    public C5696f3(int i10) {
        this.f85262c = new long[i10];
    }

    @Override // j$.util.stream.AbstractC5701g3
    public final void b(Object obj, long j10) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i10 = 0; i10 < j10; i10++) {
            longConsumer.accept(this.f85262c[i10]);
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
        int i10 = this.f85267b;
        this.f85267b = i10 + 1;
        this.f85262c[i10] = j10;
    }
}
