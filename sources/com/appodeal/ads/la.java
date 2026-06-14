package com.appodeal.ads;

import com.google.firebase.remoteconfig.RemoteConfigComponent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class la {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ la[] f13618d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13620c;

    static {
        la[] laVarArr = {new la("Appsflyer", 0, "appsflyer", 2), new la("Adjust", 1, "adjust", 1), new la("Facebook", 2, "facebook_analytics", 4), new la("Firebase", 3, RemoteConfigComponent.DEFAULT_NAMESPACE, 8)};
        f13618d = laVarArr;
        qf.a.a(laVarArr);
    }

    public la(String str, int i10, String str2, int i11) {
        this.f13619b = str2;
        this.f13620c = i11;
    }

    public static la valueOf(String str) {
        return (la) Enum.valueOf(la.class, str);
    }

    public static la[] values() {
        return (la[]) f13618d.clone();
    }

    public final String d() {
        return this.f13619b;
    }
}
