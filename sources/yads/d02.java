package yads;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class d02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f109679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d12 f109680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CheckBox f109681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ProgressBar f109682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f109683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f109684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f109685g = CollectionsKt.emptyList();

    public d02(View view, d12 d12Var, Map map) {
        this.f109679a = view;
        this.f109680b = d12Var;
        this.f109683e = MapsKt.toMutableMap(map);
    }

    public final Map a() {
        return this.f109683e;
    }

    public final List b() {
        return this.f109685g;
    }

    public final ImageView c() {
        return this.f109684f;
    }

    public final CheckBox d() {
        return this.f109681c;
    }

    public final View e() {
        return this.f109679a;
    }

    public final d12 f() {
        return this.f109680b;
    }

    public final ProgressBar g() {
        return this.f109682d;
    }
}
