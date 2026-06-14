package com.iab.omid.library.ironsrc.walking.async;

import com.iab.omid.library.ironsrc.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f35388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f35389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f35390e;

    public a(b.InterfaceC0404b interfaceC0404b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0404b);
        this.f35388c = new HashSet<>(hashSet);
        this.f35389d = jSONObject;
        this.f35390e = j10;
    }
}
