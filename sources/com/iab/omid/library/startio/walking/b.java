package com.iab.omid.library.startio.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.startio.walking.async.b;
import com.iab.omid.library.startio.walking.async.d;
import com.iab.omid.library.startio.walking.async.e;
import com.iab.omid.library.startio.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b implements b.InterfaceC0425b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f36072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.startio.walking.async.c f36073b;

    public b(com.iab.omid.library.startio.walking.async.c cVar) {
        this.f36073b = cVar;
    }

    @Override // com.iab.omid.library.startio.walking.async.b.InterfaceC0425b
    @VisibleForTesting
    public JSONObject a() {
        return this.f36072a;
    }

    public void b() {
        this.f36073b.b(new d(this));
    }

    @Override // com.iab.omid.library.startio.walking.async.b.InterfaceC0425b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f36072a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f36073b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f36073b.b(new e(this, hashSet, jSONObject, j10));
    }
}
