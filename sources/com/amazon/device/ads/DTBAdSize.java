package com.amazon.device.ads;

import com.amazon.aps.ads.model.ApsSlotInfoExtra;
import com.ironsource.C4240b4;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class DTBAdSize {
    public static final String AAX_INTERSTITIAL_AD_SIZE = "interstitial";
    private final AdType adType;
    private final int height;
    private JSONObject pubSettings;
    private ApsSlotInfoExtra slotInfoExtra;
    private final String slotUUID;
    private final int width;

    public static final class DTBInterstitialAdSize extends DTBAdSize {
        public DTBInterstitialAdSize(String str) {
            super(9999, 9999, AdType.INTERSTITIAL, str, null);
        }
    }

    public static final class DTBVideo extends DTBAdSize {
        public DTBVideo(int i10, int i11, String str) {
            super(i10, i11, AdType.VIDEO, str, null);
        }

        public DTBVideo(int i10, int i11, String str, JSONObject jSONObject) {
            super(i10, i11, AdType.VIDEO, str, jSONObject);
        }
    }

    public DTBAdSize(int i10, int i11, String str) {
        this(i10, i11, AdType.DISPLAY, str, null);
        if (i10 == 9999 || i11 == 9999) {
            throw new IllegalArgumentException("Invalid size passed, Please use DTBInterstitialAdSize for interstitial ads.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DTBAdSize dTBAdSize = (DTBAdSize) obj;
        return this.height == dTBAdSize.height && this.width == dTBAdSize.width;
    }

    public AdType getDTBAdType() {
        return this.adType;
    }

    public int getHeight() {
        return this.height;
    }

    public JSONObject getPubSettings() {
        return this.pubSettings;
    }

    public ApsSlotInfoExtra getSlotInfoExtra() {
        return this.slotInfoExtra;
    }

    public String getSlotUUID() {
        return this.slotUUID;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return ((this.height + 31) * 31) + this.width;
    }

    public boolean isInterstitialAd() {
        return this.adType.equals(AdType.INTERSTITIAL);
    }

    public void setPubSettings(JSONObject jSONObject) {
        this.pubSettings = jSONObject;
    }

    public void setSlotInfoExtra(ApsSlotInfoExtra apsSlotInfoExtra) {
        this.slotInfoExtra = apsSlotInfoExtra;
    }

    public String toString() {
        return "DTBAdSize [" + this.width + "x" + this.height + ", adType=" + this.adType + ", slotUUID=" + this.slotUUID + C4240b4.j.f42674e;
    }

    protected DTBAdSize(int i10, int i11, AdType adType, String str, JSONObject jSONObject) {
        if (i10 >= 0 && i11 >= 0 && !DtbCommonUtils.isNullOrEmpty(str)) {
            this.width = i10;
            this.height = i11;
            this.adType = adType;
            this.slotUUID = str;
            this.pubSettings = jSONObject;
            return;
        }
        throw new IllegalArgumentException("Invalid parameter(s) passed to DTBAdSize constructor.");
    }

    protected DTBAdSize(int i10, int i11, AdType adType, String str) {
        this(i10, i11, adType, str, null);
        if (i10 < 0 || i11 < 0 || DtbCommonUtils.isNullOrEmpty(str)) {
            throw new IllegalArgumentException("Invalid parameter(s) passed to DTBAdSize constructor.");
        }
    }
}
