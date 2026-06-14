package io.appmetrica.analytics.impl;

import android.annotation.SuppressLint;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@DoNotInline
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0003J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lio/appmetrica/analytics/impl/If;", "Lio/appmetrica/analytics/impl/Hf;", "", "b", "a", "Ljava/lang/String;", "mProcessName", "<init>", "()V", "analytics_binaryProdRelease"}, k = 1, mv = {1, 6, 0})
public final class If implements Hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private volatile String mProcessName;

    @SuppressLint({"PrivateApi"})
    private final String b() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("getProcessName", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    @Override // io.appmetrica.analytics.impl.Hf
    @Nullable
    public String a() {
        if (this.mProcessName != null) {
            return this.mProcessName;
        }
        synchronized (this) {
            try {
                if (this.mProcessName == null) {
                    this.mProcessName = b();
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.mProcessName;
    }
}
