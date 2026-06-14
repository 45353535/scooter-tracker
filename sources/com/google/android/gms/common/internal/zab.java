package com.google.android.gms.common.internal;

import j$.util.DesugarCollections;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class zab {
    public final Set zaa;

    public zab(Set set) {
        Preconditions.checkNotNull(set);
        this.zaa = DesugarCollections.unmodifiableSet(set);
    }
}
