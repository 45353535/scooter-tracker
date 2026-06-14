package org.bidon.unityads.ext;

import com.unity3d.services.ads.UnityAdsImplementation;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f97760a = "4.16.4.1";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f97761b = UnityAdsImplementation.getInstance().getVersion();

    public static final String a() {
        return f97760a;
    }

    public static final String b() {
        return f97761b;
    }
}
