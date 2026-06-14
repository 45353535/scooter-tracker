package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.rc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4005rc extends BroadcastReceiver implements Zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4130wc f39466b;

    public C4005rc(C4130wc c4130wc, String jsCallbackNamespace) {
        Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
        this.f39466b = c4130wc;
        this.f39465a = jsCallbackNamespace;
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
        F3.a(context, this, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual("android.intent.action.HEADSET_PLUG", intent.getAction())) {
            int intExtra = intent.getIntExtra("state", 0);
            InterfaceC3878m9 interfaceC3878m9 = this.f39466b.f39840b;
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).a("MraidMediaProcessor", "Headphone plugged state changed: " + intExtra);
            }
            this.f39466b.b(this.f39465a, 1 == intExtra);
        }
    }
}
