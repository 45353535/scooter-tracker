package com.pubmatic.sdk.video.player;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.video.vastmodels.POBVastCreative;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public interface POBProgressiveEventListener {
    void onProgressReached(@NonNull Map<POBVastCreative.POBEventTypes, List<String>> map);
}
