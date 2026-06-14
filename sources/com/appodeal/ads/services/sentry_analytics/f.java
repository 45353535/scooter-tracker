package com.appodeal.ads.services.sentry_analytics;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f14746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f14747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f[] f14748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f14749f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14750b;

    static {
        f fVar = new f("OFF", 0, "off");
        f14747d = fVar;
        f[] fVarArr = {fVar, new f("LITE", 1, "lite"), new f("FULL", 2, "full")};
        f14748e = fVarArr;
        f14749f = qf.a.a(fVarArr);
        f14746c = new e();
    }

    public f(String str, int i10, String str2) {
        this.f14750b = str2;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f14748e.clone();
    }
}
