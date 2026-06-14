package com.iab.omid.library.unity3d.walking.async;

import com.iab.omid.library.unity3d.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f36319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f36320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f36321e;

    public a(b.InterfaceC0433b interfaceC0433b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0433b);
        this.f36319c = new HashSet<>(hashSet);
        this.f36320d = jSONObject;
        this.f36321e = j10;
    }
}
