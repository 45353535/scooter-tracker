package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public enum BoundType {
    OPEN(false),
    CLOSED(true);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f29324b;

    BoundType(boolean z10) {
        this.f29324b = z10;
    }

    static BoundType g(boolean z10) {
        return z10 ? CLOSED : OPEN;
    }
}
