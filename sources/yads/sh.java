package yads;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class sh extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final sh f115793b = new sh();

    public sh() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(androidx.work.impl.utils.j.a(obj).getReason() == 6);
    }
}
