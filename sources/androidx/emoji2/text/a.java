package androidx.emoji2.text;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Handler f4561b;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f4561b.post(runnable);
    }
}
