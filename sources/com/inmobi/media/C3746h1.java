package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C3746h1;
import com.inmobi.media.W;
import com.inmobi.media.ads.network.common.model.AdResponse;
import kotlin.Lazy;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3746h1 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC3845l1 f38679b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3746h1(AbstractC3845l1 abstractC3845l1, Continuation continuation) {
        super(2, continuation);
        this.f38679b = abstractC3845l1;
    }

    public static final Unit a(AbstractC3845l1 abstractC3845l1, W w10) {
        AbstractC3845l1.a(abstractC3845l1, w10);
        return Unit.f93236a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3746h1(this.f38679b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3746h1(this.f38679b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38678a;
        try {
            if (i10 != 0) {
                try {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                } catch (Throwable th2) {
                    this.f38679b.b((byte) 0);
                    throw th2;
                }
            } else {
                kotlin.d.b(obj);
                Yn yn = new Yn(this.f38679b.G(), this.f38679b.f38923i);
                final AbstractC3845l1 abstractC3845l1 = this.f38679b;
                Function1 function1 = new Function1() { // from class: w3.z7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return C3746h1.a(abstractC3845l1, (W) obj2);
                    }
                };
                this.f38678a = 1;
                obj = yn.a(function1, this);
                if (obj == objG) {
                    return objG;
                }
            }
            AdResponse adResponse = (AdResponse) obj;
            AbstractC3845l1 abstractC3845l12 = this.f38679b;
            C3903n9 c3903n9 = abstractC3845l12.f38923i;
            if (c3903n9 != null) {
                C4093v0 c4093v0 = abstractC3845l12.f38926l;
                AbstractC3643d0.a(c4093v0.f39715e, c4093v0.f39716f, adResponse, c3903n9);
            }
            this.f38679b.a(adResponse);
        } catch (Y e10) {
            AbstractC3845l1.a(this.f38679b, e10);
        } catch (Throwable th3) {
            C3903n9 c3903n92 = this.f38679b.f38923i;
            if (c3903n92 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c3903n92.a("l1", "doAdLoadWork: " + th3);
            }
            Lazy lazy = P9.f37527a;
            P9.a(new L2(th3));
            AbstractC3845l1 abstractC3845l13 = this.f38679b;
            abstractC3845l13.getClass();
            abstractC3845l13.b(MapsKt.mutableMapOf(TuplesKt.to("errorCode", (short) 2363)));
            abstractC3845l13.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
        }
        this.f38679b.b((byte) 0);
        return Unit.f93236a;
    }
}
