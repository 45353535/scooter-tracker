package q5;

import com.skydoves.balloon.Balloon;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Balloon f98693b;

    public c(Balloon balloon) {
        Intrinsics.checkNotNullParameter(balloon, "balloon");
        this.f98693b = balloon;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f98693b.G();
    }
}
