package com.pubmatic.sdk.common.network;

import android.annotation.SuppressLint;
import android.net.Uri;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.network.POBHttpRequest;
import com.pubmatic.sdk.common.network.POBNetworkHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.view.POBWebView;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class POBTrackerHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final POBNetworkHandler f62493a;

    class a implements POBNetworkHandler.POBNetworkListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f62494a;

        a(String str) {
            this.f62494a = str;
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkListener
        public void onFailure(POBError pOBError) {
            POBLog.error("POBTrackerHandler", "Failed to execute tracker url : " + this.f62494a, "\n Error : " + pOBError.getErrorMessage());
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkListener
        public void onSuccess(String str) {
            POBLog.debug("POBTrackerHandler", "Successfully executed tracker url : " + this.f62494a, new Object[0]);
        }
    }

    public POBTrackerHandler(@NonNull POBNetworkHandler pOBNetworkHandler) {
        this.f62493a = pOBNetworkHandler;
    }

    @NonNull
    public static List<String> sanitizeURLScheme(@Nullable List<String> list, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            POBLog.debug("POBTrackerHandler", "Unable to sanitize urls as list is null", new Object[0]);
            return arrayList;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String strSanitizeURLScheme = sanitizeURLScheme(it.next(), z10);
            if (strSanitizeURLScheme != null) {
                arrayList.add(strSanitizeURLScheme);
            }
        }
        return arrayList;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    @MainThread
    public void executeJsScripts(@NonNull POBWebView pOBWebView, @NonNull String str) {
        POBLog.debug("POBTrackerHandler", "Executing js tracker script: " + str, new Object[0]);
        pOBWebView.getSettings().setJavaScriptEnabled(true);
        pOBWebView.loadDataWithBaseURL(null, str, "text/html", StandardCharsets.UTF_8.name(), null);
    }

    public void handleTrackersForError(@Nullable List<String> list, @Nullable Map<Object, Object> map, @Nullable Map<String, String> map2) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (String strBuildUriWithQueryParams : list) {
            Uri uri = Uri.parse(strBuildUriWithQueryParams);
            String host = uri.getHost();
            if (map2 != null && !map2.isEmpty() && host != null && host.contains("pubmatic.com")) {
                strBuildUriWithQueryParams = POBUtils.buildUriWithQueryParams(uri, map2);
            }
            sendTracker(strBuildUriWithQueryParams, map);
        }
    }

    public void sendTracker(@Nullable String str) {
        if (POBUtils.isNullOrEmpty(str)) {
            POBLog.error("POBTrackerHandler", "Failed to execute tracker url: " + str, new Object[0]);
            return;
        }
        POBLog.debug("POBTrackerHandler", "Executing tracker for url: %s", str);
        POBHttpRequest pOBHttpRequest = new POBHttpRequest();
        pOBHttpRequest.setUrl(str);
        pOBHttpRequest.setRetryCount(3);
        pOBHttpRequest.setRequestMethod(POBHttpRequest.HTTP_METHOD.GET);
        pOBHttpRequest.setTimeout(10000);
        this.f62493a.sendRequest(pOBHttpRequest, new a(str));
    }

    public void sendTrackers(@Nullable List<String> list) {
        if (list != null && !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sendTracker(it.next());
            }
        } else {
            POBLog.error("POBTrackerHandler", "Failed to execute tracker url: " + list, new Object[0]);
        }
    }

    public void sendTrackers(@Nullable List<String> list, @Nullable Map<Object, Object> map) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sendTracker(it.next(), map);
        }
    }

    @Nullable
    public static String sanitizeURLScheme(@Nullable String str, boolean z10) {
        String str2;
        try {
            if (!POBUtils.isNullOrEmpty(str)) {
                Uri uri = Uri.parse(str);
                if (uri == null || uri.getScheme() != null) {
                    return str;
                }
                Uri.Builder builderBuildUpon = uri.buildUpon();
                if (z10) {
                    str2 = "https";
                } else {
                    str2 = "http";
                }
                return builderBuildUpon.scheme(str2).build().toString();
            }
            POBLog.debug("POBTrackerHandler", "Unable to sanitize url - %s", str);
            return null;
        } catch (Exception e10) {
            POBLog.debug("POBTrackerHandler", "Error occurred while sanitizing url %s. Reason - %s", str, e10.getMessage());
            return null;
        }
    }

    public void sendTracker(@Nullable String str, @Nullable Map<Object, Object> map) {
        if (!POBUtils.isNullOrEmpty(str)) {
            if (map != null && map.size() > 0) {
                for (Map.Entry<Object, Object> entry : map.entrySet()) {
                    str = str.replace(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
                }
            }
            sendTracker(str);
            return;
        }
        POBLog.error("POBTrackerHandler", "Empty tracker url.", new Object[0]);
    }

    public void sendTracker(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        if (!POBUtils.isNullOrEmpty(str)) {
            if (str2 != null && str3 != null) {
                str = str.replace(str2, str3);
            }
            sendTracker(str);
            return;
        }
        POBLog.error("POBTrackerHandler", "Unable to send tracker for url - %s.", str);
    }
}
