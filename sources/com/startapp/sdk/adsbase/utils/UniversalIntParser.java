package com.startapp.sdk.adsbase.utils;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.startapp.json.TypeParser;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public class UniversalIntParser implements TypeParser<Integer> {
    private static final String LOG_TAG = "UniversalIntParser";

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.startapp.json.TypeParser
    @NonNull
    public Integer parse(@NonNull Class<Integer> cls, @Nullable Object obj) {
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return Integer.valueOf(Boolean.TRUE.equals(obj) ? 1 : 0);
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (Throwable unused) {
            }
        }
        return 0;
    }
}
