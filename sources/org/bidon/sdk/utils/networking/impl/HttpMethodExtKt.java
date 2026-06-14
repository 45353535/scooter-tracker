package org.bidon.sdk.utils.networking.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.bidon.sdk.utils.networking.Method;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"asRequestMethod", "", "Lorg/bidon/sdk/utils/networking/Method;", "bidon_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class HttpMethodExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Method.values().length];
            try {
                iArr[Method.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Method.POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Method.PUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Method.DELETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final String asRequestMethod(@NotNull Method method) {
        Intrinsics.checkNotNullParameter(method, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[method.ordinal()];
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return "PUT";
        }
        if (i10 == 4) {
            return "DELETE";
        }
        throw new m();
    }
}
