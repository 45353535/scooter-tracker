package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes10.dex */
public class f {
    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            Resources resources = context.getResources();
            return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android")) > 0;
        } catch (Throwable th2) {
            q0.b("DomainSameTool", th2.getMessage(), th2);
            return false;
        }
    }
}
