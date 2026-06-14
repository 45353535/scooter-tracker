package com.ironsource;

import com.ironsource.C4524s;
import com.ironsource.K7;
import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.gd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4334gd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4553tb f43190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<LevelPlay.AdFormat, C4524s> f43191b;

    public C4334gd(@NotNull C4553tb tools, @NotNull Map<LevelPlay.AdFormat, C4524s> adFormatsConfigurations) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adFormatsConfigurations, "adFormatsConfigurations");
        this.f43190a = tools;
        this.f43191b = adFormatsConfigurations;
    }

    private final void b(K7.a aVar, String str, LevelPlay.AdFormat adFormat, C4524s.d dVar) throws JSONException {
        N3 n32 = N3.Delivery;
        O4 o4C = dVar.c();
        a(aVar.a(str, adFormat, n32, new E3(o4C != null ? Boolean.valueOf(o4C.a()) : null, null, null, 6, null)), str, adFormat, n32);
    }

    private final void c(K7.a aVar, String str, LevelPlay.AdFormat adFormat, C4524s.d dVar) throws JSONException {
        Xc xcE = dVar.e();
        if (xcE != null) {
            N3 n32 = N3.Pacing;
            a(aVar.a(str, adFormat, n32, new E3(xcE.a(), xcE.b(), M3.Second)), str, adFormat, n32);
        }
    }

    public final void a(@NotNull K7.a cappingService) {
        Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        for (Map.Entry<LevelPlay.AdFormat, C4524s> entry : this.f43191b.entrySet()) {
            LevelPlay.AdFormat key = entry.getKey();
            for (Map.Entry<String, C4524s.d> entry2 : entry.getValue().c().entrySet()) {
                String key2 = entry2.getKey();
                C4524s.d value = entry2.getValue();
                b(cappingService, key2, key, value);
                a(cappingService, key2, key, value);
                c(cappingService, key2, key, value);
            }
        }
    }

    private final void a(K7.a aVar, String str, LevelPlay.AdFormat adFormat, C4524s.d dVar) throws JSONException {
        H3 h3B = dVar.b();
        if (h3B != null) {
            N3 n32 = N3.ShowCount;
            a(aVar.a(str, adFormat, n32, new E3(h3B.a(), h3B.b(), h3B.c())), str, adFormat, n32);
        }
    }

    private final void a(Object obj, String str, LevelPlay.AdFormat adFormat, N3 n32) throws JSONException {
        Throwable thG = Result.g(obj);
        if (thG != null) {
            this.f43190a.a(str, adFormat, new I3().a(n32), thG.getMessage());
        }
    }
}
