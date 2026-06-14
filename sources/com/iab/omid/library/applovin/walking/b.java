package com.iab.omid.library.applovin.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.applovin.walking.async.b;
import com.iab.omid.library.applovin.walking.async.d;
import com.iab.omid.library.applovin.walking.async.e;
import com.iab.omid.library.applovin.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b implements b.InterfaceC0372b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f34345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.applovin.walking.async.c f34346b;

    public b(com.iab.omid.library.applovin.walking.async.c cVar) {
        this.f34346b = cVar;
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0372b
    @VisibleForTesting
    public JSONObject a() {
        return this.f34345a;
    }

    public void b() {
        this.f34346b.b(new d(this));
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0372b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f34345a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f34346b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f34346b.b(new e(this, hashSet, jSONObject, j10));
    }
}
