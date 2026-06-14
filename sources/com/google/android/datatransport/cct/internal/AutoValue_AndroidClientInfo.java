package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.AndroidClientInfo;

/* JADX INFO: loaded from: classes7.dex */
final class AutoValue_AndroidClientInfo extends AndroidClientInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f24192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f24195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f24196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f24197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f24198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f24199h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f24200i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f24201j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f24202k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f24203l;

    static final class Builder extends AndroidClientInfo.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f24204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f24205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f24206c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f24207d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f24208e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f24209f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f24210g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f24211h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f24212i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f24213j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f24214k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f24215l;

        Builder() {
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo build() {
            return new AutoValue_AndroidClientInfo(this.f24204a, this.f24205b, this.f24206c, this.f24207d, this.f24208e, this.f24209f, this.f24210g, this.f24211h, this.f24212i, this.f24213j, this.f24214k, this.f24215l);
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setApplicationBuild(@Nullable String str) {
            this.f24215l = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setCountry(@Nullable String str) {
            this.f24213j = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setDevice(@Nullable String str) {
            this.f24207d = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setFingerprint(@Nullable String str) {
            this.f24211h = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setHardware(@Nullable String str) {
            this.f24206c = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setLocale(@Nullable String str) {
            this.f24212i = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setManufacturer(@Nullable String str) {
            this.f24210g = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setMccMnc(@Nullable String str) {
            this.f24214k = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setModel(@Nullable String str) {
            this.f24205b = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setOsBuild(@Nullable String str) {
            this.f24209f = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setProduct(@Nullable String str) {
            this.f24208e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public AndroidClientInfo.Builder setSdkVersion(@Nullable Integer num) {
            this.f24204a = num;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AndroidClientInfo) {
            AndroidClientInfo androidClientInfo = (AndroidClientInfo) obj;
            Integer num = this.f24192a;
            if (num != null ? num.equals(androidClientInfo.getSdkVersion()) : androidClientInfo.getSdkVersion() == null) {
                String str = this.f24193b;
                if (str != null ? str.equals(androidClientInfo.getModel()) : androidClientInfo.getModel() == null) {
                    String str2 = this.f24194c;
                    if (str2 != null ? str2.equals(androidClientInfo.getHardware()) : androidClientInfo.getHardware() == null) {
                        String str3 = this.f24195d;
                        if (str3 != null ? str3.equals(androidClientInfo.getDevice()) : androidClientInfo.getDevice() == null) {
                            String str4 = this.f24196e;
                            if (str4 != null ? str4.equals(androidClientInfo.getProduct()) : androidClientInfo.getProduct() == null) {
                                String str5 = this.f24197f;
                                if (str5 != null ? str5.equals(androidClientInfo.getOsBuild()) : androidClientInfo.getOsBuild() == null) {
                                    String str6 = this.f24198g;
                                    if (str6 != null ? str6.equals(androidClientInfo.getManufacturer()) : androidClientInfo.getManufacturer() == null) {
                                        String str7 = this.f24199h;
                                        if (str7 != null ? str7.equals(androidClientInfo.getFingerprint()) : androidClientInfo.getFingerprint() == null) {
                                            String str8 = this.f24200i;
                                            if (str8 != null ? str8.equals(androidClientInfo.getLocale()) : androidClientInfo.getLocale() == null) {
                                                String str9 = this.f24201j;
                                                if (str9 != null ? str9.equals(androidClientInfo.getCountry()) : androidClientInfo.getCountry() == null) {
                                                    String str10 = this.f24202k;
                                                    if (str10 != null ? str10.equals(androidClientInfo.getMccMnc()) : androidClientInfo.getMccMnc() == null) {
                                                        String str11 = this.f24203l;
                                                        if (str11 != null ? str11.equals(androidClientInfo.getApplicationBuild()) : androidClientInfo.getApplicationBuild() == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public String getApplicationBuild() {
        return this.f24203l;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public String getCountry() {
        return this.f24201j;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public String getDevice() {
        return this.f24195d;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public String getFingerprint() {
        return this.f24199h;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public String getHardware() {
        return this.f24194c;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public String getLocale() {
        return this.f24200i;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public String getManufacturer() {
        return this.f24198g;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public String getMccMnc() {
        return this.f24202k;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public String getModel() {
        return this.f24193b;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public String getOsBuild() {
        return this.f24197f;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public String getProduct() {
        return this.f24196e;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public Integer getSdkVersion() {
        return this.f24192a;
    }

    public int hashCode() {
        Integer num = this.f24192a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f24193b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f24194c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f24195d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f24196e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f24197f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f24198g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f24199h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f24200i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f24201j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f24202k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f24203l;
        return iHashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f24192a + ", model=" + this.f24193b + ", hardware=" + this.f24194c + ", device=" + this.f24195d + ", product=" + this.f24196e + ", osBuild=" + this.f24197f + ", manufacturer=" + this.f24198g + ", fingerprint=" + this.f24199h + ", locale=" + this.f24200i + ", country=" + this.f24201j + ", mccMnc=" + this.f24202k + ", applicationBuild=" + this.f24203l + "}";
    }

    private AutoValue_AndroidClientInfo(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f24192a = num;
        this.f24193b = str;
        this.f24194c = str2;
        this.f24195d = str3;
        this.f24196e = str4;
        this.f24197f = str5;
        this.f24198g = str6;
        this.f24199h = str7;
        this.f24200i = str8;
        this.f24201j = str9;
        this.f24202k = str10;
        this.f24203l = str11;
    }
}
