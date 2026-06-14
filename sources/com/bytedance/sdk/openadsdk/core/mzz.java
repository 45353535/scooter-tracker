package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bytedance.sdk.openadsdk.core.mo;

/* JADX INFO: loaded from: classes6.dex */
public class mzz extends mo {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile mzz qdl;

    private mzz(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mo
    public /* bridge */ /* synthetic */ mo.lnr qdl() {
        return super.qdl();
    }

    public static mzz qdl(Context context) {
        if (qdl == null) {
            synchronized (mzz.class) {
                try {
                    if (qdl == null) {
                        qdl = new mzz(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return qdl;
    }
}
