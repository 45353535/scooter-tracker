package yads;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class tm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f116296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f116297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hd1 f116298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fd1 f116299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sm f116300e;

    public /* synthetic */ tm(Context context, ViewGroup viewGroup, List list, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this(context, viewGroup, new hd1(list), new fd1(), new sm(onPreDrawListener));
    }

    public tm(Context context, ViewGroup viewGroup, hd1 hd1Var, fd1 fd1Var, sm smVar) {
        this.f116296a = context;
        this.f116297b = viewGroup;
        this.f116298c = hd1Var;
        this.f116299d = fd1Var;
        this.f116300e = smVar;
    }
}
