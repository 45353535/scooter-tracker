package eg;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 extends CancellationException implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient Job f69125b;

    public a1(String str, Throwable th2, Job job) {
        super(str);
        this.f69125b = job;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return Intrinsics.areEqual(a1Var.getMessage(), getMessage()) && Intrinsics.areEqual(a1Var.h(), h()) && Intrinsics.areEqual(a1Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // eg.w
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public a1 d() {
        return null;
    }

    public final Job h() {
        Job job = this.f69125b;
        return job == null ? kotlinx.coroutines.d0.f93604b : job;
    }

    public int hashCode() {
        String message = getMessage();
        Intrinsics.checkNotNull(message);
        int iHashCode = message.hashCode() * 31;
        Job jobH = h();
        int iHashCode2 = (iHashCode + (jobH != null ? jobH.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + h();
    }
}
