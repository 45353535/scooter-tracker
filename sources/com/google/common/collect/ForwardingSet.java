package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingSet<E> extends ForwardingCollection<E> implements Set<E> {
    protected ForwardingSet() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return obj == this || n().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return n().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingCollection
    public abstract Set n();

    protected boolean o(Collection collection) {
        return Sets.d(this, (Collection) Preconditions.checkNotNull(collection));
    }
}
