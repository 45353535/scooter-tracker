package com.appodeal.ads.modules.common.internal.service;

import com.ironsource.C4240b4;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/InternalEventTracker;", "", "isInternalEventTrackingEnabled", "", "()Z", "internalLogEvent", "", C4240b4.i.f42633j0, "", "params", "", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface InternalEventTracker {
    void internalLogEvent(String eventName, Map<String, ? extends Object> params);

    boolean isInternalEventTrackingEnabled();
}
