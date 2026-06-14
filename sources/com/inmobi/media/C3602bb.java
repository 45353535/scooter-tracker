package com.inmobi.media;

import com.inmobi.media.C3602bb;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: renamed from: com.inmobi.media.bb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3602bb extends AbstractC4019s1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3920o1 f38260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ac f38261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Job f38262d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3602bb(C3920o1 adManagerComponent, Ac stateMachine) {
        super(adManagerComponent);
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f38260b = adManagerComponent;
        this.f38261c = stateMachine;
    }

    public static final Unit a(C3602bb c3602bb) {
        c3602bb.f38261c.e();
        return Unit.f93236a;
    }

    @Override // com.inmobi.media.AbstractC4019s1
    public final void b() {
        g();
    }

    @Override // com.inmobi.media.AbstractC4019s1
    public final void d() {
        g();
    }

    @Override // com.inmobi.media.AbstractC4019s1
    public final void e() {
        H6.a(this.f38262d);
        this.f38262d = null;
    }

    public final void g() {
        long j10 = this.f39494a.f39096c;
        CoroutineScope coroutineScope = this.f38260b.f39147e;
        Function0 timeOutCallback = new Function0() { // from class: w3.y5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3602bb.a(this.f107394b);
            }
        };
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(timeOutCallback, "timeOutCallback");
        this.f38262d = eg.i.d(coroutineScope, null, null, new C4038sk(j10, timeOutCallback, null), 3, null);
    }

    @Override // com.inmobi.media.AbstractC4019s1
    public final void a() {
        H6.a(this.f38262d);
        this.f38262d = null;
    }
}
