package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements O, LongConsumer, InterfaceC5802z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f84914a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f84915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y f84916c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.PrimitiveIterator
    public final void forEachRemaining(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        while (hasNext()) {
            longConsumer.accept(nextLong());
        }
    }

    @Override // java.util.Iterator
    public final Long next() {
        if (s0.f84982a) {
            s0.a(f0.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        }
        return Long.valueOf(nextLong());
    }

    @Override // j$.util.O, java.util.Iterator, j$.util.InterfaceC5802z
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            forEachRemaining((LongConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (s0.f84982a) {
            s0.a(f0.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((LongConsumer) new L(consumer, 0));
    }

    public f0(Y y10) {
        this.f84916c = y10;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
        this.f84914a = true;
        this.f84915b = j10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f84914a) {
            this.f84916c.tryAdvance((LongConsumer) this);
        }
        return this.f84914a;
    }

    @Override // j$.util.O
    public final long nextLong() {
        if (!this.f84914a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f84914a = false;
        return this.f84915b;
    }
}
