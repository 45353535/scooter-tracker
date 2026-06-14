package com.inmobi.media;

import android.webkit.URLUtil;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.inmobi.media.ol, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3940ol {
    public static final boolean a(String str) {
        if (str == null || StringsKt.f0(StringsKt.v1(str).toString(), ' ', false, 2, null)) {
            return false;
        }
        return URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str);
    }

    public static final String b(String str) {
        if (str == null) {
            return "";
        }
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = Intrinsics.compare((int) str.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String string = str.subSequence(i10, length + 1).toString();
        return string == null ? "" : string;
    }
}
