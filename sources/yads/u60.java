package yads;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class u60 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f116533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z60 f116534c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u60(Context context, z60 z60Var) {
        super(0);
        this.f116533b = context;
        this.f116534c = z60Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new us2(this.f116533b, (ms1) this.f116534c.f118566k.getValue());
    }
}
