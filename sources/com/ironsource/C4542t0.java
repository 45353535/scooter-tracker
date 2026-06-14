package com.ironsource;

import com.ironsource.C4524s;
import com.ironsource.InterfaceC4499q7;
import com.unity3d.mediation.LevelPlay;
import java.util.Iterator;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4542t0 implements K3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4553tb f45428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<LevelPlay.AdFormat, C4524s> f45429b;

    public C4542t0(@NotNull C4553tb tools, @NotNull Map<LevelPlay.AdFormat, C4524s> adFormatsConfigurations) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adFormatsConfigurations, "adFormatsConfigurations");
        this.f45428a = tools;
        this.f45429b = adFormatsConfigurations;
    }

    private final void b(InterfaceC4499q7.a aVar, String str, C4524s.d dVar) throws JSONException {
        Xc xcE = dVar.e();
        if (xcE != null) {
            N3 n32 = N3.Pacing;
            a(aVar.a(str, n32, new E3(xcE.a(), xcE.b(), xcE.c())), str, n32);
        }
    }

    @Override // com.ironsource.K3
    public void a(@NotNull InterfaceC4499q7.a cappingService) {
        Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        Iterator<Map.Entry<LevelPlay.AdFormat, C4524s>> it = this.f45429b.entrySet().iterator();
        while (it.hasNext()) {
            for (Map.Entry<String, C4524s.d> entry : it.next().getValue().a().entrySet()) {
                String key = entry.getKey();
                C4524s.d value = entry.getValue();
                a(cappingService, key, value);
                b(cappingService, key, value);
            }
        }
    }

    private final void a(InterfaceC4499q7.a aVar, String str, C4524s.d dVar) throws JSONException {
        H3 h3B = dVar.b();
        if (h3B != null) {
            N3 n32 = N3.ShowCount;
            a(aVar.a(str, n32, new E3(h3B.a(), h3B.b(), h3B.c())), str, n32);
        }
    }

    private final void a(Object obj, String str, N3 n32) throws JSONException {
        Throwable thG = Result.g(obj);
        if (thG != null) {
            this.f45428a.a(str, new I3().a(n32), thG.getMessage());
        }
    }
}
