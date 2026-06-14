package com.ironsource.sdk.controller;

import com.ironsource.C4500q8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public interface m {

    public static final class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f45156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final String f45157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final String f45158c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private final String f45159d;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String funToCall) {
            this(funToCall, null, null, null, 14, null);
            Intrinsics.checkNotNullParameter(funToCall, "funToCall");
        }

        @Override // com.ironsource.sdk.controller.m
        @NotNull
        public String a() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SSA_CORE.SDKController.runFunction('" + this.f45156a);
            String str = this.f45157b;
            if (str != null && str.length() != 0) {
                sb2.append("?parameters=" + this.f45157b);
            }
            String str2 = this.f45158c;
            if (str2 != null && str2.length() != 0) {
                sb2.append("','" + this.f45158c);
            }
            String str3 = this.f45159d;
            if (str3 != null && str3.length() != 0) {
                sb2.append("','" + this.f45159d);
            }
            sb2.append("');");
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String funToCall, @Nullable String str) {
            this(funToCall, str, null, null, 12, null);
            Intrinsics.checkNotNullParameter(funToCall, "funToCall");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String funToCall, @Nullable String str, @Nullable String str2) {
            this(funToCall, str, str2, null, 8, null);
            Intrinsics.checkNotNullParameter(funToCall, "funToCall");
        }

        public a(@NotNull String funToCall, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            Intrinsics.checkNotNullParameter(funToCall, "funToCall");
            this.f45156a = funToCall;
            this.f45157b = str;
            this.f45158c = str2;
            this.f45159d = str3;
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
        }
    }

    public static final class b implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f45160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private String f45161b;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@NotNull m jsMethod, int i10) {
            this(jsMethod.a(), i10);
            Intrinsics.checkNotNullParameter(jsMethod, "jsMethod");
        }

        @Override // com.ironsource.sdk.controller.m
        @NotNull
        public String a() {
            String str = "console.log(\"JS exception: \" + JSON.stringify(e));";
            if (this.f45160a != C4500q8.d.MODE_0.b() && (this.f45160a < C4500q8.d.MODE_1.b() || this.f45160a > C4500q8.d.MODE_3.b())) {
                str = "empty";
            }
            String str2 = "try{" + this.f45161b + "}catch(e){" + str + "}";
            Intrinsics.checkNotNullExpressionValue(str2, "StringBuilder()\n        …}\")\n          .toString()");
            return str2;
        }

        public b(@NotNull String script, int i10) {
            Intrinsics.checkNotNullParameter(script, "script");
            this.f45161b = script;
            this.f45160a = i10;
        }
    }

    @NotNull
    String a();
}
