package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.vd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4589vd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C4589vd f45668b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, NetworkSettings> f45669a = new ConcurrentHashMap<>();

    private C4589vd() {
    }

    public static synchronized C4589vd c() {
        try {
            if (f45668b == null) {
                f45668b = new C4589vd();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f45668b;
    }

    public void a(NetworkSettings networkSettings) {
        if (networkSettings == null || TextUtils.isEmpty(networkSettings.getProviderName())) {
            return;
        }
        this.f45669a.put(networkSettings.getProviderName(), networkSettings);
    }

    public NetworkSettings b(String str) {
        NetworkSettings networkSettings = this.f45669a.get(str);
        if (networkSettings != null) {
            return networkSettings;
        }
        NetworkSettings networkSettings2 = new NetworkSettings(str);
        a(networkSettings2);
        return networkSettings2;
    }

    public ConcurrentHashMap<String, NetworkSettings> d() {
        return this.f45669a;
    }

    public void a() {
        this.f45669a.clear();
    }

    @Nullable
    public NetworkSettings c(String str) {
        for (NetworkSettings networkSettings : this.f45669a.values()) {
            if ("IronSource".equals(networkSettings.getProviderTypeForReflection()) && str.equalsIgnoreCase(networkSettings.getSubProviderId())) {
                return networkSettings;
            }
        }
        return new NetworkSettings(str);
    }

    public HashSet<String> a(String str, String str2) {
        HashSet<String> hashSet = new HashSet<>();
        try {
            for (NetworkSettings networkSettings : this.f45669a.values()) {
                if (networkSettings.getProviderTypeForReflection().equals(str)) {
                    if (networkSettings.getRewardedVideoSettings() != null && networkSettings.getRewardedVideoSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getRewardedVideoSettings().optString(str2))) {
                        hashSet.add(networkSettings.getRewardedVideoSettings().optString(str2));
                    }
                    if (networkSettings.getInterstitialSettings() != null && networkSettings.getInterstitialSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getInterstitialSettings().optString(str2))) {
                        hashSet.add(networkSettings.getInterstitialSettings().optString(str2));
                    }
                    if (networkSettings.getBannerSettings() != null && networkSettings.getBannerSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getBannerSettings().optString(str2))) {
                        hashSet.add(networkSettings.getBannerSettings().optString(str2));
                    }
                    if (networkSettings.getNativeAdSettings() != null && networkSettings.getNativeAdSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getNativeAdSettings().optString(str2))) {
                        hashSet.add(networkSettings.getNativeAdSettings().optString(str2));
                    }
                }
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
        }
        return hashSet;
    }

    public void b() {
        for (NetworkSettings networkSettings : this.f45669a.values()) {
            if (networkSettings.isMultipleInstances() && !TextUtils.isEmpty(networkSettings.getProviderTypeForReflection())) {
                NetworkSettings networkSettingsB = b(networkSettings.getProviderDefaultInstance());
                networkSettings.setApplicationSettings(IronSourceUtils.b(networkSettings.getApplicationSettings(), networkSettingsB.getApplicationSettings()));
                networkSettings.setInterstitialSettings(IronSourceUtils.b(networkSettings.getInterstitialSettings(), networkSettingsB.getInterstitialSettings()));
                networkSettings.setRewardedVideoSettings(IronSourceUtils.b(networkSettings.getRewardedVideoSettings(), networkSettingsB.getRewardedVideoSettings()));
                networkSettings.setBannerSettings(IronSourceUtils.b(networkSettings.getBannerSettings(), networkSettingsB.getBannerSettings()));
                networkSettings.setNativeAdSettings(IronSourceUtils.b(networkSettings.getNativeAdSettings(), networkSettingsB.getNativeAdSettings()));
            }
        }
    }

    public boolean a(String str) {
        return this.f45669a.containsKey(str);
    }
}
