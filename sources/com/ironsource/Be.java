package com.ironsource;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f40453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final List<String> f40454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f40455c;

    public Be(@Nullable String str, @Nullable List<String> list, boolean z10) {
        this.f40453a = str;
        this.f40454b = list;
        this.f40455c = z10;
    }

    public final boolean a() {
        if (this.f40455c) {
            List<String> list = this.f40454b;
            if (list != null && !list.isEmpty()) {
                for (String str : list) {
                    String str2 = this.f40453a;
                    if (str2 != null && StringsKt.a0(str2, str, false, 2, null)) {
                        return true;
                    }
                }
            }
            return false;
        }
        List<String> list2 = this.f40454b;
        if (list2 != null && !list2.isEmpty()) {
            for (String str3 : list2) {
                String str4 = this.f40453a;
                if (str4 != null && StringsKt.g0(str4, str3, false, 2, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    public final String b() {
        return this.f40453a;
    }

    public /* synthetic */ Be(String str, List list, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i10 & 4) != 0 ? false : z10);
    }
}
