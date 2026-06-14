package com.moloco.sdk.internal.services.bidtoken;

import androidx.media3.common.PlaybackException;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f55319c = new e("UNKNOWN", 0, -100);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f55320d = new e("HTTP_REQUEST_TIMEOUT", 1, -101);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f55321e = new e("UNKNOWN_HOST", 2, PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ e[] f55322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f55323g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55324b;

    static {
        e[] eVarArrD = d();
        f55322f = eVarArrD;
        f55323g = qf.a.a(eVarArrD);
    }

    public e(String str, int i10, int i11) {
        this.f55324b = i11;
    }

    public static final /* synthetic */ e[] d() {
        return new e[]{f55319c, f55320d, f55321e};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f55322f.clone();
    }

    public final int g() {
        return this.f55324b;
    }
}
