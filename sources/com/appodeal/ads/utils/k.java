package com.appodeal.ads.utils;

import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.utils.exception_handler.AppodealException;
import com.appodeal.ads.z6;
import eg.e0;
import eg.o0;
import java.util.EnumMap;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumMap f15028a = new EnumMap(AdType.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CoroutineScope f15029b = kotlinx.coroutines.i.a(o0.a().plus(new e0("ApdShownCallbackDetector")));

    public static AppodealException a(AdType adType, String str) {
        return new AppodealException(z6.d(str) + " " + adType.getDisplayName() + " was not shown");
    }
}
