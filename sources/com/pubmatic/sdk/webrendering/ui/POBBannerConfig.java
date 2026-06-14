package com.pubmatic.sdk.webrendering.ui;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.device.ads.DTBAdLoader;
import com.pubmatic.sdk.common.log.POBLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class POBBannerConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f63414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f63415b;

    public static class ConfigBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f63416a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f63417b = 5;

        @NonNull
        public static POBBannerConfig createBannerConfig(@Nullable JSONObject jSONObject, @NonNull String str) {
            ConfigBuilder configBuilder = new ConfigBuilder();
            if (jSONObject != null) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ext");
                if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() <= 0) {
                    POBLog.warn("ConfigBuilder", "Null/empty extension response parameter.", new Object[0]);
                } else {
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("banner");
                    if (jSONObjectOptJSONObject2 == null || jSONObjectOptJSONObject2.length() <= 0) {
                        POBLog.warn("ConfigBuilder", "Null/empty banner response parameter.", new Object[0]);
                    } else {
                        POBLog.info("ConfigBuilder", "Banner config: " + jSONObjectOptJSONObject2, new Object[0]);
                        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("clientconfig");
                        if (jSONObjectOptJSONObject3 != null) {
                            configBuilder.setSkipAfter(jSONObjectOptJSONObject3.optInt(DTBAdLoader.APS_VIDEO_SKIP_AFTER, 5));
                            if ("interstitial".equals(str)) {
                                configBuilder.setBackButtonEnabled(jSONObjectOptJSONObject3.optBoolean("enablehardwarebackbutton", false));
                            }
                        }
                    }
                }
            }
            return configBuilder.build();
        }

        public POBBannerConfig build() {
            return new POBBannerConfig(this);
        }

        public ConfigBuilder setBackButtonEnabled(boolean z10) {
            this.f63416a = z10;
            return this;
        }

        public ConfigBuilder setSkipAfter(int i10) {
            this.f63417b = i10;
            return this;
        }
    }

    public int getSkipAfter() {
        return this.f63414a;
    }

    public boolean isBackButtonEnabled() {
        return this.f63415b;
    }

    private POBBannerConfig(ConfigBuilder configBuilder) {
        this.f63414a = configBuilder.f63417b;
        this.f63415b = configBuilder.f63416a;
    }
}
