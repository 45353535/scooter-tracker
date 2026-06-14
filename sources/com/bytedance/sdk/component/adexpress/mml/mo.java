package com.bytedance.sdk.component.adexpress.mml;

import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.Constants;

/* JADX INFO: loaded from: classes6.dex */
public class mo {
    public static boolean qdl(String str) {
        return TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, Constants.REWARDED_VIDEO);
    }

    public static boolean ud(String str) {
        return com.bytedance.sdk.component.adexpress.mml.ud() && qdl(str);
    }
}
