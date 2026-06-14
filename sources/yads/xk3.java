package yads;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class xk3 implements ri0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f117853c = {ub.a(xk3.class, "cacheListener", "getCacheListener()Lcom/monetization/ads/nativeads/video/cache/VideoCacheListener;", 0)};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f117854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f117855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f117856f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gk2 f117858b;

    static {
        List listListOf = CollectionsKt.listOf((Object[]) new Integer[]{3, 4});
        f117854d = listListOf;
        List listListOf2 = CollectionsKt.listOf((Object[]) new Integer[]{1, 5});
        f117855e = listListOf2;
        f117856f = CollectionsKt.plus((Collection) listListOf, (Iterable) listListOf2);
    }

    public xk3(String str, ne3 ne3Var) {
        this.f117857a = str;
        this.f117858b = hk2.a(ne3Var);
    }
}
