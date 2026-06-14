package com.ironsource.mediationsdk.adquality;

import com.ironsource.C4262c9;
import com.ironsource.EnumC4402ke;
import com.ironsource.N6;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f43760a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static EnumC0468a f43761b = EnumC0468a.DONT_INITIALIZE;

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.adquality.a$a, reason: collision with other inner class name */
    public enum EnumC0468a {
        DONT_INITIALIZE(0),
        LEVELPLAY_ONLY(1),
        ALL_MEDIATIONS(2),
        OTHER_ONLY(3);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C0469a f43762b = new C0469a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f43768a;

        /* JADX INFO: renamed from: com.ironsource.mediationsdk.adquality.a$a$a, reason: collision with other inner class name */
        public static final class C0469a {
            public /* synthetic */ C0469a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final EnumC0468a a(int i10) {
                EnumC0468a enumC0468a;
                EnumC0468a[] enumC0468aArrValues = EnumC0468a.values();
                int length = enumC0468aArrValues.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        enumC0468a = null;
                        break;
                    }
                    enumC0468a = enumC0468aArrValues[i11];
                    if (enumC0468a.b() == i10) {
                        break;
                    }
                    i11++;
                }
                return enumC0468a == null ? EnumC0468a.DONT_INITIALIZE : enumC0468a;
            }

            private C0469a() {
            }
        }

        EnumC0468a(int i10) {
            this.f43768a = i10;
        }

        public final int b() {
            return this.f43768a;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EnumC0468a a() {
            return a.f43761b;
        }

        private b() {
        }

        public final void a(@NotNull EnumC0468a enumC0468a) {
            Intrinsics.checkNotNullParameter(enumC0468a, "<set-?>");
            a.f43761b = enumC0468a;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43769a;

        static {
            int[] iArr = new int[EnumC0468a.values().length];
            try {
                iArr[EnumC0468a.LEVELPLAY_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0468a.ALL_MEDIATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0468a.OTHER_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43769a = iArr;
        }
    }

    public final boolean b() throws JSONException {
        EnumC4402ke enumC4402ke;
        JSONArray jSONArrayOptJSONArray = new C4262c9().a().optJSONArray(N6.f41384g0);
        if (jSONArrayOptJSONArray == null) {
            return false;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArrayOptJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = jSONArrayOptJSONArray.getInt(i10);
            EnumC4402ke[] enumC4402keArrValues = EnumC4402ke.values();
            int length2 = enumC4402keArrValues.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length2) {
                    enumC4402ke = null;
                    break;
                }
                enumC4402ke = enumC4402keArrValues[i12];
                if (enumC4402ke.b() == i11) {
                    break;
                }
                i12++;
            }
            if (enumC4402ke != null) {
                linkedHashSet.add(enumC4402ke);
            }
        }
        int i13 = c.f43769a[f43761b.ordinal()];
        if (i13 == 1) {
            return linkedHashSet.contains(EnumC4402ke.LEVEL_PLAY_INIT);
        }
        if (i13 != 2) {
            if (i13 == 3) {
                return linkedHashSet.contains(EnumC4402ke.EXTERNAL_MEDIATION_INIT);
            }
        } else if (linkedHashSet.contains(EnumC4402ke.LEVEL_PLAY_INIT) || linkedHashSet.contains(EnumC4402ke.EXTERNAL_MEDIATION_INIT)) {
            return true;
        }
        return false;
    }

    public final void a(int i10) {
        f43761b = EnumC0468a.f43762b.a(i10);
    }
}
