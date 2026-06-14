package com.inmobi.media;

import android.text.TextUtils;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Ki {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f37225a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f37226b = "dir";

    public static final String a() {
        String str = "pr-SAND-11.1.0-20251110";
        if (TextUtils.isEmpty("")) {
            return str;
        }
        return str + TokenBuilder.TOKEN_DELIMITER + "";
    }
}
