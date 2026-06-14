package com.google.android.gms.internal.ads;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class zziex implements Iterator, yf.a {
    private final /* synthetic */ Iterator zza;

    public zziex(@NotNull Iterator delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.zza = delegate;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
