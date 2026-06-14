package com.appodeal.ads;

import kotlin.Metadata;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J,\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\bH&J4\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J,\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH&J,\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\u0012"}, d2 = {"Lcom/appodeal/ads/AppodealRequestCallbacks;", "", "onWaterfallStart", "", "adType", "", "onWaterfallFinish", "loadedEcpm", "", Reporting.EventType.FILL, "", "onRequestStart", "networkName", "adUnitName", "predictedEcpm", "onRequestFinish", "onImpression", "onClick", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AppodealRequestCallbacks {
    void onClick(String adType, String networkName, String adUnitName, double loadedEcpm);

    void onImpression(String adType, String networkName, String adUnitName, double loadedEcpm);

    void onRequestFinish(String adType, String networkName, String adUnitName, double loadedEcpm, boolean fill);

    void onRequestStart(String adType, String networkName, String adUnitName, double predictedEcpm);

    void onWaterfallFinish(String adType, double loadedEcpm, boolean fill);

    void onWaterfallStart(String adType);
}
