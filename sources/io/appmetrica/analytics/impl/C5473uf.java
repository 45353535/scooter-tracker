package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.uf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5473uf implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(@NonNull Y7 y72) {
        int iOrdinal = y72.ordinal();
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? 0 : 2;
        }
        return 3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y7 toModel(@NonNull Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            return Y7.f76695c;
        }
        if (iIntValue == 2) {
            return Y7.f76697e;
        }
        if (iIntValue != 3) {
            return Y7.f76694b;
        }
        return Y7.f76696d;
    }
}
