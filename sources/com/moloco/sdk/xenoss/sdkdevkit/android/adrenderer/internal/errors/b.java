package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f56020b = new b("FULLSCREEN_AD_SHOW_FAILED_NO_SUPPORTED_TYPE", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b[] f56021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f56022d;

    static {
        b[] bVarArrD = d();
        f56021c = bVarArrD;
        f56022d = qf.a.a(bVarArrD);
    }

    public b(String str, int i10) {
    }

    public static final /* synthetic */ b[] d() {
        return new b[]{f56020b};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f56021c.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public String a() {
        return name();
    }
}
