package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5124gj implements InterfaceC5233l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4965af f77267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ScreenInfo f77268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f77269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f77270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5098fj f77271e = new C5098fj();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f77272f = new WeakReference(null);

    @WorkerThread
    public final synchronized void a(@NotNull Activity activity) {
        try {
            this.f77272f = new WeakReference(activity);
            if (!this.f77270d) {
                if (this.f77267a == null) {
                    this.f77267a = new C4965af(C5112g7.a(activity).a());
                }
                C4965af c4965af = this.f77267a;
                Intrinsics.checkNotNull(c4965af);
                this.f77268b = c4965af.p();
                if (this.f77267a == null) {
                    this.f77267a = new C4965af(C5112g7.a(activity).a());
                }
                C4965af c4965af2 = this.f77267a;
                Intrinsics.checkNotNull(c4965af2);
                this.f77269c = c4965af2.t();
                this.f77270d = true;
            }
            if (this.f77268b == null) {
                b(activity);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void b(Context context) {
        if (context != null) {
            this.f77271e.getClass();
            ScreenInfo screenInfoA = C5098fj.a(context);
            if (screenInfoA == null || Intrinsics.areEqual(screenInfoA, this.f77268b)) {
                return;
            }
            this.f77268b = screenInfoA;
            if (this.f77267a == null) {
                this.f77267a = new C4965af(C5112g7.a(context).a());
            }
            C4965af c4965af = this.f77267a;
            Intrinsics.checkNotNull(c4965af);
            c4965af.a(this.f77268b);
        }
    }

    @WorkerThread
    @Nullable
    public final synchronized ScreenInfo a(@NotNull Context context) {
        try {
            if (!this.f77270d) {
                if (this.f77267a == null) {
                    this.f77267a = new C4965af(C5112g7.a(context).a());
                }
                C4965af c4965af = this.f77267a;
                Intrinsics.checkNotNull(c4965af);
                this.f77268b = c4965af.p();
                if (this.f77267a == null) {
                    this.f77267a = new C4965af(C5112g7.a(context).a());
                }
                C4965af c4965af2 = this.f77267a;
                Intrinsics.checkNotNull(c4965af2);
                this.f77269c = c4965af2.t();
                this.f77270d = true;
            }
            b((Context) this.f77272f.get());
            if (this.f77268b == null) {
                if (AndroidUtils.isApiAchieved(30)) {
                    if (!this.f77269c) {
                        b(context);
                        this.f77269c = true;
                        if (this.f77267a == null) {
                            this.f77267a = new C4965af(C5112g7.a(context).a());
                        }
                        C4965af c4965af3 = this.f77267a;
                        Intrinsics.checkNotNull(c4965af3);
                        c4965af3.v();
                    }
                } else {
                    b(context);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f77268b;
    }

    @VisibleForTesting
    public final void a(@NotNull C4965af c4965af) {
        this.f77267a = c4965af;
    }
}
