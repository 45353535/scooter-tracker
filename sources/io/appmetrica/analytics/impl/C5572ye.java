package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5572ye implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ca f78581a;

    public C5572ye() {
        this(new Ca(20480, 100, 1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(@NonNull Map<String, String> map) {
        On onA = this.f78581a.a(map);
        C5391r8 c5391r8 = new C5391r8();
        c5391r8.f78126b = ((C5462u4) onA.f76210b).f78323b;
        Map map2 = (Map) onA.f76209a;
        if (map2 != null) {
            c5391r8.f78125a = new C5367q8[map2.size()];
            int i10 = 0;
            for (Map.Entry entry : map2.entrySet()) {
                c5391r8.f78125a[i10] = new C5367q8();
                c5391r8.f78125a[i10].f78047a = StringUtils.getUTF8Bytes((String) entry.getKey());
                c5391r8.f78125a[i10].f78048b = StringUtils.getUTF8Bytes((String) entry.getValue());
                i10++;
            }
        }
        InterfaceC5185j3 interfaceC5185j3 = onA.f76210b;
        int i11 = ((C5462u4) interfaceC5185j3).f77367a;
        return new Ii(c5391r8, interfaceC5185j3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @VisibleForTesting
    public C5572ye(@NonNull Ca ca2) {
        this.f78581a = ca2;
    }

    @NonNull
    public final Map<String, String> a(@NonNull Ii ii) {
        throw new UnsupportedOperationException();
    }
}
