package net.pubnative.lite.sdk.models;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public enum ContentInfoIconYPosition {
    TOP("top"),
    BOTTOM("bottom");

    public final String verticalPosition;

    ContentInfoIconYPosition(String str) {
        this.verticalPosition = str;
    }

    public static ContentInfoIconYPosition fromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return TOP;
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        ContentInfoIconYPosition contentInfoIconYPosition = TOP;
        if (!lowerCase.equals(contentInfoIconYPosition.verticalPosition)) {
            ContentInfoIconYPosition contentInfoIconYPosition2 = BOTTOM;
            if (lowerCase.equals(contentInfoIconYPosition2.verticalPosition)) {
                return contentInfoIconYPosition2;
            }
        }
        return contentInfoIconYPosition;
    }

    public static ContentInfoIconYPosition getDefaultYPosition() {
        return BOTTOM;
    }
}
