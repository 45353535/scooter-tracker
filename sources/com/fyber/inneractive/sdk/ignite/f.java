package com.fyber.inneractive.sdk.ignite;

import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f21065a;

    public f(String str) {
        this.f21065a = str;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        String str = (String) obj;
        IAlog.a("Hit Request: Hitting URL finished: %s", this.f21065a);
        if (exc == null) {
            IAlog.a("Hit Request: Hitting URL response code: %s", str);
        } else {
            IAlog.a("Hit Request: Hitting URL failed: %s", exc);
        }
    }
}
