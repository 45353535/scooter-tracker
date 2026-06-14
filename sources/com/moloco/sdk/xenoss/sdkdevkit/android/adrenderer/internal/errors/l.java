package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class l implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f56091b = new l("VAST_AD_EXOPLAYER_VIDEO_LAYER_ERROR", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f56092c = new l("VAST_AD_EXOPLAYER_STYLED_PLAYER_VIEW_INFLATE_EXCEPTION_ERROR", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f56093d = new l("VAST_AD_EXOPLAYER_SET_MEDIA_ITEM_EXCEPTION_ERROR", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f56094e = new l("VAST_AD_EXOPLAYER_SET_MEDIA_FILE_NOT_EXISTS_ERROR", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ l[] f56095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f56096g;

    static {
        l[] lVarArrD = d();
        f56095f = lVarArrD;
        f56096g = qf.a.a(lVarArrD);
    }

    public l(String str, int i10) {
    }

    public static final /* synthetic */ l[] d() {
        return new l[]{f56091b, f56092c, f56093d, f56094e};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f56095f.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public String a() {
        return name();
    }
}
