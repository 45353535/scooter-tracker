package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5686d3 extends AbstractC5701g3 implements DoubleConsumer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double[] f85247c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    public C5686d3(int i10) {
        this.f85247c = new double[i10];
    }

    @Override // j$.util.stream.AbstractC5701g3
    public final void b(Object obj, long j10) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i10 = 0; i10 < j10; i10++) {
            doubleConsumer.accept(this.f85247c[i10]);
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        int i10 = this.f85267b;
        this.f85267b = i10 + 1;
        this.f85247c[i10] = d10;
    }
}
