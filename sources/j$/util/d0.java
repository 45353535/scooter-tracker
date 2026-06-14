package j$.util;

import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 implements Iterator, Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f84907a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f84908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Spliterator f84909c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public d0(Spliterator spliterator) {
        this.f84909c = spliterator;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f84907a = true;
        this.f84908b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f84907a) {
            this.f84909c.tryAdvance(this);
        }
        return this.f84907a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f84907a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f84907a = false;
        return this.f84908b;
    }
}
