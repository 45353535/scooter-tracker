package com.inmobi.media;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.zg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4209zg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ea f40054a;

    public C4209zg(Context context, String sharePrefFile) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharePrefFile, "sharePrefFile");
        ConcurrentHashMap concurrentHashMap = Ea.f36782b;
        this.f40054a = Da.a(context, sharePrefFile);
    }

    public final String a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Ea ea2 = this.f40054a;
        ea2.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        return ea2.f36783a.getString(key, null);
    }
}
