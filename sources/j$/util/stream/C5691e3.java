package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5691e3 extends AbstractC5701g3 implements IntConsumer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f85255c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    public C5691e3(int i10) {
        this.f85255c = new int[i10];
    }

    @Override // j$.util.stream.AbstractC5701g3
    public final void b(Object obj, long j10) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i10 = 0; i10 < j10; i10++) {
            intConsumer.accept(this.f85255c[i10]);
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        int i11 = this.f85267b;
        this.f85267b = i11 + 1;
        this.f85255c[i11] = i10;
    }
}
