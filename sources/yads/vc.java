package yads;

import android.app.Dialog;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class vc {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f116954e = TimeUnit.SECONDS.toMillis(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dialog f116955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ql0 f116956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b92 f116957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f116958d;

    public vc(Dialog dialog, id idVar, ql0 ql0Var, b92 b92Var, Handler handler) {
        this.f116955a = dialog;
        this.f116956b = ql0Var;
        this.f116957c = b92Var;
        this.f116958d = handler;
    }
}
