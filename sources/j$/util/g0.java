package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements H, DoubleConsumer, InterfaceC5802z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f84936a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f84937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T f84938c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.PrimitiveIterator
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        while (hasNext()) {
            doubleConsumer.accept(nextDouble());
        }
    }

    @Override // java.util.Iterator
    public final Double next() {
        if (s0.f84982a) {
            s0.a(g0.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }
        return Double.valueOf(nextDouble());
    }

    @Override // j$.util.H, java.util.Iterator, j$.util.InterfaceC5802z
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            forEachRemaining((DoubleConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (s0.f84982a) {
            s0.a(g0.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((DoubleConsumer) new E(consumer, 0));
    }

    public g0(T t10) {
        this.f84938c = t10;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f84936a = true;
        this.f84937b = d10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f84936a) {
            this.f84938c.tryAdvance((DoubleConsumer) this);
        }
        return this.f84936a;
    }

    @Override // j$.util.H
    public final double nextDouble() {
        if (!this.f84936a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f84936a = false;
        return this.f84937b;
    }
}
