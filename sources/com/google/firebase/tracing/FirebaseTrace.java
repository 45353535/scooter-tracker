package com.google.firebase.tracing;

import android.os.Trace;

/* JADX INFO: loaded from: classes9.dex */
public final class FirebaseTrace {
    public static void popTrace() {
        Trace.endSection();
    }

    public static void pushTrace(String str) {
        Trace.beginSection(str);
    }
}
