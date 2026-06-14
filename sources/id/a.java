package id;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f74353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a1 f74354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f74355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f74356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z f74357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j f74358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f74359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f74360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final hd.g f74361i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f74362j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final s f74363k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f74364l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f74365m;

    public a(b adElementType, String name, a1 a1Var, String str, String str2, String str3, z elementLayoutParams, j appearanceParams, Map customParams, Map animationParams, hd.g gVar, List list, s sVar) {
        Intrinsics.checkNotNullParameter(adElementType, "adElementType");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(elementLayoutParams, "elementLayoutParams");
        Intrinsics.checkNotNullParameter(appearanceParams, "appearanceParams");
        Intrinsics.checkNotNullParameter(customParams, "customParams");
        Intrinsics.checkNotNullParameter(animationParams, "animationParams");
        this.f74353a = adElementType;
        this.f74354b = a1Var;
        this.f74355c = str;
        this.f74356d = str2;
        this.f74357e = elementLayoutParams;
        this.f74358f = appearanceParams;
        this.f74359g = customParams;
        this.f74360h = animationParams;
        this.f74361i = gVar;
        this.f74362j = list;
        this.f74363k = sVar;
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = name.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        this.f74364l = lowerCase;
        this.f74365m = str3 != null ? str3 : str;
    }

    public final b a() {
        return this.f74353a;
    }

    public final Map b() {
        return this.f74360h;
    }

    public final j c() {
        return this.f74358f;
    }

    public final s d() {
        return this.f74363k;
    }

    public final String e(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (String) this.f74359g.get(key);
    }

    public final Map f() {
        return this.f74359g;
    }

    public final z g() {
        return this.f74357e;
    }

    public final hd.g h() {
        return this.f74361i;
    }

    public final List i() {
        return this.f74362j;
    }

    public final String j() {
        return this.f74364l;
    }

    public final String k() {
        return this.f74356d;
    }

    public final a1 l() {
        return this.f74354b;
    }

    public final String m() {
        return this.f74355c;
    }

    public final String n() {
        return this.f74365m;
    }

    public /* synthetic */ a(b bVar, String str, a1 a1Var, String str2, String str3, String str4, z zVar, j jVar, Map map, Map map2, hd.g gVar, List list, s sVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, str, (i10 & 4) != 0 ? null : a1Var, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, zVar, jVar, (i10 & 256) != 0 ? new HashMap() : map, (i10 & 512) != 0 ? new EnumMap(f.class) : map2, (i10 & 1024) != 0 ? null : gVar, (i10 & 2048) != 0 ? null : list, (i10 & 4096) != 0 ? null : sVar);
    }
}
