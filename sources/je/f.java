package je;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import ve.f1;
import ve.o;
import ve.z;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements re.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ re.b f85842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f85843c;

    public f(e call, re.b origin) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f85842b = origin;
        this.f85843c = call;
    }

    @Override // re.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e p() {
        return this.f85843c;
    }

    @Override // re.b
    public ze.b getAttributes() {
        return this.f85842b.getAttributes();
    }

    @Override // re.b, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f85842b.getCoroutineContext();
    }

    @Override // ve.w
    public o getHeaders() {
        return this.f85842b.getHeaders();
    }

    @Override // re.b
    public z getMethod() {
        return this.f85842b.getMethod();
    }

    @Override // re.b
    public f1 getUrl() {
        return this.f85842b.getUrl();
    }
}
