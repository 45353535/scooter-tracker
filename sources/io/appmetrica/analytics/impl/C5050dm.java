package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5050dm extends BaseRequestConfig.BaseRequestArguments {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f77028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f77029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Map<String, String> f77030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f77031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final List<String> f77032e;

    public C5050dm(@NonNull P3 p32) {
        this(p32.a().c(), p32.a().d(), p32.a().a(), p32.a().h(), p32.a().b());
    }

    public final boolean a(@NonNull C5050dm c5050dm) {
        return false;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C5050dm mergeFrom(@NonNull C5050dm c5050dm) {
        return new C5050dm((String) WrapUtils.getOrDefaultNullable(this.f77028a, c5050dm.f77028a), (String) WrapUtils.getOrDefaultNullable(this.f77029b, c5050dm.f77029b), (Map) WrapUtils.getOrDefaultNullable(this.f77030c, c5050dm.f77030c), this.f77031d || c5050dm.f77031d, c5050dm.f77031d ? c5050dm.f77032e : this.f77032e);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(@NonNull Object obj) {
        return false;
    }

    public final String toString() {
        return "Arguments{distributionReferrer='" + this.f77028a + "', installReferrerSource='" + this.f77029b + "', clientClids=" + this.f77030c + ", hasNewCustomHosts=" + this.f77031d + ", newCustomHosts=" + this.f77032e + '}';
    }

    public C5050dm(@Nullable String str, @Nullable String str2, @Nullable Map<String, String> map, boolean z10, @Nullable List<String> list) {
        this.f77028a = str;
        this.f77029b = str2;
        this.f77030c = map;
        this.f77031d = z10;
        this.f77032e = list;
    }

    public C5050dm() {
        this(null, null, null, false, null);
    }
}
