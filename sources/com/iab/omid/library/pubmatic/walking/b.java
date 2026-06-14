package com.iab.omid.library.pubmatic.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.pubmatic.walking.async.b;
import com.iab.omid.library.pubmatic.walking.async.d;
import com.iab.omid.library.pubmatic.walking.async.e;
import com.iab.omid.library.pubmatic.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b implements b.InterfaceC0417b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f35808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.pubmatic.walking.async.c f35809b;

    public b(com.iab.omid.library.pubmatic.walking.async.c cVar) {
        this.f35809b = cVar;
    }

    @Override // com.iab.omid.library.pubmatic.walking.async.b.InterfaceC0417b
    @VisibleForTesting
    public JSONObject a() {
        return this.f35808a;
    }

    public void b() {
        this.f35809b.b(new d(this));
    }

    @Override // com.iab.omid.library.pubmatic.walking.async.b.InterfaceC0417b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f35808a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f35809b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f35809b.b(new e(this, hashSet, jSONObject, j10));
    }
}
