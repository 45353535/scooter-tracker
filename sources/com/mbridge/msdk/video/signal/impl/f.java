package com.mbridge.msdk.video.signal.impl;

import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.video.module.MBridgeVideoView;

/* JADX INFO: loaded from: classes10.dex */
public class f implements com.mbridge.msdk.video.signal.g {
    @Override // com.mbridge.msdk.video.signal.g
    public void a(int i10) {
        q0.a("DefaultJSNotifyProxy", "onVideoStatusNotify:" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.g
    public void a(int i10, String str) {
        q0.a("DefaultJSNotifyProxy", "onClick:" + i10 + ",pt:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.g
    public void a(MBridgeVideoView.v vVar) {
        q0.a("DefaultJSNotifyProxy", "onProgressNotify:" + vVar.toString());
    }

    @Override // com.mbridge.msdk.video.signal.g
    public void a(Object obj) {
        q0.a("DefaultJSNotifyProxy", "onWebviewShow:" + obj);
    }

    @Override // com.mbridge.msdk.video.signal.g
    public void a(int i10, int i11, int i12, int i13) {
        q0.a("DefaultJSNotifyProxy", "showDataInfo");
    }
}
