package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class sy1 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hg2 f115988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d31 f115989c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy1(hg2 hg2Var, d31 d31Var) {
        super(0);
        this.f115988b = hg2Var;
        this.f115989c = d31Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f115988b.a(this.f115989c);
    }
}
