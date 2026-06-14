package com.bytedance.sdk.component.mo.qdl.qdl.qdl;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bytedance.sdk.component.mo.qdl.qdl.qdl.ud;

/* JADX INFO: loaded from: classes6.dex */
public class qdl extends ud {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile qdl qdl;

    private qdl(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.qdl.ud
    public /* bridge */ /* synthetic */ ud.C0231ud qdl() {
        return super.qdl();
    }

    public static qdl qdl(Context context) {
        if (qdl == null) {
            synchronized (qdl.class) {
                try {
                    if (qdl == null) {
                        qdl = new qdl(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return qdl;
    }
}
