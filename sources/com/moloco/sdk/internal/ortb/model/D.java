package com.moloco.sdk.internal.ortb.model;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import yg.j0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@ug.l
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0081\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/D;", "", "<init>", "(Ljava/lang/String;I)V", com.taurusx.tax.f.y.f66058y, "a", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "d", EidRequestBuilder.REQUEST_FIELD_EMAIL, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class D {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f54490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D f54491c = new D("Top", 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D f54492d = new D("Center", 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D f54493e = new D("Bottom", 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ D[] f54494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f54495g;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.D$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final /* synthetic */ KSerializer a() {
            return (KSerializer) D.f54490b.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        D[] dArrD = d();
        f54494f = dArrD;
        f54495g = qf.a.a(dArrD);
        INSTANCE = new Companion(null);
        f54490b = lf.i.b(lf.l.f94210c, new Function0() { // from class: com.moloco.sdk.internal.ortb.model.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j0.a("com.moloco.sdk.internal.ortb.model.VerticalAlignment", D.values(), new String[]{"top", "center", "bottom"}, new Annotation[][]{null, null, null}, null);
            }
        });
    }

    public D(String str, int i10) {
    }

    public static final /* synthetic */ D[] d() {
        return new D[]{f54491c, f54492d, f54493e};
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f54494f.clone();
    }
}
