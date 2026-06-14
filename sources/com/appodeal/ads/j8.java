package com.appodeal.ads;

import com.appodeal.ads.utils.Log;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j8 implements com.appodeal.ads.utils.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f13511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tc f13512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s7 f13513c;

    public j8(l0 l0Var, tc tcVar, s7 s7Var) {
        this.f13511a = l0Var;
        this.f13512b = tcVar;
        this.f13513c = s7Var;
    }

    @Override // com.appodeal.ads.utils.p
    public final void a() {
        Log.debug("ViewAdRenderer", "VisibilityTracker", "onViewShown");
        i2 i2Var = this.f13511a.f13567g;
        tc adRequest = this.f13512b;
        s7 adObject = this.f13513c;
        i2Var.getClass();
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        i2Var.e0(adRequest, adObject, null);
    }

    @Override // com.appodeal.ads.utils.p
    public final void b() {
        Log.debug("ViewAdRenderer", "VisibilityTracker", "onViewTrackingFinished");
        i2 i2Var = this.f13511a.f13567g;
        tc adRequest = this.f13512b;
        s7 adObject = this.f13513c;
        i2Var.getClass();
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        i2Var.Y(adRequest, adObject, null);
    }
}
