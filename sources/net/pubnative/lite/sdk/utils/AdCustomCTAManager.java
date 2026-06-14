package net.pubnative.lite.sdk.utils;

import android.text.TextUtils;
import net.pubnative.lite.sdk.models.APIAsset;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdData;

/* JADX INFO: loaded from: classes3.dex */
public class AdCustomCTAManager {
    public static final Integer CUSTOM_CTA_DELAY_DEFAULT = 2;
    public static final Integer CUSTOM_CTA_DELAY_MAX = 10;

    public enum CtaType {
        DEFAULT("default"),
        EXTENDED("extended");

        private final String mCtaType;

        CtaType(String str) {
            this.mCtaType = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mCtaType;
        }
    }

    public static Integer getCustomCtaDelay(Ad ad2) {
        return Integer.valueOf(Math.min(((ad2 == null || ad2.getCustomCTADelay() == null || ad2.getCustomCTADelay().intValue() < 0) ? CUSTOM_CTA_DELAY_DEFAULT : ad2.getCustomCTADelay()).intValue(), CUSTOM_CTA_DELAY_MAX.intValue()));
    }

    public static CtaType getCustomCtaType(Ad ad2) {
        String customCTAType = ad2.getCustomCTAType();
        if (customCTAType != null) {
            CtaType ctaType = CtaType.EXTENDED;
            if (customCTAType.equals(ctaType.toString())) {
                return ctaType;
            }
        }
        return CtaType.DEFAULT;
    }

    private static Boolean hasIcon(Ad ad2) {
        if (ad2 == null || !ad2.hasCustomCTA()) {
            return Boolean.FALSE;
        }
        AdData asset = ad2.getAsset(APIAsset.CUSTOM_CTA);
        String stringField = asset != null ? asset.getStringField("icon") : null;
        return Boolean.valueOf(!TextUtils.isEmpty(stringField) && URLValidator.isValidURL(stringField));
    }

    public static Boolean isAbleShow(Ad ad2) {
        return Boolean.valueOf(isEnabled(ad2).booleanValue() && hasIcon(ad2).booleanValue());
    }

    public static Boolean isEnabled(Ad ad2) {
        return Boolean.valueOf((ad2 == null || ad2.isCustomCTAEnabled() == null || !ad2.isCustomCTAEnabled().booleanValue()) ? false : true);
    }
}
