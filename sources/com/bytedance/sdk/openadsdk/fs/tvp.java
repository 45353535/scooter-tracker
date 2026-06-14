package com.bytedance.sdk.openadsdk.fs;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* JADX INFO: loaded from: classes6.dex */
public class tvp {
    private final AudioManager qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f17601ud = -1;
    private boolean lnr = false;

    public tvp(Context context) {
        this.qdl = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public int qdl() {
        return this.f17601ud;
    }

    public void qdl(boolean z10) {
        qdl(z10, false);
    }

    public void qdl(boolean z10, boolean z11) {
        if (this.qdl == null) {
            return;
        }
        int i10 = 0;
        if (z10) {
            int iWd = DeviceUtils.wd();
            if (iWd != 0) {
                this.f17601ud = iWd;
            } else if (!z11) {
                return;
            }
            qdl(3, 0, 0);
            this.lnr = true;
            return;
        }
        int iTvp = this.f17601ud;
        if (iTvp == 0) {
            iTvp = DeviceUtils.tvp() / 15;
        } else {
            if (iTvp == -1) {
                if (!z11) {
                    return;
                } else {
                    iTvp = DeviceUtils.tvp() / 15;
                }
            }
            this.f17601ud = -1;
            qdl(3, iTvp, i10);
            this.lnr = true;
        }
        i10 = 1;
        this.f17601ud = -1;
        qdl(3, iTvp, i10);
        this.lnr = true;
    }

    private void qdl(int i10, int i11, int i12) {
        try {
            this.qdl.setStreamVolume(i10, i11, i12);
        } catch (Throwable unused) {
        }
    }
}
