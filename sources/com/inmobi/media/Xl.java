package com.inmobi.media;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes9.dex */
public final class Xl implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3941om f38011a;

    public Xl(CoroutineScope coroutineScope, C3941om c3941om) {
        this.f38011a = c3941om;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        K3 k32;
        MutableSharedFlow mutableSharedFlow;
        Job jobD;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C3903n9 c3903n9 = this.f38011a.f39218e;
        if (c3903n9 != null) {
            c3903n9.a("VideoExperienceManager", "attachWindowLifecycleObserver - window visibility changed: " + zBooleanValue);
        }
        if (zBooleanValue) {
            C3941om c3941om = this.f38011a;
            C3903n9 c3903n92 = c3941om.f39218e;
            if (c3903n92 != null) {
                c3903n92.a("VideoExperienceManager", "handleOnWindowVisible called - starting media player and setting up observers");
            }
            InterfaceC3680ec interfaceC3680ec = c3941om.f39221h;
            if (interfaceC3680ec == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
                interfaceC3680ec = null;
            }
            Sd sd2 = (Sd) interfaceC3680ec;
            C3967pn c3967pn = sd2.f37721k;
            c3967pn.f39313d.set(true);
            C4134wg c4134wg = (C4134wg) c3967pn.f39318i.f37976d.getValue();
            c4134wg.f39853b.setValue(Mn.f37387a);
            c4134wg.f39857f.set(true);
            H6.a(c4134wg.f39856e);
            c4134wg.f39856e = null;
            C4134wg c4134wg2 = (C4134wg) c3967pn.f39318i.f37976d.getValue();
            c4134wg2.a();
            Job jobD2 = eg.i.d(c3967pn.f39310a, eg.o0.c(), null, new C3917nn(new Vm(c4134wg2.f39853b), null, c3967pn), 2, null);
            ArrayList activeJobs = c3967pn.f39314e;
            Intrinsics.checkNotNullParameter(jobD2, "<this>");
            Intrinsics.checkNotNullParameter(activeJobs, "activeJobs");
            activeJobs.add(jobD2);
            c3967pn.a();
            Job jobD3 = eg.i.d(sd2.f37711a, null, null, new Ld(new Od(sd2.f37723m), null, sd2), 3, null);
            ArrayList activeJobs2 = sd2.f37714d;
            Intrinsics.checkNotNullParameter(jobD3, "<this>");
            Intrinsics.checkNotNullParameter(activeJobs2, "activeJobs");
            activeJobs2.add(jobD3);
            sd2.f37720j.b();
            C3903n9 c3903n93 = c3941om.f39218e;
            if (c3903n93 != null) {
                c3903n93.a("VideoExperienceManager", "observeMediaEvents - setting up media event observers");
            }
            InterfaceC3680ec interfaceC3680ec2 = c3941om.f39221h;
            if (interfaceC3680ec2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
                interfaceC3680ec2 = null;
            }
            Job jobF = hg.i.F(hg.i.K(new C3791im(hg.i.K(((Sd) interfaceC3680ec2).f37723m, new C3816jm(c3941om, null))), new C3841km(c3941om, null)), c3941om.f39215b);
            ArrayList activeJobs3 = c3941om.f39219f;
            Intrinsics.checkNotNullParameter(jobF, "<this>");
            Intrinsics.checkNotNullParameter(activeJobs3, "activeJobs");
            activeJobs3.add(jobF);
            P4.a(c3941om.f39215b, new C3916nm(c3941om, null));
            if (!c3941om.f39216c.f39303b.isEmpty() && (k32 = c3941om.f39222i) != null && (mutableSharedFlow = k32.f37195d) != null && (jobD = eg.i.d(c3941om.f39215b, null, null, new C3716fm(mutableSharedFlow, null, c3941om), 3, null)) != null) {
                ArrayList activeJobs4 = c3941om.f39219f;
                Intrinsics.checkNotNullParameter(jobD, "<this>");
                Intrinsics.checkNotNullParameter(activeJobs4, "activeJobs");
                activeJobs4.add(jobD);
            }
        } else {
            this.f38011a.b();
        }
        return Unit.f93236a;
    }
}
