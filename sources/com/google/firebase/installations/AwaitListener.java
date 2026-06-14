package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
final class AwaitListener implements OnCompleteListener<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f32837a;

    public boolean await(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f32837a.await(j10, timeUnit);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(@NonNull Task<Void> task) {
        this.f32837a.countDown();
    }

    public void onSuccess() {
        this.f32837a.countDown();
    }
}
