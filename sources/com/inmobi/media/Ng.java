package com.inmobi.media;

import kotlinx.coroutines.sync.Mutex;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Ng extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONObject f37451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Mutex f37452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f37453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Og f37454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37455e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ng(Og og2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f37454d = og2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37453c = obj;
        this.f37455e |= Integer.MIN_VALUE;
        return this.f37454d.a((JSONObject) null, this);
    }
}
