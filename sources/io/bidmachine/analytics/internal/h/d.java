package io.bidmachine.analytics.internal.h;

import android.content.Context;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public abstract class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f79572c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f79573a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f79574b = b.EMPTY;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public enum b {
        EMPTY,
        CREATED,
        ENABLED,
        DISABLED,
        DESTROYED
    }

    public abstract String a();

    public final void a(Context context) {
        synchronized (this.f79573a) {
            if (this.f79574b != b.EMPTY) {
                return;
            }
            d(context);
            this.f79574b = b.CREATED;
            Unit unit = Unit.f93236a;
        }
    }

    public final void b(Context context) {
        synchronized (this.f79573a) {
            if (this.f79574b != b.ENABLED) {
                return;
            }
            try {
                Result.Companion companion = Result.f93230c;
                e(context);
                Result.b(Unit.f93236a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                Result.b(kotlin.d.a(th2));
            }
            this.f79574b = b.DISABLED;
            Unit unit = Unit.f93236a;
        }
    }

    public abstract void b(Object obj);

    public final void c(Context context) {
        synchronized (this.f79573a) {
            if (this.f79574b != b.DISABLED) {
                return;
            }
            try {
                Result.Companion companion = Result.f93230c;
                f(context);
                Result.b(Unit.f93236a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                Result.b(kotlin.d.a(th2));
            }
            this.f79574b = b.ENABLED;
            Unit unit = Unit.f93236a;
        }
    }

    public abstract void d(Context context);

    public abstract void e(Context context);

    public abstract void f(Context context);

    public final void a(Object obj) {
        synchronized (this.f79573a) {
            b bVar = this.f79574b;
            if (bVar == b.CREATED || bVar == b.DISABLED) {
                b(obj);
                this.f79574b = b.DISABLED;
                Unit unit = Unit.f93236a;
            }
        }
    }
}
