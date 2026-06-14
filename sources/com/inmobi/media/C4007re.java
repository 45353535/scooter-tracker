package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: renamed from: com.inmobi.media.re, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4007re extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4057te f39470b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4007re(C4057te c4057te, Continuation continuation) {
        super(2, continuation);
        this.f39470b = c4057te;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4007re(this.f39470b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4007re(this.f39470b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39469a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            InterfaceC3878m9 interfaceC3878m9L = this.f39470b.l();
            if (interfaceC3878m9L != null) {
                ((C3903n9) interfaceC3878m9L).a("NativeRenderedState", "Track Views Attached to Telemetry Started - waiting for window state change");
            }
            MutableStateFlow mutableStateFlow = ((yo) this.f39470b.f39594b.f39680l.getValue()).f40024b;
            C3983qe c3983qe = new C3983qe(null);
            this.f39469a = 1;
            if (hg.i.y(mutableStateFlow, c3983qe, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        C4082ue c4082ue = this.f39470b.f39594b;
        c4082ue.f39670b.f39546b = true;
        c4082ue.f39674f.f37444b.f37281e.a(Te.f37766a);
        C4057te c4057te = this.f39470b;
        Wc.a(c4057te.f39594b.f39671c, c4057te.l());
        C3617c0 c3617c0 = this.f39470b.f39960a.f39882a.f39146d;
        c3617c0.getClass();
        c3617c0.f38312e = SystemClock.elapsedRealtime();
        Dc dc2 = (Dc) this.f39470b.f39594b.f39675g.f36794f.getValue();
        Sg publisherNativeViewData = this.f39470b.f39594b.f39671c;
        dc2.getClass();
        Intrinsics.checkNotNullParameter(publisherNativeViewData, "publisherNativeViewData");
        Map mapA = AbstractC3789ik.a(dc2.f36723a);
        ViewGroup parentView = publisherNativeViewData.f37729a.getParentView();
        int i11 = 0;
        for (Pair pair : Wc.a(publisherNativeViewData)) {
            View view = (View) pair.component1();
            short sShortValue = ((Number) pair.component2()).shortValue();
            if (view != null && view.getVisibility() == 0 && AbstractC4116vn.a(view, parentView)) {
                i11 |= 1 << sShortValue;
            }
        }
        mapA.put("viewState", Integer.valueOf(i11));
        Wj wj = Wj.f37959a;
        Wj.b("ViewStateOnParentAttached", mapA, EnumC3585ak.f38215a);
        return Unit.f93236a;
    }
}
