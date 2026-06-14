package com.iab.omid.library.pubnativenet.walking.async;

import com.iab.omid.library.pubnativenet.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f35934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f35935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f35936e;

    public a(b.InterfaceC0421b interfaceC0421b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0421b);
        this.f35934c = new HashSet<>(hashSet);
        this.f35935d = jSONObject;
        this.f35936e = j10;
    }
}
