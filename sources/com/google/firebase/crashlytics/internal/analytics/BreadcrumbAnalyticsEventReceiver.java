package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class BreadcrumbAnalyticsEventReceiver implements AnalyticsEventReceiver, BreadcrumbSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BreadcrumbHandler f31966a;

    private static String a(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver
    public void onEvent(@NonNull String str, @NonNull Bundle bundle) {
        BreadcrumbHandler breadcrumbHandler = this.f31966a;
        if (breadcrumbHandler != null) {
            try {
                breadcrumbHandler.handleBreadcrumb("$A$:" + a(str, bundle));
            } catch (JSONException unused) {
                Logger.getLogger().w("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public void registerBreadcrumbHandler(@Nullable BreadcrumbHandler breadcrumbHandler) {
        this.f31966a = breadcrumbHandler;
        Logger.getLogger().d("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
