package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class I3 {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41077a;

        static {
            int[] iArr = new int[N3.values().length];
            try {
                iArr[N3.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N3.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[N3.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f41077a = iArr;
        }
    }

    public final int a(@NotNull N3 cappingType) {
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        int i10 = a.f41077a[cappingType.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return 3000;
        }
        if (i10 == 3) {
            return 3001;
        }
        throw new lf.m();
    }
}
