package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class Q6 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R6 f37581b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q6(R6 r62, Continuation continuation) {
        super(2, continuation);
        this.f37581b = r62;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Q6(this.f37581b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Q6(this.f37581b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f37580a;
        try {
            if (i10 == 0) {
                kotlin.d.b(obj);
                C3617c0 c3617c0 = this.f37581b.f38480f;
                c3617c0.getClass();
                c3617c0.f38310c = SystemClock.elapsedRealtime();
                Integer num = this.f37581b.f37644m.f39097d;
                long jIntValue = num != null ? num.intValue() : 15000;
                P6 p62 = new P6(this.f37581b, null);
                this.f37580a = 1;
                obj = eg.x1.c(jIntValue, p62, this);
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
            this.f37581b.f38475a.getClass();
            R6 r62 = this.f37581b;
            AbstractC3643d0.a("native", r62.f38478d.f37147g, adResponse, r62.f38479e);
            C3903n9 c3903n9 = this.f37581b.f38479e;
            if (c3903n9 != null) {
                c3903n9.a("AUM-FetchingState", "AdResponse Parse Success");
            }
            this.f37581b.a(adResponse);
        } catch (Y e10) {
            C3903n9 c3903n92 = this.f37581b.f38479e;
            if (c3903n92 != null) {
                c3903n92.b("AUM-FetchingState", "AdResponse Parse Failure " + e10);
            }
            this.f37581b.a(e10);
        } catch (eg.v1 unused) {
            C3903n9 c3903n93 = this.f37581b.f38479e;
            if (c3903n93 != null) {
                c3903n93.b("AUM-FetchingState", "Ad fetch timed out");
            }
            this.f37581b.a(new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), new J6((short) 2138)));
        }
        return Unit.f93236a;
    }
}
