package com.iab.omid.library.chartboost.walking.async;

import com.iab.omid.library.chartboost.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f34863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f34864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f34865e;

    public a(b.InterfaceC0388b interfaceC0388b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0388b);
        this.f34863c = new HashSet<>(hashSet);
        this.f34864d = jSONObject;
        this.f34865e = j10;
    }
}
