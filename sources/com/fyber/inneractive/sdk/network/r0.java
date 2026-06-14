package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InneractiveAdRequest f21366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap f21367b;

    public r0(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.serverapi.d dVar) {
        this.f21366a = inneractiveAdRequest;
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f21367b.put(str, str2);
    }
}
