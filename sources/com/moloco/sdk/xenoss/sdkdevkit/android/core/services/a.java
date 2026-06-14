package com.moloco.sdk.xenoss.sdkdevkit.android.core.services;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public interface a {

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0780a {

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$a, reason: collision with other inner class name */
        public static final class C0781a extends AbstractC0780a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0781a f58905a = new C0781a();

            public C0781a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$b */
        public static final class b extends AbstractC0780a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f58906a;

            public b(long j10) {
                super(null);
                this.f58906a = j10;
            }

            public final long a() {
                return this.f58906a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f58906a == ((b) obj).f58906a;
            }

            public int hashCode() {
                return androidx.collection.b.a(this.f58906a);
            }

            public String toString() {
                return "AppForeground(lastBgTimestamp=" + this.f58906a + ')';
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$c */
        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final EnumC0782a f58907a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final f f58908b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final g f58909c;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$c$a, reason: collision with other inner class name */
            public static final class EnumC0782a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final EnumC0782a f58910b = new EnumC0782a("NONE", 0);

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final EnumC0782a f58911c = new EnumC0782a("CLOSE", 1);

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public static final EnumC0782a f58912d = new EnumC0782a("SKIP", 2);

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public static final EnumC0782a f58913e = new EnumC0782a("SKIP_DEC", 3);

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public static final EnumC0782a f58914f = new EnumC0782a("MUTE", 4);

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public static final EnumC0782a f58915g = new EnumC0782a("UNMUTE", 5);

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public static final EnumC0782a f58916h = new EnumC0782a(NativeAdContent.ViewTag.CTA, 6);

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public static final EnumC0782a f58917i = new EnumC0782a("REPLAY", 7);

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public static final EnumC0782a f58918j = new EnumC0782a("AD_BADGE", 8);

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public static final /* synthetic */ EnumC0782a[] f58919k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public static final /* synthetic */ EnumEntries f58920l;

                static {
                    EnumC0782a[] enumC0782aArrD = d();
                    f58919k = enumC0782aArrD;
                    f58920l = qf.a.a(enumC0782aArrD);
                }

                public EnumC0782a(String str, int i10) {
                }

                public static final /* synthetic */ EnumC0782a[] d() {
                    return new EnumC0782a[]{f58910b, f58911c, f58912d, f58913e, f58914f, f58915g, f58916h, f58917i, f58918j};
                }

                public static EnumC0782a valueOf(String str) {
                    return (EnumC0782a) Enum.valueOf(EnumC0782a.class, str);
                }

                public static EnumC0782a[] values() {
                    return (EnumC0782a[]) f58919k.clone();
                }
            }

            public c(EnumC0782a buttonType, f position, g size) {
                Intrinsics.checkNotNullParameter(buttonType, "buttonType");
                Intrinsics.checkNotNullParameter(position, "position");
                Intrinsics.checkNotNullParameter(size, "size");
                this.f58907a = buttonType;
                this.f58908b = position;
                this.f58909c = size;
            }

            public static /* synthetic */ c b(c cVar, EnumC0782a enumC0782a, f fVar, g gVar, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    enumC0782a = cVar.f58907a;
                }
                if ((i10 & 2) != 0) {
                    fVar = cVar.f58908b;
                }
                if ((i10 & 4) != 0) {
                    gVar = cVar.f58909c;
                }
                return cVar.a(enumC0782a, fVar, gVar);
            }

            public final c a(EnumC0782a buttonType, f position, g size) {
                Intrinsics.checkNotNullParameter(buttonType, "buttonType");
                Intrinsics.checkNotNullParameter(position, "position");
                Intrinsics.checkNotNullParameter(size, "size");
                return new c(buttonType, position, size);
            }

            public final EnumC0782a c() {
                return this.f58907a;
            }

            public final f d() {
                return this.f58908b;
            }

            public final g e() {
                return this.f58909c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f58907a == cVar.f58907a && Intrinsics.areEqual(this.f58908b, cVar.f58908b) && Intrinsics.areEqual(this.f58909c, cVar.f58909c);
            }

            public int hashCode() {
                return (((this.f58907a.hashCode() * 31) + this.f58908b.hashCode()) * 31) + this.f58909c.hashCode();
            }

            public String toString() {
                return "Button(buttonType=" + this.f58907a + ", position=" + this.f58908b + ", size=" + this.f58909c + ')';
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$e */
        public static final class e extends AbstractC0780a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f58925a = new e();

            public e() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$f */
        public static final class f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final float f58926a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final float f58927b;

            public f(float f10, float f11) {
                this.f58926a = f10;
                this.f58927b = f11;
            }

            public final float a() {
                return this.f58926a;
            }

            public final float b() {
                return this.f58927b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return Float.compare(this.f58926a, fVar.f58926a) == 0 && Float.compare(this.f58927b, fVar.f58927b) == 0;
            }

            public int hashCode() {
                return (Float.floatToIntBits(this.f58926a) * 31) + Float.floatToIntBits(this.f58927b);
            }

            public String toString() {
                return "Position(topLeftXDp=" + this.f58926a + ", topLeftYDp=" + this.f58927b + ')';
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$g */
        public static final class g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final float f58928a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final float f58929b;

            public g(float f10, float f11) {
                this.f58928a = f10;
                this.f58929b = f11;
            }

            public final float a() {
                return this.f58929b;
            }

            public final float b() {
                return this.f58928a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return Float.compare(this.f58928a, gVar.f58928a) == 0 && Float.compare(this.f58929b, gVar.f58929b) == 0;
            }

            public int hashCode() {
                return (Float.floatToIntBits(this.f58928a) * 31) + Float.floatToIntBits(this.f58929b);
            }

            public String toString() {
                return "Size(widthDp=" + this.f58928a + ", heightDp=" + this.f58929b + ')';
            }
        }

        public /* synthetic */ AbstractC0780a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$d */
        public static final class d extends AbstractC0780a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final f f58921a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final f f58922b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final g f58923c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final List f58924d;

            public /* synthetic */ d(f fVar, f fVar2, g gVar, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(fVar, (i10 & 2) != 0 ? null : fVar2, (i10 & 4) != 0 ? null : gVar, (i10 & 8) != 0 ? CollectionsKt.emptyList() : list);
            }

            public final List a() {
                return this.f58924d;
            }

            public final f b() {
                return this.f58921a;
            }

            public final f c() {
                return this.f58922b;
            }

            public final g d() {
                return this.f58923c;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(f clickPosition, f fVar, g gVar, List buttonLayout) {
                super(null);
                Intrinsics.checkNotNullParameter(clickPosition, "clickPosition");
                Intrinsics.checkNotNullParameter(buttonLayout, "buttonLayout");
                this.f58921a = clickPosition;
                this.f58922b = fVar;
                this.f58923c = gVar;
                this.f58924d = buttonLayout;
            }
        }

        public AbstractC0780a() {
        }
    }

    Object a(long j10, AbstractC0780a abstractC0780a, String str, Continuation continuation);
}
