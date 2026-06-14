package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class Bc extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Cc f36618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdSessionConfiguration f36619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdSessionContext f36620c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bc(Cc cc2, AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, Continuation continuation) {
        super(2, continuation);
        this.f36618a = cc2;
        this.f36619b = adSessionConfiguration;
        this.f36620c = adSessionContext;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Bc(this.f36618a, this.f36619b, this.f36620c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Bc) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        Cc cc2 = this.f36618a;
        AdSessionConfiguration adSessionConfiguration = this.f36619b;
        Intrinsics.checkNotNull(adSessionConfiguration);
        AdSessionContext adSessionContext = this.f36620c;
        int i10 = Cc.f36669h;
        cc2.a(adSessionConfiguration, adSessionContext);
        this.f36618a.b();
        this.f36618a.c();
        return Unit.f93236a;
    }
}
