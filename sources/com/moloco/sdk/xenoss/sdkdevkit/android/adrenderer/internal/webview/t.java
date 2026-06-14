package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes10.dex */
public final class t implements u {
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.u
    public String a(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        byte[] bytes = StringsKt.n(content).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(bytes, 1);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }
}
