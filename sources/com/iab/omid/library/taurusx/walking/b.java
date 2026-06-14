package com.iab.omid.library.taurusx.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.taurusx.walking.async.b;
import com.iab.omid.library.taurusx.walking.async.d;
import com.iab.omid.library.taurusx.walking.async.e;
import com.iab.omid.library.taurusx.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b implements b.InterfaceC0429b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f36200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.taurusx.walking.async.c f36201b;

    public b(com.iab.omid.library.taurusx.walking.async.c cVar) {
        this.f36201b = cVar;
    }

    @Override // com.iab.omid.library.taurusx.walking.async.b.InterfaceC0429b
    @VisibleForTesting
    public JSONObject a() {
        return this.f36200a;
    }

    public void b() {
        this.f36201b.b(new d(this));
    }

    @Override // com.iab.omid.library.taurusx.walking.async.b.InterfaceC0429b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f36200a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f36201b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f36201b.b(new e(this, hashSet, jSONObject, j10));
    }
}
