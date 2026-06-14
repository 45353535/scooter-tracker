package com.bytedance.adsdk.ugeno.mml.mml;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.bytedance.adsdk.ugeno.wd.tvp;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class to extends lnr implements tvp.qdl {
    private Handler exu;
    private int fs;
    private int rdp;
    private int rq;

    public to(Context context) {
        super(context);
        this.fs = 0;
        this.exu = new com.bytedance.adsdk.ugeno.wd.tvp(Looper.getMainLooper(), this);
        this.rdp = 0;
    }

    @Override // com.bytedance.adsdk.ugeno.mml.mml.lnr
    public boolean qdl(Object... objArr) {
        Map<String, String> map = this.mzz;
        if (map != null) {
            int iQdl = com.bytedance.adsdk.ugeno.wd.lnr.qdl(map.get("loop"), 0);
            this.rq = iQdl;
            if (iQdl <= 0) {
                this.rdp = -1;
            } else {
                this.rdp = iQdl;
            }
            this.fs = com.bytedance.adsdk.ugeno.wd.lnr.qdl(this.mzz.get("duration"), 0);
        }
        this.exu.sendEmptyMessageDelayed(1001, this.fs);
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.wd.tvp.qdl
    public void qdl(Message message) {
        int i10;
        int i11;
        if (message.what != 1001) {
            return;
        }
        Log.d("UGBaseEventMonitor", "handleMsg: execute timer event" + this.rdp);
        this.qdl.qdl(this.f16188ud, this.mo, this.lnr.ud());
        int i12 = this.rdp + (-1);
        this.rdp = i12;
        if (i12 < 0 && (i11 = this.fs) != 0) {
            this.exu.sendEmptyMessageDelayed(1001, i11);
        } else if (i12 > 0 && (i10 = this.fs) != 0) {
            this.exu.sendEmptyMessageDelayed(1001, i10);
        } else {
            this.exu.removeMessages(1001);
        }
    }
}
