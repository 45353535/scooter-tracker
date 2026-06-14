package io.bidmachine;

import com.taurusx.tax.y.z.w.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/bidmachine/AdCridThreadHandler;", "", "", "crid", "<init>", "(Ljava/lang/String;)V", "", "destroy", "()V", "Lae/k;", s.z.f67720z, "Lae/k;", "name", "Ljava/lang/String;", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Runnable;", "Ljava/lang/Thread;", "thread", "Ljava/lang/Thread;", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AdCridThreadHandler {

    @NotNull
    private final String name;

    @NotNull
    private final Runnable runnable;

    @NotNull
    private final ae.k tag;

    @Nullable
    private Thread thread;

    public AdCridThreadHandler(@NotNull String crid) {
        Intrinsics.checkNotNullParameter(crid, "crid");
        this.tag = new ae.k("AdCridThreadManager");
        String str = "io.bidmachine.crid." + crid;
        this.name = str;
        Runnable runnable = new Runnable() { // from class: io.bidmachine.a
            @Override // java.lang.Runnable
            public final void run() {
                AdCridThreadHandler.runnable$lambda$0(this.f79174b);
            }
        };
        this.runnable = runnable;
        Thread thread = new Thread(runnable, str);
        thread.start();
        this.thread = thread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runnable$lambda$0(AdCridThreadHandler this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Thread threadCurrentThread = Thread.currentThread();
        try {
            io.bidmachine.core.a.c(this$0.tag, this$0.name + " started");
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException unused) {
            threadCurrentThread.interrupt();
        }
    }

    public final void destroy() {
        Thread thread = this.thread;
        if (thread != null) {
            thread.interrupt();
        }
        this.thread = null;
        io.bidmachine.core.a.c(this.tag, this.name + " stopped");
    }
}
