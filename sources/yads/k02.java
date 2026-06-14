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
public final class k02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f112545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CheckBox f112546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ProgressBar f112547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f112548d = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f112549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f112550f;

    public k02(View view, Map map) {
        this.f112545a = view;
        this.f112549e = MapsKt.toMutableMap(map);
    }

    public final Map a() {
        return this.f112549e;
    }

    public final List b() {
        return this.f112548d;
    }

    public final ImageView c() {
        return this.f112550f;
    }

    public final CheckBox d() {
        return this.f112546b;
    }

    public final View e() {
        return this.f112545a;
    }

    public final ProgressBar f() {
        return this.f112547c;
    }
}
