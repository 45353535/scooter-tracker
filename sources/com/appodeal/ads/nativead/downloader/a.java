package com.appodeal.ads.nativead.downloader;

import com.appodeal.ads.MediaAssets;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f13841r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13842s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f13843t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f13844u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MediaAssets f13845v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function1 f13846w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Function0 f13847x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, MediaAssets mediaAssets, Function1 function1, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f13844u = gVar;
        this.f13845v = mediaAssets;
        this.f13846w = function1;
        this.f13847x = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        a aVar = new a(this.f13844u, this.f13845v, this.f13846w, this.f13847x, continuation);
        aVar.f13843t = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0128  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.nativead.downloader.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
