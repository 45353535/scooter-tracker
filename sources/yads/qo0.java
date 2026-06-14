package yads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class qo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f115107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final no0 f115108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x82 f115109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f115110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public po0 f115111e;

    public qo0(Handler handler, su1 su1Var, no0 no0Var, x82 x82Var) {
        this.f115107a = su1Var;
        this.f115108b = no0Var;
        this.f115109c = x82Var;
        this.f115110d = handler;
    }

    public /* synthetic */ qo0(su1 su1Var, no0 no0Var, x82 x82Var) {
        this(new Handler(Looper.getMainLooper()), su1Var, no0Var, x82Var);
    }
}
