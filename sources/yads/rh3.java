package yads;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class rh3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final rh3 f115452b = new rh3();

    public rh3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
