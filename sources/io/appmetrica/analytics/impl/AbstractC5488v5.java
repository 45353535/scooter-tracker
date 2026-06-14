package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC5488v5 implements InterfaceC5175ij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BaseRequestConfig f78424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseRequestConfig.RequestConfigLoader f78425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public S5 f78426c;

    public AbstractC5488v5(@NonNull BaseRequestConfig.RequestConfigLoader<Object, S5> requestConfigLoader, @NonNull C5204jm c5204jm, @NonNull ArgumentsMerger<Object, Object> argumentsMerger) {
        this.f78425b = requestConfigLoader;
        C5468ua.k().v().a(this);
        a(new S5(c5204jm, C5468ua.k().v(), C5468ua.k().s(), argumentsMerger));
    }

    public final synchronized void a(@NonNull S5 s52) {
        this.f78426c = s52;
    }

    @NonNull
    @VisibleForTesting(otherwise = 4)
    public final synchronized ArgumentsMerger<Object, Object> b() {
        return (ArgumentsMerger) this.f78426c.componentArguments;
    }

    @NonNull
    public final synchronized C5204jm c() {
        return this.f78426c.f76392a;
    }

    public final void d() {
        synchronized (this) {
            this.f78424a = null;
        }
    }

    public final synchronized void e() {
        this.f78424a = null;
    }

    public synchronized void a(@NonNull Object obj) {
        if (!((ArgumentsMerger) this.f78426c.componentArguments).compareWithOtherArguments(obj)) {
            a(new S5(c(), C5468ua.H.v(), C5468ua.H.s(), (ArgumentsMerger) ((ArgumentsMerger) this.f78426c.componentArguments).mergeFrom(obj)));
            e();
        }
    }

    public final synchronized void a(@NonNull C5204jm c5204jm) {
        a(new S5(c5204jm, C5468ua.H.v(), C5468ua.H.s(), b()));
        e();
    }

    @NonNull
    public final synchronized BaseRequestConfig a() {
        try {
            if (this.f78424a == null) {
                this.f78424a = this.f78425b.load(this.f78426c);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f78424a;
    }
}
