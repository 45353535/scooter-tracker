package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f56534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f56535c = new y("Portrait", 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f56536d = new y("Landscape", 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y f56537e = new y("None", 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ y[] f56538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f56539g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y a(String str) {
            if (str == null) {
                return null;
            }
            int iHashCode = str.hashCode();
            if (iHashCode == 3387192) {
                if (str.equals("none")) {
                    return y.f56537e;
                }
                return null;
            }
            if (iHashCode == 729267099) {
                if (str.equals("portrait")) {
                    return y.f56535c;
                }
                return null;
            }
            if (iHashCode == 1430647483 && str.equals("landscape")) {
                return y.f56536d;
            }
            return null;
        }

        public a() {
        }
    }

    static {
        y[] yVarArrD = d();
        f56538f = yVarArrD;
        f56539g = qf.a.a(yVarArrD);
        f56534b = new a(null);
    }

    public y(String str, int i10) {
    }

    public static final /* synthetic */ y[] d() {
        return new y[]{f56535c, f56536d, f56537e};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f56538f.clone();
    }
}
