package com.iab.omid.library.unity3d.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.unity3d.walking.async.b;
import com.iab.omid.library.unity3d.walking.async.d;
import com.iab.omid.library.unity3d.walking.async.e;
import com.iab.omid.library.unity3d.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b implements b.InterfaceC0433b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f36328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.unity3d.walking.async.c f36329b;

    public b(com.iab.omid.library.unity3d.walking.async.c cVar) {
        this.f36329b = cVar;
    }

    @Override // com.iab.omid.library.unity3d.walking.async.b.InterfaceC0433b
    @VisibleForTesting
    public JSONObject a() {
        return this.f36328a;
    }

    public void b() {
        this.f36329b.b(new d(this));
    }

    @Override // com.iab.omid.library.unity3d.walking.async.b.InterfaceC0433b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f36328a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f36329b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f36329b.b(new e(this, hashSet, jSONObject, j10));
    }
}
