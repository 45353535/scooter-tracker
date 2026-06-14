package yads;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ni3 {
    public static String a(String str) {
        String string = StringsKt.v1(str).toString();
        if (string.length() <= 0) {
            return "";
        }
        return "yma_" + string;
    }
}
