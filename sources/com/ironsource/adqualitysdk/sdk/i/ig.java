package com.ironsource.adqualitysdk.sdk.i;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class ig {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2493 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2494;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static final String[] f2495;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2496;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f2497;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final e f2498;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final SQLiteDatabase f2499;

    static class e extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f2500 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char f2501 = 39750;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char f2502 = 5026;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f2503 = 0;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char f2504 = 7002;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static char f2505 = 48713;

        public e(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m6773(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (n.f3016) {
                try {
                    char[] cArr2 = new char[cArr.length];
                    n.f3015 = 0;
                    char[] cArr3 = new char[2];
                    while (true) {
                        int i11 = n.f3015;
                        if (i11 < cArr.length) {
                            cArr3[0] = cArr[i11];
                            cArr3[1] = cArr[i11 + 1];
                            int i12 = 58224;
                            for (int i13 = 0; i13 < 16; i13++) {
                                char c10 = cArr3[1];
                                char c11 = cArr3[0];
                                char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2504)) ^ ((c11 >>> 5) + f2501)));
                                cArr3[1] = c12;
                                cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2505) ^ ((c12 + i12) ^ ((c12 << 4) + f2502))));
                                i12 -= 40503;
                            }
                            int i14 = n.f3015;
                            cArr2[i14] = cArr3[0];
                            cArr2[i14 + 1] = cArr3[1];
                            n.f3015 = i14 + 2;
                        } else {
                            str2 = new String(cArr2, 0, i10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            f2500 = (f2503 + 113) % 128;
            if (!sQLiteDatabase.isReadOnly()) {
                f2500 = (f2503 + 123) % 128;
                sQLiteDatabase.execSQL(m6773("鼯\ue57cힾ\uea5e还譶䊦諌ꔄ\udb54弫햋㫲ﵝ㖿戄뷙셸渑帤甑㛜", 21 - ((Process.getThreadPriority(0) + 20) >> 6)).intern());
            }
            sQLiteDatabase.execSQL(m6773("⋲⋍쵒莮\uefce䨷荣玱贻盥펜㱶烊ﵶ噴᰻╍ꑰ\udade⋉缴랕Â棤뢠\ue699童扅㻛럈㣪퇳ꔄ\udb54讻炗罎믯캉巀\uefce䨷꧲۴䚺㺞\uedef㥆还譶㿘礊㠕㤛Ў餳엏됥⎛淾턞\ue017\uefce䨷꧲۴쒂䈏", 67 - Color.alpha(0)).intern());
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            f2503 = (f2500 + 11) % 128;
        }
    }

    static {
        m6766();
        f2495 = new String[]{m6767((Process.myPid() >> 22) + 18, (char) (57367 - TextUtils.lastIndexOf("", '0', 0)), Color.blue(0) + 3).intern(), m6767(View.getDefaultSize(0, 0), (char) (KeyEvent.getDeadChar(0, 0) + 29517), TextUtils.getCapsMode("", 0, 0) + 3).intern()};
        int i10 = f2494 + 79;
        f2493 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public ig(Context context, String str) {
        e eVar = new e(context, str);
        this.f2498 = eVar;
        this.f2499 = eVar.getWritableDatabase();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static void m6766() {
        f2496 = new char[]{29499, 3583, 36487, 'k', 32438, 64991, 31833, 64369, 31295, 63693, 'k', 32421, 65017, 31754, 64312, 31344, 63616, 30624, 57459, 40622, 7623, 'k', 32438, 64991, 31812, 64371, 'k', 32438, 64991, 31833, 64256, 31318, 63673, 30592, 63160, 30036, 'C', 32412, 65011, 31799, 64280, 31287, 63620, 30628, 63220, 30018};
        f2497 = 7955426510279966419L;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized HashMap<String, String> m6769(String str, int i10) {
        String str2;
        HashMap<String, String> map;
        try {
            f2493 = (f2494 + 69) % 128;
            Cursor cursor = null;
            try {
                String strReplace = str.replace('*', '%');
                String strIntern = m6767(26 - View.combineMeasuredStates(0, 0), (char) Color.alpha(0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10).intern();
                String[] strArr = {strReplace};
                if (i10 <= 0) {
                    int i11 = f2494 + 41;
                    f2493 = i11 % 128;
                    if (i11 % 2 == 0) {
                        throw null;
                    }
                    str2 = null;
                } else {
                    String string = Integer.toString(i10);
                    f2493 = (f2494 + 9) % 128;
                    str2 = string;
                }
                Cursor cursorQuery = this.f2499.query(m6767(11 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getWindowTouchSlop() >> 8) + 8).intern(), f2495, strIntern, strArr, null, null, null, str2);
                map = new HashMap<>();
                while (cursorQuery != null && cursorQuery.moveToNext()) {
                    try {
                        map.put(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(m6767(18 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (ExpandableListView.getPackedPositionGroup(0L) + 57368), 3 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(m6767(KeyEvent.keyCodeFromString(""), (char) (29517 - Gravity.getAbsoluteGravity(0, 0)), 3 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())));
                    } catch (IllegalArgumentException unused) {
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th2) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return map;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized void m6770(String str, String str2) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(m6767(Color.alpha(0), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 29517), AndroidCharacter.getMirror('0') - '-').intern(), str2);
            if (this.f2499.update(m6767((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9, (char) TextUtils.getOffsetBefore("", 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 7).intern(), contentValues, m6767(3 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (Process.myTid() >> 22), ExpandableListView.getPackedPositionType(0L) + 7).intern(), new String[]{str}) == 0) {
                f2493 = (f2494 + 5) % 128;
                contentValues.put(m6767((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 17, (char) (57368 - (ViewConfiguration.getTouchSlop() >> 8)), 3 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), str);
                this.f2499.replace(m6767(10 - Color.green(0), (char) (KeyEvent.getMaxKeyCode() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 8).intern(), null, contentValues);
            }
            int i10 = f2493 + 41;
            f2494 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 64 / 0;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m6771(String str) {
        f2494 = (f2493 + 31) % 128;
        this.f2499.delete(m6767(10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) View.getDefaultSize(0, 0), 7 - ExpandableListView.getPackedPositionChild(0L)).intern(), m6767((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 20, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 4 - TextUtils.indexOf((CharSequence) "", '0')).intern(), new String[]{str});
        int i10 = f2494 + 107;
        f2493 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 5 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    protected final synchronized String m6772(String str) {
        Throwable th2;
        f2493 = (f2494 + 99) % 128;
        Cursor cursor = null;
        try {
            Cursor cursorQuery = this.f2499.query(m6767(10 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) View.combineMeasuredStates(0, 0), MotionEvent.axisFromString("") + 9).intern(), f2495, m6767(3 - KeyEvent.keyCodeFromString(""), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), View.MeasureSpec.getSize(0) + 7).intern(), new String[]{str}, null, null, null);
            if (cursorQuery != null) {
                int i10 = f2494 + 61;
                f2493 = i10 % 128;
                try {
                    if (i10 % 2 == 0) {
                        cursorQuery.moveToNext();
                        throw null;
                    }
                    if (!(!cursorQuery.moveToNext())) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(m6767((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (29517 - (ViewConfiguration.getLongPressTimeout() >> 16)), 3 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern()));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    cursor = cursorQuery;
                    if (cursor == null) {
                        throw th2;
                    }
                    cursor.close();
                    throw th2;
                }
            }
            if (cursorQuery != null) {
                f2494 = (f2493 + 65) % 128;
                cursorQuery.close();
                f2494 = (f2493 + 5) % 128;
            }
            return null;
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6767(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1677) {
            try {
                char[] cArr = new char[i11];
                d.f1676 = 0;
                while (true) {
                    int i12 = d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f2496[i10 + i12]) ^ (((long) i12) * f2497)) ^ ((long) c10));
                        d.f1676 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized int m6768(String str) {
        Cursor cursor = null;
        try {
            Cursor cursorQuery = this.f2499.query(m6767(9 - TextUtils.lastIndexOf("", '0', 0), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 8).intern(), new String[]{m6767((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 35, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 10 - View.getDefaultSize(0, 0)).intern()}, m6767(ExpandableListView.getPackedPositionType(0L) + 26, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 10 - TextUtils.getCapsMode("", 0, 0)).intern(), new String[]{str.replace('*', '%')}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        int i10 = cursorQuery.getInt(0);
                        int i11 = f2494 + 113;
                        f2493 = i11 % 128;
                        if (i11 % 2 != 0) {
                            cursorQuery.close();
                            f2494 = (f2493 + 85) % 128;
                            return i10;
                        }
                        cursorQuery.close();
                        throw null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return 0;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
