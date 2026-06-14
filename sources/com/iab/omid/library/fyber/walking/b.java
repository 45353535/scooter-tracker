package com.iab.omid.library.fyber.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.fyber.walking.async.b;
import com.iab.omid.library.fyber.walking.async.d;
import com.iab.omid.library.fyber.walking.async.e;
import com.iab.omid.library.fyber.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b implements b.InterfaceC0395b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f35121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.fyber.walking.async.c f35122b;

    public b(com.iab.omid.library.fyber.walking.async.c cVar) {
        this.f35122b = cVar;
    }

    @Override // com.iab.omid.library.fyber.walking.async.b.InterfaceC0395b
    @VisibleForTesting
    public JSONObject a() {
        return this.f35121a;
    }

    public void b() {
        this.f35122b.b(new d(this));
    }

    @Override // com.iab.omid.library.fyber.walking.async.b.InterfaceC0395b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f35121a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f35122b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f35122b.b(new e(this, hashSet, jSONObject, j10));
    }
}
