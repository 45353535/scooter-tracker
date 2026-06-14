package com.startapp.sdk.internal;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public final class t5 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f65295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f65296b;

    public t5(com.startapp.sdk.components.a aVar, Context context) {
        this.f65296b = aVar;
        this.f65295a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return new cd(this.f65296b.D, new File(this.f65295a.getFilesDir(), "StartApp-68962b1486d766d9"), new s5());
    }
}
