package com.mobilefuse.sdk.encoding;

import android.net.Uri;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0002¨\u0006\u0003"}, d2 = {"toUriParams", "", "", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class HttpParamsKt {
    @NotNull
    public static final String toUriParams(@NotNull Map<String, String> toUriParams) {
        Intrinsics.checkNotNullParameter(toUriParams, "$this$toUriParams");
        Uri.Builder builder = new Uri.Builder();
        for (Map.Entry<String, String> entry : toUriParams.entrySet()) {
            builder.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        String string = builder.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "Uri.Builder().also {\n   …ild()\n        .toString()");
        return StringsKt.W(string, "?", "", false, 4, null);
    }
}
