package com.startapp.sdk.internal;

import android.os.Build;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodSubtype;

/* JADX INFO: loaded from: classes11.dex */
public final class ga {
    public static final String a(InputMethodSubtype inputMethodSubtype) {
        String languageTag = Build.VERSION.SDK_INT >= 24 ? inputMethodSubtype.getLanguageTag() : null;
        return TextUtils.isEmpty(languageTag) ? inputMethodSubtype.getLocale() : languageTag;
    }
}
