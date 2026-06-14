package com.unity3d.services.ads.gmascar.utils;

import androidx.annotation.NonNull;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;

/* JADX INFO: loaded from: classes11.dex */
public class GMAEventSender implements IEventSender {
    private final IEventSender _eventSender;

    public GMAEventSender() {
        this(SharedInstances.INSTANCE.getWebViewEventSender());
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean canSend() {
        return this._eventSender.canSend();
    }

    public void send(c cVar, Object... objArr) {
        this._eventSender.sendEvent(WebViewEventCategory.GMA, cVar, objArr);
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean sendEvent(@NonNull Enum<?> r22, @NonNull Enum<?> r32, @NonNull Object... objArr) {
        return this._eventSender.sendEvent(r22, r32, objArr);
    }

    public void sendVersion(String str) {
        this._eventSender.sendEvent(WebViewEventCategory.INIT_GMA, c.VERSION, str);
    }

    public GMAEventSender(IEventSender iEventSender) {
        this._eventSender = iEventSender;
    }
}
