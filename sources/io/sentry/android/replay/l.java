package io.sentry.android.replay;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile m f83055a = m.INITIAL;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m.STOPPED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[m.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final m a() {
        return this.f83055a;
    }

    public final boolean b(m newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        switch (a.$EnumSwitchMapping$0[this.f83055a.ordinal()]) {
            case 1:
                return newState == m.STARTED || newState == m.CLOSED;
            case 2:
                return newState == m.PAUSED || newState == m.STOPPED || newState == m.CLOSED;
            case 3:
                return newState == m.PAUSED || newState == m.STOPPED || newState == m.CLOSED;
            case 4:
                return newState == m.RESUMED || newState == m.STOPPED || newState == m.CLOSED;
            case 5:
                return newState == m.STARTED || newState == m.CLOSED;
            case 6:
                return false;
            default:
                throw new lf.m();
        }
    }

    public final boolean c() {
        return this.f83055a == m.STARTED || this.f83055a == m.RESUMED;
    }

    public final void d(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<set-?>");
        this.f83055a = mVar;
    }
}
