package com.iab.omid.library.bigosg.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.bigosg.walking.a.b;
import com.iab.omid.library.bigosg.walking.a.d;
import com.iab.omid.library.bigosg.walking.a.e;
import com.iab.omid.library.bigosg.walking.a.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b implements b.InterfaceC0379b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f34602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.bigosg.walking.a.c f34603b;

    public b(com.iab.omid.library.bigosg.walking.a.c cVar) {
        this.f34603b = cVar;
    }

    public void a() {
        this.f34603b.b(new d(this));
    }

    @Override // com.iab.omid.library.bigosg.walking.a.b.InterfaceC0379b
    @VisibleForTesting
    public JSONObject b() {
        return this.f34602a;
    }

    @Override // com.iab.omid.library.bigosg.walking.a.b.InterfaceC0379b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f34602a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f34603b.b(new e(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f34603b.b(new f(this, hashSet, jSONObject, j10));
    }
}
