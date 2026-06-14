package com.iab.omid.library.bytedance2.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.bytedance2.walking.async.b;
import com.iab.omid.library.bytedance2.walking.async.d;
import com.iab.omid.library.bytedance2.walking.async.e;
import com.iab.omid.library.bytedance2.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b implements b.InterfaceC0383b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f34731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.walking.async.c f34732b;

    public b(com.iab.omid.library.bytedance2.walking.async.c cVar) {
        this.f34732b = cVar;
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0383b
    @VisibleForTesting
    public JSONObject a() {
        return this.f34731a;
    }

    public void b() {
        this.f34732b.b(new d(this));
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0383b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f34731a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f34732b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f34732b.b(new e(this, hashSet, jSONObject, j10));
    }
}
