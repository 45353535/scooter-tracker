package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
final class aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f28642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final at f28644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f28645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final com.google.android.play.integrity.internal.ae f28646e;

    aj(Context context, com.google.android.play.integrity.internal.s sVar, at atVar, k kVar) {
        this.f28643b = context.getPackageName();
        this.f28642a = sVar;
        this.f28644c = atVar;
        this.f28645d = kVar;
        if (com.google.android.play.integrity.internal.ai.b(context)) {
            this.f28646e = new com.google.android.play.integrity.internal.ae(context, sVar, "IntegrityService", ak.f28647a, new com.google.android.play.integrity.internal.z() { // from class: com.google.android.play.core.integrity.ae
                @Override // com.google.android.play.integrity.internal.z
                public final Object a(IBinder iBinder) {
                    return com.google.android.play.integrity.internal.m.b(iBinder);
                }
            }, null);
        } else {
            sVar.b("Phonesky is not installed.", new Object[0]);
            this.f28646e = null;
        }
    }

    static /* bridge */ /* synthetic */ Bundle a(aj ajVar, byte[] bArr, Long l10, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.f28643b);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.d.b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.d.a(arrayList)));
        return bundle;
    }

    final Task b(Activity activity, Bundle bundle) {
        if (this.f28646e == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i10 = bundle.getInt("dialog.intent.type");
        this.f28642a.d("requestAndShowDialog(%s, %s)", this.f28643b, Integer.valueOf(i10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f28646e.t(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i10), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f28646e == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof ao) {
            }
            this.f28642a.d("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f28646e.t(new af(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e10) {
            return Tasks.forException(new IntegrityServiceException(-13, e10));
        }
    }
}
