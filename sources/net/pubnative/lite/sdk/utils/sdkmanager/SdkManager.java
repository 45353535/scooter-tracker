package net.pubnative.lite.sdk.utils.sdkmanager;

import net.pubnative.lite.sdk.viewability.baseom.BaseViewabilityManager;

/* JADX INFO: loaded from: classes3.dex */
public class SdkManager {
    private final DisplayManager displayManager;
    private final BaseViewabilityManager visibilityManager;

    public static class Builder {
        private DisplayManager displayManager;
        private BaseViewabilityManager visibilityManager;

        public SdkManager build() {
            return new SdkManager(this);
        }

        public Builder displayManager(DisplayManager displayManager) {
            this.displayManager = displayManager;
            return this;
        }

        public Builder visibilityManager(BaseViewabilityManager baseViewabilityManager) {
            this.visibilityManager = baseViewabilityManager;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public DisplayManager getDisplayManager() {
        return this.displayManager;
    }

    public BaseViewabilityManager getVisibilityManager() {
        return this.visibilityManager;
    }

    private SdkManager(Builder builder) {
        this.visibilityManager = builder.visibilityManager;
        this.displayManager = builder.displayManager;
    }
}
