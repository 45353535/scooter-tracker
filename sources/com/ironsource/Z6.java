package com.ironsource;

import com.ironsource.C4240b4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Z6 implements V6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final JSONObject f42242a;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final boolean f42244b = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f42246d = 24;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f42243a = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f42245c = EnumC4225a7.SendEvent.b();

        private a() {
        }

        public final int a() {
            return f42245c;
        }
    }

    public Z6(@Nullable JSONObject jSONObject) {
        this.f42242a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.V6
    public long a() {
        return ((long) this.f42242a.optInt("timeout", 24)) * 1000;
    }

    @Override // com.ironsource.U5
    public boolean b() {
        return this.f42242a.optBoolean(com.ironsource.mediationsdk.metadata.a.f44111j, false);
    }

    @Override // com.ironsource.V6
    @NotNull
    public EnumC4225a7 c() {
        return EnumC4225a7.f42320b.a(this.f42242a.optInt(C4240b4.f.f42572e, a.f42243a.a()));
    }
}
