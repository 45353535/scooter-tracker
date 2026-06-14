package yads;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class vh extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wh f117009b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh(wh whVar) {
        super(1);
        this.f117009b = whVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return wh.a(this.f117009b, androidx.work.impl.utils.j.a(obj));
    }
}
