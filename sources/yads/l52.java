package yads;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class l52 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l52 f112974b = new l52();

    public l52() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return (xb3) CollectionsKt.first(((gb3) obj).f111136a);
    }
}
