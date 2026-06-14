package com.appodeal.ads.adapters.iab.utils;

import android.content.Context;
import android.text.TextUtils;
import com.appodeal.ads.utils.InstallTrackingHelper;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ boolean f12315b = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f12316a;

    public final void a(Context context, String str, String str2, long j10, d dVar) {
        if (TextUtils.isEmpty(str)) {
            dVar.a();
            return;
        }
        if (!f12315b && str == null) {
            throw new AssertionError();
        }
        InstallTrackingHelper.addPackageToTrackingList(str2, j10);
        if (!str.equals("appodeal://")) {
            this.f12316a = str;
            dVar.a(null);
            n.g(context, str, new b(dVar));
        } else if (TextUtils.isEmpty(this.f12316a)) {
            dVar.a(new c(this, dVar, context));
        } else {
            n.g(context, this.f12316a, new b(dVar));
        }
    }
}
