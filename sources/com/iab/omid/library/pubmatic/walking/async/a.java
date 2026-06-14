package com.iab.omid.library.pubmatic.walking.async;

import com.iab.omid.library.pubmatic.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f35799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f35800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f35801e;

    public a(b.InterfaceC0417b interfaceC0417b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0417b);
        this.f35799c = new HashSet<>(hashSet);
        this.f35800d = jSONObject;
        this.f35801e = j10;
    }
}
