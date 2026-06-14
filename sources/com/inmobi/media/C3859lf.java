package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: renamed from: com.inmobi.media.lf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3859lf extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdConfig.OmidConfig f38976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f38977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f38978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3959pf f38979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38980e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3859lf(C3959pf c3959pf, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f38979d = c3959pf;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38978c = obj;
        this.f38980e |= Integer.MIN_VALUE;
        return this.f38979d.a(this);
    }
}
