package com.amazon.device.ads;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public interface DTBAdCallback {
    void onFailure(@NonNull AdError adError);

    void onSuccess(@NonNull DTBAdResponse dTBAdResponse);
}
