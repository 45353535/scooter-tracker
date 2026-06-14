package com.ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.aj;
import com.ironsource.adqualitysdk.sdk.i.k;
import com.ironsource.adqualitysdk.sdk.i.kc;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ISAdQualityConfig {

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private final Map<String, String> f38;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private final ISAdQualityDeviceIdType f39;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private final boolean f40;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private final String f41;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private final boolean f42;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private final ISAdQualityLogLevel f43;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final String f44;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final Set<ISAdQualityInitListener> f45;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final boolean f46;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final boolean f47;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final boolean f48;

    /* synthetic */ ISAdQualityConfig(String str, boolean z10, boolean z11, boolean z12, ISAdQualityLogLevel iSAdQualityLogLevel, Set set, String str2, boolean z13, boolean z14, ISAdQualityDeviceIdType iSAdQualityDeviceIdType, Map map, byte b10) {
        this(str, z10, z11, z12, iSAdQualityLogLevel, set, str2, z13, z14, iSAdQualityDeviceIdType, map);
    }

    public static ISAdQualityConfig merge(ISAdQualityConfig iSAdQualityConfig, ISAdQualityConfig iSAdQualityConfig2) {
        Builder builder = new Builder();
        if (iSAdQualityConfig.f46) {
            builder.setUserId(iSAdQualityConfig.f44);
        } else if (iSAdQualityConfig2.f46) {
            builder.setUserId(iSAdQualityConfig2.f44);
        }
        if (iSAdQualityConfig.f47) {
            builder.setTestMode(iSAdQualityConfig.f48);
        } else if (iSAdQualityConfig2.f47) {
            builder.setTestMode(iSAdQualityConfig2.f48);
        }
        if (iSAdQualityConfig.f42) {
            builder.setCoppa(iSAdQualityConfig.f40);
        } else if (iSAdQualityConfig2.f42) {
            builder.setCoppa(iSAdQualityConfig2.f40);
        }
        ISAdQualityLogLevel iSAdQualityLogLevel = iSAdQualityConfig.f43;
        if (iSAdQualityLogLevel == null) {
            iSAdQualityLogLevel = iSAdQualityConfig2.f43;
        }
        builder.setLogLevel(iSAdQualityLogLevel);
        Iterator<ISAdQualityInitListener> it = iSAdQualityConfig.f45.iterator();
        while (it.hasNext()) {
            builder.addAdQualityInitListener(it.next());
        }
        Iterator<ISAdQualityInitListener> it2 = iSAdQualityConfig2.f45.iterator();
        while (it2.hasNext()) {
            builder.addAdQualityInitListener(it2.next());
        }
        String str = iSAdQualityConfig.f41;
        if (str != null) {
            builder.setInitializationSource(str);
        } else {
            String str2 = iSAdQualityConfig2.f41;
            if (str2 != null) {
                builder.setInitializationSource(str2);
            }
        }
        ISAdQualityDeviceIdType iSAdQualityDeviceIdType = iSAdQualityConfig.f39;
        if (iSAdQualityDeviceIdType == null) {
            iSAdQualityDeviceIdType = iSAdQualityConfig2.f39;
        }
        builder.setDeviceIdType(iSAdQualityDeviceIdType);
        HashMap map = new HashMap(iSAdQualityConfig2.f38);
        map.putAll(iSAdQualityConfig.f38);
        for (Map.Entry entry : map.entrySet()) {
            builder.setMetaData((String) entry.getKey(), (String) entry.getValue());
        }
        return builder.build();
    }

    public Set<ISAdQualityInitListener> getAdQualityInitListeners() {
        return this.f45;
    }

    public boolean getCoppa() {
        return this.f40;
    }

    public ISAdQualityDeviceIdType getDeviceIdType() {
        return this.f39;
    }

    public String getInitializationSource() {
        return this.f41;
    }

    public ISAdQualityLogLevel getLogLevel() {
        return this.f43;
    }

    public Map<String, String> getMetaData() {
        return this.f38;
    }

    public String getUserId() {
        return this.f44;
    }

    public boolean isTestMode() {
        return this.f48;
    }

    public boolean isUserIdSet() {
        return this.f46;
    }

    private ISAdQualityConfig(String str, boolean z10, boolean z11, boolean z12, ISAdQualityLogLevel iSAdQualityLogLevel, Set<ISAdQualityInitListener> set, String str2, boolean z13, boolean z14, ISAdQualityDeviceIdType iSAdQualityDeviceIdType, Map<String, String> map) {
        this.f44 = str;
        this.f46 = z10;
        this.f48 = z11;
        this.f47 = z12;
        this.f43 = iSAdQualityLogLevel;
        this.f45 = set;
        this.f41 = str2;
        this.f40 = z13;
        this.f42 = z14;
        this.f39 = iSAdQualityDeviceIdType;
        this.f38 = map;
    }

    public static class Builder {

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f59 = null;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private boolean f55 = false;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private boolean f58 = false;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean f56 = false;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private ISAdQualityLogLevel f57 = ISAdQualityLogLevel.INFO;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private final Set<ISAdQualityInitListener> f53 = new HashSet();

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private String f51 = null;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private boolean f54 = false;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private boolean f52 = false;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private ISAdQualityDeviceIdType f50 = ISAdQualityDeviceIdType.NONE;

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private final Map<String, String> f49 = new HashMap();

        public Builder addAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f53.add(iSAdQualityInitListener);
            return this;
        }

        public ISAdQualityConfig build() {
            return new ISAdQualityConfig(this.f59, this.f55, this.f58, this.f56, this.f57, this.f53, this.f51, this.f54, this.f52, this.f50, this.f49, (byte) 0);
        }

        public Builder removeAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f53.remove(iSAdQualityInitListener);
            return this;
        }

        @Deprecated
        public Builder setAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            return addAdQualityInitListener(iSAdQualityInitListener);
        }

        public Builder setCoppa(boolean z10) {
            this.f54 = z10;
            this.f52 = true;
            return this;
        }

        public Builder setDeviceIdType(ISAdQualityDeviceIdType iSAdQualityDeviceIdType) {
            this.f50 = iSAdQualityDeviceIdType;
            return this;
        }

        public Builder setInitializationSource(String str) {
            if (kc.m7150(str, 20)) {
                this.f51 = str;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setInitializationSource( ");
            sb2.append(str);
            sb2.append(" ) init source must have length of 1-20");
            k.m7102("ISAdQualityConfig", sb2.toString());
            return this;
        }

        public Builder setLogLevel(ISAdQualityLogLevel iSAdQualityLogLevel) {
            this.f57 = iSAdQualityLogLevel;
            return this;
        }

        public Builder setMetaData(JSONObject jSONObject) {
            if (jSONObject != null) {
                for (int i10 = 0; i10 < jSONObject.names().length(); i10++) {
                    try {
                        String string = jSONObject.names().getString(i10);
                        Object objOpt = jSONObject.opt(string);
                        if (objOpt instanceof String) {
                            setMetaData(string, (String) objOpt);
                        } else {
                            StringBuilder sb2 = new StringBuilder("setMetaData( ");
                            sb2.append(string);
                            sb2.append(" , ");
                            sb2.append(objOpt);
                            sb2.append(" ) value must be a string");
                            k.m7102("ISAdQualityConfig", sb2.toString());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return this;
        }

        public Builder setTestMode(boolean z10) {
            this.f58 = z10;
            this.f56 = true;
            return this;
        }

        public Builder setUserId(String str) {
            this.f59 = str;
            this.f55 = true;
            return this;
        }

        public Builder setMetaData(String str, String str2) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    if (!aj.m4710(str)) {
                        if (aj.m4713(this.f49, str)) {
                            StringBuilder sb2 = new StringBuilder("setMetaData( ");
                            sb2.append(str);
                            sb2.append(" , ");
                            sb2.append(str2);
                            sb2.append(" ) limited to 5 meta data values. Ignoring meta data value.");
                            k.m7102("ISAdQualityConfig", sb2.toString());
                            return this;
                        }
                        if (!aj.m4711(str, str2)) {
                            StringBuilder sb3 = new StringBuilder("setMetaData( ");
                            sb3.append(str);
                            sb3.append(" , ");
                            sb3.append(str2);
                            sb3.append(" ) the length of both the key and the value should be between 1 and 64");
                            sb3.append(" characters.");
                            k.m7102("ISAdQualityConfig", sb3.toString());
                            return this;
                        }
                    }
                    this.f49.put(str, str2);
                }
            } catch (Exception unused) {
            }
            return this;
        }
    }
}
