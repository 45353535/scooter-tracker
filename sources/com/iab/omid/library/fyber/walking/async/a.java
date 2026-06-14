package com.iab.omid.library.fyber.walking.async;

import com.iab.omid.library.fyber.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f35112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f35113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f35114e;

    public a(b.InterfaceC0395b interfaceC0395b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0395b);
        this.f35112c = new HashSet<>(hashSet);
        this.f35113d = jSONObject;
        this.f35114e = j10;
    }
}
