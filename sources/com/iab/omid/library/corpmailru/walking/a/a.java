package com.iab.omid.library.corpmailru.walking.a;

import com.iab.omid.library.corpmailru.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final HashSet<String> f34976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final JSONObject f34977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final long f34978c;

    public a(b.InterfaceC0391b interfaceC0391b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0391b);
        this.f34976a = new HashSet<>(hashSet);
        this.f34977b = jSONObject;
        this.f34978c = j10;
    }
}
