package io.bidmachine;

import androidx.annotation.NonNull;
import io.bidmachine.IAd;

/* JADX INFO: loaded from: classes12.dex */
public interface AdFullScreenListener<AdType extends IAd> {
    void onAdClosed(@NonNull AdType adtype, boolean z10);
}
