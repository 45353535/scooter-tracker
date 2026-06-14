package com.my.target;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class ia {
    public ha a(String str) {
        try {
            String string = new JSONObject(str).getString("id");
            if (!TextUtils.isEmpty(string)) {
                return new ha(string);
            }
            gb.a("ShoppablePostMessageParamsParser: can't parse shoppablePostMessageParams – shoppableAdsDataId is empty");
            return null;
        } catch (Throwable th2) {
            gb.a("ShoppablePostMessageParamsParser: can't parse shoppablePostMessageParams – " + th2.getMessage());
            return null;
        }
    }
}
