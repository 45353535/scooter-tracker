package com.iab.omid.library.chartboost.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.chartboost.walking.async.b;
import com.iab.omid.library.chartboost.walking.async.d;
import com.iab.omid.library.chartboost.walking.async.e;
import com.iab.omid.library.chartboost.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b implements b.InterfaceC0388b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f34872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.chartboost.walking.async.c f34873b;

    public b(com.iab.omid.library.chartboost.walking.async.c cVar) {
        this.f34873b = cVar;
    }

    @Override // com.iab.omid.library.chartboost.walking.async.b.InterfaceC0388b
    @VisibleForTesting
    public JSONObject a() {
        return this.f34872a;
    }

    public void b() {
        this.f34873b.b(new d(this));
    }

    @Override // com.iab.omid.library.chartboost.walking.async.b.InterfaceC0388b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f34872a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f34873b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f34873b.b(new e(this, hashSet, jSONObject, j10));
    }
}
