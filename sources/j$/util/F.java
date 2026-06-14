package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class F implements H, InterfaceC5802z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfDouble f84788a;

    public /* synthetic */ F(PrimitiveIterator.OfDouble ofDouble) {
        this.f84788a = ofDouble;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfDouble ofDouble = this.f84788a;
        if (obj instanceof F) {
            obj = ((F) obj).f84788a;
        }
        return ofDouble.equals(obj);
    }

    @Override // j$.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f84788a.forEachRemaining(obj);
    }

    @Override // j$.util.H, java.util.Iterator, j$.util.InterfaceC5802z
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f84788a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.H
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f84788a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f84788a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f84788a.hashCode();
    }

    @Override // j$.util.H, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f84788a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f84788a.next();
    }

    @Override // j$.util.H
    public final /* synthetic */ double nextDouble() {
        return this.f84788a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f84788a.remove();
    }
}
