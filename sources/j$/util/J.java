package j$.util;

import j$.util.PrimitiveIterator;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class J implements PrimitiveIterator.OfInt, InterfaceC5802z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfInt f84792a;

    public /* synthetic */ J(PrimitiveIterator.OfInt ofInt) {
        this.f84792a = ofInt;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfInt ofInt = this.f84792a;
        if (obj instanceof J) {
            obj = ((J) obj).f84792a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f84792a.forEachRemaining(intConsumer);
    }

    @Override // j$.util.PrimitiveIterator.OfInt
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f84792a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.PrimitiveIterator.OfInt
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        this.f84792a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f84792a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f84792a.hashCode();
    }

    @Override // j$.util.PrimitiveIterator.OfInt
    public final /* synthetic */ Integer next() {
        return this.f84792a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f84792a.next();
    }

    @Override // j$.util.PrimitiveIterator.OfInt
    public final /* synthetic */ int nextInt() {
        return this.f84792a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f84792a.remove();
    }
}
