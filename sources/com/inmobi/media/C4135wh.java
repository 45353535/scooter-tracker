package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.wh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4135wh extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bh f39859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f39860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f39861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RootConfig f39862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f39863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gg.v f39864g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4135wh(Bh bh2, String str, String str2, RootConfig rootConfig, List list, gg.v vVar, Continuation continuation) {
        super(2, continuation);
        this.f39859b = bh2;
        this.f39860c = str;
        this.f39861d = str2;
        this.f39862e = rootConfig;
        this.f39863f = list;
        this.f39864g = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4135wh(this.f39859b, this.f39860c, this.f39861d, this.f39862e, this.f39863f, this.f39864g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4135wh) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39858a;
        try {
            if (i10 == 0) {
                kotlin.d.b(obj);
                Bh bh2 = this.f39859b;
                String str = this.f39860c;
                String str2 = this.f39861d;
                RootConfig rootConfig = this.f39862e;
                List list = this.f39863f;
                gg.v vVar = this.f39864g;
                this.f39858a = 1;
                if (bh2.a(str, str2, rootConfig, list, vVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
        } catch (Exception e10) {
            Lazy lazy = P9.f37527a;
            AbstractC3779i9.a(e10);
        }
        return Unit.f93236a;
    }
}
