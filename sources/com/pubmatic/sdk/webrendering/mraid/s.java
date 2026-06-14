package com.pubmatic.sdk.webrendering.mraid;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class s {
    public static /* synthetic */ boolean a(String str) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return true;
    }
}
