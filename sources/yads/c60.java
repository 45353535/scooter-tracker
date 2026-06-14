package yads;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class c60 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f109260b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c60(Context context) {
        super(0);
        this.f109260b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new e51(this.f109260b);
    }
}
