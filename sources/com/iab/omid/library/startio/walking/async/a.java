package com.iab.omid.library.startio.walking.async;

import com.iab.omid.library.startio.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f36063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f36064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f36065e;

    public a(b.InterfaceC0425b interfaceC0425b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0425b);
        this.f36063c = new HashSet<>(hashSet);
        this.f36064d = jSONObject;
        this.f36065e = j10;
    }
}
