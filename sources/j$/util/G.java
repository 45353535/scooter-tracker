package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class G implements PrimitiveIterator.OfDouble {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H f84789a;

    public /* synthetic */ G(H h10) {
        this.f84789a = h10;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        H h10 = this.f84789a;
        if (obj instanceof G) {
            obj = ((G) obj).f84789a;
        }
        return h10.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f84789a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f84789a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.f84789a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f84789a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f84789a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f84789a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f84789a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    public final /* synthetic */ double nextDouble() {
        return this.f84789a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f84789a.remove();
    }
}
