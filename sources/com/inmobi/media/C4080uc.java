package com.inmobi.media;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4080uc extends ContentObserver implements Zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f39663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4130wc f39665d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4080uc(C4130wc c4130wc, String mJsCallbackNamespace, Context context, Handler handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(mJsCallbackNamespace, "mJsCallbackNamespace");
        this.f39665d = c4130wc;
        this.f39662a = mJsCallbackNamespace;
        this.f39663b = context;
        this.f39664c = -1;
    }

    @Override // com.inmobi.media.Zb
    public final void a() {
        Context context = Ji.f37157a;
        if (context == null) {
            return;
        }
        context.getContentResolver().unregisterContentObserver(this);
    }

    @Override // com.inmobi.media.Zb
    public final void b() {
        Context context = Ji.f37157a;
        if (context == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        eg.i.d(A9.f36557c, null, null, new C4055tc(this, this.f39665d, z10, null), 3, null);
    }
}
