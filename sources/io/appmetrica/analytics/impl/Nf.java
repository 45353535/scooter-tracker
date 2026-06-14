package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class Nf implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5568ya f76165a;

    public Nf() {
        this(new C5568ya(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(@NonNull List<String> list) {
        On onA = this.f76165a.a((List<Object>) list);
        List list2 = (List) onA.f76209a;
        C5466u8[] c5466u8Arr = new C5466u8[0];
        if (list2 != null) {
            c5466u8Arr = new C5466u8[list2.size()];
            for (int i10 = 0; i10 < list2.size(); i10++) {
                C5466u8 c5466u8 = new C5466u8();
                c5466u8Arr[i10] = c5466u8;
                c5466u8.f78349a = StringUtils.getUTF8Bytes((String) list2.get(i10));
            }
        }
        onA.f76210b.getBytesTruncated();
        return new Ii(c5466u8Arr, onA.f76210b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @VisibleForTesting
    public Nf(@NonNull C5568ya c5568ya) {
        this.f76165a = c5568ya;
    }

    @NonNull
    public final List<String> a(@NonNull Ii ii) {
        throw new UnsupportedOperationException();
    }
}
