package com.moloco.sdk.internal;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class s implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f55254b = new s("AD_LOAD_LIMIT_REACHED", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f55255c = new s("BID_LOAD_ERROR_CANNOT_PROCESS_BID_RESPONSE", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f55256d = new s("BID_LOAD_ERROR_CANNOT_PARSE_BID_RESPONSE", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s f55257e = new s("AD_SHOW_ERROR_NOT_LOADED", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s f55258f = new s("AD_SHOW_ERROR_ALREADY_DISPLAYING", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ s[] f55259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f55260h;

    static {
        s[] sVarArrD = d();
        f55259g = sVarArrD;
        f55260h = qf.a.a(sVarArrD);
    }

    public s(String str, int i10) {
    }

    public static final /* synthetic */ s[] d() {
        return new s[]{f55254b, f55255c, f55256d, f55257e, f55258f};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f55259g.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public String a() {
        return name();
    }
}
