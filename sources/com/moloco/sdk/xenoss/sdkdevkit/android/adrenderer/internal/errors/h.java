package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import kotlin.jvm.internal.Intrinsics;
import lf.m;

/* JADX INFO: loaded from: classes10.dex */
public abstract class h {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56053a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.f56047b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.f56048c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.f56049d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.f56050e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f56053a = iArr;
        }
    }

    public static final i a(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        int i10 = a.f56053a[gVar.ordinal()];
        if (i10 == 1) {
            return i.f56054b;
        }
        if (i10 == 2) {
            return i.f56055c;
        }
        if (i10 == 3) {
            return i.f56056d;
        }
        if (i10 == 4) {
            return i.f56057e;
        }
        throw new m();
    }

    public static final j b(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        int i10 = a.f56053a[gVar.ordinal()];
        if (i10 == 1) {
            return j.f56060b;
        }
        if (i10 == 2) {
            return j.f56061c;
        }
        if (i10 == 3) {
            return j.f56062d;
        }
        if (i10 == 4) {
            return j.f56063e;
        }
        throw new m();
    }
}
