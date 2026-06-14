package com.inmobi.media;

import android.os.HandlerThread;
import com.amazon.device.ads.DtbConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes9.dex */
public abstract class H6 {
    public static final boolean a(String str) {
        return str == null || StringsKt.v1(str).toString().length() == 0 || !(StringsKt.a0(str, "http://", false, 2, null) || StringsKt.a0(str, DtbConstants.HTTPS, false, 2, null));
    }

    public static final void a(HandlerThread handlerThread, String name) {
        Intrinsics.checkNotNullParameter(handlerThread, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            handlerThread.start();
        } catch (InternalError e10) {
            e10.toString();
        }
    }

    public static final void a(Job job) {
        if (job == null || !job.isActive()) {
            return;
        }
        Job.a.a(job, null, 1, null);
    }
}
