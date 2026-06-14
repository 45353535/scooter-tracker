package yads;

import android.content.Context;
import java.util.Arrays;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jn1 f109986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tq1 f109987b;

    public /* synthetic */ dn1(jn1 jn1Var) {
        this(jn1Var, new tq1());
    }

    public final com.monetization.ads.mediation.base.a a(Context context, cp1 cp1Var, Class cls) {
        String str;
        String str2;
        try {
            str = cp1Var.f109504b;
            this.f109987b.getClass();
        } catch (ClassCastException e10) {
            a(context, cp1Var, "does_not_conform_to_protocol", e10);
        } catch (Throwable th2) {
            a(context, cp1Var, "could_not_create_adapter", th2);
        }
        if (tq1.f116344a.contains(str)) {
            if (aq0.a(context, zp0.f118751d)) {
            }
            return null;
        }
        Object objA = jk2.a(str, new Object[0]);
        androidx.privacysandbox.ads.adservices.topics.a.a(cls.cast(objA));
        if (objA == null) {
            kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
            str2 = String.format("Instantiation failed for %s", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        } else {
            kotlin.jvm.internal.a1 a1Var2 = kotlin.jvm.internal.a1.f93282a;
            str2 = String.format("Cast from %s to %s is failed", Arrays.copyOf(new Object[]{objA.getClass().getName(), cls.getName()}, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        }
        a(context, cp1Var, str2);
        return null;
    }

    public dn1(jn1 jn1Var, tq1 tq1Var) {
        this.f109986a = jn1Var;
        this.f109987b = tq1Var;
    }

    public final void a(Context context, cp1 cp1Var, String str) {
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to("reason", "could_not_create_adapter"), TuplesKt.to("description", str));
        jn1 jn1Var = this.f109986a;
        jn1Var.getClass();
        jn1Var.a(context, xl2.f117869f, cp1Var, null, mapMapOf);
    }

    public final void a(Context context, cp1 cp1Var, String str, Throwable th2) {
        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("reason", str));
        String message = th2.getMessage();
        if (message == null) {
            message = "Unknown error message";
        }
        boolean z10 = lb1.f113032a;
        mapMutableMapOf.put("description", th2.getClass().getName() + " " + message);
        this.f109986a.a(context, cp1Var, mapMutableMapOf);
    }
}
