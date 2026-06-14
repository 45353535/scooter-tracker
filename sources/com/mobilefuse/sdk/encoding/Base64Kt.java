package com.mobilefuse.sdk.encoding;

import android.util.Base64;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u00020\u0001¨\u0006\u0004"}, d2 = {"base64Decode", "", "", "base64Encode", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class Base64Kt {
    @Nullable
    public static final byte[] base64Decode(@NotNull String base64Decode) {
        Intrinsics.checkNotNullParameter(base64Decode, "$this$base64Decode");
        try {
            return Base64.decode(base64Decode, 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final String base64Encode(@NotNull byte[] base64Encode) {
        Intrinsics.checkNotNullParameter(base64Encode, "$this$base64Encode");
        try {
            return Base64.encodeToString(base64Encode, 0);
        } catch (Throwable unused) {
            return null;
        }
    }
}
