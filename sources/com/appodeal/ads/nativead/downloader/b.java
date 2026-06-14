package com.appodeal.ads.nativead.downloader;

import com.appodeal.ads.MediaAssets;
import com.appodeal.ads.ext.LogExtKt;
import eg.x1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13848r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f13849s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f13850t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f13851u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MediaAssets f13852v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function1 f13853w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Function0 f13854x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i10, g gVar, MediaAssets mediaAssets, Function1 function1, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f13850t = i10;
        this.f13851u = gVar;
        this.f13852v = mediaAssets;
        this.f13853w = function1;
        this.f13854x = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        b bVar = new b(this.f13850t, this.f13851u, this.f13852v, this.f13853w, this.f13854x, continuation);
        bVar.f13849s = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f13848r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f13849s;
            long j10 = this.f13850t;
            a aVar = new a(this.f13851u, this.f13852v, this.f13853w, this.f13854x, null);
            this.f13849s = coroutineScope;
            this.f13848r = 1;
            obj = x1.e(j10, aVar, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        if (((Unit) obj) == null) {
            this.f13854x.invoke();
            LogExtKt.logInternal$default(null, "Native assets were not loaded by timeout", null, 5, null);
        }
        return Unit.f93236a;
    }
}
