package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes8.dex */
final class zzayf implements Runnable {
    private zzayf() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzayg.zzd = MessageDigest.getInstance("MD5");
            countDownLatch = zzayg.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzayg.zzb;
        } catch (Throwable th2) {
            zzayg.zzb.countDown();
            throw th2;
        }
        countDownLatch.countDown();
    }

    /* synthetic */ zzayf(byte[] bArr) {
    }
}
