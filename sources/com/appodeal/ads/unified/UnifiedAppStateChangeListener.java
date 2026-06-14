package com.appodeal.ads.unified;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appodeal.ads.utils.app.AppState;

/* JADX INFO: loaded from: classes6.dex */
public interface UnifiedAppStateChangeListener {
    void onAppStateChanged(@Nullable Activity activity, @NonNull AppState appState, boolean z10);
}
