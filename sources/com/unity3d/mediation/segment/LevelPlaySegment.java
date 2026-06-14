package com.unity3d.mediation.segment;

import android.text.TextUtils;
import com.ironsource.C4462o4;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class LevelPlaySegment {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    public static final String IAPT = "iapt";

    @NotNull
    public static final String LEVEL = "lvl";

    @NotNull
    public static final String PAYING = "pay";

    @NotNull
    public static final String SEGMENT_NAME = "segName";

    @NotNull
    public static final String USER_CREATION_DATE = "ucd";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f67909h = 999999;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final double f67910i = 999999.99d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f67911j = 5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f67912k = "custom";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f67915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f67916d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f67919g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList<Pair<String, String>> f67913a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f67914b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f67917e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f67918f = -1.0d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final boolean a(String str) {
        if (str == null) {
            return false;
        }
        return new Regex("^[a-zA-Z0-9]*$").g(str);
    }

    @NotNull
    public final ArrayList<Pair<String, String>> getCustoms$mediationsdk_release() {
        return this.f67913a;
    }

    public final double getIapTotal() {
        return this.f67918f;
    }

    public final int getLevel() {
        return this.f67917e;
    }

    @NotNull
    public final ArrayList<Pair<String, String>> getSegmentData() {
        IronLog.API.info("");
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        int i10 = this.f67917e;
        if (i10 != -1) {
            arrayList.add(new Pair<>("lvl", String.valueOf(i10)));
        }
        if (this.f67915c) {
            arrayList.add(new Pair<>("pay", String.valueOf(isPaying())));
        }
        double d10 = this.f67918f;
        if (d10 != -1.0d) {
            arrayList.add(new Pair<>("iapt", String.valueOf(d10)));
        }
        long j10 = this.f67919g;
        if (j10 != 0) {
            arrayList.add(new Pair<>("ucd", String.valueOf(j10)));
        }
        String str = this.f67916d;
        if (str != null && !TextUtils.isEmpty(str)) {
            arrayList.add(new Pair<>(SEGMENT_NAME, str));
        }
        ArrayList<Pair<String, String>> arrayList2 = this.f67913a;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator<T> it = arrayList2.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList3.add(new Pair("custom_" + pair.getFirst(), pair.getSecond()));
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    @Nullable
    public final String getSegmentName() {
        return this.f67916d;
    }

    public final long getUserCreationDate() {
        return this.f67919g;
    }

    public final boolean isPaying() {
        return this.f67914b.get();
    }

    public final void setCustom(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        IronLog.API.info("");
        try {
            if (a(key) && a(key, 1, 32) && a(value) && a(value, 1, 32)) {
                if (this.f67913a.size() >= 5) {
                    this.f67913a.remove(0);
                }
                this.f67913a.add(new Pair<>(key, value));
                return;
            }
            IronLog.INTERNAL.warning(key + ", " + value + " must be alphanumeric and 1-32 in length");
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public final void setIapTotal(double d10) {
        IronLog.API.info("");
        if (0.0d <= d10 && d10 <= f67910i) {
            double d11 = 100;
            this.f67918f = Math.floor(d10 * d11) / d11;
            return;
        }
        IronLog.INTERNAL.warning(d10 + " must be between 0-999999.99");
    }

    public final void setLevel(int i10) {
        IronLog.API.info("");
        if (1 <= i10 && i10 < 1000000) {
            this.f67917e = i10;
            return;
        }
        IronLog.INTERNAL.warning(i10 + " must be between 1-999999");
    }

    public final void setPaying(boolean z10) {
        IronLog.API.info("");
        this.f67915c = true;
        this.f67914b.set(z10);
    }

    public final void setSegmentName(@Nullable String str) {
        IronLog.API.info("");
        if (a(str) && a(str, 1, 32)) {
            this.f67916d = str;
            return;
        }
        IronLog.INTERNAL.warning(str + " must be alphanumeric and 1-32 in length");
    }

    public final void setUserCreationDate(long j10) {
        IronLog.API.info("");
        if (j10 > 0) {
            this.f67919g = j10;
            return;
        }
        IronLog.INTERNAL.warning(j10 + " is an invalid timestamp");
    }

    @NotNull
    public final JSONObject toJson() {
        IronLog.API.info("");
        JSONObject jSONObject = new JSONObject();
        for (Pair<String, String> pair : getSegmentData()) {
            try {
                jSONObject.put(pair.component1(), pair.component2());
            } catch (JSONException e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error("exception " + e10.getMessage());
            }
        }
        return jSONObject;
    }

    private final boolean a(String str, int i10, int i11) {
        return str != null && str.length() >= i10 && str.length() <= i11;
    }
}
