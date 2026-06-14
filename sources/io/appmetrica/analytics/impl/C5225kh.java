package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5225kh extends BaseRequestConfig.BaseRequestArguments {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f77607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f77608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f77609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f77610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f77611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f77612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f77613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f77614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final Map<String, String> f77615i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f77616j;

    public C5225kh(@NonNull C5487v4 c5487v4) {
        this(c5487v4.f78409a, c5487v4.f78410b, c5487v4.f78412d, c5487v4.f78413e, c5487v4.f78414f, c5487v4.f78415g, c5487v4.f78416h, c5487v4.f78417i, c5487v4.f78418j, c5487v4.f78419k);
    }

    public static C5225kh a() {
        return new C5225kh(null, null, null, null, null, null, null, null, null, null);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C5225kh mergeFrom(@NonNull C5487v4 c5487v4) {
        return new C5225kh((String) WrapUtils.getOrDefaultNullable(c5487v4.f78409a, this.f77607a), (Boolean) WrapUtils.getOrDefaultNullable(c5487v4.f78410b, Boolean.valueOf(this.f77608b)), (Boolean) WrapUtils.getOrDefaultNullable(c5487v4.f78412d, Boolean.valueOf(this.f77609c)), (Integer) WrapUtils.getOrDefaultNullable(c5487v4.f78413e, Integer.valueOf(this.f77610d)), (Integer) WrapUtils.getOrDefaultNullable(c5487v4.f78414f, Integer.valueOf(this.f77611e)), (Integer) WrapUtils.getOrDefaultNullable(c5487v4.f78415g, Integer.valueOf(this.f77612f)), (Boolean) WrapUtils.getOrDefaultNullable(c5487v4.f78416h, Boolean.valueOf(this.f77613g)), (Boolean) WrapUtils.getOrDefaultNullable(c5487v4.f78417i, Boolean.valueOf(this.f77614h)), (Map) WrapUtils.getOrDefaultNullable(c5487v4.f78418j, this.f77615i), (Integer) WrapUtils.getOrDefaultNullable(c5487v4.f78419k, Integer.valueOf(this.f77616j)));
    }

    public C5225kh(String str, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4) {
        this.f77607a = str;
        Boolean bool5 = Boolean.FALSE;
        this.f77608b = ((Boolean) WrapUtils.getOrDefault(bool, bool5)).booleanValue();
        this.f77609c = ((Boolean) WrapUtils.getOrDefault(bool2, bool5)).booleanValue();
        this.f77610d = Math.max(10, ((Integer) WrapUtils.getOrDefault(num, 10)).intValue());
        this.f77611e = ((Integer) WrapUtils.getOrDefault(num2, 7)).intValue();
        this.f77612f = ((Integer) WrapUtils.getOrDefault(num3, 90)).intValue();
        this.f77613g = ((Boolean) WrapUtils.getOrDefault(bool3, bool5)).booleanValue();
        this.f77614h = ((Boolean) WrapUtils.getOrDefault(bool4, Boolean.TRUE)).booleanValue();
        this.f77615i = map;
        this.f77616j = ((Integer) WrapUtils.getOrDefault(num4, 1000)).intValue();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean compareWithOtherArguments(@NonNull C5487v4 c5487v4) {
        Map<String, String> map;
        String str;
        Boolean bool = c5487v4.f78410b;
        if (bool != null && this.f77608b != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = c5487v4.f78412d;
        if (bool2 != null && this.f77609c != bool2.booleanValue()) {
            return false;
        }
        Integer num = c5487v4.f78413e;
        if (num != null && this.f77610d != num.intValue()) {
            return false;
        }
        Integer num2 = c5487v4.f78414f;
        if (num2 != null && this.f77611e != num2.intValue()) {
            return false;
        }
        Integer num3 = c5487v4.f78415g;
        if (num3 != null && this.f77612f != num3.intValue()) {
            return false;
        }
        Boolean bool3 = c5487v4.f78416h;
        if (bool3 != null && this.f77613g != bool3.booleanValue()) {
            return false;
        }
        Boolean bool4 = c5487v4.f78417i;
        if (bool4 != null && this.f77614h != bool4.booleanValue()) {
            return false;
        }
        String str2 = c5487v4.f78409a;
        if (str2 != null && ((str = this.f77607a) == null || !str.equals(str2))) {
            return false;
        }
        Map<String, String> map2 = c5487v4.f78418j;
        if (map2 != null && ((map = this.f77615i) == null || !map.equals(map2))) {
            return false;
        }
        Integer num4 = c5487v4.f78419k;
        return num4 == null || this.f77616j == num4.intValue();
    }
}
