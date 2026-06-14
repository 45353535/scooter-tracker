package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f34336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f34337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f34338e;

    public a(b.InterfaceC0372b interfaceC0372b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0372b);
        this.f34336c = new HashSet<>(hashSet);
        this.f34337d = jSONObject;
        this.f34338e = j10;
    }
}
