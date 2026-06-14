package yads;

import android.content.Context;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class b60 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f108913b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b60(Context context) {
        super(0);
        this.f108913b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new m70(j72.f112253c.a(this.f108913b).f112255a, new ArrayList());
    }
}
