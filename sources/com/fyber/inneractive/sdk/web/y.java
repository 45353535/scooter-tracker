package com.fyber.inneractive.sdk.web;

import android.content.DialogInterface;
import android.os.Environment;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public final class y implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f24085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f24086b;

    public y(i0 i0Var, String str) {
        this.f24086b = i0Var;
        this.f24085a = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        i0 i0Var = this.f24086b;
        String str = this.f24085a;
        i0Var.getClass();
        new File(Environment.getExternalStorageDirectory(), "Pictures").mkdirs();
        com.fyber.inneractive.sdk.flow.x xVar = i0Var.f23988s;
        IAConfigManager.O.f20313s.a(new com.fyber.inneractive.sdk.network.b1(new x(i0Var), str, xVar != null ? xVar.f21037c : null));
    }
}
