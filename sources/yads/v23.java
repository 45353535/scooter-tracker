package yads;

import android.content.Context;
import android.location.LocationManager;
import java.util.HashSet;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class v23 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f116852c = new HashSet(CollectionsKt.listOf("gps"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashSet f116853d = new HashSet(CollectionsKt.listOf((Object[]) new String[]{"gps", "passive"}));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationManager f116854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ta2 f116855b;

    public /* synthetic */ v23(Context context, LocationManager locationManager) {
        this(locationManager, new ta2(context));
    }

    public v23(LocationManager locationManager, ta2 ta2Var) {
        this.f116854a = locationManager;
        this.f116855b = ta2Var;
    }
}
