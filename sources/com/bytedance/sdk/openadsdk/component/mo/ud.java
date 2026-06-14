package com.bytedance.sdk.openadsdk.component.mo;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public class ud implements Handler.Callback {
    private boolean fs;
    private qdl lnr;
    private long rq;
    private long to;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.jpc.qdl f17011ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private boolean f17012wd;
    private Handler qdl = new Handler(Looper.myLooper(), this);
    private int mml = 0;
    private int mzz = 5;
    private int mo = 0;
    private final int jpc = 1000;
    private int tvp = 1000;

    public ud(com.bytedance.sdk.openadsdk.component.jpc.qdl qdlVar) {
        this.f17011ud = qdlVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        if (message.what == 100 && this.qdl != null) {
            int i10 = message.arg1;
            qdl(i10);
            if (i10 > 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i10 - 1;
                this.qdl.sendMessageDelayed(messageObtain, this.tvp);
            }
        }
        return true;
    }

    public void lnr() {
        if (this.qdl != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            messageObtain.arg1 = this.mml;
            this.qdl.sendMessage(messageObtain);
        }
    }

    public void mml() {
        Handler handler = this.qdl;
        if (handler != null) {
            handler.removeMessages(100);
        }
    }

    public void mzz() {
        this.qdl.removeCallbacksAndMessages(null);
        this.qdl = null;
    }

    public void qdl(int i10) {
        this.mml = i10;
        int i11 = this.mzz - i10;
        this.f17011ud.ud(i11);
        boolean z10 = true;
        if (i10 <= 0) {
            qdl qdlVar = this.lnr;
            if (qdlVar != null && !this.f17012wd) {
                qdlVar.ud();
                this.f17012wd = true;
            }
            i10 = 0;
        }
        qdl qdlVar2 = this.lnr;
        if (qdlVar2 != null) {
            int i12 = this.mo;
            int i13 = i12 - i11;
            if (i10 != 0 && i11 < i12) {
                z10 = false;
            }
            qdlVar2.qdl(i13, z10);
        }
    }

    public void ud(int i10) {
        this.mo = Math.min(i10, this.mzz);
    }

    public void ud() {
        Handler handler = this.qdl;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(100, this.mzz, 0));
        }
    }

    public void qdl(float f10) {
        int i10 = (int) f10;
        this.mzz = i10;
        if (i10 <= 0) {
            this.mzz = 5;
        }
    }

    public void qdl(qdl qdlVar) {
        this.lnr = qdlVar;
    }

    public int qdl() {
        return this.mo;
    }

    public void qdl(int i10, float f10, boolean z10) {
        com.bytedance.sdk.openadsdk.component.jpc.qdl qdlVar;
        if ((i10 == 1 || i10 == 2) && this.fs != z10) {
            this.fs = z10;
            if (i10 == 1 && (qdlVar = this.f17011ud) != null) {
                qdlVar.qdl(z10);
            }
            if (z10) {
                try {
                    this.tvp = (int) (1000.0f / f10);
                    this.rq = System.currentTimeMillis();
                    return;
                } catch (Throwable unused) {
                }
            } else {
                long jCurrentTimeMillis = this.to + (System.currentTimeMillis() - this.rq);
                this.to = jCurrentTimeMillis;
                com.bytedance.sdk.openadsdk.component.jpc.qdl qdlVar2 = this.f17011ud;
                if (qdlVar2 != null) {
                    qdlVar2.qdl(jCurrentTimeMillis);
                }
            }
            this.tvp = 1000;
        }
    }
}
