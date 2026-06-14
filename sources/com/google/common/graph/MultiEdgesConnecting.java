package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
abstract class MultiEdgesConnecting<E> extends AbstractSet<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f30636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f30637c;

    MultiEdgesConnecting(Map map, Object obj) {
        this.f30636b = (Map) Preconditions.checkNotNull(map);
        this.f30637c = Preconditions.checkNotNull(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f30637c.equals(this.f30636b.get(obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public UnmodifiableIterator<E> iterator() {
        final Iterator<E> it = this.f30636b.entrySet().iterator();
        return new AbstractIterator<E>(this) { // from class: com.google.common.graph.MultiEdgesConnecting.1

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ MultiEdgesConnecting f30639e;

            {
                this.f30639e = this;
            }

            @Override // com.google.common.collect.AbstractIterator
            protected Object computeNext() {
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (this.f30639e.f30637c.equals(entry.getValue())) {
                        return entry.getKey();
                    }
                }
                return a();
            }
        };
    }
}
