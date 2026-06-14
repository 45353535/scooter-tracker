package com.amazon.aps.ads.util.adview;

import android.webkit.ValueCallback;
import com.amazon.device.ads.DTBAdMRAIDController;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J$\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\tH&¨\u0006\n"}, d2 = {"Lcom/amazon/aps/ads/util/adview/ApsWebBridgeListener;", "", "getApsMraidHandler", "Lcom/amazon/device/ads/DTBAdMRAIDController;", "evaluateApsJavascript", "", "script", "", "resultCallback", "Landroid/webkit/ValueCallback;", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ApsWebBridgeListener {
    void evaluateApsJavascript(@Nullable String script, @Nullable ValueCallback<String> resultCallback);

    @Nullable
    DTBAdMRAIDController getApsMraidHandler();
}
