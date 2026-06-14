package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import n6.b;

/* JADX INFO: loaded from: classes11.dex */
public class SignalsHandler implements b {
    private GMAEventSender _gmaEventSender;

    public SignalsHandler(GMAEventSender gMAEventSender) {
        this._gmaEventSender = gMAEventSender;
    }

    @Override // n6.b
    public void onSignalsCollected(String str) {
        this._gmaEventSender.send(c.SIGNALS, str);
    }

    @Override // n6.b
    public void onSignalsCollectionFailed(String str) {
        this._gmaEventSender.send(c.SIGNALS_ERROR, str);
    }
}
