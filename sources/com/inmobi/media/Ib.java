package com.inmobi.media;

import android.content.Context;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class Ib extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Jb f37063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f37064c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ib(Jb jb2, Context context, Continuation continuation) {
        super(1, continuation);
        this.f37063b = jb2;
        this.f37064c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new Ib(this.f37063b, this.f37064c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Ib(this.f37063b, this.f37064c, (Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f37062a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            if (this.f37063b.f37129g.get()) {
                return Unit.f93236a;
            }
            Jb jb2 = this.f37063b;
            Context context = this.f37064c;
            this.f37062a = 1;
            if (jb2.a(context, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        CoroutineScope coroutineScope = Sb.f37702a;
        C4154xb dao = (C4154xb) AbstractC4179yb.f39987a.getValue();
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        Jb jb3 = this.f37063b;
        long j10 = timeInMillis - jb3.f37125c;
        int i11 = jb3.f37127e;
        Intrinsics.checkNotNullParameter(dao, "dao");
        if (!Sb.f37704c.getAndSet(true)) {
            Qb runnable = new Qb(dao, j10, i11, null);
            CoroutineScope coroutineScope2 = AbstractC3790il.f38771a;
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            eg.i.d(AbstractC3790il.f38771a, null, null, new C3715fl(10000L, null, runnable), 3, null);
        }
        return Unit.f93236a;
    }
}
