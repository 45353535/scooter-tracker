package kd;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public class f extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Handler f93155a = new Handler(Looper.getMainLooper());

    @Override // kd.c
    protected Handler b() {
        return f93155a;
    }
}
