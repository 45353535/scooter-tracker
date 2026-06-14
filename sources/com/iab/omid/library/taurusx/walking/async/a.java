package com.iab.omid.library.taurusx.walking.async;

import com.iab.omid.library.taurusx.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f36191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f36192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f36193e;

    public a(b.InterfaceC0429b interfaceC0429b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0429b);
        this.f36191c = new HashSet<>(hashSet);
        this.f36192d = jSONObject;
        this.f36193e = j10;
    }
}
