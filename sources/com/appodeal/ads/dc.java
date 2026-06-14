package com.appodeal.ads;

import com.ironsource.C4240b4;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class dc extends ed implements com.appodeal.ads.networking.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.appodeal.ads.networking.binders.s[] f13255f;

    public dc(String packageName) {
        long segmentId = Appodeal.getSegmentId();
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.f13252c = packageName;
        this.f13253d = segmentId;
        this.f13254e = "install";
        kotlin.jvm.internal.z0 z0Var = new kotlin.jvm.internal.z0(2);
        com.appodeal.ads.networking.binders.s.f14082b.getClass();
        z0Var.b(com.appodeal.ads.networking.binders.s.f14083c.toArray(new com.appodeal.ads.networking.binders.s[0]));
        z0Var.a(com.appodeal.ads.networking.binders.s.f14086f);
        this.f13255f = (com.appodeal.ads.networking.binders.s[]) z0Var.d(new com.appodeal.ads.networking.binders.s[z0Var.c()]);
    }

    @Override // com.appodeal.ads.ed
    public final Object a(Continuation continuation) throws JSONException {
        z8 z8Var = new z8();
        String str = this.f13252c;
        Intrinsics.checkNotNullParameter("id", C4240b4.i.W);
        ((JSONObject) z8Var.f15309b.getValue()).put("id", str);
        Long lE = kotlin.coroutines.jvm.internal.b.e(this.f13253d);
        Intrinsics.checkNotNullParameter("segment_id", C4240b4.i.W);
        ((JSONObject) z8Var.f15309b.getValue()).put("segment_id", lE);
        com.appodeal.ads.networking.binders.s[] sVarArr = this.f13255f;
        return z8Var.a((com.appodeal.ads.networking.binders.s[]) Arrays.copyOf(sVarArr, sVarArr.length), (kotlin.coroutines.jvm.internal.d) continuation);
    }

    @Override // com.appodeal.ads.networking.b0
    public final String c() {
        return this.f13254e;
    }

    @Override // com.appodeal.ads.ed
    public final com.appodeal.ads.networking.binders.s[] d() {
        return this.f13255f;
    }
}
