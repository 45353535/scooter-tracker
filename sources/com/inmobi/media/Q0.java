package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class Q0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f37557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AdResponse f37558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f37559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f37562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ R0 f37563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f37564h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(R0 r02, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f37563g = r02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37562f = obj;
        this.f37564h |= Integer.MIN_VALUE;
        return this.f37563g.a(null, null, this);
    }
}
