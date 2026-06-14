package com.ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.k;
import com.ironsource.adqualitysdk.sdk.i.kc;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public class ISAdQualitySegment {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private double f76;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private final Map<String, String> f77;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private final long f78;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final AtomicBoolean f79;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final String f80;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final int f81;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final String f82;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final int f83;

    public static class Builder {

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private String f90;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f92;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private double f89 = 999999.99d;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private int f91 = -1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private int f88 = -1;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private AtomicBoolean f86 = null;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private long f87 = 0;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private double f84 = -1.0d;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private Map<String, String> f85 = new HashMap();

        public ISAdQualitySegment build() {
            return new ISAdQualitySegment(this.f90, this.f91, this.f92, this.f88, this.f86, this.f84, this.f87, new HashMap(this.f85), (byte) 0);
        }

        public Builder setAge(int i10) {
            if (i10 == 0) {
                return this;
            }
            if (i10 > 0 && i10 <= 199) {
                this.f91 = i10;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setAge( ");
            sb2.append(i10);
            sb2.append(" ) age must be between 1-199");
            k.m7102("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }

        public Builder setCustomData(String str, String str2) {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    if (this.f85.size() >= 5) {
                        StringBuilder sb2 = new StringBuilder("setCustomData( ");
                        sb2.append(str);
                        sb2.append(" , ");
                        sb2.append(str2);
                        sb2.append(" ) limited to 5 custom values. Ignoring custom value.");
                        k.m7102("ISAdQualitySegment Builder", sb2.toString());
                        return this;
                    }
                    if (kc.m7159(str) && kc.m7159(str2) && kc.m7150(str, 32) && kc.m7150(str2, 32)) {
                        this.f85.put("sgct_".concat(String.valueOf(str)), str2);
                        return this;
                    }
                    StringBuilder sb3 = new StringBuilder("setCustomData( ");
                    sb3.append(str);
                    sb3.append(" , ");
                    sb3.append(str2);
                    sb3.append(" ) key and value must be alphanumeric and 1-32 in length");
                    k.m7102("ISAdQualitySegment Builder", sb3.toString());
                    return this;
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            return this;
        }

        public Builder setGender(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            Locale locale = Locale.ENGLISH;
            if (str.toLowerCase(locale).equals(IronSourceConstants.a.f44308b) || str.toLowerCase(locale).equals(IronSourceConstants.a.f44309c)) {
                this.f92 = str.toLowerCase(locale);
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setGender( ");
            sb2.append(str);
            sb2.append(" ) is invalid");
            k.m7102("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }

        public Builder setInAppPurchasesTotal(double d10) {
            if (d10 >= 0.0d && d10 < this.f89) {
                this.f84 = Math.floor(d10 * 100.0d) / 100.0d;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setIAPTotal( ");
            sb2.append(d10);
            sb2.append(" ) iapt must be between 0-");
            sb2.append(this.f89);
            k.m7102("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }

        public Builder setIsPaying(boolean z10) {
            if (this.f86 == null) {
                this.f86 = new AtomicBoolean();
            }
            this.f86.set(z10);
            return this;
        }

        public Builder setLevel(int i10) {
            if (i10 == 0) {
                return this;
            }
            if (i10 > 0 && i10 < 999999) {
                this.f88 = i10;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setLevel( ");
            sb2.append(i10);
            sb2.append(" ) level must be between 1-999999");
            k.m7102("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }

        public Builder setSegmentName(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (kc.m7159(str) && kc.m7150(str, 32)) {
                this.f90 = str;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setSegmentName( ");
            sb2.append(str);
            sb2.append(" ) segment name must be alphanumeric and 1-32 in length");
            k.m7102("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }

        public Builder setUserCreationDate(long j10) {
            if (j10 == 0) {
                return this;
            }
            if (j10 > 0) {
                this.f87 = j10;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setUserCreationDate( ");
            sb2.append(j10);
            sb2.append(" ) is an invalid timestamp");
            k.m7102("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }
    }

    /* synthetic */ ISAdQualitySegment(String str, int i10, String str2, int i11, AtomicBoolean atomicBoolean, double d10, long j10, Map map, byte b10) {
        this(str, i10, str2, i11, atomicBoolean, d10, j10, map);
    }

    public int getAge() {
        return this.f83;
    }

    public Map<String, String> getCustomData() {
        return this.f77;
    }

    public String getGender() {
        return this.f82;
    }

    public double getInAppPurchasesTotal() {
        return this.f76;
    }

    public AtomicBoolean getIsPaying() {
        return this.f79;
    }

    public int getLevel() {
        return this.f81;
    }

    public String getName() {
        return this.f80;
    }

    public long getUserCreationDate() {
        return this.f78;
    }

    private ISAdQualitySegment(String str, int i10, String str2, int i11, AtomicBoolean atomicBoolean, double d10, long j10, Map<String, String> map) {
        this.f80 = str;
        this.f83 = i10;
        this.f82 = str2;
        this.f81 = i11;
        this.f79 = atomicBoolean;
        this.f76 = d10;
        this.f78 = j10;
        this.f77 = map;
    }
}
