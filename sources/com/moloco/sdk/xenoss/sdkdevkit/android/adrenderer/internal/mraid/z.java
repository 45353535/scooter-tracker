package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class z {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56540a;

        static {
            int[] iArr = new int[y.values().length];
            try {
                iArr[y.f56535c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.f56536d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y.f56537e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f56540a = iArr;
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a a(y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        int i10 = a.f56540a[yVar.ordinal()];
        if (i10 == 1) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.f56733c;
        }
        if (i10 == 2) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.f56734d;
        }
        if (i10 == 3) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.f56735e;
        }
        throw new lf.m();
    }
}
