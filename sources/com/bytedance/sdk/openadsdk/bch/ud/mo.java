package com.bytedance.sdk.openadsdk.bch.ud;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.hzv;

/* JADX INFO: loaded from: classes6.dex */
public class mo {
    public static boolean qdl(View view, int i10) {
        return qdl(view, false, i10);
    }

    public static boolean qdl(View view, boolean z10, int i10) {
        if (view == null) {
            return false;
        }
        return hzv.qdl(view, z10 ? 30 : 50, i10, false);
    }
}
