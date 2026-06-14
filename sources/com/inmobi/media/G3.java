package com.inmobi.media;

import android.net.Uri;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes9.dex */
public abstract class G3 {
    public static final boolean a(String str) {
        if (str == null || StringsKt.y0(str)) {
            return false;
        }
        String scheme = Uri.parse(str).getScheme();
        return !(scheme == null || scheme.length() == 0);
    }
}
