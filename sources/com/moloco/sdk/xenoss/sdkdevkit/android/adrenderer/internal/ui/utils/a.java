package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.TextUnit;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f57283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f57284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f57285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f57286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f57287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final RoundedCornerShape f57288f;

    static {
        float fM3951constructorimpl = Dp.m3951constructorimpl(24);
        f57283a = fM3951constructorimpl;
        f57284b = Dp.m3951constructorimpl(4);
        f57285c = TextUnit.INSTANCE.m4143getUnspecifiedXSAIIZE();
        f57286d = DpKt.m3973DpSizeYgX7TsA(fM3951constructorimpl, fM3951constructorimpl);
        f57287e = Color.m1603copywmQWz5c$default(Color.INSTANCE.m1634getGray0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
        f57288f = RoundedCornerShapeKt.getCircleShape();
    }

    public static final float a() {
        return f57284b;
    }

    public static final long b() {
        return f57286d;
    }

    public static final long c() {
        return f57285c;
    }

    public static final long d() {
        return f57287e;
    }

    public static final RoundedCornerShape e() {
        return f57288f;
    }
}
