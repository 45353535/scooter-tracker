package yads;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o50 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z60 f114202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f114203c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o50(Context context, z60 z60Var) {
        super(0);
        this.f114202b = z60Var;
        this.f114203c = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        vt2 vt2Var = (vt2) this.f114202b.f118557b.getValue();
        gw gwVar = hw.f111788a;
        Context context = this.f114203c;
        gwVar.getClass();
        return new qy(vt2Var, gw.a(context));
    }
}
