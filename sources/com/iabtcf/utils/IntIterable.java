package com.iabtcf.utils;

import j$.util.DesugarArrays;
import j$.util.Spliterators;
import j$.util.stream.IntStream;
import j$.util.stream.StreamSupport;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public abstract class IntIterable implements Iterable<Integer> {
    public abstract boolean contains(int i10);

    public boolean containsAll(int... iArr) {
        return DesugarArrays.stream(iArr).allMatch(new b(this));
    }

    public boolean containsAny(int... iArr) {
        return DesugarArrays.stream(iArr).anyMatch(new b(this));
    }

    public abstract IntIterator intIterator();

    public boolean isEmpty() {
        return !intIterator().hasNext();
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() { // from class: com.iabtcf.utils.IntIterable.1
            final IntIterator internal;

            {
                this.internal = IntIterable.this.intIterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.internal.hasNext();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public Integer next() {
                return this.internal.next();
            }
        };
    }

    public Set<Integer> toSet() {
        HashSet hashSet = new HashSet();
        IntIterator intIterator = intIterator();
        while (intIterator.hasNext()) {
            hashSet.add(intIterator.next());
        }
        return hashSet;
    }

    public IntStream toStream() {
        return StreamSupport.intStream(Spliterators.spliteratorUnknownSize(intIterator(), 1296), false);
    }
}
