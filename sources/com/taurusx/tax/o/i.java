package com.taurusx.tax.o;

import java.util.Map;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;

/* JADX INFO: loaded from: classes11.dex */
public class i {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static i f66463z = new i();

    public enum w {
        CLOSE("close"),
        EXPAND("expand"),
        USECUSTOMCLOSE("usecustomclose"),
        OPEN("open"),
        RESIZE("resize"),
        GET_RESIZE_PROPERTIES("getResizeProperties"),
        SET_RESIZE_PROPERTIES("setResizeProperties"),
        PLAY_VIDEO("playVideo"),
        STORE_PICTURE(MRAIDNativeFeature.STORE_PICTURE),
        GET_CURRENT_POSITION("getCurrentPosition"),
        GET_DEFAULT_POSITION("getDefaultPosition"),
        GET_MAX_SIZE("getMaxSize"),
        GET_SCREEN_SIZE("getScreenSize"),
        CREATE_CALENDAR_EVENT("createCalendarEvent"),
        UNSPECIFIED("");


        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f66465z;

        w(String str) {
            this.f66465z = str;
        }

        public static w w(String str) {
            for (w wVar : values()) {
                if (wVar.f66465z.equals(str)) {
                    return wVar;
                }
            }
            return UNSPECIFIED;
        }

        public String z() {
            return this.f66465z;
        }
    }

    public static /* synthetic */ class z {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final /* synthetic */ int[] f66466z;

        static {
            int[] iArr = new int[w.values().length];
            f66466z = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f66466z;
                w wVar = w.CLOSE;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f66466z;
                w wVar2 = w.CLOSE;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f66466z;
                w wVar3 = w.CLOSE;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = f66466z;
                w wVar4 = w.CLOSE;
                iArr5[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = f66466z;
                w wVar5 = w.CLOSE;
                iArr6[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = f66466z;
                w wVar6 = w.CLOSE;
                iArr7[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                int[] iArr8 = f66466z;
                w wVar7 = w.CLOSE;
                iArr8[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                int[] iArr9 = f66466z;
                w wVar8 = w.CLOSE;
                iArr9[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                int[] iArr10 = f66466z;
                w wVar9 = w.CLOSE;
                iArr10[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                int[] iArr11 = f66466z;
                w wVar10 = w.CLOSE;
                iArr11[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                int[] iArr12 = f66466z;
                w wVar11 = w.CLOSE;
                iArr12[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                int[] iArr13 = f66466z;
                w wVar12 = w.CLOSE;
                iArr13[12] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                int[] iArr14 = f66466z;
                w wVar13 = w.CLOSE;
                iArr14[13] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                int[] iArr15 = f66466z;
                w wVar14 = w.CLOSE;
                iArr15[14] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    @Deprecated
    public static void z(i iVar) {
        f66463z = iVar;
    }

    public g w(String str, Map<String, String> map, g0 g0Var) {
        switch (w.w(str)) {
            case CLOSE:
                return new f(map, g0Var);
            case EXPAND:
                return new p(map, g0Var);
            case USECUSTOMCLOSE:
                return new d(map, g0Var);
            case OPEN:
                return new x(map, g0Var);
            case RESIZE:
                return new h(map, g0Var);
            case GET_RESIZE_PROPERTIES:
                return new k(map, g0Var);
            case SET_RESIZE_PROPERTIES:
                return new j(map, g0Var);
            case PLAY_VIDEO:
                return new r(map, g0Var);
            case STORE_PICTURE:
                return new b(map, g0Var);
            case GET_CURRENT_POSITION:
                return new v(map, g0Var);
            case GET_DEFAULT_POSITION:
                return new l(map, g0Var);
            case GET_MAX_SIZE:
                return new e(map, g0Var);
            case GET_SCREEN_SIZE:
                return new u(map, g0Var);
            case CREATE_CALENDAR_EVENT:
                return new m(map, g0Var);
            default:
                return null;
        }
    }

    public static g z(String str, Map<String, String> map, g0 g0Var) {
        return f66463z.w(str, map, g0Var);
    }
}
