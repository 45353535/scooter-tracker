package com.google.android.gms.internal.ads;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Collection;
import java.util.Set;
import java.util.Spliterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class zzifb extends zziew implements Set, yf.a, j$.util.Set {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzifb(@NotNull Collection delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
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
