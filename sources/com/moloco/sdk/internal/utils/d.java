package com.moloco.sdk.internal.utils;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d {
    public static final String a(String substituteCountDownTimeLeftMacro, int i10) {
        Intrinsics.checkNotNullParameter(substituteCountDownTimeLeftMacro, "$this$substituteCountDownTimeLeftMacro");
        return StringsKt.W(substituteCountDownTimeLeftMacro, "[SECONDS_LEFT]", Long.toString(((long) i10) & 4294967295L, 10), false, 4, null);
    }

    public static final String b(String str, long j10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.W(str, "[HAPPENED_AT_TS]", String.valueOf(j10), false, 4, null);
    }

    public static final String c(String str, String errorCode) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        return StringsKt.W(str, "[ERROR_CODE]", errorCode, false, 4, null);
    }

    public static final String d(String str, String errorCode, long j10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        return b(c(str, errorCode), j10);
    }

    public static final String e(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str2 == null) {
            return str;
        }
        String strW = StringsKt.W(str, "[MTID]", str2, false, 4, null);
        return strW == null ? str : strW;
    }
}
