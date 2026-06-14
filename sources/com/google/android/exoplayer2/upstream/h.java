package com.google.android.exoplayer2.upstream;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.google.common.base.Predicate;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class h {
    static {
        Predicate<String> predicate = HttpDataSource.REJECT_PAYWALL_TYPES;
    }

    public static /* synthetic */ boolean a(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = Ascii.toLowerCase(str);
        return (TextUtils.isEmpty(lowerCase) || (lowerCase.contains("text") && !lowerCase.contains("text/vtt")) || lowerCase.contains("html") || lowerCase.contains("xml")) ? false : true;
    }
}
