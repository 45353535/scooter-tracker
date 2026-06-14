package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5593za extends K2 {
    public C5593za(int i10) {
        super(i10);
    }

    @Override // io.appmetrica.analytics.impl.K2, io.appmetrica.analytics.impl.Aa
    @NonNull
    public final On a(@Nullable String str) {
        int length = 0;
        if (str != null) {
            int length2 = str.length();
            int i10 = this.f76015a;
            if (length2 > i10) {
                String strSubstring = str.substring(0, i10);
                length = str.getBytes().length - strSubstring.getBytes().length;
                str = strSubstring;
            }
        }
        return new On(str, new C5160i3(length));
    }
}
