package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4626y implements InterfaceC4395k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final M8 f45849a;

    public C4626y(@NotNull M8 sessionDepthService) {
        Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        this.f45849a = sessionDepthService;
    }

    @Override // com.ironsource.InterfaceC4395k7
    public void a(@NotNull Map<String, Object> output) {
        Intrinsics.checkNotNullParameter(output, "output");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(N6.J0, Integer.valueOf(this.f45849a.a(LevelPlay.AdFormat.INTERSTITIAL)));
        output.put("interstitial", linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(N6.J0, Integer.valueOf(this.f45849a.a(LevelPlay.AdFormat.REWARDED)));
        output.put(N6.G0, linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(N6.J0, Integer.valueOf(this.f45849a.a(LevelPlay.AdFormat.BANNER)));
        output.put("banner", linkedHashMap3);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put(N6.J0, Integer.valueOf(this.f45849a.a(LevelPlay.AdFormat.NATIVE_AD)));
        output.put("nativeAd", linkedHashMap4);
    }
}
