package com.iab.omid.library.mobilefuse.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.mobilefuse.walking.async.b;
import com.iab.omid.library.mobilefuse.walking.async.d;
import com.iab.omid.library.mobilefuse.walking.async.e;
import com.iab.omid.library.mobilefuse.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b implements b.InterfaceC0412b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f35667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.mobilefuse.walking.async.c f35668b;

    public b(com.iab.omid.library.mobilefuse.walking.async.c cVar) {
        this.f35668b = cVar;
    }

    @Override // com.iab.omid.library.mobilefuse.walking.async.b.InterfaceC0412b
    @VisibleForTesting
    public JSONObject a() {
        return this.f35667a;
    }

    public void b() {
        this.f35668b.b(new d(this));
    }

    @Override // com.iab.omid.library.mobilefuse.walking.async.b.InterfaceC0412b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f35667a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f35668b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f35668b.b(new e(this, hashSet, jSONObject, j10));
    }
}
