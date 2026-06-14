package com.pubmatic.sdk.common.viewability;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.viewability.POBMeasurementProvider;
import com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener;

/* JADX INFO: loaded from: classes11.dex */
public interface POBHTMLMeasurementProvider extends POBMeasurementProvider {

    public enum POBHTMLAdEventType {
        LOADED,
        IMPRESSION,
        CLICK,
        ACCEPT_INVITATION
    }

    @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider, com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener
    /* synthetic */ void addFriendlyObstructions(@NonNull View view, @NonNull POBObstructionUpdateListener.POBFriendlyObstructionPurpose pOBFriendlyObstructionPurpose);

    @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider
    /* synthetic */ void finishAdSession();

    @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider
    @NonNull
    /* synthetic */ String omSDKVersion();

    @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider
    /* synthetic */ void omidJsServiceScript(@NonNull Context context, @NonNull POBMeasurementProvider.POBScriptListener pOBScriptListener);

    @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider, com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener
    /* synthetic */ void removeFriendlyObstructions(@Nullable View view);

    @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider
    /* synthetic */ void setTrackView(@NonNull View view);

    void signalAdEvent(@NonNull POBHTMLAdEventType pOBHTMLAdEventType);

    void startAdSession(@NonNull WebView webView);
}
