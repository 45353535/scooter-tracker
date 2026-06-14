package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0716a f56732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f56733c = new a("Portrait", 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f56734d = new a("Landscape", 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f56735e = new a("None", 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f56736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f56737g;

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a$a, reason: collision with other inner class name */
    public static final class C0716a {
        public /* synthetic */ C0716a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0716a() {
        }
    }

    static {
        a[] aVarArrD = d();
        f56736f = aVarArrD;
        f56737g = qf.a.a(aVarArrD);
        f56732b = new C0716a(null);
    }

    public a(String str, int i10) {
    }

    public static final /* synthetic */ a[] d() {
        return new a[]{f56733c, f56734d, f56735e};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f56736f.clone();
    }
}
