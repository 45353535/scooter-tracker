package com.moloco.sdk.internal.services.proto;

import android.util.Base64;
import com.moloco.sdk.UserIntent$UserAdInteractionExt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements a {
    @Override // com.moloco.sdk.internal.services.proto.a
    public String a(UserIntent$UserAdInteractionExt input, int i10) {
        Intrinsics.checkNotNullParameter(input, "input");
        String strEncodeToString = Base64.encodeToString(input.toByteArray(), i10);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }
}
