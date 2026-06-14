package re;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import ve.f1;
import ve.o;
import ve.z;

/* JADX INFO: loaded from: classes3.dex */
public class a implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final je.b f99419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z f99420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f1 f99421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ye.c f99422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o f99423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ze.b f99424g;

    public a(je.b call, e data) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f99419b = call;
        this.f99420c = data.f();
        this.f99421d = data.h();
        this.f99422e = data.b();
        this.f99423f = data.e();
        this.f99424g = data.a();
    }

    @Override // re.b
    public ze.b getAttributes() {
        return this.f99424g;
    }

    @Override // re.b, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return p().getCoroutineContext();
    }

    @Override // ve.w
    public o getHeaders() {
        return this.f99423f;
    }

    @Override // re.b
    public z getMethod() {
        return this.f99420c;
    }

    @Override // re.b
    public f1 getUrl() {
        return this.f99421d;
    }

    @Override // re.b
    public je.b p() {
        return this.f99419b;
    }
}
