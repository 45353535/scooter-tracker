package com.pubmatic.sdk.video;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.device.ads.DTBAdLoader;
import com.pubmatic.sdk.common.log.POBLog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class POBVastPlayerConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f62976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f62977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f62978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f62979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f62980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f62981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f62982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f62983h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f62984i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f62985j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f62986k;

    public static class ConfigBuilder {
        public static final int DEFAULT_ENDCARD_SKIP_AFTER = 5;
        public static final int DEFAULT_MEDIA_URI_TIMEOUT = 20000;
        public static final boolean DEFAULT_PLAY_ON_MUTE = true;
        public static final int DEFAULT_SKIP = 1;
        public static final int DEFAULT_VIDEO_SKIP_AFTER = 7;
        public static final int DEFAULT_WRAPPER_URI_TIMEOUT = 5000;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f62987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f62988b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f62990d;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f62994h = true;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f62995i = 5;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f62996j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f62997k = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f62989c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f62991e = 7;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f62992f = 5000;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f62993g = 20000;

        public ConfigBuilder(int i10, int i11) {
            this.f62987a = i10;
            this.f62988b = i11;
        }

        private static int a(boolean z10) {
            return z10 ? 0 : 7;
        }

        @NonNull
        public static POBVastPlayerConfig createVastConfig(@Nullable JSONObject jSONObject, boolean z10, boolean z11, boolean z12, @NonNull String str) {
            POBVastPlayerConfig pOBVastPlayerConfigBuild = new ConfigBuilder(0, 0).build(z10);
            if (jSONObject != null) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ext");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("video");
                    if (jSONObjectOptJSONObject2 == null || jSONObjectOptJSONObject2.length() <= 0) {
                        POBLog.warn("ConfigBuilder", "Null/empty video response parameter.", new Object[0]);
                        return pOBVastPlayerConfigBuild;
                    }
                    POBLog.info("ConfigBuilder", "Video config: " + jSONObjectOptJSONObject2, new Object[0]);
                    ConfigBuilder configBuilder = new ConfigBuilder(jSONObjectOptJSONObject2.optInt("minduration"), jSONObjectOptJSONObject2.optInt("maxduration"));
                    configBuilder.skip(jSONObjectOptJSONObject2.optInt("skip", 1));
                    configBuilder.skipMin(jSONObjectOptJSONObject2.optInt("skipmin"));
                    configBuilder.setSkipAfterCompletionEnabled(z11);
                    if (-9999 != jSONObjectOptJSONObject2.optInt(DTBAdLoader.APS_VIDEO_SKIP_AFTER, -9999)) {
                        configBuilder.setSkipAfterCompletionEnabled(false);
                    }
                    configBuilder.skipAfter(jSONObjectOptJSONObject2.optInt(DTBAdLoader.APS_VIDEO_SKIP_AFTER, a(z11)));
                    configBuilder.setPlayOnMute(z12);
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("playbackmethod");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        try {
                            int iIntValue = ((Integer) jSONArrayOptJSONArray.get(0)).intValue();
                            if ("interstitial".equals(str)) {
                                if (iIntValue == 1) {
                                    configBuilder.setPlayOnMute(false);
                                } else if (iIntValue == 2) {
                                    configBuilder.setPlayOnMute(true);
                                }
                            } else if (iIntValue == 5) {
                                configBuilder.setPlayOnMute(false);
                            } else if (iIntValue == 6) {
                                configBuilder.setPlayOnMute(true);
                            }
                        } catch (JSONException e10) {
                            POBLog.warn("ConfigBuilder", "Failed to parse playbackmethod, %s", e10.toString());
                        }
                    }
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("clientconfig");
                    if (jSONObjectOptJSONObject3 != null && jSONObjectOptJSONObject3.length() > 0) {
                        configBuilder.setBackButtonEnabled(jSONObjectOptJSONObject3.optBoolean("enablehardwarebackbutton", false));
                        JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("timeouts");
                        if (jSONObjectOptJSONObject4 != null) {
                            configBuilder.wrapperUriTimeout(jSONObjectOptJSONObject4.optInt("wrapperTagURI"));
                            configBuilder.mediaUriTimeout(jSONObjectOptJSONObject4.optInt("mediaFileURI"));
                        }
                        JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject3.optJSONObject("companion");
                        if (jSONObjectOptJSONObject5 != null) {
                            configBuilder.endCardSkipAfter(jSONObjectOptJSONObject5.optInt(DTBAdLoader.APS_VIDEO_SKIP_AFTER, 5));
                        }
                    }
                    return configBuilder.build(z10);
                }
                POBLog.warn("ConfigBuilder", "Null/empty extension response parameter.", new Object[0]);
            }
            return pOBVastPlayerConfigBuild;
        }

        public POBVastPlayerConfig build(boolean z10) {
            return new POBVastPlayerConfig(this, z10);
        }

        public ConfigBuilder endCardSkipAfter(int i10) {
            this.f62995i = i10;
            return this;
        }

        public ConfigBuilder mediaUriTimeout(int i10) {
            if (i10 > this.f62993g) {
                this.f62993g = i10;
            }
            return this;
        }

        public ConfigBuilder setBackButtonEnabled(boolean z10) {
            this.f62996j = z10;
            return this;
        }

        public ConfigBuilder setPlayOnMute(boolean z10) {
            this.f62994h = z10;
            return this;
        }

        public ConfigBuilder setSkipAfterCompletionEnabled(boolean z10) {
            this.f62997k = z10;
            return this;
        }

        public ConfigBuilder skip(int i10) {
            this.f62989c = i10;
            return this;
        }

        public ConfigBuilder skipAfter(int i10) {
            this.f62991e = i10;
            return this;
        }

        public ConfigBuilder skipMin(int i10) {
            this.f62990d = i10;
            return this;
        }

        public ConfigBuilder wrapperUriTimeout(int i10) {
            if (i10 > this.f62992f) {
                this.f62992f = i10;
            }
            return this;
        }
    }

    public int getEndCardSkipAfter() {
        return this.f62984i;
    }

    public int getMaxDuration() {
        return this.f62977b;
    }

    public int getMediaUriTimeout() {
        return this.f62982g;
    }

    public int getMinDuration() {
        return this.f62976a;
    }

    public int getSkip() {
        return this.f62978c;
    }

    public int getSkipAfter() {
        return this.f62980e;
    }

    public int getSkipMin() {
        return this.f62979d;
    }

    public int getWrapperUriTimeout() {
        return this.f62981f;
    }

    public boolean isBackButtonEnabled() {
        return this.f62985j;
    }

    public boolean isPlayOnMute() {
        return this.f62983h;
    }

    public boolean isSkipAfterCompletionEnabled() {
        return this.f62986k;
    }

    private POBVastPlayerConfig(ConfigBuilder configBuilder, boolean z10) {
        this.f62976a = configBuilder.f62987a;
        this.f62977b = configBuilder.f62988b;
        if (z10) {
            this.f62978c = configBuilder.f62989c;
        }
        this.f62979d = configBuilder.f62990d;
        this.f62980e = configBuilder.f62991e;
        this.f62981f = configBuilder.f62992f;
        this.f62982g = configBuilder.f62993g;
        this.f62983h = configBuilder.f62994h;
        this.f62984i = configBuilder.f62995i;
        this.f62985j = configBuilder.f62996j;
        this.f62986k = configBuilder.f62997k;
    }
}
