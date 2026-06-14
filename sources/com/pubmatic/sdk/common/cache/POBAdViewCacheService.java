package com.pubmatic.sdk.common.cache;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.ui.POBFullScreenActivityBackPressListener;
import com.pubmatic.sdk.common.ui.POBFullScreenActivityListener;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class POBAdViewCacheService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f62268a = DesugarCollections.synchronizedMap(new HashMap());

    public static class AdViewConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private View f62269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private POBFullScreenActivityListener f62270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private POBFullScreenActivityBackPressListener f62271c;

        public AdViewConfig(@NonNull View view, @NonNull POBFullScreenActivityListener pOBFullScreenActivityListener) {
            this.f62269a = view;
            this.f62270b = pOBFullScreenActivityListener;
        }

        @NonNull
        public View getAdView() {
            return this.f62269a;
        }

        @Nullable
        public POBFullScreenActivityBackPressListener getBackPressListener() {
            return this.f62271c;
        }

        @NonNull
        public POBFullScreenActivityListener getEventListener() {
            return this.f62270b;
        }

        public void setBackPressListener(@Nullable POBFullScreenActivityBackPressListener pOBFullScreenActivityBackPressListener) {
            this.f62271c = pOBFullScreenActivityBackPressListener;
        }
    }

    @Nullable
    public AdViewConfig getStoredAdView(@NonNull Integer num) {
        return (AdViewConfig) this.f62268a.get(num);
    }

    @Nullable
    public AdViewConfig popStoredAdView(@NonNull Integer num) {
        return (AdViewConfig) this.f62268a.remove(num);
    }

    public void storeAdView(@NonNull Integer num, @NonNull AdViewConfig adViewConfig) {
        this.f62268a.put(num, adViewConfig);
    }
}
