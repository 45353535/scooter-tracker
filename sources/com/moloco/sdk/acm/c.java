package com.moloco.sdk.acm;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    @NotNull
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f53949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f53950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53951c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public c(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.f53949a = new ArrayList();
        this.f53950b = eventName;
        this.f53951c = 1;
    }

    public final int a() {
        return this.f53951c;
    }

    public List b() {
        return this.f53949a;
    }

    public String c() {
        return this.f53950b;
    }

    public final c d(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Count cannot be negative");
        }
        this.f53951c = i10;
        return this;
    }

    public c e(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (b().size() < 10 && key.length() <= 50 && value.length() <= 50) {
            b().add(new d(key, value));
        }
        return this;
    }
}
