package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.sc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4030sc extends BroadcastReceiver implements Zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4130wc f39525b;

    public C4030sc(C4130wc c4130wc, String jsCallbackNamespace) {
        Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
        this.f39525b = c4130wc;
        this.f39524a = jsCallbackNamespace;
    }

    @Override // com.inmobi.media.Zb
    public final void a() {
        Context context = Ji.f37157a;
        if (context == null) {
            return;
        }
        context.unregisterReceiver(this);
    }

    @Override // com.inmobi.media.Zb
    public final void b() {
        Context context = Ji.f37157a;
        if (context == null) {
            return;
        }
        F3.a(context, this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual("android.media.RINGER_MODE_CHANGED", intent.getAction())) {
            int intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", 2);
            InterfaceC3878m9 interfaceC3878m9 = this.f39525b.f39840b;
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).a("MraidMediaProcessor", "Ringer mode action changed: " + intExtra);
            }
            this.f39525b.a(this.f39524a, 2 != intExtra);
        }
    }
}
