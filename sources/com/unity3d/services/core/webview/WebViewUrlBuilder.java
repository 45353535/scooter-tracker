package com.unity3d.services.core.webview;

import com.ironsource.C4240b4;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes11.dex */
public class WebViewUrlBuilder {
    private final SDKMetricsSender _sdkMetricsSender = (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);
    private final String _urlWithQueryString;

    public WebViewUrlBuilder(String str, Configuration configuration) {
        this._urlWithQueryString = str + ((("?platform=android" + buildQueryParam("origin", configuration.getWebViewUrl())) + buildQueryParam("version", configuration.getWebViewVersion())) + buildQueryParam("isNativeCollectingMetrics", String.valueOf(configuration.areMetricsEnabledForCurrentSession())));
    }

    private String buildQueryParam(String str, String str2) {
        if (str2 != null) {
            try {
                return "" + C4240b4.j.f42670c + str + C4240b4.j.f42668b + URLEncoder.encode(str2, "UTF-8");
            } catch (UnsupportedEncodingException e10) {
                DeviceLog.exception(String.format("Unsupported charset when encoding %s", str), e10);
            }
        }
        return "";
    }

    public String getUrlWithQueryString() {
        return this._urlWithQueryString;
    }
}
