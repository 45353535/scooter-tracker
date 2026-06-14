package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import androidx.webkit.Profile;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f56384c = new c0("Loading", 0, "loading");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c0 f56385d = new c0(Profile.DEFAULT_PROFILE_NAME, 1, "default");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c0 f56386e = new c0("Resized", 2, "resized");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c0 f56387f = new c0("Expanded", 3, "expanded");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c0 f56388g = new c0("Hidden", 4, "hidden");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ c0[] f56389h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f56390i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56391b;

    static {
        c0[] c0VarArrD = d();
        f56389h = c0VarArrD;
        f56390i = qf.a.a(c0VarArrD);
    }

    public c0(String str, int i10, String str2) {
        this.f56391b = str2;
    }

    public static final /* synthetic */ c0[] d() {
        return new c0[]{f56384c, f56385d, f56386e, f56387f, f56388g};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f56389h.clone();
    }

    public final String g() {
        return this.f56391b;
    }
}
