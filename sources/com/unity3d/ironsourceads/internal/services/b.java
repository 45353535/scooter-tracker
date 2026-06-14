package com.unity3d.ironsourceads.internal.services;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.A5;
import com.ironsource.C4347h9;
import com.ironsource.C4462o4;
import com.ironsource.C4649z5;
import com.ironsource.EnumC4380j9;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4320g;
import com.ironsource.InterfaceC4337h;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.k;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;
import com.unity3d.ironsourceads.internal.services.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements com.unity3d.ironsourceads.internal.services.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4320g f67824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4337h f67825b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67826a;

        static {
            int[] iArr = new int[EnumC4380j9.values().length];
            try {
                iArr[EnumC4380j9.DIRECT_INTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4380j9.APP_ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f67826a = iArr;
        }
    }

    public b(@NotNull InterfaceC4320g actionIntentFactory, @NotNull InterfaceC4337h activityIntentFactory) {
        Intrinsics.checkNotNullParameter(actionIntentFactory, "actionIntentFactory");
        Intrinsics.checkNotNullParameter(activityIntentFactory, "activityIntentFactory");
        this.f67824a = actionIntentFactory;
        this.f67825b = activityIntentFactory;
    }

    private final a.AbstractC0843a b(Activity activity, Intent intent) {
        activity.startActivityForResult(intent, 794006778);
        a(this, A5.INLINE_STORE_LAUNCHED, EnumC4380j9.DIRECT_INTENT, null, 4, null);
        return a.AbstractC0843a.b.f67823a;
    }

    @Override // com.unity3d.ironsourceads.internal.services.a
    @NotNull
    public a.AbstractC0843a a(@NotNull Context context, @NotNull C4347h9 request) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        try {
        } catch (Exception e10) {
            e = e10;
        }
        try {
            a(this, A5.INLINE_STORE_REQUESTED, request.g(), null, 4, null);
            if (TextUtils.isEmpty(request.h())) {
                a(A5.INLINE_STORE_FAILED, request.g(), MapsKt.mutableMapOf(TuplesKt.to("reason", "storeUrl is empty")));
                return new a.AbstractC0843a.C0844a("storeUrl is empty");
            }
            if (!(context instanceof Activity)) {
                a(A5.INLINE_STORE_FAILED, request.g(), MapsKt.mutableMapOf(TuplesKt.to("reason", "context is not an Activity")));
                return new a.AbstractC0843a.C0844a("context is not an Activity");
            }
            Intent intentA = a(request);
            if (!a(context, intentA)) {
                a(A5.INLINE_STORE_FAILED, request.g(), MapsKt.mutableMapOf(TuplesKt.to("reason", "Failed to resolve for packageManager")));
                return new a.AbstractC0843a.C0844a("Failed to resolve for packageManager");
            }
            int i10 = a.f67826a[request.g().ordinal()];
            if (i10 == 1) {
                return b((Activity) context, intentA);
            }
            if (i10 == 2) {
                return a((Activity) context, intentA);
            }
            throw new m();
        } catch (Exception e11) {
            e = e11;
            Exception exc = e;
            C4462o4.d().a(exc);
            String str = "Failed to open inline store: " + exc.getMessage();
            IronLog.INTERNAL.error(exc.toString());
            a(A5.INLINE_STORE_FAILED, request.g(), MapsKt.mutableMapOf(TuplesKt.to("reason", str)));
            return new a.AbstractC0843a.C0844a(str);
        }
    }

    public b() {
        this(new k.a(), new k.b());
    }

    private final Intent a(C4347h9 c4347h9) throws JSONException {
        Intent intentA = this.f67824a.a();
        intentA.setPackage(c4347h9.f());
        intentA.setData(Uri.parse(c4347h9.h()));
        JSONObject jSONObjectE = c4347h9.e();
        if (jSONObjectE != null) {
            Iterator<String> itKeys = jSONObjectE.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object value = jSONObjectE.get(next);
                if (value instanceof String) {
                    intentA.putExtra(next, (String) value);
                } else if (value instanceof Boolean) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    intentA.putExtra(next, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    intentA.putExtra(next, ((Number) value).intValue());
                } else if (value instanceof Long) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    intentA.putExtra(next, ((Number) value).longValue());
                } else if (value instanceof Float) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    intentA.putExtra(next, ((Number) value).floatValue());
                } else if (value instanceof Double) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    intentA.putExtra(next, ((Number) value).doubleValue());
                } else {
                    intentA.putExtra(next, value.toString());
                }
            }
        }
        return intentA;
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    private final boolean a(Context context, Intent intent) {
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    private final a.AbstractC0843a a(Activity activity, Intent intent) {
        activity.startActivity(new InlineStoreActivity.b(this.f67825b).a(intent).a(activity));
        a(this, A5.INLINE_STORE_ACTIVITY_LAUNCHED, EnumC4380j9.APP_ACTIVITY, null, 4, null);
        return a.AbstractC0843a.b.f67823a;
    }

    @Override // com.unity3d.ironsourceads.internal.services.a
    @NotNull
    public a.AbstractC0843a a(@NotNull Context context, @NotNull EnumC4380j9 strategy) {
        Intent intent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        try {
            a(this, A5.INLINE_STORE_DESTROY_REQUESTED, strategy, null, 4, null);
            if (!(context instanceof Activity)) {
                a(A5.INLINE_STORE_DESTROY_FAILED, strategy, MapsKt.mutableMapOf(TuplesKt.to("reason", "context is not an Activity")));
                return new a.AbstractC0843a.C0844a("context is not an Activity");
            }
            int i10 = a.f67826a[strategy.ordinal()];
            if (i10 == 1) {
                intent = new Intent(context, (Class<?>) ControllerActivity.class);
            } else {
                if (i10 != 2) {
                    throw new m();
                }
                intent = new Intent(context, (Class<?>) InlineStoreActivity.class);
            }
            intent.addFlags(603979776);
            intent.putExtra("destroy_inline_store", true);
            context.startActivity(intent);
            a(this, A5.INLINE_STORE_DESTROY_LAUNCHED, strategy, null, 4, null);
            return a.AbstractC0843a.b.f67823a;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            String str = "Failed to destroy inline store: " + e10.getMessage();
            IronLog.INTERNAL.error(e10.toString());
            a(A5.INLINE_STORE_DESTROY_FAILED, strategy, MapsKt.mutableMapOf(TuplesKt.to("reason", str)));
            return new a.AbstractC0843a.C0844a(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void a(b bVar, A5 a52, EnumC4380j9 enumC4380j9, Map map, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = new LinkedHashMap();
        }
        bVar.a(a52, enumC4380j9, map);
    }

    private final void a(A5 a52, EnumC4380j9 enumC4380j9, Map<String, Object> map) {
        try {
            map.put(IronSourceConstants.EVENTS_EXT1, "strategy:" + enumC4380j9.b());
            Ib.f41088s.d().q().a(new C4649z5(a52, new JSONObject(MapsKt.toMap(map))));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
        }
    }
}
