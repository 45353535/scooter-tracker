package com.fyber.inneractive.sdk.factories;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f20614a = new HashMap();

    public final void a(com.fyber.inneractive.sdk.response.a aVar, e eVar) {
        if (this.f20614a.containsKey(aVar)) {
            IAlog.f("Handler already exists for ad type %s! : %s", aVar, this.f20614a.get(aVar));
        } else {
            this.f20614a.put(aVar, eVar);
        }
    }
}
