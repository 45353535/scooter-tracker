package com.iab.omid.library.amazon.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.amazon.walking.async.b;
import com.iab.omid.library.amazon.walking.async.d;
import com.iab.omid.library.amazon.walking.async.e;
import com.iab.omid.library.amazon.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b implements b.InterfaceC0368b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f34210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.amazon.walking.async.c f34211b;

    public b(com.iab.omid.library.amazon.walking.async.c cVar) {
        this.f34211b = cVar;
    }

    @Override // com.iab.omid.library.amazon.walking.async.b.InterfaceC0368b
    @VisibleForTesting
    public JSONObject a() {
        return this.f34210a;
    }

    public void b() {
        this.f34211b.b(new d(this));
    }

    @Override // com.iab.omid.library.amazon.walking.async.b.InterfaceC0368b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f34210a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f34211b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f34211b.b(new e(this, hashSet, jSONObject, j10));
    }
}
