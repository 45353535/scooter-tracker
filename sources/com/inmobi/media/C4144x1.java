package com.inmobi.media;

import android.app.ApplicationExitInfo;
import com.ironsource.C4240b4;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4144x1 extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4169y1 f39886a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4144x1(C4169y1 c4169y1, Continuation continuation) {
        super(1, continuation);
        this.f39886a = c4169y1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new C4144x1(this.f39886a, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C4144x1(this.f39886a, (Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        C4169y1 c4169y1 = this.f39886a;
        List historicalProcessExitReasons = c4169y1.f39971e.getHistoricalProcessExitReasons(c4169y1.f39968b.getPackageName(), 0, 10);
        Intrinsics.checkNotNullExpressionValue(historicalProcessExitReasons, "getHistoricalProcessExitReasons(...)");
        Ea ea2 = this.f39886a.f39972f;
        ea2.getClass();
        Intrinsics.checkNotNullParameter("exitReasonTimestamp", C4240b4.i.W);
        long j10 = ea2.f36783a.getLong("exitReasonTimestamp", 0L);
        C4169y1 c4169y12 = this.f39886a;
        Iterator it = historicalProcessExitReasons.iterator();
        long timestamp = j10;
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoA = androidx.work.impl.utils.j.a(it.next());
            if (applicationExitInfoA.getTimestamp() > j10) {
                long j11 = c4169y12.f39969c;
                C4119w1 runnable = new C4119w1(c4169y12, applicationExitInfoA, null);
                CoroutineScope coroutineScope = AbstractC3790il.f38771a;
                Intrinsics.checkNotNullParameter(runnable, "runnable");
                eg.i.d(AbstractC3790il.f38771a, null, null, new C3715fl(j11, null, runnable), 3, null);
                if (applicationExitInfoA.getTimestamp() > timestamp) {
                    timestamp = applicationExitInfoA.getTimestamp();
                }
            }
        }
        this.f39886a.f39972f.a("exitReasonTimestamp", timestamp, false);
        return Unit.f93236a;
    }
}
