package yads;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class fl0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f110759h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f110760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f110761b = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f110762c = MapsKt.emptyMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f110763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f110764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f110765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f110766g;

    public final Map a() {
        return this.f110762c;
    }

    public final String b() {
        String str;
        synchronized (f110759h) {
            str = this.f110766g;
        }
        return str;
    }
}
