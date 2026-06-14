package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
public final class jj extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lj f112361a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj(lj ljVar, Looper looper) {
        super(looper);
        this.f112361a = ljVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f112361a.a(message);
    }
}
