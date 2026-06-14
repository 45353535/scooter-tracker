package com.unity3d.ads.core.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0004"}, d2 = {"getMemoryValueFromString", "", "memVal", "", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class GetMemoryValueFromStringKt {
    public static final long getMemoryValueFromString(@Nullable String str) {
        Long lX;
        if (str == null) {
            return -1L;
        }
        Matcher matcher = Pattern.compile("(\\d+)").matcher(str);
        String strGroup = null;
        while (matcher.find()) {
            strGroup = matcher.group(1);
        }
        if (strGroup == null || (lX = StringsKt.x(strGroup)) == null) {
            return -1L;
        }
        return lX.longValue();
    }
}
