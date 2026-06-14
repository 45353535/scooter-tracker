package f1;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o0 implements t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70698a;

    public o0() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.f70698a = string;
    }

    @Override // f1.t4
    public final String a() {
        return this.f70698a;
    }
}
