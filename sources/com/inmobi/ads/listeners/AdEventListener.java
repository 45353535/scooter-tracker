package com.inmobi.ads.listeners;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public abstract class AdEventListener<T> {
    public void onAdClicked(@NonNull T t10, Map<Object, Object> map) {
    }

    public void onAdFetchSuccessful(@NonNull T t10, @NonNull AdMetaInfo adMetaInfo) {
    }

    public void onAdImpression(@NonNull T t10) {
    }

    public void onAdLoadFailed(@NonNull T t10, @NonNull InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    public void onAdLoadSucceeded(@NonNull T t10, @NonNull AdMetaInfo adMetaInfo) {
    }

    public void onRequestPayloadCreated(byte[] bArr) {
    }

    public void onRequestPayloadCreationFailed(@NonNull InMobiAdRequestStatus inMobiAdRequestStatus) {
    }
}
