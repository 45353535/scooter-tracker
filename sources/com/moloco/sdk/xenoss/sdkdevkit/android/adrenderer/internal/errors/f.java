package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class f implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f56040b = new f("NATIVE_AD_ORTB_RESPONSE_NULL_ERROR", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f56041c = new f("NATIVE_AD_IMAGE_ASSET_MEDIA_FETCH_ERROR", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f56042d = new f("NATIVE_AD_IMAGE_PREPARE_ASSET_UNKNOWN_ERROR", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f56043e = new f("NATIVE_AD_VIDEO_ASSET_MEDIA_NOT_ENOUGH_ERROR", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f56044f = new f("NATIVE_AD_VIDEO_ASSET_MEDIA_FETCH_ERROR", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f[] f56045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f56046h;

    static {
        f[] fVarArrD = d();
        f56045g = fVarArrD;
        f56046h = qf.a.a(fVarArrD);
    }

    public f(String str, int i10) {
    }

    public static final /* synthetic */ f[] d() {
        return new f[]{f56040b, f56041c, f56042d, f56043e, f56044f};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f56045g.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public String a() {
        return name();
    }
}
