package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5344pa implements U9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O8 f77977a = new O8();

    @NotNull
    public final C5191j9[] a(@Nullable byte[] bArr) {
        int i10 = 0;
        if (bArr == null) {
            return new C5191j9[0];
        }
        Map<String, byte[]> model = this.f77977a.toModel(bArr);
        C5191j9[] c5191j9Arr = new C5191j9[model.size()];
        for (Object obj : model.entrySet()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Map.Entry entry = (Map.Entry) obj;
            C5191j9 c5191j9 = new C5191j9();
            c5191j9.f77508a = ((String) entry.getKey()).getBytes(Charsets.UTF_8);
            c5191j9.f77509b = (byte[]) entry.getValue();
            c5191j9Arr[i10] = c5191j9;
            i10 = i11;
        }
        return c5191j9Arr;
    }
}
