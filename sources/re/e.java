package re;

import java.util.Map;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import ve.f1;
import ve.o;
import ve.z;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f1 f99432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f99433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f99434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ye.c f99435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Job f99436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ze.b f99437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f99438g;

    public e(f1 url, z method, o headers, ye.c body, Job executionContext, ze.b attributes) {
        Set setKeySet;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(executionContext, "executionContext");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f99432a = url;
        this.f99433b = method;
        this.f99434c = headers;
        this.f99435d = body;
        this.f99436e = executionContext;
        this.f99437f = attributes;
        Map map = (Map) attributes.a(le.i.a());
        this.f99438g = (map == null || (setKeySet = map.keySet()) == null) ? SetsKt.emptySet() : setKeySet;
    }

    public final ze.b a() {
        return this.f99437f;
    }

    public final ye.c b() {
        return this.f99435d;
    }

    public final Object c(le.h key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = (Map) this.f99437f.a(le.i.a());
        if (map != null) {
            return map.get(key);
        }
        return null;
    }

    public final Job d() {
        return this.f99436e;
    }

    public final o e() {
        return this.f99434c;
    }

    public final z f() {
        return this.f99433b;
    }

    public final Set g() {
        return this.f99438g;
    }

    public final f1 h() {
        return this.f99432a;
    }

    public String toString() {
        return "HttpRequestData(url=" + this.f99432a + ", method=" + this.f99433b + ')';
    }
}
