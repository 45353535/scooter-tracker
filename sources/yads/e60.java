package yads;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class e60 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f110210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z60 f110211c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e60(Context context, z60 z60Var) {
        super(0);
        this.f110210b = context;
        this.f110211c = z60Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new k51(this.f110210b, (e51) this.f110211c.f118580y.getValue());
    }
}
