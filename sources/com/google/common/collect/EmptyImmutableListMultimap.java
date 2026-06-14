package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
class EmptyImmutableListMultimap extends ImmutableListMultimap<Object, Object> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final EmptyImmutableListMultimap f29447j = new EmptyImmutableListMultimap();

    private EmptyImmutableListMultimap() {
        super(ImmutableMap.of(), 0);
    }

    private Object readResolve() {
        return f29447j;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public ImmutableMap<Object, Collection<Object>> asMap() {
        return super.asMap();
    }
}
