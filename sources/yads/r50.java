package yads;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class r50 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f115319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z60 f115320c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r50(Context context, z60 z60Var) {
        super(0);
        this.f115319b = context;
        this.f115320c = z60Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new k70(this.f115319b, (qo1) this.f115320c.f118560e.getValue(), new rp1(this.f115319b));
    }
}
