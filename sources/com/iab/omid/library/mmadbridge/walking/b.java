package com.iab.omid.library.mmadbridge.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.mmadbridge.walking.async.b;
import com.iab.omid.library.mmadbridge.walking.async.d;
import com.iab.omid.library.mmadbridge.walking.async.e;
import com.iab.omid.library.mmadbridge.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b implements b.InterfaceC0408b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f35532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.walking.async.c f35533b;

    public b(com.iab.omid.library.mmadbridge.walking.async.c cVar) {
        this.f35533b = cVar;
    }

    @Override // com.iab.omid.library.mmadbridge.walking.async.b.InterfaceC0408b
    @VisibleForTesting
    public JSONObject a() {
        return this.f35532a;
    }

    public void b() {
        this.f35533b.b(new d(this));
    }

    @Override // com.iab.omid.library.mmadbridge.walking.async.b.InterfaceC0408b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f35532a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f35533b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f35533b.b(new e(this, hashSet, jSONObject, j10));
    }
}
