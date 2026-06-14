package net.pubnative.lite.sdk.utils;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class ProgressTimeFormatter {
    public static String formatSeconds(int i10) {
        return String.format(Locale.ENGLISH, "%02d:%02d", Integer.valueOf((i10 % 3600) / 60), Integer.valueOf(i10 % 60));
    }
}
