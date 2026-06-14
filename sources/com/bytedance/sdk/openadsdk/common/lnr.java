package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.ljh;

/* JADX INFO: loaded from: classes6.dex */
public class lnr extends fs {
    public lnr(@NonNull Context context) {
        super(context);
        this.f16969ud = false;
    }

    @Override // com.bytedance.sdk.openadsdk.common.fs
    public void qdl() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.lnr.1
            @Override // java.lang.Runnable
            public void run() {
                lnr lnrVar = lnr.this;
                if (lnrVar.qdl != null) {
                    lnrVar.setVisibility(0);
                }
            }
        });
    }

    public void qdl(ljh ljhVar, String str, int i10, String str2, long j10, boolean z10, int i11, long j11) {
        if (getVisibility() != 8) {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, str, i10, str2, SystemClock.elapsedRealtime() - j10, z10, i11, j11);
            super.ud();
        }
    }
}
