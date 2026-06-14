package org.bidon.ironsource.ext;

import com.unity3d.ironsourceads.IronSourceAds;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f97320a = "9.1.0.0";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f97321b;

    static {
        String sdkVersion = IronSourceAds.getSdkVersion();
        Intrinsics.checkNotNullExpressionValue(sdkVersion, "getSdkVersion(...)");
        f97321b = sdkVersion;
    }

    public static final String a() {
        return f97320a;
    }

    public static final String b() {
        return f97321b;
    }
}
