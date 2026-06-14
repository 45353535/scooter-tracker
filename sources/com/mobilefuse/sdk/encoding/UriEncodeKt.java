package com.mobilefuse.sdk.encoding;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0001¨\u0006\u0003"}, d2 = {"uriEncode", "", "kotlin.jvm.PlatformType", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class UriEncodeKt {
    public static final String uriEncode(@NotNull String uriEncode) {
        Intrinsics.checkNotNullParameter(uriEncode, "$this$uriEncode");
        return Uri.encode(uriEncode);
    }
}
