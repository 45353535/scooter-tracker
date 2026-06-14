package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
final class PairwiseEquivalence<E, T extends E> extends Equivalence<Iterable<T>> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Equivalence f28917b;

    PairwiseEquivalence(Equivalence equivalence) {
        this.f28917b = (Equivalence) Preconditions.checkNotNull(equivalence);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.base.Equivalence
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(Iterable iterable, Iterable iterable2) {
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!this.f28917b.equivalent(it.next(), it2.next())) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.base.Equivalence
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int b(Iterable iterable) {
        Iterator it = iterable.iterator();
        int iHash = 78721;
        while (it.hasNext()) {
            iHash = (iHash * 24943) + this.f28917b.hash(it.next());
        }
        return iHash;
    }

    public boolean equals(Object obj) {
        if (obj instanceof PairwiseEquivalence) {
            return this.f28917b.equals(((PairwiseEquivalence) obj).f28917b);
        }
        return false;
    }

    public int hashCode() {
        return this.f28917b.hashCode() ^ 1185147655;
    }

    public String toString() {
        return this.f28917b + ".pairwise()";
    }
}
