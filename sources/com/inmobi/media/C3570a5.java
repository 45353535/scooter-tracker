package com.inmobi.media;

import android.net.Network;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3570a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Network f38147a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f38148b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f38149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f38150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f38151e = new AtomicBoolean(false);

    public static AdConfig.CustomNetworkValidation a() {
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return ((AdConfig) Y3.f38021a.a(AdConfig.class)).getCustomNwValidation();
    }
}
