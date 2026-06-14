package com.unity3d.services.store.core;

import com.unity3d.services.store.StoreWebViewEventSender;
import com.unity3d.services.store.WebViewStoreEventListener;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/unity3d/services/store/core/StoreEventListenerFactory;", "", "storeWebViewEventSender", "Lcom/unity3d/services/store/StoreWebViewEventSender;", "(Lcom/unity3d/services/store/StoreWebViewEventSender;)V", "invoke", "Lcom/unity3d/services/store/gpbl/listeners/StoreEventListener;", "operationId", "", "isLifecycleListener", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StoreEventListenerFactory {

    @NotNull
    private final StoreWebViewEventSender storeWebViewEventSender;

    public StoreEventListenerFactory(@NotNull StoreWebViewEventSender storeWebViewEventSender) {
        Intrinsics.checkNotNullParameter(storeWebViewEventSender, "storeWebViewEventSender");
        this.storeWebViewEventSender = storeWebViewEventSender;
    }

    public static /* synthetic */ StoreEventListener invoke$default(StoreEventListenerFactory storeEventListenerFactory, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return storeEventListenerFactory.invoke(i10, z10);
    }

    @NotNull
    public final StoreEventListener invoke() {
        return invoke$default(this, 0, false, 3, null);
    }

    @NotNull
    public final StoreEventListener invoke(int i10) {
        return invoke$default(this, i10, false, 2, null);
    }

    @NotNull
    public final StoreEventListener invoke(int operationId, boolean isLifecycleListener) {
        return new WebViewStoreEventListener(operationId, this.storeWebViewEventSender, isLifecycleListener);
    }
}
