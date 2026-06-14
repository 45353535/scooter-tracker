package com.appodeal.ads.adapters.iab.utils;

import com.appodeal.ads.networking.LoadingError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final LoadingError a(b2.b error) {
        Intrinsics.checkNotNullParameter(error, "error");
        int iC = error.c();
        if (iC != 0) {
            if (iC == 1) {
                return LoadingError.ConnectionError;
            }
            if (iC == 2) {
                return LoadingError.IncorrectAdunit;
            }
            if (iC == 3) {
                return LoadingError.IncorrectCreative;
            }
            if (iC == 5) {
                return LoadingError.TimeoutError;
            }
            if (iC != 6) {
                return LoadingError.NoFill;
            }
        }
        return LoadingError.InternalError;
    }

    public static final boolean b(String str) {
        return !(str == null || StringsKt.y0(str));
    }
}
