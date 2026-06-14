package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class Zc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f42275a;

    public Zc(@NotNull String baseControllerUrl) {
        Intrinsics.checkNotNullParameter(baseControllerUrl, "baseControllerUrl");
        this.f42275a = baseControllerUrl;
    }

    @NotNull
    public final String a() {
        String str = this.f42275a;
        String strSubstring = str.substring(0, StringsKt.C0(str, "/", 0, false, 6, null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
