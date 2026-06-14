package com.iab.omid.library.mobilefuse.walking.async;

import com.iab.omid.library.mobilefuse.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f35658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f35659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f35660e;

    public a(b.InterfaceC0412b interfaceC0412b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0412b);
        this.f35658c = new HashSet<>(hashSet);
        this.f35659d = jSONObject;
        this.f35660e = j10;
    }
}
