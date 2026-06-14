package com.appodeal.ads.services.adjust;

import com.adjust.sdk.Adjust;
import com.appodeal.ads.ext.LogExtKt;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k {
    public static final boolean a() {
        try {
            Field declaredField = Adjust.class.getDeclaredField("defaultInstance");
            declaredField.setAccessible(true);
            return declaredField.get(null) != null;
        } catch (Throwable th2) {
            LogExtKt.logInternal("AdjustService", "Failed to check is initialized", th2);
            return false;
        }
    }
}
