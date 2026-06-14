package com.inmobi.unification.sdk.model.initialization;

import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import com.inmobi.media.AbstractC3989qk;
import com.inmobi.media.C4013rk;
import com.inmobi.media.Xh;
import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import com.ironsource.C4424m2;
import com.taurusx.tax.f.y;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class TimeoutConfigurations implements Serializable {
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_MUTT_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_MUTT_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_MUTT_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_MUTT_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_RETRY_INTERVAL = 1000;
    private static final int DEFAULT_AB_AUDIO_LOAD_TIMEOUT = 14500;
    private static final int DEFAULT_AB_BANNER_LOAD_TIMEOUT = 14500;
    private static final int DEFAULT_AB_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_AB_NATIVE_LOAD_TIMEOUT = 14500;

    @NotNull
    private static final String DEFAULT_KEY = "default";
    private static final int DEFAULT_MAX_RETRIES = 3;
    private static final int DEFAULT_NONAB_AUDIO_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_AUDIO_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_BANNER_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_BANNER_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_INTERSTITIAL_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_NATIVE_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_NATIVE_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_RETRY_INTERVAL = 1000;
    public static final int DEFAULT_TIMEOUT = 15000;

    @NotNull
    public static final C4013rk Companion = new C4013rk();

    @NotNull
    private static final String APPLOVIN_KEY = "c_applovin";

    @NotNull
    private static final JSONObject defaultNonABBannerloadTimeout = AbstractC3989qk.a(29500, 9500, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABBannerMuttTimeout = AbstractC3989qk.a(29500, 9500, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABBannerMaxRetries = AbstractC3989qk.a(3, 3, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABBannerRetryInterval = AbstractC3989qk.a(1000, 1000, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABIntloadTimeout = AbstractC3989qk.a(29500, 14500, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABIntMuttTimeout = AbstractC3989qk.a(29500, 14500, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABIntMaxRetries = AbstractC3989qk.a(3, 3, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABIntRetryInterval = AbstractC3989qk.a(1000, 1000, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABNativeloadTimeout = AbstractC3989qk.a(29500, 14500, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABNativeMuttTimeout = AbstractC3989qk.a(29500, 14500, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABNativeMaxRetries = AbstractC3989qk.a(3, 3, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABNativeRetryInterval = AbstractC3989qk.a(1000, 1000, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABAudioloadTimeout = AbstractC3989qk.a(29500, 9500, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABAudioMuttTimeout = AbstractC3989qk.a(29500, 9500, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABAudioMaxRetries = AbstractC3989qk.a(3, 3, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultNonABAudioRetryInterval = AbstractC3989qk.a(1000, 1000, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultABBannerloadTimeout = AbstractC3989qk.a(14500, 9500, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultABBannerMaxRetries = AbstractC3989qk.a(3, 3, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultABBannerRetryInterval = AbstractC3989qk.a(1000, 1000, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultABIntloadTimeout = AbstractC3989qk.a(29500, 29500, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultABIntMaxRetries = AbstractC3989qk.a(3, 3, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultABIntRetryInterval = AbstractC3989qk.a(1000, 1000, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultABNativeloadTimeout = AbstractC3989qk.a(14500, 14500, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultABNativeMaxRetries = AbstractC3989qk.a(3, 3, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultABNativeRetryInterval = AbstractC3989qk.a(1000, 1000, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultABAudioloadTimeout = AbstractC3989qk.a(14500, 9500, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultABAudioMaxRetries = AbstractC3989qk.a(3, 3, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultABAudioRetryInterval = AbstractC3989qk.a(1000, 1000, "default", APPLOVIN_KEY);

    @NotNull
    private static final JSONObject defaultPreloadBannerPreloadTimeout = Xh.a("default", 29500);

    @NotNull
    private static final JSONObject defaultPreloadBannerMuttTimeout = Xh.a("default", 29500);

    @NotNull
    private static final JSONObject defaultPreloadBannerLoadTimeout = Xh.a("default", 14500);

    @NotNull
    private static final JSONObject defaultPreloadBannerMaxRetries = Xh.a("default", 3);

    @NotNull
    private static final JSONObject defaultPreloadBannerRetryInterval = Xh.a("default", 1000);

    @NotNull
    private static final JSONObject defaultPreloadIntPreloadTimeout = Xh.a("default", 29500);

    @NotNull
    private static final JSONObject defaultPreloadIntMuttTimeout = Xh.a("default", 29500);

    @NotNull
    private static final JSONObject defaultPreloadIntloadTimeout = Xh.a("default", 29500);

    @NotNull
    private static final JSONObject defaultPreloadIntMaxRetries = Xh.a("default", 3);

    @NotNull
    private static final JSONObject defaultPreloadIntRetryInterval = Xh.a("default", 1000);

    @NotNull
    private static final JSONObject defaultPreloadNativePreloadTimeout = Xh.a("default", 29500);

    @NotNull
    private static final JSONObject defaultPreloadNativeMuttTimeout = Xh.a("default", 29500);

    @NotNull
    private static final JSONObject defaultPreloadNativeloadTimeout = Xh.a("default", 14500);

    @NotNull
    private static final JSONObject defaultPreloadNativeMaxRetries = Xh.a("default", 3);

    @NotNull
    private static final JSONObject defaultPreloadNativeRetryInterval = Xh.a("default", 1000);

    @NotNull
    private static final JSONObject defaultPreloadAudioPreloadTimeout = Xh.a("default", 29500);

    @NotNull
    private static final JSONObject defaultPreloadAudioMuttTimeout = Xh.a("default", 29500);

    @NotNull
    private static final JSONObject defaultPreloadAudioloadTimeout = Xh.a("default", 14500);

    @NotNull
    private static final JSONObject defaultPreloadAudioMaxRetries = Xh.a("default", 3);

    @NotNull
    private static final JSONObject defaultPreloadAudioRetryInterval = Xh.a("default", 1000);

    @NotNull
    private static final Function2<JSONObject, Integer, Boolean> validator = new Function2() { // from class: y3.a
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(TimeoutConfigurations.a((JSONObject) obj, ((Integer) obj2).intValue()));
        }
    };
    private int step4s = 15000;

    @NotNull
    private MediationConfig mediationConfig = new MediationConfig();

    @Keep
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$ABConfig;", "", "<init>", "()V", "banner", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdABConfig;", "int", "native", "audio", "getBanner", "getInterstitial", "getNative", "getAudio", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ABConfig {

        @NotNull
        private AdABConfig audio;

        @NotNull
        private AdABConfig banner;

        @NotNull
        private AdABConfig int;

        @NotNull
        private AdABConfig native;

        public ABConfig() {
            TimeoutConfigurations.Companion.getClass();
            this.banner = new AdABConfig(TimeoutConfigurations.defaultABBannerloadTimeout, TimeoutConfigurations.defaultABBannerRetryInterval, TimeoutConfigurations.defaultABBannerMaxRetries);
            this.int = new AdABConfig(TimeoutConfigurations.defaultABIntloadTimeout, TimeoutConfigurations.defaultABIntRetryInterval, TimeoutConfigurations.defaultABIntMaxRetries);
            this.native = new AdABConfig(TimeoutConfigurations.defaultABNativeloadTimeout, TimeoutConfigurations.defaultABNativeRetryInterval, TimeoutConfigurations.defaultABNativeMaxRetries);
            this.audio = new AdABConfig(TimeoutConfigurations.defaultABAudioloadTimeout, TimeoutConfigurations.defaultABAudioRetryInterval, TimeoutConfigurations.defaultABAudioMaxRetries);
        }

        @NotNull
        public final AdABConfig getAudio() {
            return this.audio;
        }

        @NotNull
        public final AdABConfig getBanner() {
            return this.banner;
        }

        @NotNull
        /* JADX INFO: renamed from: getInterstitial, reason: from getter */
        public final AdABConfig getInt() {
            return this.int;
        }

        @NotNull
        public final AdABConfig getNative() {
            return this.native;
        }

        public final boolean isValid() {
            return this.banner.isValid() && this.int.isValid() && this.native.isValid() && this.audio.isValid();
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$MediationConfig;", "", "<init>", "()V", "ab", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$ABConfig;", "nonAb", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$NonABConfig;", "preload", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$PreloadConfig;", "getABConfig", "getNonABConfig", "getPreloadConfig", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MediationConfig {

        @NotNull
        private ABConfig ab = new ABConfig();

        @NotNull
        private NonABConfig nonAb = new NonABConfig();

        @NotNull
        private PreloadConfig preload = new PreloadConfig();

        @NotNull
        /* JADX INFO: renamed from: getABConfig, reason: from getter */
        public final ABConfig getAb() {
            return this.ab;
        }

        @NotNull
        /* JADX INFO: renamed from: getNonABConfig, reason: from getter */
        public final NonABConfig getNonAb() {
            return this.nonAb;
        }

        @NotNull
        /* JADX INFO: renamed from: getPreloadConfig, reason: from getter */
        public final PreloadConfig getPreload() {
            return this.preload;
        }

        public final boolean isValid() {
            return this.ab.isValid() && this.nonAb.isValid() && this.preload.isValid();
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$NonABConfig;", "", "<init>", "()V", "banner", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdNonABConfig;", "int", "native", "audio", "getBanner", "getInterstitial", "getNative", "getAudio", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NonABConfig {

        @NotNull
        private AdNonABConfig audio;

        @NotNull
        private AdNonABConfig banner;

        @NotNull
        private AdNonABConfig int;

        @NotNull
        private AdNonABConfig native;

        public NonABConfig() {
            TimeoutConfigurations.Companion.getClass();
            this.banner = new AdNonABConfig(TimeoutConfigurations.defaultNonABBannerloadTimeout, TimeoutConfigurations.defaultNonABBannerMuttTimeout, TimeoutConfigurations.defaultNonABBannerRetryInterval, TimeoutConfigurations.defaultNonABBannerMaxRetries);
            this.int = new AdNonABConfig(TimeoutConfigurations.defaultNonABIntloadTimeout, TimeoutConfigurations.defaultNonABIntMuttTimeout, TimeoutConfigurations.defaultNonABIntRetryInterval, TimeoutConfigurations.defaultNonABIntMaxRetries);
            this.native = new AdNonABConfig(TimeoutConfigurations.defaultNonABNativeloadTimeout, TimeoutConfigurations.defaultNonABNativeMuttTimeout, TimeoutConfigurations.defaultNonABNativeRetryInterval, TimeoutConfigurations.defaultNonABNativeMaxRetries);
            this.audio = new AdNonABConfig(TimeoutConfigurations.defaultNonABAudioloadTimeout, TimeoutConfigurations.defaultNonABAudioMuttTimeout, TimeoutConfigurations.defaultNonABAudioRetryInterval, TimeoutConfigurations.defaultNonABAudioMaxRetries);
        }

        @NotNull
        public final AdNonABConfig getAudio() {
            return this.audio;
        }

        @NotNull
        public final AdNonABConfig getBanner() {
            return this.banner;
        }

        @NotNull
        /* JADX INFO: renamed from: getInterstitial, reason: from getter */
        public final AdNonABConfig getInt() {
            return this.int;
        }

        @NotNull
        public final AdNonABConfig getNative() {
            return this.native;
        }

        public final boolean isValid() {
            return this.banner.isValid() && this.int.isValid() && this.native.isValid() && this.audio.isValid();
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$PreloadConfig;", "", "<init>", "()V", "banner", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdPreloadConfig;", "int", "native", "audio", "getBanner", "getInterstitial", "getNative", "getAudio", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PreloadConfig {

        @NotNull
        private AdPreloadConfig audio;

        @NotNull
        private AdPreloadConfig banner;

        @NotNull
        private AdPreloadConfig int;

        @NotNull
        private AdPreloadConfig native;

        public PreloadConfig() {
            TimeoutConfigurations.Companion.getClass();
            this.banner = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadBannerPreloadTimeout, TimeoutConfigurations.defaultPreloadBannerMuttTimeout, TimeoutConfigurations.defaultPreloadBannerLoadTimeout, TimeoutConfigurations.defaultPreloadBannerRetryInterval, TimeoutConfigurations.defaultPreloadBannerMaxRetries);
            this.int = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadIntPreloadTimeout, TimeoutConfigurations.defaultPreloadIntMuttTimeout, TimeoutConfigurations.defaultPreloadIntloadTimeout, TimeoutConfigurations.defaultPreloadIntRetryInterval, TimeoutConfigurations.defaultPreloadIntMaxRetries);
            this.native = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadNativePreloadTimeout, TimeoutConfigurations.defaultPreloadNativeMuttTimeout, TimeoutConfigurations.defaultPreloadNativeloadTimeout, TimeoutConfigurations.defaultPreloadNativeRetryInterval, TimeoutConfigurations.defaultPreloadNativeMaxRetries);
            this.audio = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadAudioPreloadTimeout, TimeoutConfigurations.defaultPreloadAudioMuttTimeout, TimeoutConfigurations.defaultPreloadAudioloadTimeout, TimeoutConfigurations.defaultPreloadAudioRetryInterval, TimeoutConfigurations.defaultPreloadAudioMaxRetries);
        }

        @NotNull
        public final AdPreloadConfig getAudio() {
            return this.audio;
        }

        @NotNull
        public final AdPreloadConfig getBanner() {
            return this.banner;
        }

        @NotNull
        /* JADX INFO: renamed from: getInterstitial, reason: from getter */
        public final AdPreloadConfig getInt() {
            return this.int;
        }

        @NotNull
        public final AdPreloadConfig getNative() {
            return this.native;
        }

        public final boolean isValid() {
            return this.banner.isValid() && this.int.isValid() && this.native.isValid() && this.audio.isValid();
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\"\u0010\u0018\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\"\u0010\u001b\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014¨\u0006 "}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$RenderTimeoutByType;", "", "<init>", "()V", "", "adType", "", "defValue", "getTimeoutByType$media_release", "(Ljava/lang/String;I)I", "getTimeoutByType", "timeout", "", "setTimeoutByType", "(Ljava/lang/String;I)V", "banner", "I", "getBanner$media_release", "()I", "setBanner$media_release", "(I)V", "audio", "getAudio$media_release", "setAudio$media_release", "int", "getInt$media_release", "setInt$media_release", "native", "getNative$media_release", "setNative$media_release", y.f66058y, "com/inmobi/unification/sdk/model/initialization/a", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RenderTimeoutByType {

        @NotNull
        public static final a Companion = new a();
        private int audio;
        private int banner;
        private int int;
        private int native;

        public /* synthetic */ RenderTimeoutByType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getAudio$media_release, reason: from getter */
        public final int getAudio() {
            return this.audio;
        }

        /* JADX INFO: renamed from: getBanner$media_release, reason: from getter */
        public final int getBanner() {
            return this.banner;
        }

        /* JADX INFO: renamed from: getInt$media_release, reason: from getter */
        public final int getInt() {
            return this.int;
        }

        /* JADX INFO: renamed from: getNative$media_release, reason: from getter */
        public final int getNative() {
            return this.native;
        }

        public final int getTimeoutByType$media_release(@NotNull String adType, int defValue) {
            int i10;
            int i11;
            int i12;
            int i13;
            Intrinsics.checkNotNullParameter(adType, "adType");
            int iHashCode = adType.hashCode();
            if (iHashCode != -1396342996) {
                if (iHashCode != -1052618729) {
                    if (iHashCode != 104431) {
                        if (iHashCode == 93166550 && adType.equals("audio") && (i13 = this.audio) > 0) {
                            return i13;
                        }
                    } else if (adType.equals("int") && (i12 = this.int) > 0) {
                        return i12;
                    }
                } else if (adType.equals("native") && (i11 = this.native) > 0) {
                    return i11;
                }
            } else if (adType.equals("banner") && (i10 = this.banner) > 0) {
                return i10;
            }
            return defValue;
        }

        public final void setAudio$media_release(int i10) {
            this.audio = i10;
        }

        public final void setBanner$media_release(int i10) {
            this.banner = i10;
        }

        public final void setInt$media_release(int i10) {
            this.int = i10;
        }

        public final void setNative$media_release(int i10) {
            this.native = i10;
        }

        @VisibleForTesting(otherwise = 5)
        public final void setTimeoutByType(@NotNull String adType, int timeout) {
            Intrinsics.checkNotNullParameter(adType, "adType");
            int iHashCode = adType.hashCode();
            if (iHashCode == -1396342996) {
                if (adType.equals("banner")) {
                    this.banner = timeout;
                }
            } else if (iHashCode == -1052618729) {
                if (adType.equals("native")) {
                    this.native = timeout;
                }
            } else if (iHashCode == 104431) {
                if (adType.equals("int")) {
                    this.int = timeout;
                }
            } else if (iHashCode == 93166550 && adType.equals("audio")) {
                this.audio = timeout;
            }
        }

        private RenderTimeoutByType() {
        }
    }

    public final MediationConfig X() {
        return this.mediationConfig;
    }

    public final int Y() {
        return this.step4s;
    }

    public final boolean Z() {
        return this.step4s >= 0 && this.mediationConfig.isValid();
    }

    public final void a0() {
        int i10 = this.step4s;
        if (i10 <= 0) {
            i10 = 15000;
        }
        this.step4s = i10;
    }

    public static final boolean a(JSONObject param, int i10) {
        Intrinsics.checkNotNullParameter(param, "param");
        Iterator<String> itKeys = param.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        boolean z10 = true;
        while (itKeys.hasNext()) {
            if (param.getInt(itKeys.next()) < i10) {
                z10 = false;
            }
        }
        return z10;
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\bJ\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdABConfig;", "", "<init>", "()V", C4424m2.f43621t, "Lorg/json/JSONObject;", "retryInterval", "maxRetries", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "loadRetryInterval", "maxLoadRetries", "getLoadTimeout", "getRetryInterval", "getMaxRetries", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdABConfig {

        @NotNull
        private JSONObject loadRetryInterval;

        @NotNull
        private JSONObject loadTimeout;

        @NotNull
        private JSONObject maxLoadRetries;

        public AdABConfig() {
            this.loadTimeout = new JSONObject();
            this.loadRetryInterval = new JSONObject();
            this.maxLoadRetries = new JSONObject();
        }

        @NotNull
        public final JSONObject getLoadTimeout() {
            return this.loadTimeout;
        }

        @NotNull
        /* JADX INFO: renamed from: getMaxRetries, reason: from getter */
        public final JSONObject getMaxLoadRetries() {
            return this.maxLoadRetries;
        }

        @NotNull
        /* JADX INFO: renamed from: getRetryInterval, reason: from getter */
        public final JSONObject getLoadRetryInterval() {
            return this.loadRetryInterval;
        }

        public final boolean isValid() {
            TimeoutConfigurations.Companion.getClass();
            return ((Boolean) TimeoutConfigurations.validator.invoke(this.loadTimeout, 0)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.loadRetryInterval, 1)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.maxLoadRetries, 1)).booleanValue();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AdABConfig(@NotNull JSONObject loadTimeout, @NotNull JSONObject retryInterval, @NotNull JSONObject maxRetries) {
            this();
            Intrinsics.checkNotNullParameter(loadTimeout, "loadTimeout");
            Intrinsics.checkNotNullParameter(retryInterval, "retryInterval");
            Intrinsics.checkNotNullParameter(maxRetries, "maxRetries");
            this.loadTimeout = loadTimeout;
            this.loadRetryInterval = retryInterval;
            this.maxLoadRetries = maxRetries;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\tJ\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdNonABConfig;", "", "<init>", "()V", C4424m2.f43621t, "Lorg/json/JSONObject;", "muttTimeout", "retryInterval", "maxRetries", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "loadRetryInterval", "maxLoadRetries", "getLoadTimeout", "getMuttTimeout", "getRetryInterval", "getMaxRetries", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdNonABConfig {

        @NotNull
        private JSONObject loadRetryInterval;

        @NotNull
        private JSONObject loadTimeout;

        @NotNull
        private JSONObject maxLoadRetries;

        @NotNull
        private JSONObject muttTimeout;

        public AdNonABConfig() {
            this.loadTimeout = new JSONObject();
            this.muttTimeout = new JSONObject();
            this.loadRetryInterval = new JSONObject();
            this.maxLoadRetries = new JSONObject();
        }

        @NotNull
        public final JSONObject getLoadTimeout() {
            return this.loadTimeout;
        }

        @NotNull
        /* JADX INFO: renamed from: getMaxRetries, reason: from getter */
        public final JSONObject getMaxLoadRetries() {
            return this.maxLoadRetries;
        }

        @NotNull
        public final JSONObject getMuttTimeout() {
            return this.muttTimeout;
        }

        @NotNull
        /* JADX INFO: renamed from: getRetryInterval, reason: from getter */
        public final JSONObject getLoadRetryInterval() {
            return this.loadRetryInterval;
        }

        public final boolean isValid() {
            TimeoutConfigurations.Companion.getClass();
            return ((Boolean) TimeoutConfigurations.validator.invoke(this.muttTimeout, 0)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.loadTimeout, 0)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.loadRetryInterval, 1)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.maxLoadRetries, 1)).booleanValue();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AdNonABConfig(@NotNull JSONObject loadTimeout, @NotNull JSONObject muttTimeout, @NotNull JSONObject retryInterval, @NotNull JSONObject maxRetries) {
            this();
            Intrinsics.checkNotNullParameter(loadTimeout, "loadTimeout");
            Intrinsics.checkNotNullParameter(muttTimeout, "muttTimeout");
            Intrinsics.checkNotNullParameter(retryInterval, "retryInterval");
            Intrinsics.checkNotNullParameter(maxRetries, "maxRetries");
            this.loadTimeout = loadTimeout;
            this.muttTimeout = muttTimeout;
            this.loadRetryInterval = retryInterval;
            this.maxLoadRetries = maxRetries;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B1\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\nJ\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u0011\u001a\u00020\u0005J\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdPreloadConfig;", "", "<init>", "()V", "preloadTimeout", "Lorg/json/JSONObject;", "muttTimeout", C4424m2.f43621t, "retryInterval", "maxRetries", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "loadRetryInterval", "maxLoadRetries", "getPreloadTimeout", "getMuttTimeout", "getLoadTimeout", "getRetryInterval", "getMaxRetries", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdPreloadConfig {

        @NotNull
        private JSONObject loadRetryInterval;

        @NotNull
        private JSONObject loadTimeout;

        @NotNull
        private JSONObject maxLoadRetries;

        @NotNull
        private JSONObject muttTimeout;

        @NotNull
        private JSONObject preloadTimeout;

        public AdPreloadConfig() {
            this.preloadTimeout = new JSONObject();
            this.muttTimeout = new JSONObject();
            this.loadTimeout = new JSONObject();
            this.loadRetryInterval = new JSONObject();
            this.maxLoadRetries = new JSONObject();
        }

        @NotNull
        public final JSONObject getLoadTimeout() {
            return this.loadTimeout;
        }

        @NotNull
        /* JADX INFO: renamed from: getMaxRetries, reason: from getter */
        public final JSONObject getMaxLoadRetries() {
            return this.maxLoadRetries;
        }

        @NotNull
        public final JSONObject getMuttTimeout() {
            return this.muttTimeout;
        }

        @NotNull
        public final JSONObject getPreloadTimeout() {
            return this.preloadTimeout;
        }

        @NotNull
        /* JADX INFO: renamed from: getRetryInterval, reason: from getter */
        public final JSONObject getLoadRetryInterval() {
            return this.loadRetryInterval;
        }

        public final boolean isValid() {
            TimeoutConfigurations.Companion.getClass();
            return ((Boolean) TimeoutConfigurations.validator.invoke(this.loadTimeout, 0)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.loadRetryInterval, 1)).booleanValue() && ((Boolean) TimeoutConfigurations.validator.invoke(this.maxLoadRetries, 1)).booleanValue();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AdPreloadConfig(@NotNull JSONObject preloadTimeout, @NotNull JSONObject muttTimeout, @NotNull JSONObject loadTimeout, @NotNull JSONObject retryInterval, @NotNull JSONObject maxRetries) {
            this();
            Intrinsics.checkNotNullParameter(preloadTimeout, "preloadTimeout");
            Intrinsics.checkNotNullParameter(muttTimeout, "muttTimeout");
            Intrinsics.checkNotNullParameter(loadTimeout, "loadTimeout");
            Intrinsics.checkNotNullParameter(retryInterval, "retryInterval");
            Intrinsics.checkNotNullParameter(maxRetries, "maxRetries");
            this.preloadTimeout = preloadTimeout;
            this.muttTimeout = muttTimeout;
            this.loadTimeout = loadTimeout;
            this.loadRetryInterval = retryInterval;
            this.maxLoadRetries = maxRetries;
        }
    }
}
