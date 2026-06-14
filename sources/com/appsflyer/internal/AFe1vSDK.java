package com.appsflyer.internal;

import androidx.annotation.NonNull;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public interface AFe1vSDK<ResponseType> {
    @NonNull
    ResponseType getMonetizationNetwork(String str) throws JSONException;
}
