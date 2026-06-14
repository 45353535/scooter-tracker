package com.appodeal.ads.services.appsflyer.util;

import android.content.SharedPreferences;
import com.appodeal.ads.ext.LogExtKt;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f14638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f14639b;

    public h(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.f14638a = sharedPreferences;
        this.f14639b = new LinkedHashMap();
    }

    public static final void c(String str, Function1 function1, h hVar, SharedPreferences sharedPreferences, String str2) {
        String string;
        if (!Intrinsics.areEqual(str2, str) || (string = sharedPreferences.getString(str, null)) == null) {
            return;
        }
        LogExtKt.logInternal$default("AppsflyerService", str + " received from callback: " + string, null, 4, null);
        function1.invoke(string);
        hVar.a(str);
    }

    public final void a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) this.f14639b.remove(key);
        if (onSharedPreferenceChangeListener != null) {
            this.f14638a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
    }

    public final void b(final String key, final Function1 callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(callback, "callback");
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.appodeal.ads.services.appsflyer.util.g
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                h.c(key, callback, this, sharedPreferences, str);
            }
        };
        this.f14638a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        this.f14639b.put(key, onSharedPreferenceChangeListener);
    }
}
