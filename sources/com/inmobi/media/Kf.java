package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Kf {
    public static final boolean a(Context context, String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        if (context == null) {
            return false;
        }
        return context.checkCallingOrSelfPermission(permission) == 0;
    }
}
