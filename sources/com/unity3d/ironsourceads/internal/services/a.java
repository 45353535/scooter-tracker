package com.unity3d.ironsourceads.internal.services;

import android.content.Context;
import com.ironsource.C4347h9;
import com.ironsource.EnumC4380j9;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface a {

    /* JADX INFO: renamed from: com.unity3d.ironsourceads.internal.services.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0843a {

        /* JADX INFO: renamed from: com.unity3d.ironsourceads.internal.services.a$a$a, reason: collision with other inner class name */
        public static final class C0844a extends AbstractC0843a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f67822a;

            public C0844a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @NotNull
            public final String a() {
                return this.f67822a;
            }

            @NotNull
            public final String b() {
                return this.f67822a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0844a) && Intrinsics.areEqual(this.f67822a, ((C0844a) obj).f67822a);
            }

            public int hashCode() {
                return this.f67822a.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(errorMessage=" + this.f67822a + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0844a(@NotNull String errorMessage) {
                super(null);
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                this.f67822a = errorMessage;
            }

            @NotNull
            public final C0844a a(@NotNull String errorMessage) {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                return new C0844a(errorMessage);
            }

            public /* synthetic */ C0844a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? "" : str);
            }

            public static /* synthetic */ C0844a a(C0844a c0844a, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = c0844a.f67822a;
                }
                return c0844a.a(str);
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ironsourceads.internal.services.a$a$b */
        public static final class b extends AbstractC0843a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f67823a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ AbstractC0843a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0843a() {
        }
    }

    @NotNull
    AbstractC0843a a(@NotNull Context context, @NotNull C4347h9 c4347h9);

    @NotNull
    AbstractC0843a a(@NotNull Context context, @NotNull EnumC4380j9 enumC4380j9);
}
