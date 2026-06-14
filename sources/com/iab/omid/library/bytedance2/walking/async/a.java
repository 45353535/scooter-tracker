package com.iab.omid.library.bytedance2.walking.async;

import com.iab.omid.library.bytedance2.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f34722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f34723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f34724e;

    public a(b.InterfaceC0383b interfaceC0383b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0383b);
        this.f34722c = new HashSet<>(hashSet);
        this.f34723d = jSONObject;
        this.f34724e = j10;
    }
}
