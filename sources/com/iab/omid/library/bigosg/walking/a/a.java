package com.iab.omid.library.bigosg.walking.a;

import com.iab.omid.library.bigosg.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final HashSet<String> f34593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final JSONObject f34594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final long f34595c;

    public a(b.InterfaceC0379b interfaceC0379b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0379b);
        this.f34593a = new HashSet<>(hashSet);
        this.f34594b = jSONObject;
        this.f34595c = j10;
    }
}
