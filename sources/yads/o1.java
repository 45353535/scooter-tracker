package yads;

import android.app.Activity;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f114150a;

    public o1(Activity activity) {
        ArrayList arrayList = new ArrayList();
        this.f114150a = arrayList;
        if (activity != null) {
            arrayList.add(new WeakReference(activity));
        }
    }

    public final void a(Activity activity) {
        synchronized (this) {
            try {
                ArrayList arrayList = this.f114150a;
                if (!androidx.activity.s.a(arrayList) || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(((WeakReference) it.next()).get(), activity)) {
                            break;
                        }
                    }
                }
                this.f114150a.add(new WeakReference(activity));
                Objects.toString(activity);
                boolean z10 = lb1.f113032a;
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(Activity activity) {
        Object next;
        synchronized (this) {
            try {
                Iterator it = this.f114150a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (Intrinsics.areEqual(((WeakReference) next).get(), activity)) {
                            break;
                        }
                    }
                }
                WeakReference weakReference = (WeakReference) next;
                if (weakReference != null) {
                    this.f114150a.remove(weakReference);
                    Objects.toString(activity);
                    boolean z10 = lb1.f113032a;
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
