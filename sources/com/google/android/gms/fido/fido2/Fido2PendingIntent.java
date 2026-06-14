package com.google.android.gms.fido.fido2;

import android.app.Activity;
import android.content.IntentSender;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public interface Fido2PendingIntent {
    boolean hasPendingIntent();

    void launchPendingIntent(@NonNull Activity activity, int i10) throws IntentSender.SendIntentException;
}
