package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.Job;

/* JADX INFO: renamed from: com.inmobi.media.j6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3800j6 extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3850l6 f38795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f38796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f38797d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3800j6(C3850l6 c3850l6, boolean z10, Ref$ObjectRef ref$ObjectRef, Continuation continuation) {
        super(1, continuation);
        this.f38795b = c3850l6;
        this.f38796c = z10;
        this.f38797d = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new C3800j6(this.f38795b, this.f38796c, this.f38797d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C3800j6) create((Continuation) obj)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38794a;
        try {
            if (i10 == 0) {
                kotlin.d.b(obj);
                C3850l6 c3850l6 = this.f38795b;
                boolean z10 = this.f38796c;
                this.f38794a = 1;
                if (C3850l6.a(c3850l6, z10, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
        } catch (Exception unused) {
            Job job = (Job) this.f38797d.f93280b;
            if (job != null) {
                Job.a.a(job, null, 1, null);
            }
        }
        return Unit.f93236a;
    }
}
