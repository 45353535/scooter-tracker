package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes10.dex */
public class f implements com.mbridge.msdk.video.module.listener.a {
    @Override // com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        q0.b("NotifyListener", "onNotify,type=" + i10 + ",pt=" + obj);
    }
}
