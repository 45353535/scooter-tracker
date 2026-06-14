package com.inmobi.media;

import com.inmobi.media.C3756hb;
import com.inmobi.media.W;
import com.inmobi.media.ads.network.common.model.AdResponse;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.hb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3756hb extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3564a f38696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3781ib f38697c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3756hb(C3564a c3564a, AbstractC3781ib abstractC3781ib, Continuation continuation) {
        super(2, continuation);
        this.f38696b = c3564a;
        this.f38697c = abstractC3781ib;
    }

    public static final Unit a(AbstractC3781ib abstractC3781ib, W w10) {
        abstractC3781ib.f38759m.a(w10);
        return Unit.f93236a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3756hb(this.f38696b, this.f38697c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3756hb(this.f38696b, this.f38697c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38695a;
        try {
            if (i10 == 0) {
                kotlin.d.b(obj);
                C3564a c3564a = this.f38696b;
                final AbstractC3781ib abstractC3781ib = this.f38697c;
                Function1 function1 = new Function1() { // from class: w3.b8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return C3756hb.a(abstractC3781ib, (W) obj2);
                    }
                };
                this.f38695a = 1;
                obj = c3564a.a(function1, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            AdResponse adResponse = (AdResponse) obj;
            this.f38697c.f38475a.getClass();
            AbstractC3781ib abstractC3781ib2 = this.f38697c;
            AbstractC3643d0.a("native", abstractC3781ib2.f38478d.f37147g, adResponse, abstractC3781ib2.f38479e);
            C3903n9 c3903n9 = this.f38697c.f38479e;
            if (c3903n9 != null) {
                c3903n9.a("AUM-LoadResponseState", "AdResponse Parse Success");
            }
            this.f38697c.a(adResponse);
        } catch (Y e10) {
            C3903n9 c3903n92 = this.f38697c.f38479e;
            if (c3903n92 != null) {
                c3903n92.b("AUM-LoadResponseState", "AdResponse Parse Failure " + e10);
            }
            AbstractC3781ib abstractC3781ib3 = this.f38697c;
            abstractC3781ib3.getClass();
            V v10 = e10.f38018b;
            if (v10 instanceof Pi) {
                C3869m0 c3869m0 = abstractC3781ib3.f38481g;
                eg.i.d(c3869m0.f38999a, null, null, new C3844l0(c3869m0, null), 3, null);
                abstractC3781ib3.a(MapsKt.mutableMapOf(TuplesKt.to("errorCode", (short) 0)), e10.f38017a);
            } else if (v10 instanceof J6) {
                abstractC3781ib3.a(MapsKt.mutableMapOf(TuplesKt.to("errorCode", Short.valueOf(((J6) v10).f37108a))), e10.f38017a);
            } else if (v10 instanceof K6) {
                abstractC3781ib3.a(MapsKt.mutableMapOf(TuplesKt.to("errorCode", Short.valueOf((short) ((K6) v10).f37210a))), e10.f38017a);
            } else {
                if (!(v10 instanceof Ni)) {
                    throw new lf.m();
                }
                abstractC3781ib3.a(((Ni) v10).f37457a, e10.f38017a);
            }
        }
        return Unit.f93236a;
    }
}
