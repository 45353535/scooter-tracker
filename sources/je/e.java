package je;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ve.y;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f85840i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f85841j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ie.c client, re.b request, se.c response, byte[] responseBody) {
        super(client);
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        this.f85840i = responseBody;
        i(new f(this, request));
        j(new g(this, responseBody, response));
        h.a(y.b(response), responseBody.length, request.getMethod());
        this.f85841j = true;
    }

    @Override // je.b
    protected boolean b() {
        return this.f85841j;
    }

    @Override // je.b
    protected Object f(Continuation continuation) {
        return io.ktor.utils.io.b.c(this.f85840i, 0, 0, 6, null);
    }
}
