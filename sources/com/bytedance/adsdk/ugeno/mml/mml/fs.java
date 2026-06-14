package com.bytedance.adsdk.ugeno.mml.mml;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.wd.tvp;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import io.bidmachine.protobuf.EventTypeExtended;

/* JADX INFO: loaded from: classes6.dex */
public class fs extends lnr implements tvp.qdl {
    private Handler fs;
    private int rq;

    public fs(Context context) {
        super(context);
        this.rq = 500;
        this.fs = new com.bytedance.adsdk.ugeno.wd.tvp(Looper.getMainLooper(), this);
    }

    @Override // com.bytedance.adsdk.ugeno.mml.mml.lnr
    public boolean qdl(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        this.rq = com.bytedance.adsdk.ugeno.wd.lnr.qdl(this.mzz.get(POBCTAOverlayData.KEY_CTA_DELAY), 500);
        return qdl(this.f16188ud, motionEvent);
    }

    private boolean qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.fs.sendEmptyMessageDelayed(EventTypeExtended.EVENT_TYPE_CLICK_BY_SOURCE_VALUE, this.rq);
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        this.fs.removeMessages(EventTypeExtended.EVENT_TYPE_CLICK_BY_SOURCE_VALUE);
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.wd.tvp.qdl
    public void qdl(Message message) {
        if (message.what != 1101) {
            return;
        }
        com.bytedance.adsdk.ugeno.mml.rq rqVar = this.qdl;
        if (rqVar != null) {
            rqVar.qdl(this.f16188ud, this.mo, this.lnr.ud());
        }
        Handler handler = this.fs;
        if (handler != null) {
            handler.removeMessages(EventTypeExtended.EVENT_TYPE_CLICK_BY_SOURCE_VALUE);
        }
    }
}
