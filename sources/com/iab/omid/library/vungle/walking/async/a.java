package com.iab.omid.library.vungle.walking.async;

import com.iab.omid.library.vungle.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f36460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f36461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f36462e;

    public a(b.InterfaceC0438b interfaceC0438b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0438b);
        this.f36460c = new HashSet<>(hashSet);
        this.f36461d = jSONObject;
        this.f36462e = j10;
    }
}
