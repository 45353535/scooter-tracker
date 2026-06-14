package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.ForwardingSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
final class InvalidatableSet<E> extends ForwardingSet<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Supplier f30624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f30625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Supplier f30626d;

    private InvalidatableSet(Set set, Supplier supplier, Supplier supplier2) {
        this.f30625c = set;
        this.f30624b = supplier;
        this.f30626d = supplier2;
    }

    public static final <E> InvalidatableSet<E> of(Set<E> set, Supplier<Boolean> supplier, Supplier<String> supplier2) {
        return new InvalidatableSet<>((Set) Preconditions.checkNotNull(set), (Supplier) Preconditions.checkNotNull(supplier), (Supplier) Preconditions.checkNotNull(supplier2));
    }

    private void q() {
        if (!((Boolean) this.f30624b.get()).booleanValue()) {
            throw new IllegalStateException((String) this.f30626d.get());
        }
    }

    @Override // com.google.common.collect.ForwardingSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f30625c.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
    public Set n() {
        q();
        return this.f30625c;
    }
}
