package com.ironsource;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4554tc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final C4357i2 f45494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f45495b;

    /* JADX INFO: renamed from: com.ironsource.tc$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f45496a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f45497b = "adm";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f45498c = "isOneFlow";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final String f45499d = "isMultipleAdObjects";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final String f45500e = "adsInternalInfo";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final String f45501f = "success";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final String f45502g = "error";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final String f45503h = "data";

        private a() {
        }
    }

    public C4554tc() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @NotNull
    public final HashMap<String, String> a() {
        C4443n2 c4443n2G;
        HashMap<String, String> map = new HashMap<>();
        map.put("isOneFlow", String.valueOf(this.f45495b));
        map.put("isMultipleAdObjects", "true");
        List<N> listA = Ib.f41088s.d().G().a();
        String string = listA != null ? new JSONObject().put("success", true).put("data", listA).toString() : new JSONObject().put("success", false).put("error", "Failed to get ad internal info").toString();
        Intrinsics.checkNotNullExpressionValue(string, "if (jsonAdInternalInfo !…    .toString()\n        }");
        map.put(a.f45500e, string);
        C4357i2 c4357i2 = this.f45494a;
        if (c4357i2 != null && (c4443n2G = c4357i2.g()) != null) {
            map.put("adm", c4443n2G.a());
            map.putAll(c4443n2G.b());
        }
        return map;
    }

    public C4554tc(@Nullable C4357i2 c4357i2, boolean z10) {
        this.f45494a = c4357i2;
        this.f45495b = z10;
    }

    public /* synthetic */ C4554tc(C4357i2 c4357i2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : c4357i2, (i10 & 2) != 0 ? false : z10);
    }
}
