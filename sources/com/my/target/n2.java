package com.my.target;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class n2 {
    public final o2 a(String str, String str2, Context context) {
        return b(str, str2, null, context);
    }

    public abstract o2 a(String str, String str2, Map map, Context context);

    public final o2 b(String str, String str2, Map map, Context context) {
        return a(str, str2, map, context);
    }
}
