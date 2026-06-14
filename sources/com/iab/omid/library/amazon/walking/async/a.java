package com.iab.omid.library.amazon.walking.async;

import com.iab.omid.library.amazon.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f34201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f34202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f34203e;

    public a(b.InterfaceC0368b interfaceC0368b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0368b);
        this.f34201c = new HashSet<>(hashSet);
        this.f34202d = jSONObject;
        this.f34203e = j10;
    }
}
