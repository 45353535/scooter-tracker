package com.iab.omid.library.ironsrc.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.ironsrc.walking.async.b;
import com.iab.omid.library.ironsrc.walking.async.d;
import com.iab.omid.library.ironsrc.walking.async.e;
import com.iab.omid.library.ironsrc.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b implements b.InterfaceC0404b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f35397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.walking.async.c f35398b;

    public b(com.iab.omid.library.ironsrc.walking.async.c cVar) {
        this.f35398b = cVar;
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.b.InterfaceC0404b
    @VisibleForTesting
    public JSONObject a() {
        return this.f35397a;
    }

    public void b() {
        this.f35398b.b(new d(this));
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.b.InterfaceC0404b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f35397a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f35398b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f35398b.b(new e(this, hashSet, jSONObject, j10));
    }
}
