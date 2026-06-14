package com.fyber.inneractive.sdk.config;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: loaded from: classes7.dex */
public abstract class n {
    public static void a(Context context, w wVar) {
        String string = null;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            z = Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING) != 0;
            if (!z) {
                string = Settings.Secure.getString(contentResolver, "advertising_id");
            }
        } catch (Settings.SettingNotFoundException unused) {
        }
        if (string != null) {
            synchronized (wVar) {
                v vVar = wVar.f20508b;
                vVar.f20504a = string;
                vVar.f20505b = z;
                vVar.f20506c = true;
            }
        }
    }
}
