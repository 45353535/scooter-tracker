package yads;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class re2 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public te2 f115428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ne2 f115429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f115430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2 f115431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f115432f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re2(te2 te2Var, Continuation continuation) {
        super(continuation);
        this.f115431e = te2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f115430d = obj;
        this.f115432f |= Integer.MIN_VALUE;
        return this.f115431e.a((Context) null, (ne2) null, this);
    }
}
