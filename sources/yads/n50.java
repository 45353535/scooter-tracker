package yads;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class n50 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f113728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z60 f113729c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n50(Context context, z60 z60Var) {
        super(0);
        this.f113728b = context;
        this.f113729c = z60Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new dg(this.f113728b, (rf0) this.f113729c.f118558c.getValue());
    }
}
