package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.tm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4065tm extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3965pl f39611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3965pl f39613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f39614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Pe f39615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f39616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AdConfig.VastVideoConfig f39617g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4065tm(C3965pl c3965pl, double d10, Pe pe2, int i10, AdConfig.VastVideoConfig vastVideoConfig, Continuation continuation) {
        super(2, continuation);
        this.f39613c = c3965pl;
        this.f39614d = d10;
        this.f39615e = pe2;
        this.f39616f = i10;
        this.f39617g = vastVideoConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4065tm(this.f39613c, this.f39614d, this.f39615e, this.f39616f, this.f39617g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4065tm) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C3965pl c3965pl;
        Object objG = pf.b.g();
        int i10 = this.f39612b;
        if (i10 == 0) {
            kotlin.d.b(obj);
            C3965pl c3965pl2 = this.f39613c;
            double d10 = this.f39614d;
            Pe pe2 = this.f39615e;
            int i11 = this.f39616f;
            AdConfig.VastVideoConfig vastVideoConfig = this.f39617g;
            this.f39611a = c3965pl2;
            this.f39612b = 1;
            obj = AbstractC4140wm.a(c3965pl2, d10, pe2, i11, vastVideoConfig, this);
            if (obj == objG) {
                return objG;
            }
            c3965pl = c3965pl2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3965pl = this.f39611a;
            kotlin.d.b(obj);
        }
        return TuplesKt.to(c3965pl, obj);
    }
}
