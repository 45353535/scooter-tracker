package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import kotlin.jvm.internal.Intrinsics;
import lf.m;

/* JADX INFO: loaded from: classes10.dex */
public abstract class e {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56039a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.f56023b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.f56024c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.f56025d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.f56026e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.f56027f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d.f56028g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[d.f56029h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[d.f56030i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[d.f56031j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[d.f56032k.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[d.f56033l.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[d.f56034m.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[d.f56035n.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[d.f56036o.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            f56039a = iArr;
        }
    }

    public static final d a(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        switch (a.f56039a[dVar.ordinal()]) {
            case 1:
                return d.f56033l;
            case 2:
                return d.f56034m;
            case 3:
                return d.f56035n;
            case 4:
                return d.f56036o;
            case 5:
                return d.f56027f;
            case 6:
                return d.f56033l;
            case 7:
                return d.f56034m;
            case 8:
                return d.f56035n;
            case 9:
                return d.f56036o;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return dVar;
            default:
                throw new m();
        }
    }

    public static final d b(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        switch (a.f56039a[dVar.ordinal()]) {
            case 1:
                return d.f56028g;
            case 2:
                return d.f56029h;
            case 3:
                return d.f56030i;
            case 4:
                return d.f56031j;
            case 5:
                return d.f56027f;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return dVar;
            case 11:
                return d.f56028g;
            case 12:
                return d.f56029h;
            case 13:
                return d.f56030i;
            case 14:
                return d.f56031j;
            default:
                throw new m();
        }
    }
}
