package com.pubmatic.sdk.common.viewability;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface POBObstructionUpdateListener {

    public enum POBFriendlyObstructionPurpose {
        VIDEO_CONTROLS,
        CLOSE_AD,
        NOT_VISIBLE,
        OTHER
    }

    void addFriendlyObstructions(@NonNull View view, @NonNull POBFriendlyObstructionPurpose pOBFriendlyObstructionPurpose);

    void removeFriendlyObstructions(@Nullable View view);
}
