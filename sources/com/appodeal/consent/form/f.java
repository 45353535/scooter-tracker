package com.appodeal.consent.form;

import com.appodeal.consent.ConsentManagerError;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f15418r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f15419s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, r rVar, Continuation continuation) {
        super(2, continuation);
        this.f15418r = str;
        this.f15419s = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f15418r, this.f15419s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new f(this.f15418r, this.f15419s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        com.appodeal.consent.logger.a.b("[WebView] - onException: " + this.f15418r, null);
        WeakReference weakReference = ConsentActivity.f15405b;
        b.c(new ConsentManagerError.InternalError(this.f15418r, null, 2, null));
        r.e(this.f15419s);
        return Unit.f93236a;
    }
}
