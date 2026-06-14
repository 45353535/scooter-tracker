package com.appodeal.ads.unified;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public interface UnifiedAdCallbackClickTrackListener {
    void onTrackError();

    void onTrackSuccess(@Nullable JSONObject jSONObject);
}
