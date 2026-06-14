package com.iab.omid.library.appodeal.walking.async;

import com.iab.omid.library.appodeal.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f34472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f34473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f34474e;

    public a(b.InterfaceC0376b interfaceC0376b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0376b);
        this.f34472c = new HashSet<>(hashSet);
        this.f34473d = jSONObject;
        this.f34474e = j10;
    }
}
