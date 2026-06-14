package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBBidsProvider;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
@MainThread
public abstract class POBBaseEvent {
    public abstract void destroy();

    @NonNull
    protected POBError prepareErrorFromResponse(@Nullable POBBidsProvider pOBBidsProvider) {
        return new POBError(1002, (pOBBidsProvider == null || pOBBidsProvider.getNbrCode() == null) ? "No ads available" : String.format(Locale.getDefault(), "No ads available, reason(NBR): %s", pOBBidsProvider.getNbrCode()));
    }

    public abstract void requestAd(@Nullable POBBid pOBBid);
}
