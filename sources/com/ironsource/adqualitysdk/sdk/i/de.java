package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class de extends cz {
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m6161(List<Object> list) {
        return ke.m7183((View) cz.m6139(list, 0, View.class));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static WebView m6162(List<Object> list) {
        int iIntValue;
        Activity activity = (Activity) cz.m6139(list, 0, Activity.class);
        List arrayList = new ArrayList();
        String str = null;
        if (list.size() > 1) {
            iIntValue = ((Integer) cz.m6139(list, 1, Integer.class)).intValue();
            if (list.size() > 2) {
                str = (String) cz.m6139(list, 2, String.class);
                if (list.size() > 3) {
                    arrayList = (List) cz.m6139(list, 3, List.class);
                }
            }
        } else {
            iIntValue = -1;
        }
        return (WebView) ke.m7174(activity, WebView.class, iIntValue, arrayList, str);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static <E extends View> E m6163(List<Object> list) {
        return (E) ke.m7179((View) cz.m6139(list, 0, View.class), (Class) cz.m6139(list, 1, Class.class), ((Boolean) cz.m6139(list, 2, Boolean.class)).booleanValue());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static View m6164(List<Object> list) {
        return ke.m7180((Activity) cz.m6139(list, 0, Activity.class));
    }
}
