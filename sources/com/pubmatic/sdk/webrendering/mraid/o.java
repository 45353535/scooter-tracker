package com.pubmatic.sdk.webrendering.mraid;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener;

/* JADX INFO: loaded from: classes11.dex */
interface o extends POBObstructionUpdateListener {
    @Override // com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener
    /* synthetic */ void addFriendlyObstructions(@NonNull View view, @NonNull POBObstructionUpdateListener.POBFriendlyObstructionPurpose pOBFriendlyObstructionPurpose);

    boolean isUserInteracted(boolean z10);

    void onAdInteractionStarted();

    void onAdInteractionStopped();

    void onAdUnload();

    void onAdViewChanged(View view);

    void onLeavingApplication();

    void onMRAIDAdClick();

    void onOpen(String str);

    @Override // com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener
    /* synthetic */ void removeFriendlyObstructions(@Nullable View view);

    void shouldUseCustomClose(boolean z10);
}
