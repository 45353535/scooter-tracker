package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3820k1 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3845l1 f38847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f38849c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3820k1(AbstractC3845l1 abstractC3845l1, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f38847a = abstractC3845l1;
        this.f38848b = str;
        this.f38849c = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3820k1(this.f38847a, this.f38848b, this.f38849c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3820k1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        com.inmobi.media.ads.network.common.model.Ad adB = this.f38847a.b(0);
        if (adB == null || !Intrinsics.areEqual(adB.getImpressionId(), this.f38848b)) {
            C3903n9 c3903n9 = this.f38847a.f38923i;
            if (c3903n9 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c3903n9.b("l1", "Impression ID is null for saveBlob");
            }
        } else {
            this.f38847a.a(adB, this.f38849c);
            C3903n9 c3903n92 = this.f38847a.f38923i;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c3903n92.c("l1", "Updated blob " + this.f38849c);
            }
        }
        return Unit.f93236a;
    }
}
