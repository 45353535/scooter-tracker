package com.startapp.sdk.internal;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public abstract class qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f65161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f65162b = new AtomicBoolean(true);

    public static String a(Context context) {
        if (f65162b.getAndSet(false)) {
            try {
                AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener() { // from class: com.startapp.sdk.internal.zm
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        qg.f65161a = ((AppSetIdInfo) obj).getId();
                    }
                });
            } catch (GooglePlayServicesMissingManifestValueException | NoClassDefFoundError unused) {
            }
        }
        return f65161a;
    }
}
