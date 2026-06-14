package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class k implements c {
    public static final /* synthetic */ k[] H;
    public static final /* synthetic */ EnumEntries I;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f56066b = new k("VAST_AD_LOAD_INCOMPLETE_ERROR", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f56067c = new k("VAST_AD_LOAD_XML_PARSE_ERROR", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f56068d = new k("VAST_AD_LOAD_NO_XML_TAG_ERROR", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f56069e = new k("VAST_AD_LOAD_NO_ADS_ERROR", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f56070f = new k("VAST_AD_LOAD_WRAPPER_LIMIT_ERROR", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f56071g = new k("VAST_AD_LOAD_WRAPPER_TIMEOUT_ERROR", 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k f56072h = new k("VAST_AD_LOAD_WRAPPER_FETCH_ERROR", 6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k f56073i = new k("VAST_AD_LOAD_INLINE_CREATIVES_EMPTY_ERROR", 7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final k f56074j = new k("VAST_AD_LOAD_INLINE_CREATIVES_NO_LINEAR_ERROR", 8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final k f56075k = new k("VAST_AD_LOAD_LINEAR_NOT_SUPPORTED_MEDIA_ERROR", 9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final k f56076l = new k("VAST_AD_LOAD_MEDIA_FILE_CLIENT_HTTP_ERROR", 10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final k f56077m = new k("VAST_AD_LOAD_MEDIA_FILE_SERVER_HTTP_ERROR", 11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final k f56078n = new k("VAST_AD_LOAD_MEDIA_FILE_NO_NETWORK_HTTP_ERROR", 12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final k f56079o = new k("VAST_AD_LOAD_MEDIA_FILE_UNKNOWN_HOST_HTTP_ERROR", 13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final k f56080p = new k("VAST_AD_LOAD_MEDIA_FILE_SOCKET_HTTP_ERROR", 14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final k f56081q = new k("VAST_AD_LOAD_MEDIA_FILE_HTTP_DISK_IO_ERROR", 15);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final k f56082r = new k("VAST_AD_LOAD_MEDIA_FILE_HTTP_DISK_SECURITY_ERROR", 16);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final k f56083s = new k("VAST_AD_LOAD_MEDIA_FILE_HTTP_SSL_ERROR", 17);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final k f56084t = new k("VAST_AD_LOAD_MEDIA_TMP_FILE_NOT_RENAMED_DISK_ERROR", 18);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final k f56085u = new k("VAST_AD_LOAD_MEDIA_FILE_NOT_CREATED_DISK_ERROR", 19);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final k f56086v = new k("VAST_AD_LOAD_MEDIA_FILE_NOT_CREATED_SECURITY_DISK_ERROR", 20);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final k f56087w = new k("VAST_AD_LOAD_MEDIA_FILE_NOT_CREATED_IO_DISK_ERROR", 21);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final k f56088x = new k("VAST_AD_LOAD_MEDIA_FILE_NOT_CREATED_UNKNOWN_DISK_ERROR", 22);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final k f56089y = new k("VAST_AD_LOAD_MEDIA_FILE_TIMEOUT_ERROR", 23);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final k f56090z = new k("VAST_AD_LOAD_MEDIA_FILE_TIMEOUT_NOT_ENOUGH_PLAYABLE_ERROR", 24);
    public static final k A = new k("VAST_AD_LOAD_MEDIA_FILE_UNABLE_TO_DETERMINE_TIMEOUT_ERROR", 25);
    public static final k B = new k("VAST_AD_LOAD_MEDIA_NUMBER_PARSE_ERROR", 26);
    public static final k C = new k("VAST_AD_LOAD_MEDIA_FILE_INVALID_URL_ERROR", 27);
    public static final k D = new k("VAST_AD_LOAD_MEDIA_FILE_NOT_FOUND_ERROR", 28);
    public static final k E = new k("VAST_AD_LOAD_MEDIA_FILE_UNKNOWN_MEDIA_FETCH_ERROR", 29);
    public static final k F = new k("VAST_AD_LOAD_MEDIA_FILE_UNKNOWN_ERROR", 30);
    public static final k G = new k("VAST_AD_LOAD_RENDER_AD_LOAD_ERROR", 31);

    static {
        k[] kVarArrD = d();
        H = kVarArrD;
        I = qf.a.a(kVarArrD);
    }

    public k(String str, int i10) {
    }

    public static final /* synthetic */ k[] d() {
        return new k[]{f56066b, f56067c, f56068d, f56069e, f56070f, f56071g, f56072h, f56073i, f56074j, f56075k, f56076l, f56077m, f56078n, f56079o, f56080p, f56081q, f56082r, f56083s, f56084t, f56085u, f56086v, f56087w, f56088x, f56089y, f56090z, A, B, C, D, E, F, G};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) H.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public String a() {
        return name();
    }

    public final boolean g() {
        return this == f56089y || this == f56090z || this == A;
    }
}
