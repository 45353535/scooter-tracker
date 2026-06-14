package lh;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function0 f94299e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, boolean z10, Function0 function0) {
        super(str, z10);
        this.f94299e = function0;
    }

    @Override // lh.a
    public long f() {
        this.f94299e.invoke();
        return -1L;
    }
}
