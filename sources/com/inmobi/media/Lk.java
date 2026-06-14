package com.inmobi.media;

import kotlinx.coroutines.sync.Mutex;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Lk extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONObject f37300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Mutex f37301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f37302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Mk f37303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37304e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lk(Mk mk, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f37303d = mk;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37302c = obj;
        this.f37304e |= Integer.MIN_VALUE;
        return this.f37303d.a(null, this);
    }
}
