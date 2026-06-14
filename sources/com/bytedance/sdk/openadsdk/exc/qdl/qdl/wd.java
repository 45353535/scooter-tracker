package com.bytedance.sdk.openadsdk.exc.qdl.qdl;

import android.content.Context;
import com.bytedance.sdk.openadsdk.utils.gy;

/* JADX INFO: loaded from: classes6.dex */
public class wd {
    public static mo qdl(Context context, String str) {
        return lnr.qdl() ? new mzz(context, str) : gy.mml(context) ? new mml(context, str) : new qdl(context, str);
    }
}
