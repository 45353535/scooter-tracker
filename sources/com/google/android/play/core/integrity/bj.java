package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes9.dex */
final class bj extends y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ bk f28698f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(bk bkVar, String str, long j10) {
        super(str, j10);
        this.f28698f = bkVar;
    }

    @Override // com.google.android.play.core.integrity.y
    final Task b(Activity activity, Bundle bundle) {
        bundle.putLong("cloud.prj", this.f28698f.f28700e);
        return this.f28698f.f28701f.c(activity, bundle);
    }
}
