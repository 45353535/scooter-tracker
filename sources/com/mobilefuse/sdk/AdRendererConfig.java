package com.mobilefuse.sdk;

import androidx.annotation.Nullable;
import com.mobilefuse.sdk.config.ObservableConfig;

/* JADX INFO: loaded from: classes10.dex */
public class AdRendererConfig {
    private String advertisingId;
    private boolean closeButtonEnabled;

    @Nullable
    private CloseConfigResponse closeConfigResponse;
    private String deviceIp;
    private ExtendedAdType extendedAdType;
    private boolean fullscreenAd;
    private boolean limitTrackingEnabled;
    private ObservableConfig observableConfig;
    private String sdkName;
    private String sdkVersion;
    private boolean subjectToCoppa;
    private boolean testMode;
    private boolean thumbnailSize;
    private boolean transparentBackground;

    @Nullable
    private String uiAdm;
    private int adWidth = -1;
    private int adHeight = -1;
    private int adInstanceId = -1;

    public static class Builder {
        private AdRendererConfig config = new AdRendererConfig();

        public AdRendererConfig build() {
            return this.config;
        }

        public String getAdvertisingId() {
            return this.config.advertisingId;
        }

        public String getDeviceIp() {
            return this.config.deviceIp;
        }

        public ExtendedAdType getExtendedAdType() {
            return this.config.extendedAdType;
        }

        public ObservableConfig getObservableConfig() {
            return this.config.observableConfig;
        }

        public String getSdkName() {
            return this.config.sdkName;
        }

        public String getSdkVersion() {
            return this.config.sdkVersion;
        }

        public boolean isCloseButtonEnabled() {
            return this.config.closeButtonEnabled;
        }

        public boolean isFullscreenAd() {
            return this.config.fullscreenAd;
        }

        public boolean isLimitTrackingEnabled() {
            return this.config.limitTrackingEnabled;
        }

        public boolean isSubjectToCoppa() {
            return this.config.subjectToCoppa;
        }

        public boolean isTestMode() {
            return this.config.testMode;
        }

        public boolean isThumbnailSize() {
            return this.config.thumbnailSize;
        }

        public boolean isTransparentBackground() {
            return this.config.transparentBackground;
        }

        public Builder setAdHeight(int i10) {
            this.config.adHeight = i10;
            return this;
        }

        public Builder setAdInstanceId(int i10) {
            this.config.adInstanceId = i10;
            return this;
        }

        public Builder setAdWidth(int i10) {
            this.config.adWidth = i10;
            return this;
        }

        public Builder setAdvertisingId(String str) {
            this.config.advertisingId = str;
            return this;
        }

        public Builder setCloseButtonEnabled(boolean z10) {
            this.config.closeButtonEnabled = z10;
            return this;
        }

        public Builder setConfigClose(CloseConfigResponse closeConfigResponse) {
            this.config.closeConfigResponse = closeConfigResponse;
            return this;
        }

        public Builder setDeviceIp(String str) {
            this.config.deviceIp = str;
            return this;
        }

        public Builder setExtendedAdType(ExtendedAdType extendedAdType) {
            this.config.extendedAdType = extendedAdType;
            return this;
        }

        public Builder setFullscreenAd(boolean z10) {
            this.config.fullscreenAd = z10;
            return this;
        }

        public Builder setLimitTrackingEnabled(boolean z10) {
            this.config.limitTrackingEnabled = z10;
            return this;
        }

        public Builder setObservableConfig(ObservableConfig observableConfig) {
            this.config.observableConfig = observableConfig;
            return this;
        }

        public Builder setSdkName(String str) {
            this.config.sdkName = str;
            return this;
        }

        public Builder setSdkVersion(String str) {
            this.config.sdkVersion = str;
            return this;
        }

        public Builder setSubjectToCoppa(boolean z10) {
            this.config.subjectToCoppa = z10;
            return this;
        }

        public Builder setTestMode(boolean z10) {
            this.config.testMode = z10;
            return this;
        }

        public Builder setThumbnailSize(boolean z10) {
            this.config.thumbnailSize = z10;
            return this;
        }

        public Builder setTransparentBackground(boolean z10) {
            this.config.transparentBackground = z10;
            return this;
        }

        public Builder setUiAdm(@Nullable String str) {
            this.config.uiAdm = str;
            return this;
        }
    }

    AdRendererConfig() {
    }

    public int getAdHeight() {
        return this.adHeight;
    }

    public int getAdInstanceId() {
        return this.adInstanceId;
    }

    public int getAdWidth() {
        return this.adWidth;
    }

    public String getAdvertisingId() {
        return this.advertisingId;
    }

    @Nullable
    public CloseConfigResponse getCloseConfigResponse() {
        return this.closeConfigResponse;
    }

    public String getDeviceIp() {
        return this.deviceIp;
    }

    public ExtendedAdType getExtendedAdType() {
        return this.extendedAdType;
    }

    public ObservableConfig getObservableConfig() {
        return this.observableConfig;
    }

    public String getSdkName() {
        return this.sdkName;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    @Nullable
    public String getUiAdm() {
        return this.uiAdm;
    }

    public boolean isCloseButtonEnabled() {
        return this.closeButtonEnabled;
    }

    public boolean isFullscreenAd() {
        return this.fullscreenAd;
    }

    public boolean isLimitTrackingEnabled() {
        return this.limitTrackingEnabled;
    }

    public boolean isSubjectToCoppa() {
        return this.subjectToCoppa;
    }

    public boolean isTestMode() {
        return this.testMode;
    }

    public boolean isThumbnailSize() {
        return this.thumbnailSize;
    }

    public boolean isTransparentBackground() {
        return this.transparentBackground;
    }
}
