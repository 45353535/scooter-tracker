package com.google.android.gms.internal.ads;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class zziez extends zziew implements Set, yf.a, j$.util.Set {

    @NotNull
    private final Set zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziez(@NotNull Set delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.zza = delegate;
    }

    @Override // com.google.android.gms.internal.ads.zziew, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return super.contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zziew, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator iterator() {
        return new zziey(this.zza.iterator());
    }

    @Override // com.google.android.gms.internal.ads.zziew, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // com.google.android.gms.internal.ads.zziew, java.util.Collection, java.lang.Iterable, j$.util.Collection
    public /* synthetic */ j$.util.Spliterator spliterator() {
        return Spliterators.spliterator(this, 1);
    }
}
