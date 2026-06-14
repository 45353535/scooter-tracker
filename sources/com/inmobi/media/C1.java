package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class C1 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f36650a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1(Looper looper) {
        super(looper);
        Intrinsics.checkNotNullParameter(looper, "looper");
        this.f36650a = true;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        int i10 = msg.what;
        if (i10 == 1001 && this.f36650a) {
            this.f36650a = false;
            E1.a(false);
            Intrinsics.checkNotNullExpressionValue("E1", "access$getTAG$p(...)");
        } else {
            if (i10 != 1002 || this.f36650a) {
                return;
            }
            this.f36650a = true;
            E1.a(true);
            Intrinsics.checkNotNullExpressionValue("E1", "access$getTAG$p(...)");
        }
    }
}
