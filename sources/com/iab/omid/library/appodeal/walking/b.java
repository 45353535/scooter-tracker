package com.iab.omid.library.appodeal.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.appodeal.walking.async.b;
import com.iab.omid.library.appodeal.walking.async.d;
import com.iab.omid.library.appodeal.walking.async.e;
import com.iab.omid.library.appodeal.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b implements b.InterfaceC0376b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f34481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.appodeal.walking.async.c f34482b;

    public b(com.iab.omid.library.appodeal.walking.async.c cVar) {
        this.f34482b = cVar;
    }

    @Override // com.iab.omid.library.appodeal.walking.async.b.InterfaceC0376b
    @VisibleForTesting
    public JSONObject a() {
        return this.f34481a;
    }

    public void b() {
        this.f34482b.b(new d(this));
    }

    @Override // com.iab.omid.library.appodeal.walking.async.b.InterfaceC0376b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f34481a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f34482b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f34482b.b(new e(this, hashSet, jSONObject, j10));
    }
}
