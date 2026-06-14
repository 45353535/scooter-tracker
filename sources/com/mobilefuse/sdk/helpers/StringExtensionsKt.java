package com.mobilefuse.sdk.helpers;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"sanitizeJsonString", "", "mobilefuse-sdk-telemetry_release"}, k = 2, mv = {1, 4, 3})
public final class StringExtensionsKt {
    @NotNull
    public static final String sanitizeJsonString(@NotNull String sanitizeJsonString) {
        Intrinsics.checkNotNullParameter(sanitizeJsonString, "$this$sanitizeJsonString");
        return new Regex("[\r\n]").replace(new Regex("\\/").replace(new Regex("\\\\").replace(sanitizeJsonString, ""), "/"), "");
    }
}
