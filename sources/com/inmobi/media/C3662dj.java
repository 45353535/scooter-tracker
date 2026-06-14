package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: renamed from: com.inmobi.media.dj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3662dj extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Mutex f38456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC3713fj f38457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC3636cj f38458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC3636cj f38459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC3713fj f38461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3636cj f38462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3636cj f38463h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3662dj(AbstractC3713fj abstractC3713fj, InterfaceC3636cj interfaceC3636cj, InterfaceC3636cj interfaceC3636cj2, Continuation continuation) {
        super(2, continuation);
        this.f38461f = abstractC3713fj;
        this.f38462g = interfaceC3636cj;
        this.f38463h = interfaceC3636cj2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3662dj(this.f38461f, this.f38462g, this.f38463h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3662dj) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        InterfaceC3636cj interfaceC3636cj;
        AbstractC3713fj abstractC3713fj;
        InterfaceC3636cj interfaceC3636cj2;
        Object objG = pf.b.g();
        int i10 = this.f38460e;
        if (i10 == 0) {
            kotlin.d.b(obj);
            AbstractC3713fj abstractC3713fj2 = this.f38461f;
            mutex = abstractC3713fj2.f38587b;
            interfaceC3636cj = this.f38462g;
            InterfaceC3636cj interfaceC3636cj3 = this.f38463h;
            this.f38456a = mutex;
            this.f38457b = abstractC3713fj2;
            this.f38458c = interfaceC3636cj;
            this.f38459d = interfaceC3636cj3;
            this.f38460e = 1;
            if (mutex.lock(null, this) == objG) {
                return objG;
            }
            abstractC3713fj = abstractC3713fj2;
            interfaceC3636cj2 = interfaceC3636cj3;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC3636cj2 = this.f38459d;
            interfaceC3636cj = this.f38458c;
            abstractC3713fj = this.f38457b;
            mutex = this.f38456a;
            kotlin.d.b(obj);
        }
        try {
            abstractC3713fj.b(interfaceC3636cj, interfaceC3636cj2);
            return Unit.f93236a;
        } finally {
            mutex.unlock(null);
        }
    }
}
