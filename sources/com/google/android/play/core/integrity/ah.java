package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes9.dex */
final class ah extends y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ ai f28638f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(ai aiVar, String str, long j10) {
        super(str, j10);
        this.f28638f = aiVar;
    }

    @Override // com.google.android.play.core.integrity.y
    final Task b(Activity activity, Bundle bundle) {
        return this.f28638f.f28641d.b(activity, bundle);
    }
}
