package com.ironsource;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4255c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private List<String> f42790a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private List<String> f42791b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private List<String> f42792c = new ArrayList();

    @Nullable
    public final List<String> a() {
        return this.f42792c;
    }

    @Nullable
    public final List<String> b() {
        return this.f42791b;
    }

    @Nullable
    public final List<String> c() {
        return this.f42790a;
    }

    public final void a(@Nullable List<String> list) {
        this.f42792c = list;
    }

    public final void b(@Nullable List<String> list) {
        this.f42791b = list;
    }

    public final void c(@Nullable List<String> list) {
        this.f42790a = list;
    }
}
