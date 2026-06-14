package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class N implements PrimitiveIterator.OfLong {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f84797a;

    public /* synthetic */ N(O o10) {
        this.f84797a = o10;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        O o10 = this.f84797a;
        if (obj instanceof N) {
            obj = ((N) obj).f84797a;
        }
        return o10.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f84797a.forEachRemaining(longConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f84797a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        this.f84797a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f84797a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f84797a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f84797a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f84797a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong
    public final /* synthetic */ long nextLong() {
        return this.f84797a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f84797a.remove();
    }
}
