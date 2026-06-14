package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec;

import com.taurusx.tax.f.s;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f58161b = new b("DisplayStarted", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f58162c = new b(s.f66022o, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f58163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f58164e;

    static {
        b[] bVarArrD = d();
        f58163d = bVarArrD;
        f58164e = qf.a.a(bVarArrD);
    }

    public b(String str, int i10) {
    }

    public static final /* synthetic */ b[] d() {
        return new b[]{f58161b, f58162c};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f58163d.clone();
    }
}
