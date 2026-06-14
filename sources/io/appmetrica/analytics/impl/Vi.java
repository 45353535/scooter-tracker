package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class Vi implements A9 {
    @Override // io.appmetrica.analytics.impl.A9
    @Nullable
    public final Integer a(@NonNull S8 s82) {
        EnumC5168ib enumC5168ib = s82.f76415h;
        if (enumC5168ib != null) {
            return (Integer) Uf.f76562c.get(enumC5168ib);
        }
        Map map = Uf.f76560a;
        return null;
    }
}
