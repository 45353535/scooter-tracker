package io.bidmachine.analytics.internal.a;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b {
    public static final Float a(Object obj) {
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (obj instanceof String) {
            return StringsKt.u((String) obj);
        }
        return null;
    }
}
