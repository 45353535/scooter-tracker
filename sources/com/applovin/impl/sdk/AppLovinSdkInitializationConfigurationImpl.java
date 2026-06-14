package com.applovin.impl.sdk;

import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class AppLovinSdkInitializationConfigurationImpl extends AppLovinSdkInitializationConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f10462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f10463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MaxSegmentCollection f10464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f10465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f10466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f10467h;

    public static class BuilderImpl implements AppLovinSdkInitializationConfiguration.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f10469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f10470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f10471d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private MaxSegmentCollection f10472e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f10473f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List f10474g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f10475h;

        public BuilderImpl(String str, @Nullable String str2) {
            List list = Collections.EMPTY_LIST;
            this.f10473f = list;
            this.f10474g = list;
            this.f10475h = true;
            this.f10468a = str;
            this.f10469b = str2;
            o.e("AppLovinSdkInitializationConfiguration", "Initializing with key: " + str);
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration build() {
            return new AppLovinSdkInitializationConfigurationImpl(this);
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public List<String> getAdUnitIds() {
            return this.f10474g;
        }

        @Nullable
        public String getAxonEventKey() {
            return this.f10469b;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        @Nullable
        public String getMediationProvider() {
            return this.f10470c;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        @Nullable
        public String getPluginVersion() {
            return this.f10471d;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public String getSdkKey() {
            return this.f10468a;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        @Nullable
        public MaxSegmentCollection getSegmentCollection() {
            return this.f10472e;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public List<String> getTestDeviceAdvertisingIds() {
            return this.f10473f;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public boolean isExceptionHandlerEnabled() {
            return this.f10475h;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setAdUnitIds(List<String> list) {
            o.e("AppLovinSdkInitializationConfiguration", "setAdUnitIds(adUnitIds=" + list + ")");
            if (list == null) {
                return this;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                if (StringUtils.isValidString(str) && str.length() > 0) {
                    if (str.length() == 16) {
                        arrayList.add(str);
                    } else {
                        o.h("AppLovinSdkInitializationConfiguration", "Unable to set initialization ad unit id (" + str + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                    }
                }
            }
            this.f10474g = arrayList;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setExceptionHandlerEnabled(boolean z10) {
            o.e("AppLovinSdkInitializationConfiguration", "setExceptionHandlerEnabled(exceptionHandlerEnabled=" + z10 + ")");
            this.f10475h = z10;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setMediationProvider(@Nullable String str) {
            o.e("AppLovinSdkInitializationConfiguration", "setMediationProvider(mediationProvider=" + str + ")");
            if (str == null || (!str.isEmpty() && str.length() <= 64 && StringUtils.isAlphaNumeric(str))) {
                this.f10470c = str;
                return this;
            }
            o.h("AppLovinSdkInitializationConfiguration", "Mediation provider set to invalid value: " + str + ". Please use a valid mediation provider (e.g., AppLovinMediationProvider.MAX)");
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setPluginVersion(@Nullable String str) {
            o.e("AppLovinSdkInitializationConfiguration", "setPluginVersion(pluginVersion=" + str + ")");
            this.f10471d = str;
            return this;
        }

        public AppLovinSdkInitializationConfiguration.Builder setSdkKey(String str) {
            this.f10468a = str;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setSegmentCollection(MaxSegmentCollection maxSegmentCollection) {
            o.e("AppLovinSdkInitializationConfiguration", "setSegmentCollection(segmentCollection=" + maxSegmentCollection + ")");
            this.f10472e = maxSegmentCollection;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setTestDeviceAdvertisingIds(List<String> list) {
            o.e("AppLovinSdkInitializationConfiguration", "setTestDeviceAdvertisingIds(testDeviceAdvertisingIds=" + list + ")");
            if (list == null) {
                return this;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                if (str == null || str.length() != 36) {
                    o.h("AppLovinSdkInitializationConfiguration", "Unable to set test device advertising id (" + str + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
                } else {
                    arrayList.add(str);
                }
            }
            this.f10473f = arrayList;
            return this;
        }

        public String toString() {
            return "AppLovinSdkInitializationConfiguration.Builder{ sdkKey=" + this.f10468a + ", axonEventKey=" + this.f10469b + ", mediationProvider=" + this.f10470c + ", pluginVersion=" + this.f10471d + ", testDeviceAdvertisingIdentifiers=" + this.f10473f + ", adUnitIdentifiers=" + this.f10474g + ", isExceptionHandlerEnabled=" + this.f10475h + ", segmentCollection=" + this.f10472e + "}";
        }
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public List<String> getAdUnitIds() {
        return this.f10466g;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public String getAxonEventKey() {
        return this.f10461b;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public String getMediationProvider() {
        return this.f10462c;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public String getPluginVersion() {
        return this.f10463d;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public String getSdkKey() {
        return this.f10460a;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public MaxSegmentCollection getSegmentCollection() {
        return this.f10464e;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public List<String> getTestDeviceAdvertisingIds() {
        return this.f10465f;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public boolean isExceptionHandlerEnabled() {
        return this.f10467h;
    }

    public String toString() {
        return "AppLovinSdkInitializationConfiguration{ sdkKey=" + this.f10460a + ", axonEventKey=" + this.f10461b + ", mediationProvider=" + this.f10462c + ", pluginVersion=" + this.f10463d + ", testDeviceAdvertisingIds=" + this.f10465f + ", adUnitIdentifiers=" + this.f10466g + ", isExceptionHandlerEnabled=" + this.f10467h + ", segmentCollection=" + this.f10464e + "}";
    }

    private AppLovinSdkInitializationConfigurationImpl(BuilderImpl builderImpl) {
        this.f10460a = builderImpl.f10468a;
        this.f10461b = builderImpl.f10469b;
        this.f10462c = builderImpl.f10470c;
        this.f10463d = builderImpl.f10471d;
        this.f10464e = builderImpl.f10472e;
        this.f10465f = builderImpl.f10473f;
        this.f10466g = builderImpl.f10474g;
        this.f10467h = builderImpl.f10475h;
    }
}
