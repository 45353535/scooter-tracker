package net.pubnative.lite.sdk.vpaid.helpers;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.network.PNHttpClient;
import net.pubnative.lite.sdk.network.e;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.vpaid.enums.VastError;

/* JADX INFO: loaded from: classes3.dex */
public class ErrorLog {
    private static final String ERROR_CODE = "[ERRORCODE]";
    private static final String LOG_TAG = "ErrorLog";
    private static List<String> sErrorLogUrls;

    private ErrorLog() {
    }

    public static void initErrorLog(String str) {
        List<String> list = sErrorLogUrls;
        if (list == null) {
            sErrorLogUrls = new ArrayList();
        } else {
            list.clear();
        }
        sErrorLogUrls.add(str);
    }

    public static synchronized void postError(Context context, VastError vastError) {
        try {
            List<String> list = sErrorLogUrls;
            if (list != null && !list.isEmpty()) {
                for (String strReplace : sErrorLogUrls) {
                    if (!TextUtils.isEmpty(strReplace)) {
                        if (strReplace.contains("[ERRORCODE]")) {
                            strReplace = strReplace.replace("[ERRORCODE]", vastError.getValue());
                        }
                        Logger.d(LOG_TAG, strReplace);
                        PNHttpClient.makeRequest(context, strReplace, null, null, new PNHttpClient.Listener() { // from class: net.pubnative.lite.sdk.vpaid.helpers.ErrorLog.1
                            @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                            public void onFailure(Throwable th2) {
                            }

                            @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                            public /* synthetic */ void onFinally(String str, int i10) {
                                e.a(this, str, i10);
                            }

                            @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                            public void onSuccess(String str, Map<String, List<String>> map) {
                            }
                        });
                    }
                }
            }
        } finally {
        }
    }

    public static void initErrorLog(List<String> list) {
        List<String> list2 = sErrorLogUrls;
        if (list2 == null) {
            sErrorLogUrls = new ArrayList();
        } else {
            list2.clear();
        }
        sErrorLogUrls.addAll(list);
    }
}
