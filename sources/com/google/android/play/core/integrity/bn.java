package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
final class bn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f28705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f28707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final at f28708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f28709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final com.google.android.play.integrity.internal.ae f28710f;

    bn(Context context, com.google.android.play.integrity.internal.s sVar, at atVar, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f28707c = taskCompletionSource;
        this.f28706b = context.getPackageName();
        this.f28705a = sVar;
        this.f28708d = atVar;
        this.f28709e = kVar;
        com.google.android.play.integrity.internal.ae aeVar = new com.google.android.play.integrity.internal.ae(context, sVar, "ExpressIntegrityService", bo.f28711a, new com.google.android.play.integrity.internal.z() { // from class: com.google.android.play.core.integrity.bd
            @Override // com.google.android.play.integrity.internal.z
            public final Object a(IBinder iBinder) {
                return com.google.android.play.integrity.internal.h.b(iBinder);
            }
        }, null);
        this.f28710f = aeVar;
        aeVar.c().post(new be(this, taskCompletionSource, context));
    }

    static /* bridge */ /* synthetic */ Bundle a(bn bnVar, String str, long j10, long j11, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f28706b);
        bundle.putLong("cloud.prj", j10);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j11);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.d.b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.d.a(arrayList)));
        return bundle;
    }

    static /* bridge */ /* synthetic */ Bundle b(bn bnVar, long j10, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f28706b);
        bundle.putLong("cloud.prj", j10);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.d.b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.d.a(arrayList)));
        return bundle;
    }

    static /* bridge */ /* synthetic */ boolean k(bn bnVar) {
        return bnVar.f28707c.getTask().isSuccessful() && ((Integer) bnVar.f28707c.getTask().getResult()).intValue() == 0;
    }

    final Task c(Activity activity, Bundle bundle) {
        int i10 = bundle.getInt("dialog.intent.type");
        this.f28705a.d("requestAndShowDialog(%s)", Integer.valueOf(i10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f28710f.t(new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i10), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(@Nullable String str, long j10, long j11, int i10) {
        this.f28705a.d("requestExpressIntegrityToken(%s)", Long.valueOf(j11));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f28710f.t(new bg(this, taskCompletionSource, 0, str, j10, j11, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(long j10, int i10) {
        this.f28705a.d("warmUpIntegrityToken(%s)", Long.valueOf(j10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f28710f.t(new bf(this, taskCompletionSource, 0, j10, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
