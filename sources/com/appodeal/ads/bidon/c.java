package com.appodeal.ads.bidon;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f13150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f13151b;

    public c() {
        g endpointValidator = new g();
        Intrinsics.checkNotNullParameter(endpointValidator, "endpointValidator");
        this.f13150a = endpointValidator;
        this.f13151b = new a();
    }

    public final void a(String endpoint) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        if (this.f13150a.b(endpoint)) {
            this.f13151b.getClass();
            a aVarA = a.a(endpoint);
            Intrinsics.checkNotNullParameter(aVarA, "<set-?>");
            this.f13151b = aVarA;
            return;
        }
        Log.e("Appodeal", "SDK-Public [Set]: Invalid Bidon endpoint: \"" + endpoint + "\", value will not be set");
    }
}
