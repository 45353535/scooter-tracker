package com.mobilefuse.sdk.utils;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager;
import com.mobilefuse.sdk.logging.HttpRequestTracker;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class WebViewUtils {
    private static Map<String, String> interceptionMap;

    static {
        HashMap map = new HashMap();
        interceptionMap = map;
        map.put("mraid.js", "mobilefuse/mraid.js");
        interceptionMap.put("vast.js", "mobilefuse/vast.js");
        interceptionMap.put("mraid_close_controls.js", "mobilefuse/mraid_close_controls.js");
    }

    public static WebResourceResponse shouldInterceptRequest(Context context, Uri uri) throws Throwable {
        String str;
        if (uri != null && uri.getPath() != null) {
            HttpRequestTracker.logHttpRequest(uri.getPath());
            try {
                Iterator<String> it = interceptionMap.keySet().iterator();
                byte[] specificAssetBytes = new byte[0];
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    String next = it.next();
                    if (uri.getPath().contains(next)) {
                        specificAssetBytes = MobileFuseAssetManager.INSTANCE.getSpecificAssetBytes(next, context);
                        str = interceptionMap.get(next);
                        break;
                    }
                }
                if (str != null && specificAssetBytes != null && specificAssetBytes.length > 0) {
                    return new WebResourceResponse("", "", new ByteArrayInputStream(specificAssetBytes));
                }
            } catch (Throwable th2) {
                StabilityHelper.logException((Class<?>) WebViewUtils.class, th2);
            }
        }
        return null;
    }
}
