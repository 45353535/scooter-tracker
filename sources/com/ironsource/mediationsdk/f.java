package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.C4340h2;
import com.ironsource.C4460o2;
import com.ironsource.R1;
import com.ironsource.mediationsdk.e;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4460o2 f44026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f44027b;

    public f(@NotNull C4460o2 settings, @NotNull String sessionId) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f44026a = settings;
        this.f44027b = sessionId;
    }

    @Override // com.ironsource.mediationsdk.g
    @NotNull
    public e.a a(@NotNull Context context, @NotNull i auctionRequestParams, @NotNull R1 auctionListener) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        Intrinsics.checkNotNullParameter(auctionListener, "auctionListener");
        JSONObject jSONObjectA = a(context, auctionRequestParams);
        String strA = this.f44026a.a(auctionRequestParams.s());
        return auctionRequestParams.s() ? new C4340h2(auctionListener, new URL(strA), jSONObjectA, auctionRequestParams.t(), this.f44026a) : new e.a(auctionListener, new URL(strA), jSONObjectA, auctionRequestParams.t(), this.f44026a);
    }

    @Override // com.ironsource.mediationsdk.g
    public boolean b() {
        return this.f44026a.g() > 0;
    }

    @Override // com.ironsource.mediationsdk.g
    public boolean a() {
        return this.f44026a.n();
    }

    private final JSONObject a(Context context, i iVar) throws JSONException {
        JSONObject jSONObjectA = d.b().a(iVar);
        Intrinsics.checkNotNullExpressionValue(jSONObjectA, "getInstance().enrichToke…low(auctionRequestParams)");
        return jSONObjectA;
    }
}
