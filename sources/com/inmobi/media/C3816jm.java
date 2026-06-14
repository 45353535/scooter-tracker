package com.inmobi.media;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: renamed from: com.inmobi.media.jm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3816jm extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3941om f38840c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3816jm(C3941om c3941om, Continuation continuation) {
        super(2, continuation);
        this.f38840c = c3941om;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C3816jm c3816jm = new C3816jm(this.f38840c, continuation);
        c3816jm.f38839b = obj;
        return c3816jm;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C3816jm c3816jm = new C3816jm(this.f38840c, (Continuation) obj2);
        c3816jm.f38839b = (Rl) obj;
        return c3816jm.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Rl mediaEvent;
        Object objG = pf.b.g();
        int i10 = this.f38838a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            Rl rl = (Rl) this.f38839b;
            MutableSharedFlow mutableSharedFlow = this.f38840c.f39217d;
            this.f38839b = rl;
            this.f38838a = 1;
            if (mutableSharedFlow.emit(rl, this) == objG) {
                return objG;
            }
            mediaEvent = rl;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mediaEvent = (Rl) this.f38839b;
            kotlin.d.b(obj);
        }
        C3992qn c3992qn = this.f38840c.f39216c.f39308g;
        Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
        if (mediaEvent instanceof Bm) {
            Map mapA = AbstractC3789ik.a(c3992qn.f39410a);
            Wj wj = Wj.f37959a;
            Wj.b("VideoLoadStarted", mapA, EnumC3585ak.f38215a);
        } else if (mediaEvent instanceof Em) {
            Map mapA2 = AbstractC3789ik.a(c3992qn.f39410a);
            Wj wj2 = Wj.f37959a;
            Wj.b("VideoLoadSuccess", mapA2, EnumC3585ak.f38215a);
        } else if (mediaEvent instanceof C3842kn) {
            boolean[] zArr = c3992qn.f39411b;
            if (!zArr[0]) {
                zArr[0] = true;
                Map mapA3 = AbstractC3789ik.a(c3992qn.f39410a);
                Wj wj3 = Wj.f37959a;
                Wj.b("VideoStart", mapA3, EnumC3585ak.f38215a);
            }
        } else if (mediaEvent instanceof C4165xm) {
            boolean[] zArr2 = c3992qn.f39411b;
            if (!zArr2[1]) {
                zArr2[1] = true;
                Map mapA4 = AbstractC3789ik.a(c3992qn.f39410a);
                Wj wj4 = Wj.f37959a;
                Wj.b("VideoFirstQuartile", mapA4, EnumC3585ak.f38215a);
            }
        } else if (mediaEvent instanceof C3792in) {
            boolean[] zArr3 = c3992qn.f39411b;
            if (!zArr3[2]) {
                zArr3[2] = true;
                Map mapA5 = AbstractC3789ik.a(c3992qn.f39410a);
                Wj wj5 = Wj.f37959a;
                Wj.b("VideoSecondQuartile", mapA5, EnumC3585ak.f38215a);
            }
        } else if (mediaEvent instanceof C4016rn) {
            boolean[] zArr4 = c3992qn.f39411b;
            if (!zArr4[3]) {
                zArr4[3] = true;
                Map mapA6 = AbstractC3789ik.a(c3992qn.f39410a);
                Wj wj6 = Wj.f37959a;
                Wj.b("VideoThirdQuartile", mapA6, EnumC3585ak.f38215a);
            }
        } else if (mediaEvent instanceof Pl) {
            boolean[] zArr5 = c3992qn.f39411b;
            if (!zArr5[4]) {
                zArr5[4] = true;
                Map mapA7 = AbstractC3789ik.a(c3992qn.f39410a);
                Wj wj7 = Wj.f37959a;
                Wj.b("VideoComplete", mapA7, EnumC3585ak.f38215a);
            }
        } else if (mediaEvent instanceof Ql) {
            ((Ql) mediaEvent).getClass();
            Map mutableMap = MapsKt.toMutableMap(AbstractC3789ik.a(c3992qn.f39410a));
            mutableMap.put("errorCode", (short) 66);
            Wj wj8 = Wj.f37959a;
            Wj.b("VideoLoadFailure", mutableMap, EnumC3585ak.f38215a);
        }
        Ml ml = this.f38840c.f39216c.f39307f;
        Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
        if (mediaEvent instanceof Em) {
            ml.f37385a.f37364d = AbstractC3766hl.a(((Em) mediaEvent).f36813a);
            ml.f37386b.f37310f.a(Te.f37766a);
        } else if (mediaEvent instanceof Ql) {
            ((Ql) mediaEvent).getClass();
            ml.f37386b.f37316l.a(new Fo(MapsKt.mapOf(TuplesKt.to(com.taurusx.tax.n.z.f66398w, String.valueOf(405))), null, 2));
        } else if (mediaEvent instanceof C3842kn) {
            ml.f37386b.f37311g.a(Te.f37766a);
        } else if (mediaEvent instanceof C3768hn) {
            ml.f37386b.f37315k.a(Te.f37766a);
        } else if (mediaEvent instanceof Om) {
            ml.f37386b.f37314j.a(Te.f37766a);
        } else if (mediaEvent instanceof C4165xm) {
            ml.f37386b.f37306b.a(Te.f37766a);
        } else if (mediaEvent instanceof C3792in) {
            ml.f37386b.f37307c.a(Te.f37766a);
        } else if (mediaEvent instanceof C4016rn) {
            ml.f37386b.f37308d.a(Te.f37766a);
        } else if (mediaEvent instanceof Pl) {
            ml.f37386b.f37309e.a(Te.f37766a);
        } else if (mediaEvent instanceof Xm) {
            ml.f37385a.f37365e = ((Xm) mediaEvent).f38012a;
            ml.f37386b.f37317m.a(Te.f37766a);
        } else if (mediaEvent instanceof S1) {
            if (((S1) mediaEvent).f37682a) {
                ml.f37386b.f37312h.a(Te.f37766a);
            } else {
                ml.f37386b.f37313i.a(Te.f37766a);
            }
        }
        return Unit.f93236a;
    }
}
