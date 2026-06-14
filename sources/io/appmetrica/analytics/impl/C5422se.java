package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5422se implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(@Nullable Boolean bool) {
        int i10;
        if (bool == null) {
            i10 = -1;
        } else if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            i10 = 1;
        } else {
            if (!Intrinsics.areEqual(bool, Boolean.FALSE)) {
                throw new lf.m();
            }
            i10 = 0;
        }
        return Integer.valueOf(i10);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object toModel(Object obj) {
        return a(((Number) obj).intValue());
    }

    @Nullable
    public final Boolean a(int i10) {
        if (i10 == -1) {
            return null;
        }
        if (i10 == 0) {
            return Boolean.FALSE;
        }
        if (i10 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }
}
