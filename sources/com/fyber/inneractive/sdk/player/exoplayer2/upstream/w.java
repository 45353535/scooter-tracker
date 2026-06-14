package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f23089a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f23090b;

    public final synchronized Map a() {
        try {
            if (this.f23090b == null) {
                this.f23090b = DesugarCollections.unmodifiableMap(new HashMap(this.f23089a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f23090b;
    }
}
