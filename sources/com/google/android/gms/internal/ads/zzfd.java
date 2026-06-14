package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
final class zzfd implements zzdw {

    @Nullable
    private Message zza;

    private zzfd() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zza() {
        Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        this.zza = null;
        zzfe.zzp(this);
    }

    public final zzfd zzb(Message message, zzfe zzfeVar) {
        this.zza = message;
        return this;
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.zza = null;
        zzfe.zzp(this);
        return zSendMessageAtFrontOfQueue;
    }

    /* synthetic */ zzfd(byte[] bArr) {
    }
}
