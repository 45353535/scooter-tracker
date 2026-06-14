package com.iab.omid.library.corpmailru.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.corpmailru.walking.a.b;
import com.iab.omid.library.corpmailru.walking.a.d;
import com.iab.omid.library.corpmailru.walking.a.e;
import com.iab.omid.library.corpmailru.walking.a.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b implements b.InterfaceC0391b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f34985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.corpmailru.walking.a.c f34986b;

    public b(com.iab.omid.library.corpmailru.walking.a.c cVar) {
        this.f34986b = cVar;
    }

    public void a() {
        this.f34986b.b(new d(this));
    }

    @Override // com.iab.omid.library.corpmailru.walking.a.b.InterfaceC0391b
    @VisibleForTesting
    public JSONObject b() {
        return this.f34985a;
    }

    @Override // com.iab.omid.library.corpmailru.walking.a.b.InterfaceC0391b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f34985a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f34986b.b(new e(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f34986b.b(new f(this, hashSet, jSONObject, j10));
    }
}
