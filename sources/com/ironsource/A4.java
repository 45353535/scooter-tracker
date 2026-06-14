package com.ironsource;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class A4 implements InterfaceC4617x7 {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40181a;

        static {
            int[] iArr = new int[EnumC4597w4.values().length];
            try {
                iArr[EnumC4597w4.IADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4597w4.UADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4597w4.SHARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4597w4.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f40181a = iArr;
        }
    }

    @Override // com.ironsource.InterfaceC4617x7
    @Nullable
    public C4 a(@NotNull Context context, @NotNull EnumC4597w4 source) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        int i10 = a.f40181a[source.ordinal()];
        if (i10 == 1) {
            return new C4648z4(context, "supersonic_shared_preferen");
        }
        if (i10 == 2) {
            return new C4648z4(context, "unityads-installinfo");
        }
        if (i10 == 3) {
            return new C4648z4(context, B4.f40420c);
        }
        if (i10 == 4) {
            return null;
        }
        throw new lf.m();
    }
}
