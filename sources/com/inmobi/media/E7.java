package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class E7 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f36779a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E7(Continuation continuation, N7 n72) {
        super(2, continuation);
        this.f36779a = n72;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new E7(continuation, this.f36779a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new E7((Continuation) obj2, this.f36779a).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        if (this.f36779a.b() == EnumC4034sg.f39537f) {
            this.f36779a.f37417p.seekTo(0L);
            N7 n72 = this.f36779a;
            n72.f37413l.set(EnumC4034sg.f39534c);
        }
        S7 s72 = this.f36779a.f37426y;
        if (s72.f37699e) {
            s72.a();
            s72.f37698d.a();
        } else {
            P4.a(s72.f37695a, new R7(s72, null));
        }
        C4074u6 c4074u6 = this.f36779a.f37425x;
        if (!c4074u6.f39641d.getAndSet(true)) {
            CoroutineScope coroutineScope = c4074u6.f39639b;
            long j10 = c4074u6.f39648k;
            C4024s6 action = new C4024s6(c4074u6, null);
            Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
            Intrinsics.checkNotNullParameter(action, "action");
            c4074u6.f39642e = eg.i.d(coroutineScope, eg.o0.c().w(), null, new C3(j10, null, action), 2, null);
            CoroutineScope coroutineScope2 = c4074u6.f39639b;
            long j11 = c4074u6.f39649l;
            C4049t6 action2 = new C4049t6(c4074u6, null);
            Intrinsics.checkNotNullParameter(coroutineScope2, "<this>");
            Intrinsics.checkNotNullParameter(action2, "action");
            c4074u6.f39643f = eg.i.d(coroutineScope2, eg.o0.c().w(), null, new C3(j11, null, action2), 2, null);
        }
        this.f36779a.f37417p.play();
        N7 n73 = this.f36779a;
        n73.f37413l.set(EnumC4034sg.f39535d);
        N7 n74 = this.f36779a;
        n74.a(new C3768hn(n74.f37417p.getCurrentPosition()));
        return Unit.f93236a;
    }
}
