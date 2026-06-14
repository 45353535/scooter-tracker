package com.ironsource;

import android.content.Context;
import com.ironsource.Ee;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.f9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4313f9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f43101a = new a(null);

    /* JADX INFO: renamed from: com.ironsource.f9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final JSONObject a(Context context) {
            try {
                return new JSONObject(IronSourceUtils.e(context));
            } catch (JSONException unused) {
                return new JSONObject();
            }
        }

        public final boolean b(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            D3 d3D = d(context);
            return d3D.d().length() > 0 && d3D.e().length() > 0;
        }

        @Nullable
        public final Ee c(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            D3 d3D = d(context);
            if (d3D.d().length() <= 0 || d3D.e().length() <= 0) {
                d3D = null;
            }
            if (d3D == null) {
                return null;
            }
            Ee ee2 = new Ee(context, d3D.d(), d3D.f(), d3D.e());
            ee2.a(Ee.a.CACHE);
            return ee2;
        }

        @NotNull
        public final D3 d(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            JSONObject jSONObjectA = a(context);
            String cachedAppKey = jSONObjectA.optString("appKey");
            String cachedUserId = jSONObjectA.optString("userId");
            String cachedSettings = jSONObjectA.optString("response");
            Intrinsics.checkNotNullExpressionValue(cachedAppKey, "cachedAppKey");
            Intrinsics.checkNotNullExpressionValue(cachedUserId, "cachedUserId");
            Intrinsics.checkNotNullExpressionValue(cachedSettings, "cachedSettings");
            return new D3(cachedAppKey, cachedUserId, cachedSettings);
        }

        private a() {
        }
    }

    public static final boolean a(@NotNull Context context) {
        return f43101a.b(context);
    }

    @Nullable
    public static final Ee b(@NotNull Context context) {
        return f43101a.c(context);
    }

    @NotNull
    public static final D3 c(@NotNull Context context) {
        return f43101a.d(context);
    }
}
