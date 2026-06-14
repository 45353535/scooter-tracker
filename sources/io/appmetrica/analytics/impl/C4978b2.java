package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4978b2 implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f76876a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile G7 f76877b = null;

    public final void a(@NonNull G7 g72) {
        ArrayList arrayListA;
        synchronized (this) {
            this.f76877b = g72;
            arrayListA = a();
        }
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            ((InterfaceC5145he) it.next()).consume(g72);
        }
    }

    public final void b() {
        C5186j4.l().f77469e.registerListener(this, ActivityEvent.CREATED);
    }

    public final void c() {
        C5186j4.l().f77469e.unregisterListener(this, ActivityEvent.CREATED);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    @MainThread
    public final void onEvent(@NonNull Activity activity, @NonNull ActivityEvent activityEvent) {
        Intent intent = (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new Z1());
        String dataString = intent == null ? null : intent.getDataString();
        if (TextUtils.isEmpty(dataString)) {
            return;
        }
        C4952a2 c4952a2 = new C4952a2(dataString);
        synchronized (this) {
            try {
                G7 g72 = this.f76877b;
                if (g72 == null) {
                    this.f76876a.add(c4952a2);
                } else {
                    ((G9) C5186j4.l().f77467c.a()).f75815b.post(new Y1(c4952a2, g72));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized ArrayList a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f76876a);
        this.f76876a.clear();
        return arrayList;
    }
}
