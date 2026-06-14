package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbig extends CustomTabsCallback {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private final List zzb = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlq)).split(StringUtils.COMMA));
    private final zzbij zzc;

    @Nullable
    private final CustomTabsCallback zzd;
    private final zzdye zze;

    zzbig(@NonNull zzbij zzbijVar, @Nullable CustomTabsCallback customTabsCallback, zzdye zzdyeVar) {
        this.zzd = customTabsCallback;
        this.zzc = zzbijVar;
        this.zze = zzdyeVar;
    }

    private final void zzb(String str) {
        com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zze(this.zze, null, "pact_action", new Pair("pe", str));
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void extraCallback(String str, @Nullable Bundle bundle) {
        CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            customTabsCallback.extraCallback(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    @Nullable
    public final Bundle extraCallbackWithResult(String str, @Nullable Bundle bundle) {
        CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            return customTabsCallback.extraCallbackWithResult(str, bundle);
        }
        return null;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onActivityResized(int i10, int i11, Bundle bundle) {
        CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            customTabsCallback.onActivityResized(i10, i11, bundle);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onMessageChannelReady(@Nullable Bundle bundle) {
        this.zza.set(false);
        CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            customTabsCallback.onMessageChannelReady(bundle);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i10, @Nullable Bundle bundle) {
        this.zza.set(false);
        CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            customTabsCallback.onNavigationEvent(i10, bundle);
        }
        zzbij zzbijVar = this.zzc;
        zzbijVar.zzg(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        List list = this.zzb;
        if (list == null || !list.contains(String.valueOf(i10))) {
            return;
        }
        zzbijVar.zzc();
        zzb("pact_reqpmc");
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onPostMessage(String str, @Nullable Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.zza.set(true);
                zzb("pact_con");
                this.zzc.zzd(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Message is not in JSON format: ", e10);
        }
        CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            customTabsCallback.onPostMessage(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onRelationshipValidationResult(int i10, Uri uri, boolean z10, @Nullable Bundle bundle) {
        CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            customTabsCallback.onRelationshipValidationResult(i10, uri, z10, bundle);
        }
    }

    public final Boolean zza() {
        return Boolean.valueOf(this.zza.get());
    }
}
