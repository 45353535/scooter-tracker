package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import com.ironsource.C4240b4;
import io.sentry.protocol.DebugImage;

/* JADX INFO: loaded from: classes12.dex */
public final class Nc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseArray f76161c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76163b;

    static {
        SparseArray sparseArray = new SparseArray();
        f76161c = sparseArray;
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        sparseArray.put(5891, new Nc(DebugImage.JVM, "binder"));
        sparseArray.put(5890, new Nc(DebugImage.JVM, C4240b4.i.f42616b));
        sparseArray.put(5889, new Nc(DebugImage.JVM, C4240b4.i.f42616b));
        sparseArray.put(5897, new Nc("jni_native", C4240b4.i.f42616b));
        sparseArray.put(5898, new Nc("jni_native", C4240b4.i.f42616b));
    }

    public Nc(String str, String str2) {
        this.f76162a = str;
        this.f76163b = str2;
    }
}
