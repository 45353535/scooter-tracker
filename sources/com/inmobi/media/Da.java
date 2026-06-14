package com.inmobi.media;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Da {
    public static String a(String fileKey) {
        Intrinsics.checkNotNullParameter(fileKey, "fileKey");
        return "com.im.keyValueStore." + fileKey;
    }

    public static Ea a(Context context, String fileKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileKey, "fileKey");
        String strA = a(fileKey);
        ConcurrentHashMap concurrentHashMap = Ea.f36782b;
        Ea ea2 = (Ea) concurrentHashMap.get(strA);
        if (ea2 == null) {
            ea2 = new Ea(context, strA);
            Ea ea3 = (Ea) concurrentHashMap.putIfAbsent(strA, ea2);
            if (ea3 != null) {
                return ea3;
            }
        }
        return ea2;
    }
}
