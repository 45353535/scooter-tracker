package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4207ze extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ae f40049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdSessionConfiguration f40050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdSessionContext f40051c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4207ze(Ae ae2, AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, Continuation continuation) {
        super(2, continuation);
        this.f40049a = ae2;
        this.f40050b = adSessionConfiguration;
        this.f40051c = adSessionContext;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4207ze(this.f40049a, this.f40050b, this.f40051c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4207ze) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        Ae ae2 = this.f40049a;
        AdSessionConfiguration adSessionConfiguration = this.f40050b;
        Intrinsics.checkNotNull(adSessionConfiguration);
        AdSessionContext adSessionContext = this.f40051c;
        int i10 = Ae.f36571i;
        ae2.a(adSessionConfiguration, adSessionContext);
        this.f40049a.b();
        this.f40049a.c();
        return Unit.f93236a;
    }
}
