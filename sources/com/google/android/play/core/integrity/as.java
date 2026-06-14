package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* JADX INFO: loaded from: classes9.dex */
final class as extends com.google.android.play.integrity.internal.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f28660b = new com.google.android.play.integrity.internal.s("RequestDialogCallbackImpl");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f28661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f28662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final TaskCompletionSource f28663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Activity f28664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final com.google.android.play.integrity.internal.ae f28665g;

    as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, com.google.android.play.integrity.internal.ae aeVar) {
        this.f28661c = context.getPackageName();
        this.f28662d = kVar;
        this.f28663e = taskCompletionSource;
        this.f28664f = activity;
        this.f28665g = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.r
    public final void b(Bundle bundle) {
        this.f28665g.v(this.f28663e);
        this.f28660b.d("onRequestDialog(%s)", this.f28661c);
        ApiException apiExceptionA = this.f28662d.a(bundle);
        if (apiExceptionA != null) {
            this.f28663e.trySetException(apiExceptionA);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            this.f28660b.b("onRequestDialog(%s): got null dialog intent", this.f28661c);
            this.f28663e.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f28664f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.f28665g.c()));
        this.f28660b.a("Starting dialog intent...", new Object[0]);
        this.f28664f.startActivityForResult(intent, 0);
    }
}
