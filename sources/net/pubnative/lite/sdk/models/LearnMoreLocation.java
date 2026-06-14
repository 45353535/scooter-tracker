package net.pubnative.lite.sdk.models;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public enum LearnMoreLocation {
    DEFAULT("default"),
    BOTTOM_DOWN("bottom_down"),
    BOTTOM_UP("bottom_up");

    final String size;

    LearnMoreLocation(String str) {
        this.size = str;
    }

    public static LearnMoreLocation fromString(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            LearnMoreLocation learnMoreLocation = DEFAULT;
            if (lowerCase.equals(learnMoreLocation.size)) {
                return learnMoreLocation;
            }
            LearnMoreLocation learnMoreLocation2 = BOTTOM_DOWN;
            if (lowerCase.equals(learnMoreLocation2.size)) {
                return learnMoreLocation2;
            }
            LearnMoreLocation learnMoreLocation3 = BOTTOM_UP;
            if (lowerCase.equals(learnMoreLocation3.size)) {
                return learnMoreLocation3;
            }
        }
        return DEFAULT;
    }

    public String getLocationName() {
        return this.size;
    }
}
