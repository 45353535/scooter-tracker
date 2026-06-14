package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Ne implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4956a6[] fromModel(@NotNull Map<String, String> map) {
        int size = map.size();
        C4956a6[] c4956a6Arr = new C4956a6[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            c4956a6Arr[i11] = new C4956a6();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            C4956a6 c4956a6 = c4956a6Arr[i10];
            String key = entry.getKey();
            Charset charset = Charsets.UTF_8;
            c4956a6.f76797a = key.getBytes(charset);
            c4956a6Arr[i10].f76798b = entry.getValue().getBytes(charset);
            i10++;
        }
        return c4956a6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @NotNull
    public final Map<String, String> a(@NotNull C4956a6[] c4956a6Arr) {
        throw new UnsupportedOperationException();
    }
}
