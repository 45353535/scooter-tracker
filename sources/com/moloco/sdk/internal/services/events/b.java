package com.moloco.sdk.internal.services.events;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.UserIntent$UserAdInteractionExt;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.jvm.internal.Intrinsics;
import lf.m;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f55574a;

        static {
            int[] iArr = new int[a.AbstractC0780a.c.EnumC0782a.values().length];
            try {
                iArr[a.AbstractC0780a.c.EnumC0782a.f58910b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.AbstractC0780a.c.EnumC0782a.f58911c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.AbstractC0780a.c.EnumC0782a.f58912d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.AbstractC0780a.c.EnumC0782a.f58913e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.AbstractC0780a.c.EnumC0782a.f58914f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.AbstractC0780a.c.EnumC0782a.f58915g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.AbstractC0780a.c.EnumC0782a.f58916h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a.AbstractC0780a.c.EnumC0782a.f58917i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[a.AbstractC0780a.c.EnumC0782a.f58918j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f55574a = iArr;
        }
    }

    public static final UserIntent$UserAdInteractionExt.Button.b a(a.AbstractC0780a.c.EnumC0782a enumC0782a) {
        Intrinsics.checkNotNullParameter(enumC0782a, "<this>");
        switch (a.f55574a[enumC0782a.ordinal()]) {
            case 1:
                return UserIntent$UserAdInteractionExt.Button.b.NONE;
            case 2:
                return UserIntent$UserAdInteractionExt.Button.b.CLOSE;
            case 3:
                return UserIntent$UserAdInteractionExt.Button.b.SKIP;
            case 4:
                return UserIntent$UserAdInteractionExt.Button.b.DEC_SKIP;
            case 5:
                return UserIntent$UserAdInteractionExt.Button.b.MUTE;
            case 6:
                return UserIntent$UserAdInteractionExt.Button.b.UNMUTE;
            case 7:
                return UserIntent$UserAdInteractionExt.Button.b.CTA;
            case 8:
                return UserIntent$UserAdInteractionExt.Button.b.REPLAY;
            case 9:
                return UserIntent$UserAdInteractionExt.Button.b.AD_BADGE;
            default:
                throw new m();
        }
    }

    public static final UserIntent$UserAdInteractionExt.Position b(a.AbstractC0780a.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        UserIntent$UserAdInteractionExt.Position.a aVarNewBuilder = UserIntent$UserAdInteractionExt.Position.newBuilder();
        aVarNewBuilder.a(fVar.a());
        aVarNewBuilder.b(fVar.b());
        GeneratedMessageLite generatedMessageLiteBuild = aVarNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "build(...)");
        return (UserIntent$UserAdInteractionExt.Position) generatedMessageLiteBuild;
    }

    public static final UserIntent$UserAdInteractionExt.Size c(com.moloco.sdk.internal.services.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        UserIntent$UserAdInteractionExt.Size.a aVarNewBuilder = UserIntent$UserAdInteractionExt.Size.newBuilder();
        aVarNewBuilder.b(eVar.e());
        aVarNewBuilder.a(eVar.c());
        GeneratedMessageLite generatedMessageLiteBuild = aVarNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "build(...)");
        return (UserIntent$UserAdInteractionExt.Size) generatedMessageLiteBuild;
    }

    public static final UserIntent$UserAdInteractionExt.Size d(a.AbstractC0780a.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        UserIntent$UserAdInteractionExt.Size.a aVarNewBuilder = UserIntent$UserAdInteractionExt.Size.newBuilder();
        aVarNewBuilder.b(gVar.b());
        aVarNewBuilder.a(gVar.a());
        GeneratedMessageLite generatedMessageLiteBuild = aVarNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "build(...)");
        return (UserIntent$UserAdInteractionExt.Size) generatedMessageLiteBuild;
    }
}
