package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class M implements O, InterfaceC5802z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfLong f84796a;

    public /* synthetic */ M(PrimitiveIterator.OfLong ofLong) {
        this.f84796a = ofLong;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfLong ofLong = this.f84796a;
        if (obj instanceof M) {
            obj = ((M) obj).f84796a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f84796a.forEachRemaining(obj);
    }

    @Override // j$.util.O, java.util.Iterator, j$.util.InterfaceC5802z
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f84796a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.O
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f84796a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f84796a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f84796a.hashCode();
    }

    @Override // j$.util.O, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f84796a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f84796a.next();
    }

    @Override // j$.util.O
    public final /* synthetic */ long nextLong() {
        return this.f84796a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f84796a.remove();
    }
}
