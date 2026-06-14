package com.google.android.play.core.common;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface IntentSenderForResultStarter {
    void startIntentSenderForResult(@NonNull IntentSender intentSender, int i10, @Nullable Intent intent, int i11, int i12, int i13, @Nullable Bundle bundle) throws IntentSender.SendIntentException;
}
