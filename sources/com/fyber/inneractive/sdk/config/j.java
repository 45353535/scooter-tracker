package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.fyber.inneractive.sdk.util.IAlog;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public abstract class j {
    public static ArrayList a(Context context) {
        List<InputMethodInfo> enabledInputMethodList;
        HashSet hashSet = new HashSet();
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        try {
            enabledInputMethodList = inputMethodManager.getEnabledInputMethodList();
        } catch (Throwable unused) {
            enabledInputMethodList = null;
        }
        if (enabledInputMethodList != null) {
            Iterator<InputMethodInfo> it = enabledInputMethodList.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                    if (inputMethodSubtype.getMode().equals("keyboard") && i10 < 10) {
                        String locale = inputMethodSubtype.getLocale();
                        if (!TextUtils.isEmpty(locale)) {
                            try {
                                String strReplace = locale.replace("_", TokenBuilder.TOKEN_DELIMITER);
                                hashSet.add(strReplace);
                                IAlog.a("Available input language: %s", strReplace);
                                i10++;
                            } catch (Exception unused2) {
                            }
                        }
                    }
                }
            }
        }
        if (hashSet.isEmpty()) {
            if (Build.VERSION.SDK_INT >= 24) {
                hashSet.addAll(Arrays.asList(LocaleList.getDefault().toLanguageTags().split(StringUtils.COMMA)));
            } else {
                Locale locale2 = Locale.getDefault();
                if (locale2 != null) {
                    hashSet.add(locale2.toString().replace("_", TokenBuilder.TOKEN_DELIMITER));
                }
            }
        }
        return new ArrayList(hashSet);
    }
}
