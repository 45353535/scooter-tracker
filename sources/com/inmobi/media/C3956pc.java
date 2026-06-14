package com.inmobi.media;

import android.content.Context;
import com.ironsource.C4240b4;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: com.inmobi.media.pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3956pc extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3981qc f39272b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3956pc(C3981qc c3981qc, Continuation continuation) {
        super(2, continuation);
        this.f39272b = c3981qc;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3956pc(this.f39272b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3956pc(this.f39272b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objG = pf.b.g();
        int i10 = this.f39271a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            C3981qc c3981qc = this.f39272b;
            String str = c3981qc.f39373a;
            int i11 = c3981qc.f39374b;
            int i12 = c3981qc.f39375c;
            IntRange intRange = Se.f37724a;
            c3981qc.f39379g = new Je(str, null, null, null, new Ai(i11, i12 * 1000, 0), false, 46);
            C3981qc c3981qc2 = this.f39272b;
            Je je2 = c3981qc2.f39379g;
            Context context = Ji.f37157a;
            if (context != null) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter("mraid_js_store", "sharePrefFile");
                ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                Ea eaA = Da.a(context, "mraid_js_store");
                Intrinsics.checkNotNullParameter("last_ts", C4240b4.i.W);
                if ((System.currentTimeMillis() / ((long) 1000)) - eaA.f36783a.getLong("last_ts", 0L) > c3981qc2.f39376d && je2 != null) {
                    C4077u9 c4077u9 = (C4077u9) He.f37018c.getValue();
                    this.f39271a = 1;
                    objA = c4077u9.f39655a.a(je2, this);
                    if (objA == objG) {
                        return objG;
                    }
                }
            }
            return Unit.f93236a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.d.b(obj);
        objA = obj;
        Ne ne2 = (Ne) objA;
        Context context2 = Ji.f37157a;
        if (!AbstractC3741gl.a(ne2)) {
            C3981qc c3981qc3 = this.f39272b;
            InterfaceC3878m9 interfaceC3878m9 = c3981qc3.f39377e;
            if (interfaceC3878m9 != null) {
                String str2 = c3981qc3.f39378f;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m9).b(str2, "Getting MRAID Js from server failed.");
            }
        } else if (context2 != null) {
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter("mraid_js_store", "sharePrefFile");
            ConcurrentHashMap concurrentHashMap2 = Ea.f36782b;
            Ea eaA2 = Da.a(context2, "mraid_js_store");
            IntRange intRange2 = Se.f37724a;
            Intrinsics.checkNotNullParameter(ne2, "<this>");
            String value = ne2.d().M(Charsets.UTF_8);
            Intrinsics.checkNotNullParameter("mraid_js_string", C4240b4.i.W);
            Intrinsics.checkNotNullParameter(value, "value");
            eaA2.a("mraid_js_string", value, false);
            eaA2.a("last_ts", System.currentTimeMillis() / ((long) 1000), false);
        }
        return Unit.f93236a;
    }
}
