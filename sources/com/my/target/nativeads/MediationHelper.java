package com.my.target.nativeads;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.nativeads.views.MediaAdView;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class MediationHelper {
    public static void registerView(@NonNull NativeAd nativeAd, @NonNull View view, @Nullable List<View> list, @Nullable MediaAdView mediaAdView) {
        nativeAd.a(view, list, mediaAdView);
    }
}
