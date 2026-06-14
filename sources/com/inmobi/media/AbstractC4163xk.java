package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.inmobi.media.xk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4163xk {
    public static int a(String str) {
        if (StringsKt.a0(str, "track_", false, 2, null)) {
            str = str.substring(6);
            Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
