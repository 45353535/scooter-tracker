package com.iab.omid.library.mmadbridge.walking.async;

import com.iab.omid.library.mmadbridge.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f35523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f35524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f35525e;

    public a(b.InterfaceC0408b interfaceC0408b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0408b);
        this.f35523c = new HashSet<>(hashSet);
        this.f35524d = jSONObject;
        this.f35525e = j10;
    }
}
