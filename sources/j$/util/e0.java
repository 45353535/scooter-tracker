package j$.util;

import j$.util.PrimitiveIterator;
import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 implements PrimitiveIterator.OfInt, IntConsumer, InterfaceC5802z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f84911a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Spliterator.OfInt f84913c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.PrimitiveIterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((IntConsumer) intConsumer);
    }

    @Override // j$.util.PrimitiveIterator.OfInt
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        PrimitiveIterator.OfInt.CC.$default$forEachRemaining((PrimitiveIterator.OfInt) this, consumer);
    }

    @Override // j$.util.PrimitiveIterator.OfInt
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        PrimitiveIterator.OfInt.CC.$default$forEachRemaining((PrimitiveIterator.OfInt) this, intConsumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        if (s0.f84982a) {
            s0.a(e0.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        }
        return Integer.valueOf(nextInt());
    }

    public e0(Spliterator.OfInt ofInt) {
        this.f84913c = ofInt;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        this.f84911a = true;
        this.f84912b = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f84911a) {
            this.f84913c.tryAdvance((IntConsumer) this);
        }
        return this.f84911a;
    }

    @Override // j$.util.PrimitiveIterator.OfInt
    public final int nextInt() {
        if (!this.f84911a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f84911a = false;
        return this.f84912b;
    }
}
