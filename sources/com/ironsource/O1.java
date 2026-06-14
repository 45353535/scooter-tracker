package com.ironsource;

import android.os.Looper;
import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class O1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f41482a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a() {
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                Log.e("AssertThread", "ALERT UI THREAD: " + Thread.currentThread().getStackTrace()[4].getMethodName());
            }
        }

        private a() {
        }
    }

    public static final void a() {
        f41482a.a();
    }
}
