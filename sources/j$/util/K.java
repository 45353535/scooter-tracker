package j$.util;

import j$.util.PrimitiveIterator;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class K implements PrimitiveIterator.OfInt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfInt f84793a;

    public /* synthetic */ K(PrimitiveIterator.OfInt ofInt) {
        this.f84793a = ofInt;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfInt ofInt = this.f84793a;
        if (obj instanceof K) {
            obj = ((K) obj).f84793a;
        }
        return ofInt.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f84793a.forEachRemaining(intConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f84793a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        this.f84793a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f84793a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f84793a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f84793a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f84793a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt
    public final /* synthetic */ int nextInt() {
        return this.f84793a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f84793a.remove();
    }
}
