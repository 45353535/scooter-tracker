package io.appmetrica.analytics.impl;

import android.app.Activity;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5358q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f78012a = new WeakHashMap();

    public final boolean a(Activity activity, EnumC5333p enumC5333p) {
        if (activity != null && this.f78012a.get(activity) == enumC5333p) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.f78012a.put(activity, enumC5333p);
        return true;
    }
}
