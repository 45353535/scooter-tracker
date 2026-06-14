package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Eo extends SimpleThreadSafeToggle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f75746a;

    public Eo() {
        super(false, "[WakelocksToggle]");
        this.f75746a = new WeakHashMap();
    }

    public final synchronized void a(@NotNull Object obj) {
        this.f75746a.put(obj, null);
        if (this.f75746a.size() == 1) {
            updateState(true);
        }
    }

    public final synchronized void b(@NotNull Object obj) {
        this.f75746a.remove(obj);
        if (this.f75746a.isEmpty()) {
            updateState(false);
        }
    }
}
