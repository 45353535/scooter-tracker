package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import com.appodeal.ads.modules.common.internal.LogConstants;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f57633b = new x("CreativeView", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f57634c = new x("Start", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f57635d = new x("FirstQuartile", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f57636e = new x("Midpoint", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x f57637f = new x("ThirdQuartile", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x f57638g = new x("Complete", 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x f57639h = new x("Mute", 6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x f57640i = new x("UnMute", 7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x f57641j = new x(LogConstants.EVENT_PAUSE, 8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final x f57642k = new x("Rewind", 9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final x f57643l = new x(LogConstants.EVENT_RESUME, 10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final x f57644m = new x("CloseLinear", 11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final x f57645n = new x("Skip", 12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final x f57646o = new x("Progress", 13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ x[] f57647p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f57648q;

    static {
        x[] xVarArrD = d();
        f57647p = xVarArrD;
        f57648q = qf.a.a(xVarArrD);
    }

    public x(String str, int i10) {
    }

    public static final /* synthetic */ x[] d() {
        return new x[]{f57633b, f57634c, f57635d, f57636e, f57637f, f57638g, f57639h, f57640i, f57641j, f57642k, f57643l, f57644m, f57645n, f57646o};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f57647p.clone();
    }
}
