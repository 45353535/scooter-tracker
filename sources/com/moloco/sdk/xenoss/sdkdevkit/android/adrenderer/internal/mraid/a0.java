package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f56370c = new a0("Inline", 0, "inline");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0 f56371d = new a0("Interstitial", 1, "interstitial");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a0[] f56372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f56373f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56374b;

    static {
        a0[] a0VarArrD = d();
        f56372e = a0VarArrD;
        f56373f = qf.a.a(a0VarArrD);
    }

    public a0(String str, int i10, String str2) {
        this.f56374b = str2;
    }

    public static final /* synthetic */ a0[] d() {
        return new a0[]{f56370c, f56371d};
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f56372e.clone();
    }

    public final String g() {
        return this.f56374b;
    }
}
