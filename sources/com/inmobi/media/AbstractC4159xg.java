package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.xg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4159xg extends Sn {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AdConfig.ViewabilityConfig f39932l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4159xg(AdConfig.ViewabilityConfig viewabilityConfig, byte b10, InterfaceC3878m9 interfaceC3878m9) {
        super(new WeakHashMap(10), new Handler(Looper.getMainLooper()), b10, interfaceC3878m9);
        C3901n7 visibilityChecker = C3976q7.f39351k;
        Intrinsics.checkNotNullParameter(visibilityChecker, "visibilityChecker");
        Intrinsics.checkNotNullParameter(visibilityChecker, "visibilityChecker");
        this.f39932l = viewabilityConfig;
    }
}
