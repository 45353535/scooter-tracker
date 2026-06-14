package yads;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class uh extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f116637b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh(long j10) {
        super(1);
        this.f116637b = j10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(androidx.work.impl.utils.j.a(obj).getTimestamp() > this.f116637b);
    }
}
