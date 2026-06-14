package com.iab.omid.library.inmobi.walking.async;

import com.iab.omid.library.inmobi.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f35253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f35254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f35255e;

    public a(b.InterfaceC0400b interfaceC0400b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0400b);
        this.f35253c = new HashSet<>(hashSet);
        this.f35254d = jSONObject;
        this.f35255e = j10;
    }
}
