package com.inmobi.media;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.mj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3888mj extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3913nj f39049a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3888mj(C3913nj c3913nj, Continuation continuation) {
        super(2, continuation);
        this.f39049a = c3913nj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3888mj(this.f39049a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3888mj(this.f39049a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        return AbstractC4173y5.a(this.f39049a.f39112a) ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
    }
}
