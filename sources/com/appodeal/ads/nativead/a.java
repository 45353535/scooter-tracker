package com.appodeal.ads.nativead;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final String a(int i10, String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (content.length() <= i10) {
            return content;
        }
        String strSubstring = content.substring(0, i10);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        if (content.charAt(i10) != ' ' && StringsKt.C0(strSubstring, " ", 0, false, 6, null) > 0) {
            strSubstring = strSubstring.substring(0, StringsKt.C0(strSubstring, " ", 0, false, 6, null));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        return strSubstring + "…";
    }
}
