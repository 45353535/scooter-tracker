package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes9.dex */
abstract class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f28751c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f28753e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f28749a = new com.google.android.play.integrity.internal.s("IntegrityDialogWrapper");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f28752d = new Object();

    y(String str, long j10) {
        this.f28750b = str;
        this.f28751c = j10;
    }

    public final Task a(Activity activity, int i10) {
        synchronized (this.f28752d) {
            try {
                if (this.f28753e) {
                    return Tasks.forResult(0);
                }
                this.f28753e = true;
                this.f28749a.a("checkAndShowDialog(%s)", Integer.valueOf(i10));
                Bundle bundle = new Bundle();
                bundle.putInt("dialog.intent.type", i10);
                bundle.putString("package.name", this.f28750b);
                bundle.putInt("playcore.integrity.version.major", 1);
                bundle.putInt("playcore.integrity.version.minor", 3);
                bundle.putInt("playcore.integrity.version.patch", 0);
                bundle.putLong("request.token.sid", this.f28751c);
                return b(activity, bundle);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    abstract Task b(Activity activity, Bundle bundle);
}
