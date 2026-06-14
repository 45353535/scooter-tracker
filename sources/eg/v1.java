package eg;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public final class v1 extends CancellationException implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient Job f69179b;

    public v1(String str, Job job) {
        super(str);
        this.f69179b = job;
    }

    @Override // eg.w
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public v1 d() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        v1 v1Var = new v1(message, this.f69179b);
        v1Var.initCause(this);
        return v1Var;
    }

    public v1(String str) {
        this(str, null);
    }
}
