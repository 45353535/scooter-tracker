package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Yi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3986qh f38062a = new C3986qh();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38063b = Yi.class.getSimpleName();

    public static SignalsConfig.IceConfig a() {
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        return ((SignalsConfig) Y3.f38021a.a(SignalsConfig.class)).getIce();
    }
}
