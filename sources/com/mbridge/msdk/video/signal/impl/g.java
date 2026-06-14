package com.mbridge.msdk.video.signal.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes10.dex */
public class g implements com.mbridge.msdk.video.signal.i {
    @Override // com.mbridge.msdk.video.signal.i
    public void a(String str) {
        q0.a("js", "setOrientation,landscape=" + str);
    }

    @Override // com.mbridge.msdk.video.signal.i
    public String b() {
        q0.a("js", "getEndScreenInfo");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.i
    public void handlerPlayableException(String str) {
        q0.a("js", "handlerPlayableException，msg=" + str);
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i10) {
        q0.a("js", "notifyCloseBtn,state=" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i10) {
        q0.a("js", "toggleCloseBtn,state=" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.i
    public void triggerCloseBtn(String str) {
        q0.a("js", "triggerCloseBtn,state=" + str);
    }
}
