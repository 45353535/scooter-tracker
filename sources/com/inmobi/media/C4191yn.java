package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: com.inmobi.media.yn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4191yn implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f40021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bn f40022b;

    public C4191yn(CoroutineScope coroutineScope, Bn bn) {
        this.f40022b = bn;
        this.f40021a = coroutineScope;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        CoroutineScope coroutineScope = this.f40021a;
        boolean z10 = true;
        if (((Mn) obj) == Mn.f37388b) {
            Cn cn = this.f40022b.f36644d;
            if (!cn.f36687b) {
                Job job = cn.f36686a;
                if (!(job != null ? job.isActive() : false)) {
                    z10 = false;
                }
            }
            if (!z10) {
                Bn bn = this.f40022b;
                bn.f36644d.f36686a = eg.i.d(coroutineScope, null, null, new An(bn, null), 3, null);
            }
        } else {
            Bn bn2 = this.f40022b;
            Job job2 = bn2.f36644d.f36686a;
            if (job2 != null) {
                Job.a.a(job2, null, 1, null);
            }
            bn2.f36644d.f36686a = null;
        }
        return Unit.f93236a;
    }
}
