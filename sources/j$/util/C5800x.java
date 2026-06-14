package j$.util;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5800x implements DoubleConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f85413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f85414b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.count++;
        this.f85414b += d10;
        c(d10);
        this.min = Math.min(this.min, d10);
        this.max = Math.max(this.max, d10);
    }

    public final void b(C5800x c5800x) {
        this.count += c5800x.count;
        this.f85414b += c5800x.f85414b;
        c(c5800x.sum);
        c(c5800x.f85413a);
        this.min = Math.min(this.min, c5800x.min);
        this.max = Math.max(this.max, c5800x.max);
    }

    public final void c(double d10) {
        double d11 = d10 - this.f85413a;
        double d12 = this.sum;
        double d13 = d12 + d11;
        this.f85413a = (d13 - d12) - d11;
        this.sum = d13;
    }

    public final String toString() {
        double d10;
        String simpleName = C5800x.class.getSimpleName();
        Long lValueOf = Long.valueOf(this.count);
        double d11 = this.sum + this.f85413a;
        if (Double.isNaN(d11) && Double.isInfinite(this.f85414b)) {
            d11 = this.f85414b;
        }
        Double dValueOf = Double.valueOf(d11);
        Double dValueOf2 = Double.valueOf(this.min);
        if (this.count > 0) {
            double d12 = this.sum + this.f85413a;
            if (Double.isNaN(d12) && Double.isInfinite(this.f85414b)) {
                d12 = this.f85414b;
            }
            d10 = d12 / this.count;
        } else {
            d10 = 0.0d;
        }
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", simpleName, lValueOf, dValueOf, dValueOf2, Double.valueOf(d10), Double.valueOf(this.max));
    }
}
