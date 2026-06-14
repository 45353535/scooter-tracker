package com.inmobi.media;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3771i1 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3845l1 f38729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F2 f38731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f38732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f38733e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3771i1(AbstractC3845l1 abstractC3845l1, String str, F2 f22, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.f38729a = abstractC3845l1;
        this.f38730b = str;
        this.f38731c = f22;
        this.f38732d = str2;
        this.f38733e = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3771i1(this.f38729a, this.f38730b, this.f38731c, this.f38732d, this.f38733e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3771i1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        try {
            com.inmobi.media.ads.network.common.model.Ad adB = this.f38729a.b(0);
            if (adB == null || !Intrinsics.areEqual(adB.getImpressionId(), this.f38730b)) {
                C3903n9 c3903n9 = this.f38729a.f38923i;
                if (c3903n9 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c3903n9.c("l1", "Returning blob as empty string");
                }
                ((GestureDetectorOnGestureListenerC3635ci) this.f38731c).c(this.f38732d, this.f38733e, "");
            } else {
                String webVast = adB.getWebVast();
                ((GestureDetectorOnGestureListenerC3635ci) this.f38731c).c(this.f38732d, this.f38733e, webVast);
                C3903n9 c3903n92 = this.f38729a.f38923i;
                if (c3903n92 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c3903n92.c("l1", "Returning blob " + webVast);
                }
            }
        } catch (Exception e10) {
            C3903n9 c3903n93 = this.f38729a.f38923i;
            if (c3903n93 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c3903n93.a("l1", "Exception while getBlob", e10);
            }
            Lazy lazy = P9.f37527a;
            AbstractC3779i9.a(e10);
        }
        return Unit.f93236a;
    }
}
