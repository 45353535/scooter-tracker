package je;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import ve.o;
import ve.u;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends UnsupportedOperationException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f85836b;

    public c(se.c response, KClass from, KClass to) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n        Expected response body of the type '");
        sb2.append(to);
        sb2.append("' but was '");
        sb2.append(from);
        sb2.append("'\n        In response from `");
        sb2.append(se.e.d(response).getUrl());
        sb2.append("`\n        Response status `");
        sb2.append(response.d());
        sb2.append("`\n        Response header `ContentType: ");
        o headers = response.getHeaders();
        u uVar = u.f106718a;
        sb2.append(headers.get(uVar.i()));
        sb2.append("` \n        Request header `Accept: ");
        sb2.append(se.e.d(response).getHeaders().get(uVar.c()));
        sb2.append("`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
        this.f85836b = StringsKt.n(sb2.toString());
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f85836b;
    }
}
