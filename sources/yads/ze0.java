package yads;

import android.content.Intent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ze0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f118637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f118638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f118639c;

    public ze0(Intent intent, bf0 bf0Var, cf0 cf0Var) {
        this.f118637a = intent;
        this.f118638b = bf0Var;
        this.f118639c = cf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze0)) {
            return false;
        }
        ze0 ze0Var = (ze0) obj;
        return Intrinsics.areEqual(this.f118637a, ze0Var.f118637a) && Intrinsics.areEqual(this.f118638b, ze0Var.f118638b) && Intrinsics.areEqual(this.f118639c, ze0Var.f118639c);
    }

    public final int hashCode() {
        return this.f118639c.hashCode() + ((this.f118638b.hashCode() + (this.f118637a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DelegatedActivityLaunchInfo(pendingIntent=" + this.f118637a + ", onLaunchSucceed=" + this.f118638b + ", onLaunchFailed=" + this.f118639c + ")";
    }
}
