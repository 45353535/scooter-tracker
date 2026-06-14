package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.yh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4185yh extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f40006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f40007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bh f40008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f40009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ RootConfig f40010f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4185yh(List list, Bh bh2, String str, RootConfig rootConfig, Continuation continuation) {
        super(2, continuation);
        this.f40007c = list;
        this.f40008d = bh2;
        this.f40009e = str;
        this.f40010f = rootConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C4185yh c4185yh = new C4185yh(this.f40007c, this.f40008d, this.f40009e, this.f40010f, continuation);
        c4185yh.f40006b = obj;
        return c4185yh;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4185yh) create((gg.v) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f40005a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            C4160xh c4160xh = new C4160xh(this.f40007c, this.f40008d, this.f40009e, this.f40010f, (gg.v) this.f40006b, null);
            this.f40005a = 1;
            if (eg.m1.c(c4160xh, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        return Unit.f93236a;
    }
}
