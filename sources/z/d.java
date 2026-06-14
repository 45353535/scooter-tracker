package z;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import z.c;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f119122b;

    public d(Context context) {
        this.f119122b = context;
    }

    @Override // z.j
    public Object b(Continuation continuation) {
        DisplayMetrics displayMetrics = this.f119122b.getResources().getDisplayMetrics();
        c.a aVarA = a.a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new i(aVarA, aVarA);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.areEqual(this.f119122b, ((d) obj).f119122b);
    }

    public int hashCode() {
        return this.f119122b.hashCode();
    }
}
