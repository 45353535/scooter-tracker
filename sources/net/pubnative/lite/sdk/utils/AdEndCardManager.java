package net.pubnative.lite.sdk.utils;

import net.pubnative.lite.sdk.models.Ad;

/* JADX INFO: loaded from: classes3.dex */
public class AdEndCardManager {
    private static final Boolean END_CARD_ENABLED = Boolean.TRUE;
    private static final Boolean CUSTOM_END_CARD_ENABLED = Boolean.FALSE;

    public static Boolean getDefaultEndCard() {
        return END_CARD_ENABLED;
    }

    private static Boolean hasEndcardRemoteConfig(Ad ad2) {
        return Boolean.valueOf(ad2.isEndCardEnabled() != null);
    }

    public static Boolean isEndCardEnabled(Ad ad2) {
        if (ad2 == null) {
            return Boolean.FALSE;
        }
        boolean zShouldShowEndcard = shouldShowEndcard(ad2);
        if (!zShouldShowEndcard) {
            zShouldShowEndcard = shouldShowCustomEndcard(ad2);
        }
        return Boolean.valueOf(zShouldShowEndcard);
    }

    public static boolean shouldShowCustomEndcard(Ad ad2) {
        if (ad2.hasCustomEndCard()) {
            return ad2.isCustomEndCardEnabled() != null ? ad2.isCustomEndCardEnabled().booleanValue() : CUSTOM_END_CARD_ENABLED.booleanValue();
        }
        return false;
    }

    public static boolean shouldShowEndcard(Ad ad2) {
        if (ad2.hasEndCard()) {
            return hasEndcardRemoteConfig(ad2).booleanValue() ? ad2.isEndCardEnabled().booleanValue() : END_CARD_ENABLED.booleanValue();
        }
        return false;
    }
}
