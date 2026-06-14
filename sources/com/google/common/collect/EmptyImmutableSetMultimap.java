package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
class EmptyImmutableSetMultimap extends ImmutableSetMultimap<Object, Object> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final EmptyImmutableSetMultimap f29448l = new EmptyImmutableSetMultimap();

    private EmptyImmutableSetMultimap() {
        super(ImmutableMap.of(), 0, null);
    }

    private Object readResolve() {
        return f29448l;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public ImmutableMap<Object, Collection<Object>> asMap() {
        return super.asMap();
    }
}
