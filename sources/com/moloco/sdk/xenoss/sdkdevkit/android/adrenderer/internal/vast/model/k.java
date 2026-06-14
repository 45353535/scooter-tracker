package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f57578b = new k("Image", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f57579c = new k("JS", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ k[] f57580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f57581e;

    static {
        k[] kVarArrD = d();
        f57580d = kVarArrD;
        f57581e = qf.a.a(kVarArrD);
    }

    public k(String str, int i10) {
    }

    public static final /* synthetic */ k[] d() {
        return new k[]{f57578b, f57579c};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f57580d.clone();
    }
}
